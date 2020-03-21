package typingsJapgolly.sharepoint.SP.Publishing

import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PageLayoutCreationInformation")
@js.native
class PageLayoutCreationInformation () extends ClientValueObject {
  def get_associatedContentTypeId(): String = js.native
  def get_masterPageUrl(): String = js.native
  def get_newPageLayoutEditablePath(): String = js.native
  def get_newPageLayoutNameWithoutExtension(): String = js.native
  def get_web(): Web = js.native
  def set_associatedContentTypeId(value: String): String = js.native
  def set_masterPageUrl(value: String): String = js.native
  def set_newPageLayoutEditablePath(value: String): String = js.native
  def set_newPageLayoutNameWithoutExtension(value: String): String = js.native
  def set_web(value: Web): Web = js.native
}

