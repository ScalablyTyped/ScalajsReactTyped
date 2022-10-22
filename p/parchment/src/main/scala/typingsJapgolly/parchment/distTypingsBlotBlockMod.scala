package typingsJapgolly.parchment

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.BlotConstructor
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Root
import typingsJapgolly.parchment.distTypingsScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsBlotBlockMod {
  
  @JSImport("parchment/dist/typings/blot/block", JSImport.Default)
  @js.native
  open class default protected () extends BlockBlot {
    def this(scroll: Root, domNode: Node) = this()
  }
  object default {
    
    @JSImport("parchment/dist/typings/blot/block", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/block", "default.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/block", "default.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def formats(domNode: HTMLElement, scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(domNode.asInstanceOf[js.Any], scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/block", "default.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/block", "default.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.parchment.distTypingsCollectionLinkedNodeMod.LinkedNode because Already inherited
  - typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Blot because Already inherited
  - typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Formattable because var conflicts: domNode, next, parent, prev, scroll, statics. Inlined format, formats */ @js.native
  trait BlockBlot
    extends typingsJapgolly.parchment.distTypingsBlotAbstractParentMod.default {
    
    /* protected */ var attributes: typingsJapgolly.parchment.distTypingsAttributorStoreMod.default = js.native
    
    def format(name: String, value: Any): Unit = js.native
    
    def formats(): StringDictionary[Any] = js.native
  }
}
