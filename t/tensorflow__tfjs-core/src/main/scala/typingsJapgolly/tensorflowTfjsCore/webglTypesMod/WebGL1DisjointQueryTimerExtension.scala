package typingsJapgolly.tensorflowTfjsCore.webglTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGL1DisjointQueryTimerExtension extends js.Object {
  var GPU_DISJOINT_EXT: Double
  var QUERY_RESULT_AVAILABLE_EXT: Double
  var QUERY_RESULT_EXT: Double
  var TIME_ELAPSED_EXT: Double
  def beginQueryEXT(ext: Double, query: WebGLQuery): Unit
  def createQueryEXT(): js.Object
  def deleteQueryEXT(query: WebGLQuery): Unit
  def endQueryEXT(ext: Double): Unit
  def getQueryObjectEXT(query: WebGLQuery, queryResultAvailableExt: Double): Double
  def isQueryEXT(query: WebGLQuery): Boolean
}

object WebGL1DisjointQueryTimerExtension {
  @scala.inline
  def apply(
    GPU_DISJOINT_EXT: Double,
    QUERY_RESULT_AVAILABLE_EXT: Double,
    QUERY_RESULT_EXT: Double,
    TIME_ELAPSED_EXT: Double,
    beginQueryEXT: (Double, WebGLQuery) => Callback,
    createQueryEXT: CallbackTo[js.Object],
    deleteQueryEXT: WebGLQuery => Callback,
    endQueryEXT: Double => Callback,
    getQueryObjectEXT: (WebGLQuery, Double) => CallbackTo[Double],
    isQueryEXT: WebGLQuery => CallbackTo[Boolean]
  ): WebGL1DisjointQueryTimerExtension = {
    val __obj = js.Dynamic.literal(GPU_DISJOINT_EXT = GPU_DISJOINT_EXT.asInstanceOf[js.Any], QUERY_RESULT_AVAILABLE_EXT = QUERY_RESULT_AVAILABLE_EXT.asInstanceOf[js.Any], QUERY_RESULT_EXT = QUERY_RESULT_EXT.asInstanceOf[js.Any], TIME_ELAPSED_EXT = TIME_ELAPSED_EXT.asInstanceOf[js.Any])
    __obj.updateDynamic("beginQueryEXT")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.std.WebGLQuery) => beginQueryEXT(t0, t1).runNow()))
    __obj.updateDynamic("createQueryEXT")(createQueryEXT.toJsFn)
    __obj.updateDynamic("deleteQueryEXT")(js.Any.fromFunction1((t0: typingsJapgolly.std.WebGLQuery) => deleteQueryEXT(t0).runNow()))
    __obj.updateDynamic("endQueryEXT")(js.Any.fromFunction1((t0: scala.Double) => endQueryEXT(t0).runNow()))
    __obj.updateDynamic("getQueryObjectEXT")(js.Any.fromFunction2((t0: typingsJapgolly.std.WebGLQuery, t1: scala.Double) => getQueryObjectEXT(t0, t1).runNow()))
    __obj.updateDynamic("isQueryEXT")(js.Any.fromFunction1((t0: typingsJapgolly.std.WebGLQuery) => isQueryEXT(t0).runNow()))
    __obj.asInstanceOf[WebGL1DisjointQueryTimerExtension]
  }
}

