package typingsJapgolly.jpushReactNative

import typingsJapgolly.jpushReactNative.mod.Extra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentExtras extends js.Object {
  /**
    * 对应 Portal 推送消息界面上的“自定义消息内容”字段
    */
  var content: String
  /**
    * 对应 Portal 推送消息界面上的“可选设置”里的附加字段
    */
  var extras: Extra
  /**
    * 唯一标识自定义消息的 ID
    */
  var messageID: String
}

object AnonContentExtras {
  @scala.inline
  def apply(content: String, extras: Extra, messageID: String): AnonContentExtras = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentExtras]
  }
}

