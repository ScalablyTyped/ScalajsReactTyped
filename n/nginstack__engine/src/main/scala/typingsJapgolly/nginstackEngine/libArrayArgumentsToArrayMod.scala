package typingsJapgolly.nginstackEngine

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libArrayArgumentsToArrayMod {
  
  inline def apply(args: ArrayLike[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def apply(args: ArrayLike[Any], opt_fromIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], opt_fromIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def apply(args: ArrayLike[Any], opt_fromIndex: Double, opt_toIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], opt_fromIndex.asInstanceOf[js.Any], opt_toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def apply(args: ArrayLike[Any], opt_fromIndex: Unit, opt_toIndex: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any], opt_fromIndex.asInstanceOf[js.Any], opt_toIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("@nginstack/engine/lib/array/argumentsToArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
