package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipointDrawActionRedoEvent extends js.Object {
  var defaultPrevented: Boolean
  var preventDefault: js.Function
  var `type`: String
  var vertexIndex: Double
  var vertices: js.Array[js.Array[Double]]
}

object MultipointDrawActionRedoEvent {
  @scala.inline
  def apply(
    defaultPrevented: Boolean,
    preventDefault: js.Function,
    `type`: String,
    vertexIndex: Double,
    vertices: js.Array[js.Array[Double]]
  ): MultipointDrawActionRedoEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipointDrawActionRedoEvent]
  }
}

