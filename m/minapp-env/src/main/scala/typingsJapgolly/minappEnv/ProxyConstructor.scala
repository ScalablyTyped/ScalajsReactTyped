package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.minappEnv.anon.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyConstructor
  extends StObject
     with Instantiable2[/* target */ js.Object, /* handler */ ProxyHandler[js.Object], js.Object] {
  
  def revocable[T /* <: js.Object */](target: T, handler: ProxyHandler[T]): Proxy[T] = js.native
}
