package typingsJapgolly.plottable.scalesMod

import typingsJapgolly.d3Time.mod.CountableTimeInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/scales", "Time")
@js.native
/**
  * A Time Scale maps Date objects to numbers.
  *
  * @constructor
  */
class Time ()
  extends typingsJapgolly.plottable.timeScaleMod.Time

/* static members */
@JSImport("plottable/build/src/scales", "Time")
@js.native
object Time extends js.Object {
  /**
    * Transforms the Plottable TimeInterval string into a d3 time interval equivalent.
    * If the provided TimeInterval is incorrect, the default is d3.timeYear
    */
  def timeIntervalToD3Time(timeInterval: String, useUTC: Boolean): CountableTimeInterval = js.native
}

