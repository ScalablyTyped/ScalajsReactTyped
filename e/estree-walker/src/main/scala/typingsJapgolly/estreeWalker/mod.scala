package typingsJapgolly.estreeWalker

import typingsJapgolly.estreeWalker.anon.Enter
import typingsJapgolly.estreeWalker.anon.Leave
import typingsJapgolly.estreeWalker.anon.Remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("estree-walker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncWalk(ast: typingsJapgolly.estree.mod.BaseNode, hasEnterLeave: Enter): js.Promise[typingsJapgolly.estree.mod.BaseNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncWalk")(ast.asInstanceOf[js.Any], hasEnterLeave.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.estree.mod.BaseNode]]
  
  inline def walk(ast: typingsJapgolly.estree.mod.BaseNode, hasEnterLeave: Leave): typingsJapgolly.estree.mod.BaseNode = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], hasEnterLeave.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.estree.mod.BaseNode]
  
  type AsyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typingsJapgolly.estree.mod.BaseNode, 
    /* parent */ typingsJapgolly.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    js.Promise[Unit]
  ]
  
  type BaseNode = typingsJapgolly.estree.mod.BaseNode
  
  type SyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typingsJapgolly.estree.mod.BaseNode, 
    /* parent */ typingsJapgolly.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    Unit
  ]
}
