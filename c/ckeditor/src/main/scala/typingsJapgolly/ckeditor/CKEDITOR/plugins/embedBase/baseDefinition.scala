package typingsJapgolly.ckeditor.CKEDITOR.plugins.embedBase

import typingsJapgolly.ckeditor.CKEDITOR.plugins.widget.definition
import typingsJapgolly.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseDefinition extends definition {
  var providerUrl: template = js.native
  var urlRegExp: js.RegExp = js.native
  def getErrorMessage(messageTypeOrMessage: String): String = js.native
  def getErrorMessage(messageTypeOrMessage: String, url: String): String = js.native
  def getErrorMessage(messageTypeOrMessage: String, url: String, suffix: String): String = js.native
  def isUrlValid(url: String): Boolean = js.native
  def loadContent(url: String): request = js.native
  def loadContent(url: String, callback: js.Function0[Unit]): request = js.native
  def loadContent(url: String, callback: js.Function0[Unit], errorCallback: js.Function1[/* error */ String, Unit]): request = js.native
  def loadContent(
    url: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* error */ String, Unit],
    noNotifications: Boolean
  ): request = js.native
}

