package typingsJapgolly.yaml

import typingsJapgolly.yaml.anon.Alias
import typingsJapgolly.yaml.anon.Collection
import typingsJapgolly.yaml.distDocDocumentMod.Document
import typingsJapgolly.yaml.distNodesNodeMod.Node
import typingsJapgolly.yaml.distNodesPairMod.Pair
import typingsJapgolly.yaml.yamlStrings.key
import typingsJapgolly.yaml.yamlStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVisitMod {
  
  object visit {
    
    inline def apply(node: Null, visitor: visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(node: Document[Node[Any]], visitor: visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(node: Node[Any], visitor: visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yaml/dist/visit", "visit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/visit", "visit.BREAK")
    @js.native
    def BREAK: js.Symbol = js.native
    inline def BREAK_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BREAK")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/visit", "visit.REMOVE")
    @js.native
    def REMOVE: js.Symbol = js.native
    inline def REMOVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/visit", "visit.SKIP")
    @js.native
    def SKIP: js.Symbol = js.native
    inline def SKIP_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
  }
  
  object visitAsync {
    
    inline def apply(node: Null, visitor: asyncVisitor): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply(node: Document[Node[Any]], visitor: asyncVisitor): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply(node: Node[Any], visitor: asyncVisitor): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("yaml/dist/visit", "visitAsync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/visit", "visitAsync.BREAK")
    @js.native
    def BREAK: js.Symbol = js.native
    inline def BREAK_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BREAK")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/visit", "visitAsync.REMOVE")
    @js.native
    def REMOVE: js.Symbol = js.native
    inline def REMOVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/visit", "visitAsync.SKIP")
    @js.native
    def SKIP: js.Symbol = js.native
    inline def SKIP_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
  }
  
  type asyncVisitor = asyncVisitorFn[Any] | Alias
  
  type asyncVisitorFn[T] = js.Function3[
    /* key */ Double | key | value | Null, 
    /* node */ T, 
    /* path */ js.Array[Document[Node[Any]] | Node[Any] | (Pair[Any, Any])], 
    Unit | js.Symbol | Double | Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | Node[Any] | (Pair[Any, Any])])
  ]
  
  type visitor = visitorFn[Any] | Collection
  
  type visitorFn[T] = js.Function3[
    /* key */ Double | key | value | Null, 
    /* node */ T, 
    /* path */ js.Array[Document[Node[Any]] | Node[Any] | (Pair[Any, Any])], 
    Unit | js.Symbol | Double | Node[Any] | (Pair[Any, Any])
  ]
}
