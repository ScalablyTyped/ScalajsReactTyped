package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreScaleMod {
  
  @JSImport("vectorious/dist/core/scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(scalar: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scalar.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def scale(x: ArrayLike[Any], scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(x.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def scale(x: NDArray, scalar: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(x.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
