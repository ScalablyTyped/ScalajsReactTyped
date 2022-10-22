package typingsJapgolly.tarn

import typingsJapgolly.tarn.distPoolMod.PoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tarn", "Pool")
  @js.native
  open class Pool[T] protected ()
    extends typingsJapgolly.tarn.distPoolMod.Pool[T] {
    def this(opt: PoolOptions[T]) = this()
  }
  
  @JSImport("tarn", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typingsJapgolly.tarn.distTimeoutErrorMod.TimeoutError
}
