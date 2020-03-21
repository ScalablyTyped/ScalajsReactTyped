package typingsJapgolly.marko

import org.scalajs.dom.raw.Node
import typingsJapgolly.marko.componentMod.Component
import typingsJapgolly.marko.domElementMod.DomElement
import typingsJapgolly.marko.markoBooleans.`false`
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html/RenderResult", JSImport.Namespace)
@js.native
object renderResultMod extends js.Object {
  @js.native
  trait RenderResult extends DomElement {
    var document: Document_ | `false` = js.native
    def apply(out: js.Any): this.type = js.native
    def afterInsert(doc: Document_): this.type = js.native
    def getComponent(): Component = js.native
    def getComponents(): js.Array[Component] = js.native
    def getComponents(selector: js.Any): js.Array[Component] = js.native
    def getNode(doc: Document_): Node = js.native
    def getOutput(): js.Any = js.native
  }
  
}

