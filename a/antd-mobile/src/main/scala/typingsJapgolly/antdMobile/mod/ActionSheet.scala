package typingsJapgolly.antdMobile.mod

import typingsJapgolly.antdMobile.actionSheetMod.ActionCallBack
import typingsJapgolly.antdMobile.actionSheetMod.ActionSheetWithOptions
import typingsJapgolly.antdMobile.actionSheetMod.ShareActionSheetWithOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile", "ActionSheet")
@js.native
object ActionSheet extends js.Object {
  def close(): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions): Unit = js.native
  def showActionSheetWithOptions(config: ActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions): Unit = js.native
  def showShareActionSheetWithOptions(config: ShareActionSheetWithOptions, callback: ActionCallBack): Unit = js.native
}

