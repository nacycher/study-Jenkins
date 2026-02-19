# study-Jenkins
study-Jenkins
## 视频地址 https://www.bilibili.com/video/BV1bS4y1471A


![img_1.png](img_1.png)

## Jenkins简介
CIDI，自动化集成、自动化部署

## Jenkins在开发中的位置和作用
![img.png](img.png)

## Jenkins+maven+git的集成使用

## 在docker下安装gitlab
```shell
docker run --detach \
  --hostname 192.168.93.128 \
  --publish 443:443 --publish 80:80 \
  --name gitlab \
  --restart always \
  --volume /data/gitlab/config:/etc/gitlab:Z \
  --volume /data/gitlab/logs:/var/log/gitlab:Z \
  --volume /data/gitlab/data:/var/opt/gitlab:Z \
  --shm-size 256m \
  registry.gitlab.cn/omnibus/gitlab-jh:latest

```
