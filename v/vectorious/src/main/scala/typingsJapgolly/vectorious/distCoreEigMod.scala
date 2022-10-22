package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreEigMod {
  
  @JSImport("vectorious/dist/core/eig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[NDArray, NDArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[NDArray, NDArray]]
  
  inline def eig(x: ArrayLike[Any]): js.Tuple2[NDArray, NDArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("eig")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, NDArray]]
  inline def eig(x: NDArray): js.Tuple2[NDArray, NDArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("eig")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, NDArray]]
}
