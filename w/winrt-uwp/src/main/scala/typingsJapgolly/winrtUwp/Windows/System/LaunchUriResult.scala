package typingsJapgolly.winrtUwp.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the results of a Uri launch. */
@JSGlobal("Windows.System.LaunchUriResult")
@js.native
abstract class LaunchUriResult () extends js.Object {
  /** Gets the result of the Uri launch. */
  var result: ValueSet = js.native
  /** Gets the status of the Uri launch. */
  var status: LaunchUriStatus = js.native
}

