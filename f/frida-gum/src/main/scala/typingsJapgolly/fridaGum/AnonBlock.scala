package typingsJapgolly.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlock extends js.Object {
  /**
    * Whether to generate an event whenever a basic block is executed.
    *
    * Useful to record a coarse execution trace.
    */
  var block: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate events for CALL/BLR instructions.
    */
  var call: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate an event whenever a basic block is compiled.
    *
    * Useful for coverage.
    */
  var compile: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate events for all instructions.
    *
    * Not recommended as it's potentially a lot of data.
    */
  var exec: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to generate events for RET instructions.
    */
  var ret: js.UndefOr[Boolean] = js.undefined
}

object AnonBlock {
  @scala.inline
  def apply(
    block: js.UndefOr[Boolean] = js.undefined,
    call: js.UndefOr[Boolean] = js.undefined,
    compile: js.UndefOr[Boolean] = js.undefined,
    exec: js.UndefOr[Boolean] = js.undefined,
    ret: js.UndefOr[Boolean] = js.undefined
  ): AnonBlock = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (!js.isUndefined(call)) __obj.updateDynamic("call")(call.asInstanceOf[js.Any])
    if (!js.isUndefined(compile)) __obj.updateDynamic("compile")(compile.asInstanceOf[js.Any])
    if (!js.isUndefined(exec)) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (!js.isUndefined(ret)) __obj.updateDynamic("ret")(ret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
}

