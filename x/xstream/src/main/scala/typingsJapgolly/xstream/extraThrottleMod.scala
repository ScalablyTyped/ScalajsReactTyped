package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraThrottleMod {
  
  @JSImport("xstream/extra/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](period: Double): js.Function1[/* ins */ Stream[T], Stream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(period.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ins */ Stream[T], Stream[T]]]
}
