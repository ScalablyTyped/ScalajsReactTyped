package typingsJapgolly.sharepoint.SP.BusinessData

import typingsJapgolly.sharepoint.SP.BooleanResult
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.EntityIdentifier")
@js.native
class EntityIdentifier () extends ClientObject {
  def containsLocalizedDisplayName(): BooleanResult = js.native
  def getDefaultDisplayName(): StringResult = js.native
  def getLocalizedDisplayName(): StringResult = js.native
  def get_identifierType(): String = js.native
  def get_name(): String = js.native
}

