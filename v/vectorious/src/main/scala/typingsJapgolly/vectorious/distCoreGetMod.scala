package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreGetMod {
  
  @JSImport("vectorious/dist/core/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(indices: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(indices.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def get(x: ArrayLike[Any], indices: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(scala.List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
  inline def get(x: NDArray, indices: Double*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(scala.List(x.asInstanceOf[js.Any]).`++`(indices.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Double]
}
