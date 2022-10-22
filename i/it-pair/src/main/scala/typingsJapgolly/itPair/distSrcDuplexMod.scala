package typingsJapgolly.itPair

import typingsJapgolly.itStreamTypes.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDuplexMod {
  
  @JSImport("it-pair/dist/src/duplex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def duplexPair[T](): js.Tuple2[Duplex[T, T, js.Promise[Unit]], Duplex[T, T, js.Promise[Unit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplexPair")().asInstanceOf[js.Tuple2[Duplex[T, T, js.Promise[Unit]], Duplex[T, T, js.Promise[Unit]]]]
}
