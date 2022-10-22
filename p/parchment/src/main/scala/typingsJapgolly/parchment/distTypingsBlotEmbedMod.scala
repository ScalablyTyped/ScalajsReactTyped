package typingsJapgolly.parchment

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsBlotEmbedMod {
  
  @JSImport("parchment/dist/typings/blot/embed", JSImport.Default)
  @js.native
  open class default () extends EmbedBlot
  object default {
    
    @JSImport("parchment/dist/typings/blot/embed", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def formats(_domNode: HTMLElement, _scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(_domNode.asInstanceOf[js.Any], _scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.parchment.distTypingsCollectionLinkedNodeMod.LinkedNode because Already inherited
  - typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Blot because Already inherited
  - typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll, statics. Inlined format, formats */ @js.native
  trait EmbedBlot
    extends typingsJapgolly.parchment.distTypingsBlotAbstractLeafMod.default {
    
    def format(name: String, value: Any): Unit = js.native
    
    def formats(): StringDictionary[Any] = js.native
  }
}
