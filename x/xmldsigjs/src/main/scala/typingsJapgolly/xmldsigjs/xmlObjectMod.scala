package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/xml_object", JSImport.Namespace)
@js.native
object xmlObjectMod extends js.Object {
  @js.native
  abstract class XmlSignatureCollection[I /* <: XmlSignatureObject */] () extends XmlCollection[I]
  
  @js.native
  abstract class XmlSignatureObject () extends XmlObject
  
}

