package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.genericTimeStampMod.EncapsulatedTimeStampCollection
import typingsJapgolly.xadesjs.genericTimeStampMod.ReferenceInfos
import typingsJapgolly.xadesjs.genericTimeStampMod.XMLTimeStampCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/other_time_stamp", JSImport.Namespace)
@js.native
object otherTimeStampMod extends js.Object {
  @js.native
  class OtherTimeStamp () extends XmlObject {
    var CanonicalizationMethod: typingsJapgolly.xmldsigjs.mod.CanonicalizationMethod = js.native
    var EncapsulatedTimeStamp: EncapsulatedTimeStampCollection = js.native
    var Id: String = js.native
    var ReferenceInfo: ReferenceInfos = js.native
    var XMLTimeStamp: XMLTimeStampCollection = js.native
  }
  
}

