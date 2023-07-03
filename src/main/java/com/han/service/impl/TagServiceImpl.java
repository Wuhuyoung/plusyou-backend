package com.han.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.han.model.domain.Tag;
import com.han.service.TagService;
import com.han.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author 86183
* @description 针对表【tag(标签表)】的数据库操作Service实现
* @createDate 2023-07-03 23:09:50
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




