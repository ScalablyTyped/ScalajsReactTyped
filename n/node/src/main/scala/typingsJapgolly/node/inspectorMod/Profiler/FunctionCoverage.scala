package typingsJapgolly.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coverage data for a JavaScript function.
  */
trait FunctionCoverage extends js.Object {
  /**
    * JavaScript function name.
    */
  var functionName: String
  /**
    * Whether coverage data for this function has block granularity.
    */
  var isBlockCoverage: Boolean
  /**
    * Source ranges inside the function with coverage data.
    */
  var ranges: js.Array[CoverageRange]
}

object FunctionCoverage {
  @scala.inline
  def apply(functionName: String, isBlockCoverage: Boolean, ranges: js.Array[CoverageRange]): FunctionCoverage = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], isBlockCoverage = isBlockCoverage.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionCoverage]
  }
}

