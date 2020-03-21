package typingsJapgolly.parchment

import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.Text
import typingsJapgolly.parchment.registryMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  @js.native
  trait TextBlot
    extends typingsJapgolly.parchment.leafMod.default {
    @JSName("domNode")
    var domNode_TextBlot: Text = js.native
    var text: String = js.native
  }
  
  @js.native
  class default protected () extends TextBlot {
    def this(node: Node) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var blotName: String = js.native
    var scope: Scope = js.native
    def create(value: String): Text = js.native
    def value(domNode: Text): String = js.native
  }
  
}

