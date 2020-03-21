package typingsJapgolly.weappApi.mod.wx

import typingsJapgolly.weappApi.AnonAppId
import typingsJapgolly.weappApi.AnonVetsion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 帐号信息
trait AccountInfo extends js.Object {
  //  插件帐号信息（仅在插件中调用时包含这一项）
  var Plugin: AnonVetsion
  //  小程序帐号信息
  var miniProgram: AnonAppId
}

object AccountInfo {
  @scala.inline
  def apply(Plugin: AnonVetsion, miniProgram: AnonAppId): AccountInfo = {
    val __obj = js.Dynamic.literal(Plugin = Plugin.asInstanceOf[js.Any], miniProgram = miniProgram.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AccountInfo]
  }
}

