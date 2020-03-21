package typingsJapgolly.lightSdk.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Native_ extends js.Object {
  /**
    * 通过js添加导航栏按钮，目前允许在左右两边各加两个扩展按钮
    * @param params - 接口入参
    * @param params.title            文本按钮标题
    * @param params.icon            "图片按钮的图标，可支持格式：
    * 1. 远程图片url，必须以http://或https://开头
    * 2. 图片Base64编码，以base64://开头
    * 3. gmu／gmu_icon目录下的本地文件，相对路径且不包括文件后缀，如使用图片gmu/gmu_icon/test.png, 则次此参数为test"
    * @param params.action            "用户点击按钮触发的事件，可支持格式：
    * 1. 标准http或https url
    * 2. 标准gmu协议url
    * 3. JavaScript，以javascript：开头"
    * @param params.position            若为“left”，按钮添加在左侧，若为“right”，按钮添加在右侧，默认为“right”
    * @param params.tag           导航栏按钮红点的标识位，用于控制是否隐藏红点，注意：使用红点功能时该字段为必选字段
    * @param params.badges           红点json数据，如{ type: “num”, badge: 12,backgroundColor:”#ff6c00”}
    * 1. type字段{string}，分为num，dot两种，num为红点数据类型，dot为单纯小红点类型，即右上角就只有红色的圆点；num红点数据类型：右上角有红色的圆点且圆点中有数字显示
    * 2. badge字段{number}：红点显示的数字
    * 3. backgroundColor字段 ：设置红点的背景颜色
    * @param cb 功能处理后的回调函数
    */
  def addButton(params: js.Any, cb: js.Function0[Unit]): Unit
  /**
    * 通过JS发送统计分析埋点事件
    * @param params - 接口入参
    * @param params.event -事件ID，被统计事件的唯一标识（用户需要先在行为分析网站后台注册事件ID ，然后客户端采集的事件才能在网站后台展示）
    * @param params.attributes -事件附加属性，用户可根据业务需求为事件添加附加属性，默认值为{}
    * @param params.duration -事件时长（毫秒），该字段可以为持续性事件标识事件持续的时长，默认值为0
    * @param cb 功能处理后的回调函数
    */
  def analyticsSendEvent(params: js.Any, cb: js.Function0[Unit]): Unit
  /**
    * 通过js调用页面返回事件
    * @param params - 接口入参
    * @param params.number - 返回的层数。如为1，则返回上一层。大于等于页面栈数量，则返回首页，小于等于0，则无效。不配置该字段，则默认返回上一层
    * @param cb 功能处理后的回调函数
    */
  def back(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口页面中返回指定图片的base64编码字符串
    *
    * @param params - 接口入参
    * @param params.imagePickType - 选择用摄像头还是相册进行选择，默认2种都显示(carmer,album)单选图片，多选图片传入type为：(CAMERA_MUTIL-ALBUM)
    * @param params.cropPhoto - 是否剪裁
    * @param params.maxWidth - 最大宽度
    * @param params.aspectXY - 宽高比
    * @param params.maxCount - 宽高比
    * @param params.allowTakePicture - 多选图片(即type为CAMERA_MUTIL-ALBUM或MUTIL-ALBUM)情况下可选的最大照片数，默认为9。
    * @param params.reverselyOrdered - 多选图片(即type为CAMERA_MUTIL-ALBUM或MUTIL-ALBUM)情况下相册选择器是否倒序显示，默认正序显示，仅支持iOS
    * @param cb 功能处理后的回调函数
    */
  def chooseImage(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js调用关闭页面
    */
  def close(params: Null, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 用于向系统日历增加事件
    * @param params - 接口入参
    * @param params.startDate - 开始时间，格式：yyyy-MM-dd hh:mm:ss ，示例："2019-6-12 15:05:00"
    * @param params.endDate - 结束时间，格式同开始时间，默认值为开始时间，不填或所填时间小于开始时间，则为默认值
    * @param params.title - 标题
    * @param params.location - 位置信息
    * @param params.notes - 备注信息
    * @param params.alarmOffset - 提前提醒时间，单位：分 ，默认值为0，即事件开始时间提醒.注意事项：类型必须为整数，入参小于0时为默认值
    * @param cb 功能处理后的回调函数
    */
  def createCalendar(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 用于向系统日历删除事件
    * @param params - 接口入参
    * @param params.startDate - 开始时间，格式：yyyy-MM-dd hh:mm:ss ，示例："2019-6-12 15:05:00"
    * @param params.endDate - 结束时间，格式同开始时间，默认值为开始时间，不填或所填时间小于开始时间，则为默认值
    * @param params.id - 事件id
    * @param cb 功能处理后的回调函数
    */
  def deleteCalendar(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口在网页中删除存储在native的属性
    * @param params - 接口入参
    * @param params.key - native存储数据的key
    * @param params.multi_param - 一次性删除多个值如[{key:key1},{key:key2}]
    * @param params.scope - native存储域
    * @param cb 功能处理后的回调函数
    */
  def deleteData(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 文件预览，支持doc，docx ，xls，xlsx，pdf，txt，ppt ，pptX。
    * @param params - 接口入参
    * @param params.url -需要打开的文件地址
    * @param params.title -预览页面标题，如果不传title，默认为文件名（参见注意事项
    * @param cb 功能处理后的回调函数
    */
  def filePreview(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 文件下载保存功能。文件支持doc，docx ，xls，xlsx，pdf，txt，ppt ，pptX。
    * @param params - 接口入参
    * @param params.path -文件存放的相对路径，以’/‘开头，例’/aaa/bbb.docx’
    * @param params.url -文件的远程地址
    * @param params.data -文件数据的base64编码字符串（url与data至少有一个不为空，优先取url的值
    * @param params.overwrite -是否覆盖（默认不覆盖）
    * @param cb 功能处理后的回调函数
    */
  def fileSave(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口返回指定字符串内容的二维码图片的base64编码字符串
    *
    * @param params - 接口入参
    * @param params.desc - 需要被编码成二维码的内容
    * @param params.size - 二维码尺寸,默认为300x300，
    * @param cb 功能处理后的回调函数
    */
  def genCode(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口在网页中返回指定文件ID对应的base64编码字符串
    * @param params - 接口入参
    * @param params.path - 文件ID,协议为LightResource://xxx.类型
    */
  def getBase64(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口获取客户端系统剪贴板内容
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def getClipBoardContent(params: Null, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js获取手机通讯录信息
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def getContactInfo(params: Null, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口获得当前框架页面堆栈信息
    * @param params
    * @param cb
    */
  def getCurrentPages(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js调用获取经纬度
    * @param params - 接口入参
    * @param params.scanSpan - 定位刷新间隔（单位毫秒）
    * @param cb 功能处理后的回调函数
    */
  def getLocation(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 获取当前是否可获取定位状态
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def getLocationStatus(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口获取当前网络状态
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def getNetworkStatus(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口获取APP状态栏高度
    * @param params - 接口入参
    */
  def getStatusBarHeight(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过网页js获取客户端基本信息
    *
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def getSystemInfo(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口获取设备唯一标识码
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def getUDID(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过网页js获取客户端版本信息
    *
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def getVersion(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 修改导航栏透明度
    * @param params - 接口入参
    * @param params.alpha -设置透明度，透明度设置越小越透明
    * @param cb 功能处理后的回调函数
    */
  def headSetAlpha(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js设置导航栏搜索视图
    * @param params - 接口入参
    * @param params.icon -搜索框图标的文件名，native/res/icon目录下的本地文件，相对路径且不包括文件后缀，如使用图片native/res/icon/test.png， 则次此参数为test
    * @param params.backgroundColor -搜索框背景颜色，格式为 #ffffff，默认为白色
    * @param params.placeholderText -搜索框文字，默认为空
    * @param params.type -搜索框的输入类型，若type为input则为可以输入文字，否则只执行touch 跳转事件
    * @param params.placeholderTextColor -搜索框文字颜色，格式为 #ffffff，默认灰色
    * @param cb 功能处理后的回调函数
    */
  def headSetSearchView(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 苹果内购接口
    * @param params - 接口入参
    * @param params.apple_product_id -苹果商品ID(需要在苹果itunes connect平台创建商品)
    * @param params.orderId -商户订单号(此订单号为客户自己业务生成的订单号，用于最后一步校验苹果收据时做检测唯一性使用，保证内购链路完整性)
    * @param cb 功能处理后的回调函数
    */
  def iapPurchase(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口在网页中返回指定图片的文件ID，协议格式为LightResource://xxx.image
    * @param params - 接口入参
    * @param params.count - 最大可选照片数，默认 9 张，取值范围：1-9
    * @param params.sizeType -original原图，compressed 压缩图，默认 ['original','compressed']
    * @param params.sourceType - 相册选取或者拍照，默认 ['camera','album']
    */
  def imagePicker(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 图片预览功能，支持预览多张图片。
    * @param params - 接口入参
    * @param params.images -图片地址
    * @param params.selectedIndex -预览时的图片数组下标(从0开始)，表示展示当前选中的图片。默认情况为0
    * @param cb 功能处理后的回调函数
    */
  def imagePreview(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口记录日志信息
    * @param params - 接口入参
    * @param params.level -日志级别，取值有info,error,debug,warn,verbose
    * @param params.content -日志内容
    * @param cb 功能处理后的回调函数
    */
  def log(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 打开native系统特殊的外部链接 如电话，邮箱，短信，网页，其他APP等。
    * @param params - 接口入参
    * @param url - 电话: tel:10086 邮箱: mailto:abc@163.com 短信: sms:10086 网页:https://www.baidu.com App: weixin://
    * @param cb 功能处理后的回调函数
    */
  def openURL(params: js.Any, cb: js.Function0[Unit]): Unit
  /**
    * 通过js获取是否含有手势或指纹验证信息
    * @param params - 接口入参
    * @param params.verifyType    -验证方式（FP:指纹 GL:手势）
    * @param cb 功能处理后的回调函数
    */
  def preVerifyOpeation(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过JS获取推送消息
    * @param params - 接口入参
    * @param cb 功能处理后的回调函数
    */
  def pushAddEventListener(params: Null, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 当前用户添加标签
    * @deprecated
    * @param params - 接口入参
    * @param params.tags -用户所传的标签集合
    * @param cb
    */
  def pushAddTags(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 当前用户删除标签
    * @deprecated
    * @param params - 接口入参
    * @param params.tags -用户所传的标签集合
    * @param cb
    */
  def pushDeleteTags(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过JS获取推送registrationID
    * @deprecated
    * @param params - 接口入参
    * @param cb
    */
  def pushGetRegistrationID(params: Null, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 获取当前用户的所有标签
    * @deprecated
    * @param params
    * @param cb
    */
  def pushGetTags(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过JS向客户端传递推送alias，用于推送服务器定点推送
    * @param params - 接口入参
    * @param params.alias    -推送alias，为空字符串时为清除已有alias
    * @param cb 功能处理后的回调函数
    */
  def pushSetAlias(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 用于向系统日历查询事件
    * @param params - 接口入参
    * @param params.startDate - 开始时间，格式：yyyy-MM-dd hh:mm:ss ，示例："2019-6-12 15:05:00"
    * @param params.endDate - 结束时间，格式同开始时间，默认值为开始时间，不填或所填时间小于开始时间，则为默认值
    * @param params.id - 事件id
    * @param cb 功能处理后的回调函数
    */
  def queryCalendar(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口在网页中查询存储在native的属性
    * @param params - 接口入参
    * @param params.key - native存储数据的key
    * @param params.keepType - 传true：value可以支持string、object、array、boolean、number等类型的数据。默认false，即只支持string或object类型的数据
    * @param params.multi_param - 一次性读取多个值如[{key:key1},{key:key2}]
    * @param params.scope - native存储域
    * @param cb 功能处理后的回调函数
    */
  def readData(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js删除已添加的导航栏按钮
    * @param params - 接口入参
    * @param params.string    -若为“left”，则删除左侧按钮，若为“right”，则删除右侧按钮，默认为“right”
    * @param cb 功能处理后的回调函数
    */
  def removeButton(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js关闭安全键盘
    * @deprecated
    * @param params - 接口入参
    * @param cb
    */
  def safekeyboardHide(params: Null, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js展现安全键盘
    * @deprecated
    * @param params - 接口入参
    * @param params.textshow -Plain:明文显示，不加密（当textShow设置为Plain时，encryptMode无论设置成什么都不加密）。DelayAsterisk:字符0.5秒后变为星号。InstantAsterisk:字符输入后直接变为星号。默认为InstantAsterisk配置（大小写不明感，后面类型为string的配置项一样）
    * @param params.disorderEffect -appear:首次打开键盘时就乱序 click:点击按钮时才乱序，appearandclick:打开键盘就乱序且点击按钮也乱序。若无配置或配置字符串不符合这三个，则默认为click效果。注意:该字段须配合disorder字段一起使用。
    * @param params.disorder -none:不乱序。number:只有数字乱序。numberAndAlpha:数字字母都乱序。若无配置或配置字符串不符合这三个，则默认为none。
    * @param params.pressEffect -default:按钮点击后有点击效果，none:没有点击效果。默认为default。
    * @param params.keyboardType -number:数字键盘,alpha:字母键盘,symbol:符号键盘。配置组合支持四种：number|alpha、alpha|symbol、number、alpha|number|symbol、三者之间配置顺序可改变。默认为alpha|number|symbol
    * @param params.maxLength -设置最大输入长度，默认为16
    * @param params.encryptMode -设置加密方式，可选项有:AES（16个倍数的任意字符）、RSA（一大串字符）、MD5、SM2（x&y）、SM3(无)、SM4（16个任意字符）。不配置默认为MD5加密。
    * @param params.secretKey -密钥，若指定加密方式需要密钥则必须传递，否则不需要传递。若加密方式为SM2则传入的x,y密钥之间用‘&’符号连接，例如: "aaaaaaa&bbbbbb"
    * @param params.titleText -设置键盘顶部自定义文案，不配置或者配置字符串为空默认为“恒生安全输入键盘”。注意:不配置字段时，安全键盘顶部文案默认显示为safekeyboard.gmu中的配置。如果gmu中再没有的话，则默认显示为”恒生安全输入键盘”。
    * @param cb
    */
  def safekeyboardShow(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js对web页或JSNative页面上的图片进行本地化处理，保存至本地相册
    * @param params - 接口入参
    * @param params.image -图片数据，支持以下格式：1. 标准http或https图片链接 2. 图片base64编码，以data:image/png;base64, //开头
    * @param cb 功能处理后的回调函数
    */
  def saveImage(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口打开本地二维码扫描页面，扫码成功后在网页中返回扫码结果信息
    *
    * @param params - 接口入参
    * @param params.sideLength - 扫描区域边长相对于屏幕较短边长的百分比，取值范围(0,1]
    * @param params.offsetX - 扫描区域相对于屏幕左侧的偏移百分比，取值范围[0,1]
    * @param params.offsetY - 扫描区域相对于屏幕顶部的偏移百分比，取值范围[0,1]
    * @param params.type - 扫一扫识别类型。参数值有2种可选，qrcode：二维码， barcode：条形码，不传或参数错误时默认为二维码效果
    * @param cb 功能处理后的回调函数
    */
  def scanCode(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js修改导航栏背景色
    * @param params - 接口入参
    * @param params.color    -颜色，格式为 #ffffff
    * @param cb 功能处理后的回调函数
    */
  def setBackgroundColor(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口在web或者JSNative页面中复制内容到剪贴板
    * @param params - 接口入参
    * @param params.value - 需要复制到剪贴板的内容，目前只支持字符串
    * @param cb 功能处理后的回调函数
    */
  def setClipBoardContent(params: js.Any, cb: js.Any): Unit
  /**
    * 通过js接口设置屏幕方向
    * @param params - 接口入参
    * @param params.screenOrientation    -    landscape_left:左横屏  landscape_right：右横屏 portrait：竖屏
    * @param cb 功能处理后的回调函数
    */
  def setScreenOrientation(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口设置导航栏上下标题样式
    * @param params - 接口入参
    * @param params.title    -标题
    * @param params.subtitle    -副标题
    * @param cb 功能处理后的回调函数
    */
  def setSubtitle(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口设置屏幕可旋转方向
    * @param params - 接口入参
    * @param params.supportScreenOrientation    -    以数组形式，添加可设置方向。
    * @param cb 功能处理后的回调函数
    */
  def setSupportScreenOrientation(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口控制是否隐藏状态栏
    * @param params - 接口入参
    * @param params.hidden    -是否隐藏
    * @param cb 功能处理后的回调函数
    */
  def setSystemStatusBar(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 设置首页tab小红点
    * @param params - 接口入参
    * @param params.index -tab的index，值从0开始计数，须在tab个数范围内
    * @param params.type -0表示红点，1表示文本，默认为0
    * @param params.value -type为0时，忽略value字段值为""以外的所有值。若value为"",则清除红点。type为1时，value为必须字段，显示在红点中心的文本,若value为"",则清除文本
    * @param cb 功能处理后的回调函数
    */
  def setTabBarBadge(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口控制导航栏标题
    * @param params - 接口入参
    * @param params.title    -标题
    * @param cb 功能处理后的回调函数
    */
  def setTitle(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 控制导航栏红点按钮是否隐藏
    * @param params - 接口入参
    * @param params.type    -控制导航栏按钮红点是否隐藏，若为show 则显示红点,否则隐藏红点。
    * @param params.badgeId    -红点Id,供查询红点信息使用。注意:要跟你创建导航栏红点时Id保持一致。
    * @param cb 功能处理后的回调函数
    */
  def showNativeBadge(params: js.Any, cb: js.Function0[Unit]): Unit
  /**
    * 显示蒙层
    * @param params - 接口入参
    * @param params.data - 加载到蒙层WebView中页面数据，可以是字符串格式的HTML或URL（URL为远程地址或本地www下的HTML）
    * @param params.dataType -data的类型 strh5 或 url ，默认strh5 （strh5: 加载字符串格式HTML, url: 远程地址或本地www下的HTML）
    * @param params.callbackDataType - 返回的data字段类型 json 或 text，默认是text
    */
  def showOverlay(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js判断各个平台app在设备上是否已安装
    * @param params - 接口入参
    * @param params.type -平台类型，目前type值只支持'qq'，'weibo'，'weixin'三个
    * @param cb 功能处理后的回调函数
    */
  def socialAppInstalled(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 三方登录接口
    * @param params - 接口入参
    * @param params.type            登录平台类别,只支持qq,weibo,weixin三个type
    * @param cb 功能处理后的回调函数
    */
  def socialLogin(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js分享内容到各平台
    * @param params - 接口入参
    * @param params.title            分享标题
    * @param params.content            分享的描述信息
    * @param params.url            用户点击分享后打开的链接地址，
    * @param params.image    一般是标准http或https请求,可支持格式
    * 1.远程图片url，必须以http://或https://开头
    * 2. 图片Base64编码，以base64://开头
    * 3. gmu／gmu_icon目录下的本地文件，相对路径且不包括文件后缀，如使用图片gmu/gmu_icon/test.png, 则次此参数为test"
    * @param params.type    可选值：
    * “webpage”（分享网页)
    * “image”（分享图片) (注意:分享图片目前支持微信，微博，qq，钉钉。其他则不支持分享图片功能）
    * “file”（分享文件) (注意:本地地址需要为文件预览或文件下载接口所传的文件存放的相对路径地址。文件分享目前只支持微信，其他如qq，微博，钉钉则不支持文件分享功能。注意:微信朋友圈不支持文件分享功能）
    * (默认值：”webpage”)
    * @param params.channel 设置分享渠道，用户可指定将信息分享到哪个渠道上 ，注意：若配置了此参数，则无分享对话框弹出UI，不配置则会根据开发者的share.gmu中的配置生成动态生成分享对话框弹出，供用户选择分享渠道。
    * 可选值：
    * “weixin” （微信）
    * “weixin_timeline”（微信朋友圈）
    * “qq”（QQ）
    * “weibo”(微博)
    * “dingtalk”（钉钉）
    * “system”(系统分享)”
    * @param cb 功能处理后的回调函数
    */
  def socialShare(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js接口录制音频
    * @param params - 接口入参
    * @param params.duration -音频录制的最长时间，以秒为单位
    * @param cb 功能处理后的回调函数
    */
  def startRecord(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js调用关闭定位服务
    * @deprecated
    * @param params - 接口入参
    * @param cb
    */
  def stopLocation(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口结束录制音频
    * @param cb
    */
  def stopRecord(cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 用于实现网络请求
    * @param params - 接口入参
    * @param params.url - 请求的 URL
    * @param params.method - HTTP 方法 GET 或 POST ，默认GET
    * @param params.headers - HTTP 请求头
    * @param params.type - 响应类型， json，text 或是 jsonp （在原生实现中其实与 json 相同）
    * @param params.body - HTTP 请求体
    * @param params.timeout - 请求超时时间，单位ms,默认30000ms
    */
  def streamFetch(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口在网页或JsNative页面中切换底部tab
    *
    * @param params - 接口入参
    * @param params.index - 切换至下标为index位置的tab
    * @param cb 功能处理后的回调函数
    */
  def switchTab(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js传入经服务器加签后的订单信息(orderInfo)并调用相应支付渠道SDK的支付接口
    * @param params - 接口入参
    * @param params.channel_id -021:支付宝钱包022:微信钱包
    * @param params.orderInfo			- 具体内容见下方的”其他(当支付渠道为微信钱包时/当支付渠道为微信钱包时)”项
    * @param params.isSandBox			-是否进入沙箱环境（只对支付宝有效）
    * @param cb 功能处理后的回调函数
    */
  def tradePay(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * t通过js关闭交易键盘
    * @deprecated
    * @param params - 接口入参
    * @param params.type -关闭的键盘类型（price:交易价格键盘 volume:交易量键盘 search:股票代码搜索键盘）
    * @param cb
    */
  def tradekeyboardHide(params: js.Any, cb: js.Function1[/* res */ CallbackResultNoData, Unit]): Unit
  /**
    * 通过js展现交易键盘
    * @deprecated
    * @param params - 接口入参
    * @param params.type -验证方式（price:交易价格键盘 volume:交易量键盘 search:股票代码搜索键盘）
    * @param params.buttons -键盘工具栏按钮
    * @param params.funcKey -键盘工具栏按钮 注意:本字段只有search类型才支持，volume和price类型不支持
    * @param params.describe -键盘工具类描述
    * @param cb
    */
  def tradekeyboardShow(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 用于向系统日历更新相应事件信息
    * @param params - 接口入参
    * @param params.id - 事件id
    * @param params.startDate - 开始时间，格式：yyyy-MM-dd hh:mm:ss ，示例："2019-6-12 15:05:00"
    * @param params.endDate - 结束时间，格式同开始时间，默认值为开始时间，不填或所填时间小于开始时间，则为默认值
    * @param params.title - 标题
    * @param params.location - 位置信息
    * @param params.notes - 备注信息
    * @param params.alarmOffset - 提前提醒时间，单位：分 ，默认值为0，即事件开始时间提醒.注意事项：类型必须为整数，入参小于0时为默认值
    * @param cb 功能处理后的回调函数
    */
  def updateCalendar(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过JS获取登录用户信息
    * @param cb
    */
  def userGetInfo(cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js登录用户
    * @param params - 接口入参
    * @param params.uid			-用户hsid
    * @param params.mobile			-用户手机号码
    * @param params.token			-用户令牌
    * @param params.nickname			-用户昵称
    * @param params.photoURL			-用户头像地址
    * @param params.logoutWhenExit			-app退出后是否注销当前用户
    * @param cb 功能处理后的回调函数
    */
  def userLogin(params: js.Any, cb: js.Any): Unit
  /**
    * 通过js设置登录用户信息
    * @param params - 接口入参
    * @param params.uid			-用户hsid
    * @param params.mobile			-用户手机号码
    * @param params.token			-用户令牌
    * @param params.nickname			-用户昵称
    * @param params.photoURL			-用户头像地址
    * @param params.logoutWhenExit			-app退出后是否注销当前用户
    * @param params.extraInfo			-用户额外信息
    * @param cb 功能处理后的回调函数
    */
  def userSetInfo(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过JS退出用户登录
    * @param cb
    */
  def userlogout(cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js调用手势或指纹验证
    * @param params - 接口入参
    * @param params.verifyType    -验证方式（FP:指纹 GL:手势）
    * @param params.GLOpeationType    -只有verifyType为GL才可用，字段说明(verify:手势验证 set:手势设置 update:手势更新 close:清除手势)
    * @param params.otherTitle    -其他方式点击按钮title
    * @param params.additionalTitle    -附加方式点击按钮title
    * @param cb 功能处理后的回调函数
    */
  def verifyOpeation(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
  /**
    * 通过js接口在网页中向native保存数据
    * @param params - 接口入参
    * @param params.key - native存储数据的key
    * @param params.value - 向native保存的数据
    * @param params.keepType - 传true：value可以支持string、object、array、boolean、number等类型的数据。默认false，即只支持string或object类型的数据
    * @param params.multi_param - 一次性存储多个值如[{key:key1,value:value1},{key:key2,value:value1}]
    * @param params.scope - native存储域
    * @param cb 功能处理后的回调函数
    */
  def writeData(params: js.Any, cb: js.Function1[/* res */ CallbackResult, Unit]): Unit
}

object Native_ {
  @scala.inline
  def apply(
    addButton: (js.Any, js.Function0[Unit]) => Callback,
    analyticsSendEvent: (js.Any, js.Function0[Unit]) => Callback,
    back: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    chooseImage: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    close: (Null, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    createCalendar: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    deleteCalendar: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    deleteData: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    filePreview: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    fileSave: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    genCode: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getBase64: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getClipBoardContent: (Null, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getContactInfo: (Null, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getCurrentPages: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getLocation: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getLocationStatus: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getNetworkStatus: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getStatusBarHeight: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getSystemInfo: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getUDID: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    getVersion: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    headSetAlpha: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    headSetSearchView: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    iapPurchase: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    imagePicker: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    imagePreview: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    log: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    openURL: (js.Any, js.Function0[Unit]) => Callback,
    preVerifyOpeation: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    pushAddEventListener: (Null, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    pushAddTags: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    pushDeleteTags: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    pushGetRegistrationID: (Null, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    pushGetTags: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    pushSetAlias: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    queryCalendar: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    readData: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    removeButton: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    safekeyboardHide: (Null, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    safekeyboardShow: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    saveImage: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    scanCode: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    setBackgroundColor: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    setClipBoardContent: (js.Any, js.Any) => Callback,
    setScreenOrientation: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    setSubtitle: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    setSupportScreenOrientation: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    setSystemStatusBar: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    setTabBarBadge: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    setTitle: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    showNativeBadge: (js.Any, js.Function0[Unit]) => Callback,
    showOverlay: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    socialAppInstalled: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    socialLogin: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    socialShare: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    startRecord: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    stopLocation: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    stopRecord: js.Function1[/* res */ CallbackResult, Unit] => Callback,
    streamFetch: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    switchTab: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    tradePay: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    tradekeyboardHide: (js.Any, js.Function1[/* res */ CallbackResultNoData, Unit]) => Callback,
    tradekeyboardShow: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    updateCalendar: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    userGetInfo: js.Function1[/* res */ CallbackResult, Unit] => Callback,
    userLogin: (js.Any, js.Any) => Callback,
    userSetInfo: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    userlogout: js.Function1[/* res */ CallbackResult, Unit] => Callback,
    verifyOpeation: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback,
    writeData: (js.Any, js.Function1[/* res */ CallbackResult, Unit]) => Callback
  ): Native_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addButton")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => addButton(t0, t1).runNow()))
    __obj.updateDynamic("analyticsSendEvent")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => analyticsSendEvent(t0, t1).runNow()))
    __obj.updateDynamic("back")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => back(t0, t1).runNow()))
    __obj.updateDynamic("chooseImage")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => chooseImage(t0, t1).runNow()))
    __obj.updateDynamic("close")(js.Any.fromFunction2((t0: scala.Null, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => close(t0, t1).runNow()))
    __obj.updateDynamic("createCalendar")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => createCalendar(t0, t1).runNow()))
    __obj.updateDynamic("deleteCalendar")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => deleteCalendar(t0, t1).runNow()))
    __obj.updateDynamic("deleteData")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => deleteData(t0, t1).runNow()))
    __obj.updateDynamic("filePreview")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => filePreview(t0, t1).runNow()))
    __obj.updateDynamic("fileSave")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => fileSave(t0, t1).runNow()))
    __obj.updateDynamic("genCode")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => genCode(t0, t1).runNow()))
    __obj.updateDynamic("getBase64")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getBase64(t0, t1).runNow()))
    __obj.updateDynamic("getClipBoardContent")(js.Any.fromFunction2((t0: scala.Null, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getClipBoardContent(t0, t1).runNow()))
    __obj.updateDynamic("getContactInfo")(js.Any.fromFunction2((t0: scala.Null, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getContactInfo(t0, t1).runNow()))
    __obj.updateDynamic("getCurrentPages")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getCurrentPages(t0, t1).runNow()))
    __obj.updateDynamic("getLocation")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getLocation(t0, t1).runNow()))
    __obj.updateDynamic("getLocationStatus")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getLocationStatus(t0, t1).runNow()))
    __obj.updateDynamic("getNetworkStatus")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getNetworkStatus(t0, t1).runNow()))
    __obj.updateDynamic("getStatusBarHeight")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getStatusBarHeight(t0, t1).runNow()))
    __obj.updateDynamic("getSystemInfo")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getSystemInfo(t0, t1).runNow()))
    __obj.updateDynamic("getUDID")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getUDID(t0, t1).runNow()))
    __obj.updateDynamic("getVersion")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => getVersion(t0, t1).runNow()))
    __obj.updateDynamic("headSetAlpha")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => headSetAlpha(t0, t1).runNow()))
    __obj.updateDynamic("headSetSearchView")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => headSetSearchView(t0, t1).runNow()))
    __obj.updateDynamic("iapPurchase")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => iapPurchase(t0, t1).runNow()))
    __obj.updateDynamic("imagePicker")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => imagePicker(t0, t1).runNow()))
    __obj.updateDynamic("imagePreview")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => imagePreview(t0, t1).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => log(t0, t1).runNow()))
    __obj.updateDynamic("openURL")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => openURL(t0, t1).runNow()))
    __obj.updateDynamic("preVerifyOpeation")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => preVerifyOpeation(t0, t1).runNow()))
    __obj.updateDynamic("pushAddEventListener")(js.Any.fromFunction2((t0: scala.Null, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => pushAddEventListener(t0, t1).runNow()))
    __obj.updateDynamic("pushAddTags")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => pushAddTags(t0, t1).runNow()))
    __obj.updateDynamic("pushDeleteTags")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => pushDeleteTags(t0, t1).runNow()))
    __obj.updateDynamic("pushGetRegistrationID")(js.Any.fromFunction2((t0: scala.Null, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => pushGetRegistrationID(t0, t1).runNow()))
    __obj.updateDynamic("pushGetTags")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => pushGetTags(t0, t1).runNow()))
    __obj.updateDynamic("pushSetAlias")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => pushSetAlias(t0, t1).runNow()))
    __obj.updateDynamic("queryCalendar")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => queryCalendar(t0, t1).runNow()))
    __obj.updateDynamic("readData")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => readData(t0, t1).runNow()))
    __obj.updateDynamic("removeButton")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => removeButton(t0, t1).runNow()))
    __obj.updateDynamic("safekeyboardHide")(js.Any.fromFunction2((t0: scala.Null, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => safekeyboardHide(t0, t1).runNow()))
    __obj.updateDynamic("safekeyboardShow")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => safekeyboardShow(t0, t1).runNow()))
    __obj.updateDynamic("saveImage")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => saveImage(t0, t1).runNow()))
    __obj.updateDynamic("scanCode")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => scanCode(t0, t1).runNow()))
    __obj.updateDynamic("setBackgroundColor")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => setBackgroundColor(t0, t1).runNow()))
    __obj.updateDynamic("setClipBoardContent")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => setClipBoardContent(t0, t1).runNow()))
    __obj.updateDynamic("setScreenOrientation")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => setScreenOrientation(t0, t1).runNow()))
    __obj.updateDynamic("setSubtitle")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => setSubtitle(t0, t1).runNow()))
    __obj.updateDynamic("setSupportScreenOrientation")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => setSupportScreenOrientation(t0, t1).runNow()))
    __obj.updateDynamic("setSystemStatusBar")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => setSystemStatusBar(t0, t1).runNow()))
    __obj.updateDynamic("setTabBarBadge")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => setTabBarBadge(t0, t1).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => setTitle(t0, t1).runNow()))
    __obj.updateDynamic("showNativeBadge")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => showNativeBadge(t0, t1).runNow()))
    __obj.updateDynamic("showOverlay")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => showOverlay(t0, t1).runNow()))
    __obj.updateDynamic("socialAppInstalled")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => socialAppInstalled(t0, t1).runNow()))
    __obj.updateDynamic("socialLogin")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => socialLogin(t0, t1).runNow()))
    __obj.updateDynamic("socialShare")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => socialShare(t0, t1).runNow()))
    __obj.updateDynamic("startRecord")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => startRecord(t0, t1).runNow()))
    __obj.updateDynamic("stopLocation")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => stopLocation(t0, t1).runNow()))
    __obj.updateDynamic("stopRecord")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => stopRecord(t0).runNow()))
    __obj.updateDynamic("streamFetch")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => streamFetch(t0, t1).runNow()))
    __obj.updateDynamic("switchTab")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => switchTab(t0, t1).runNow()))
    __obj.updateDynamic("tradePay")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => tradePay(t0, t1).runNow()))
    __obj.updateDynamic("tradekeyboardHide")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResultNoData, scala.Unit]) => tradekeyboardHide(t0, t1).runNow()))
    __obj.updateDynamic("tradekeyboardShow")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => tradekeyboardShow(t0, t1).runNow()))
    __obj.updateDynamic("updateCalendar")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => updateCalendar(t0, t1).runNow()))
    __obj.updateDynamic("userGetInfo")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => userGetInfo(t0).runNow()))
    __obj.updateDynamic("userLogin")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => userLogin(t0, t1).runNow()))
    __obj.updateDynamic("userSetInfo")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => userSetInfo(t0, t1).runNow()))
    __obj.updateDynamic("userlogout")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => userlogout(t0).runNow()))
    __obj.updateDynamic("verifyOpeation")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => verifyOpeation(t0, t1).runNow()))
    __obj.updateDynamic("writeData")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[/* res */ typingsJapgolly.lightSdk.mod.CallbackResult, scala.Unit]) => writeData(t0, t1).runNow()))
    __obj.asInstanceOf[Native_]
  }
}

