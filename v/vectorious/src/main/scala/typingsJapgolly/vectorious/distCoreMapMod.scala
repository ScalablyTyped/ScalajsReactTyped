package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import typingsJapgolly.vectorious.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMapMod {
  
  @JSImport("vectorious/dist/core/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def map(
    x: ArrayLike[Any],
    f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]
  ): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def map(x: NDArray, f: js.Function3[/* value */ Double, /* i */ Double, /* src */ TypedArray, Double]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(x.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
