package typingsJapgolly.turistFetch

import typingsJapgolly.node.dnsMod.RecordWithTtl
import typingsJapgolly.turistFetch.anon.Typeofdns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolve6Mod {
  
  @JSImport("@turist/fetch/dist/resolve6", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(host: String, resolver: Typeofdns): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
}
