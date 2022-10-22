package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreLuFactorMod {
  
  @JSImport("vectorious/dist/core/lu_factor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[NDArray, js.typedarray.Int32Array]]
  
  inline def luFactor(x: ArrayLike[Any]): js.Tuple2[NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu_factor")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, js.typedarray.Int32Array]]
  inline def luFactor(x: NDArray): js.Tuple2[NDArray, js.typedarray.Int32Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("lu_factor")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[NDArray, js.typedarray.Int32Array]]
}
