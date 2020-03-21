package typingsJapgolly.openfin.boundsChangedMod

import typingsJapgolly.openfin.baseMod.Reply
import typingsJapgolly.openfin.openfinStrings.`bounds-changed`
import typingsJapgolly.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundsChangedReply extends Reply[window, `bounds-changed`] {
  var changeType: BoundsChangeType = js.native
  var deferred: Boolean = js.native
  var height: Double = js.native
  var left: Double = js.native
  var top: Double = js.native
  var width: Double = js.native
}

