package typingsJapgolly.parchment

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/embed", JSImport.Namespace)
@js.native
object embedMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.parchment.linkedNodeMod.LinkedNode because Already inherited
  - typingsJapgolly.parchment.blotMod.Blot because Already inherited
  - typingsJapgolly.parchment.blotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll. Inlined format, formats */ @js.native
  trait EmbedBlot
    extends typingsJapgolly.parchment.leafMod.default {
    def format(name: String, value: js.Any): Unit = js.native
    def formats(): StringDictionary[js.Any] = js.native
  }
  
  @js.native
  class default () extends EmbedBlot
  
  /* static members */
  @js.native
  object default extends js.Object {
    def formats(domNode: HTMLElement): js.Any = js.native
  }
  
}

