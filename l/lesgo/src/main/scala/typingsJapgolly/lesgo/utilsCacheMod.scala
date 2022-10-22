package typingsJapgolly.lesgo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCacheMod {
  
  @JSImport("lesgo/utils/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def del(key: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def ec(): typingsJapgolly.memcached.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("ec")().asInstanceOf[typingsJapgolly.memcached.mod.^]
  inline def ec(conn: String): typingsJapgolly.memcached.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("ec")(conn.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.memcached.mod.^]
  
  inline def get(key: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def set(key: String, `val`: Any, lifetime: Double): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], lifetime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
