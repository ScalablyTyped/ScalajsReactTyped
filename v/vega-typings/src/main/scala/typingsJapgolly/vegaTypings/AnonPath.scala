package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.markMod._Clip
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath extends _Clip {
  var path: String | SignalRef
}

object AnonPath {
  @scala.inline
  def apply(path: String | SignalRef): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPath]
  }
}

