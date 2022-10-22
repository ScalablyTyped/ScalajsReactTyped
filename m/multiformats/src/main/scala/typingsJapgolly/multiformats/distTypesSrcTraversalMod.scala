package typingsJapgolly.multiformats

import typingsJapgolly.multiformats.anon.Load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcTraversalMod {
  
  @JSImport("multiformats/dist/types/src/traversal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def walk(hasCidLoadSeen: Load): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(hasCidLoadSeen.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type BlockView[T, C, A, V] = typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.BlockView[T, C, A, V]
  
  type CID[C, A, V] = typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Any, C, A, V]
}
