package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmldsigjs.keyInfosMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_info", JSImport.Namespace)
@js.native
object keyInfoMod extends js.Object {
  @js.native
  class KeyInfo () extends XmlCollection[KeyInfoClause] {
    var Id: String = js.native
  }
  
}

