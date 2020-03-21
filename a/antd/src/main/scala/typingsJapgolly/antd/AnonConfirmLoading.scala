package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.danger
import typingsJapgolly.antd.antdStrings.dashed
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.ghost
import typingsJapgolly.antd.antdStrings.link
import typingsJapgolly.antd.antdStrings.primary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfirmLoading extends js.Object {
  var confirmLoading: Boolean
  var maskTransitionName: String
  var okType: link | dashed | default | primary | ghost | danger
  var transitionName: String
  var visible: Boolean
  var width: Double
}

object AnonConfirmLoading {
  @scala.inline
  def apply(
    confirmLoading: Boolean,
    maskTransitionName: String,
    okType: link | dashed | default | primary | ghost | danger,
    transitionName: String,
    visible: Boolean,
    width: Double
  ): AnonConfirmLoading = {
    val __obj = js.Dynamic.literal(confirmLoading = confirmLoading.asInstanceOf[js.Any], maskTransitionName = maskTransitionName.asInstanceOf[js.Any], okType = okType.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfirmLoading]
  }
}

