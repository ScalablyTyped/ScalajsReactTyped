package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.markMod._Clip
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSphere extends _Clip {
  var sphere: String | SignalRef
}

object AnonSphere {
  @scala.inline
  def apply(sphere: String | SignalRef): AnonSphere = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSphere]
  }
}

