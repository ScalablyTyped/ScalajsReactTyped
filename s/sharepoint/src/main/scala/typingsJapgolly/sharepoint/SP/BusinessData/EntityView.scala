package typingsJapgolly.sharepoint.SP.BusinessData

import typingsJapgolly.sharepoint.SP.BusinessData.Collections.EntityFieldCollection
import typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.EntityView")
@js.native
class EntityView () extends ClientObject {
  def getDefaultValues(): EntityFieldValueDictionary = js.native
  def getType(fieldDotNotation: String): StringResult = js.native
  def getTypeDescriptor(fieldDotNotation: String): TypeDescriptor = js.native
  def getXmlSchema(): StringResult = js.native
  def get_fields(): EntityFieldCollection = js.native
  def get_name(): String = js.native
  def get_relatedSpecificFinderName(): String = js.native
}

