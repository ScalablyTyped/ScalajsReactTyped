package typingsJapgolly.dynamicTimeWarping.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  class DynamicTimeWarping[T] protected () extends js.Object {
    def this(ser1: js.Array[T], ser2: js.Array[T], distFunc: js.Function2[/* a */ T, /* b */ T, Double]) = this()
    def getDistance(): Double = js.native
    def getPath(): js.Array[js.Tuple2[Double, Double]] = js.native
  }
  
}

