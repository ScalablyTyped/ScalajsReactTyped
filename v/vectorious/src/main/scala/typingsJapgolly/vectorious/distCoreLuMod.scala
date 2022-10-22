package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreLuMod {
  
  @JSImport("vectorious/dist/core/lu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array]]
  
  inline def lu(x: ArrayLike[Any]): js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array]]
  inline def lu(x: NDArray): js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[NDArray, NDArray, js.typedarray.Int32Array]]
}
