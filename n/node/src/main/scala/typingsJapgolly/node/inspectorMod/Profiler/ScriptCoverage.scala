package typingsJapgolly.node.inspectorMod.Profiler

import typingsJapgolly.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Coverage data for a JavaScript script.
  */
trait ScriptCoverage extends js.Object {
  /**
    * Functions contained in the script that has coverage data.
    */
  var functions: js.Array[FunctionCoverage]
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  /**
    * JavaScript script name or url.
    */
  var url: java.lang.String
}

object ScriptCoverage {
  @scala.inline
  def apply(functions: js.Array[FunctionCoverage], scriptId: ScriptId, url: java.lang.String): ScriptCoverage = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScriptCoverage]
  }
}

