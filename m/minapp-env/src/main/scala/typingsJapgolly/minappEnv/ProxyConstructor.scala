package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConstructor
  extends Instantiable2[/* target */ js.Object, /* handler */ ProxyHandler[js.Object], js.Object] {
  def revocable[T /* <: js.Object */](target: T, handler: ProxyHandler[T]): AnonProxy[T] = js.native
}

