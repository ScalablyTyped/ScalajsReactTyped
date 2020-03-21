package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.audio
import typingsJapgolly.uniApp.uniAppStrings.image
import typingsJapgolly.uniApp.uniAppStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOption extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 要上传文件资源的路径
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * 文件类型，image/video/audio，仅支付宝小程序，且必填。
    * - image: 图像
    * - video: 视频
    * - audio: 音频
    */
  var fileType: js.UndefOr[image | video | audio] = js.undefined
  /**
    * 需要上传的文件列表。使用 files 时，filePath 和 name 不生效。仅 5+App 支持
    */
  var files: js.UndefOr[js.Array[UploadFileOptionFiles]] = js.undefined
  /**
    * HTTP 请求中其他额外的 form data
    */
  var formData: js.UndefOr[js.Any] = js.undefined
  /**
    * HTTP 请求 Header, header 中不能设置 Referer
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ UploadFileSuccessCallbackResult, Unit]] = js.undefined
  /**
    * 开发者服务器 url
    */
  var url: js.UndefOr[String] = js.undefined
}

object UploadFileOption {
  @scala.inline
  def apply(
    complete: /* result */ GeneralCallbackResult => Callback = null,
    fail: /* result */ GeneralCallbackResult => Callback = null,
    filePath: String = null,
    fileType: image | video | audio = null,
    files: js.Array[UploadFileOptionFiles] = null,
    formData: js.Any = null,
    header: js.Any = null,
    name: String = null,
    success: /* result */ UploadFileSuccessCallbackResult => Callback = null,
    url: String = null
  ): UploadFileOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GeneralCallbackResult) => fail(t0).runNow()))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.UploadFileSuccessCallbackResult) => success(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOption]
  }
}

