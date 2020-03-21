package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One of:
  * - S for DATA_MODE_STRAIGHT; straight table representation
  * - P for DATA_MODE_PIVOT; pivot table representation
  * - K for DATA_MODE_PIVOT_STACK; stacked table representation
  * - T for DATA_MODE_TREE; tree representation
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.S
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.P
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.K
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.T
*/
trait NxHypercubeMode extends js.Object

object NxHypercubeMode {
  @scala.inline
  def K: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.K = this.cast("K")
  @scala.inline
  def P: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.P = this.cast("P")
  @scala.inline
  def S: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.S = this.cast("S")
  @scala.inline
  def T: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.T = this.cast("T")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

