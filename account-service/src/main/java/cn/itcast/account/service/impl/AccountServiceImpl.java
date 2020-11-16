package cn.itcast.account.service.impl;

import cn.itcast.account.entity.Account;
import cn.itcast.account.mapper.AccountMapper;
import cn.itcast.account.service.AccountService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 虎哥
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    @Transactional
    public void debit(String userId, int money) {
        log.info("开始扣款");
        if(money>200){
            throw new RuntimeException("扣款失败，可能是余额不足！");
        }else{
            log.info("扣款成功");
        }
    }
}
