package typingsJapgolly.parchment

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.parchment.linkedNodeMod.LinkedNode because Already inherited
  - typingsJapgolly.parchment.blotMod.Blot because Already inherited
  - typingsJapgolly.parchment.blotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll. Inlined format, formats */ @js.native
  trait FormatBlot
    extends typingsJapgolly.parchment.containerMod.default {
    var attributes: typingsJapgolly.parchment.storeMod.default = js.native
    def format(name: String, value: js.Any): Unit = js.native
    def formats(): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  class default protected () extends FormatBlot {
    def this(domNode: Node) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def formats(domNode: HTMLElement): js.Any = js.native
  }
  
}

