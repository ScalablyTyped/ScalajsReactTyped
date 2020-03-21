package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.xmlBaseMod.XadesObject
import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/any", JSImport.Namespace)
@js.native
object anyMod extends js.Object {
  @js.native
  class Any () extends XmlObject {
    var Value: String = js.native
  }
  
  @js.native
  class AnyCollection () extends XmlCollection[XadesObject]
  
}

