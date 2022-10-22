package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreProjectMod {
  
  @JSImport("vectorious/dist/core/project", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def project(x: ArrayLike[Any], y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def project(x: ArrayLike[Any], y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def project(x: NDArray, y: ArrayLike[Any]): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def project(x: NDArray, y: NDArray): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("project")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
