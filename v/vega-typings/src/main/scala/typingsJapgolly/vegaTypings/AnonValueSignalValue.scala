package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.onEventsMod._Update
import typingsJapgolly.vegaTypings.signalMod.SignalValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueSignalValue extends _Update {
  var value: SignalValue
}

object AnonValueSignalValue {
  @scala.inline
  def apply(value: SignalValue): AnonValueSignalValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValueSignalValue]
  }
}

