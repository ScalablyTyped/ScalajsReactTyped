package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/data_object", JSImport.Namespace)
@js.native
object dataObjectMod extends js.Object {
  @js.native
  class DataObject () extends XmlObject {
    var Encoding: String = js.native
    var Id: String = js.native
    var MimeType: String = js.native
  }
  
  @js.native
  class DataObjects () extends XmlCollection[DataObject]
  
}

