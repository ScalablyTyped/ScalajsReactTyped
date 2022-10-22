package typingsJapgolly.parchment

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MutationObserver
import org.scalajs.dom.MutationRecord
import org.scalajs.dom.Node
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Blot
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.BlotConstructor
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Root
import typingsJapgolly.parchment.distTypingsScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsBlotScrollMod {
  
  @JSImport("parchment/dist/typings/blot/scroll", JSImport.Default)
  @js.native
  open class default protected () extends ScrollBlot {
    def this(registry: typingsJapgolly.parchment.distTypingsRegistryMod.default, node: HTMLDivElement) = this()
  }
  object default {
    
    @JSImport("parchment/dist/typings/blot/scroll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.allowedChildren")
    @js.native
    def allowedChildren: js.Array[BlotConstructor] = js.native
    inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.blotName")
    @js.native
    def blotName: String = js.native
    inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
    
    /* was `typeof BlockBlot` */
    @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild")
    @js.native
    open class defaultChild protected ()
      extends typingsJapgolly.parchment.distTypingsBlotBlockMod.default {
      def this(scroll: Root, domNode: Node) = this()
    }
    /* was `typeof BlockBlot` */
    object defaultChild {
      
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.allowedChildren")
      @js.native
      def allowedChildren: js.Array[BlotConstructor] = js.native
      inline def allowedChildren_=(x: js.Array[BlotConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowedChildren")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.blotName")
      @js.native
      def blotName: String = js.native
      inline def blotName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blotName")(x.asInstanceOf[js.Any])
      
      /* static member */
      inline def formats(domNode: HTMLElement, scroll: Root): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formats")(domNode.asInstanceOf[js.Any], scroll.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.scope")
      @js.native
      def scope: Scope = js.native
      inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("parchment/dist/typings/blot/scroll", "default.defaultChild.tagName")
      @js.native
      def tagName: String = js.native
      inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.scope")
    @js.native
    def scope: Scope = js.native
    inline def scope_=(x: Scope): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scope")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parchment/dist/typings/blot/scroll", "default.tagName")
    @js.native
    def tagName: String = js.native
    inline def tagName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagName")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.parchment.distTypingsCollectionLinkedNodeMod.LinkedNode because Already inherited
  - typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Blot because Already inherited
  - typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Parent because Already inherited
  - typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Root because var conflicts: children, domNode, next, parent, prev, scroll, statics. Inlined create, create, create, create, create, create, find, find, find, find, query, query, query, query, query, query */ @js.native
  trait ScrollBlot
    extends typingsJapgolly.parchment.distTypingsBlotAbstractParentMod.default {
    
    def create(input: String): Blot = js.native
    def create(input: String, value: Any): Blot = js.native
    def create(input: Node): Blot = js.native
    def create(input: Node, value: Any): Blot = js.native
    def create(input: Scope): Blot = js.native
    def create(input: Scope, value: Any): Blot = js.native
    
    def find(): Blot | Null = js.native
    def find(node: Node): Blot | Null = js.native
    def find(node: Node, bubble: Boolean): Blot | Null = js.native
    def find(node: Null, bubble: Boolean): Blot | Null = js.native
    
    var observer: MutationObserver = js.native
    
    def query(query: String): typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: String, scope: Scope): typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node): typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Node, scope: Scope): typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope): typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    def query(query: Scope, scope: Scope): typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default | BlotConstructor | Null = js.native
    
    def register(definitions: Any*): Any = js.native
    
    var registry: typingsJapgolly.parchment.distTypingsRegistryMod.default = js.native
    
    def update(): Unit = js.native
    def update(mutations: js.Array[MutationRecord]): Unit = js.native
    def update(mutations: Unit, context: StringDictionary[Any]): Unit = js.native
  }
  object ScrollBlot {
    
    /* was `typeof BlockBlot` */
    type defaultChild = typingsJapgolly.parchment.distTypingsBlotBlockMod.default
  }
}
