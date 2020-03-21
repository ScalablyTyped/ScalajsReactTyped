package typingsJapgolly.elasticApmNode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Taggable extends js.Object {
  def addLabels(labels: Labels): Boolean
  def setLabel(name: String, value: LabelValue): Boolean
}

object Taggable {
  @scala.inline
  def apply(addLabels: Labels => CallbackTo[Boolean], setLabel: (String, LabelValue) => CallbackTo[Boolean]): Taggable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLabels")(js.Any.fromFunction1((t0: typingsJapgolly.elasticApmNode.mod.Labels) => addLabels(t0).runNow()))
    __obj.updateDynamic("setLabel")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.elasticApmNode.mod.LabelValue) => setLabel(t0, t1).runNow()))
    __obj.asInstanceOf[Taggable]
  }
}

