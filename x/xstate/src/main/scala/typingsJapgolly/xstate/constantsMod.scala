package typingsJapgolly.xstate

import typingsJapgolly.xstate.typesMod.ActivityMap
import typingsJapgolly.xstate.typesMod.DefaultGuardType
import typingsJapgolly.xstate.xstateStrings.Dot
import typingsJapgolly.xstate.xstateStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  val DEFAULT_GUARD_TYPE: DefaultGuardType = js.native
  val EMPTY_ACTIVITY_MAP: ActivityMap = js.native
  val STATE_DELIMITER: Dot = js.native
  val TARGETLESS_KEY: _empty = js.native
}

