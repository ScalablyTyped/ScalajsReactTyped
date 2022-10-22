package typingsJapgolly.lib0

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMapMod {
  
  @JSImport("lib0/dist/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all[K, V](m: Map[K, V], f: js.Function2[/* arg0 */ V, /* arg1 */ K, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(m.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def any[K, V](m: Map[K, V], f: js.Function2[/* arg0 */ V, /* arg1 */ K, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(m.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def copy[X, Y](m: Map[X, Y]): Map[X, Y] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(m.asInstanceOf[js.Any]).asInstanceOf[Map[X, Y]]
  
  inline def create(): Map[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Map[Any, Any]]
  
  inline def map[K, V, R](m: Map[K, V], f: js.Function2[/* arg0 */ V, /* arg1 */ K, R]): js.Array[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(m.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Array[R]]
  
  inline def setIfUndefined[T, K](map: Map[K, T], key: K, createT: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setIfUndefined")(map.asInstanceOf[js.Any], key.asInstanceOf[js.Any], createT.asInstanceOf[js.Any])).asInstanceOf[T]
}
