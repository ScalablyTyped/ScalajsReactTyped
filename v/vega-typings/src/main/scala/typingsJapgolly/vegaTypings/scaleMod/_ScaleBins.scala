package typingsJapgolly.vegaTypings.scaleMod

import typingsJapgolly.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ScaleBins extends js.Object

object _ScaleBins {
  @scala.inline
  def SignalRef(signal: String): _ScaleBins = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ScaleBins]
  }
  @scala.inline
  def AnonStart(step: Double | SignalRef, start: Double | SignalRef = null, stop: Double | SignalRef = null): _ScaleBins = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ScaleBins]
  }
}

