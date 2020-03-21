package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSpec extends js.Object {
  var id: Double
  def runs(): Unit
}

object XSpec {
  @scala.inline
  def apply(id: Double, runs: Callback): XSpec = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("runs")(runs.toJsFn)
    __obj.asInstanceOf[XSpec]
  }
}

