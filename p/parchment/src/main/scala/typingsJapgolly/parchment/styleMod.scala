package typingsJapgolly.parchment

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/attributor/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  @js.native
  trait StyleAttributor
    extends typingsJapgolly.parchment.attributorMod.default
  
  @js.native
  class default () extends StyleAttributor
  
  /* static members */
  @js.native
  object default extends js.Object {
    def keys(node: Element): js.Array[String] = js.native
  }
  
}

