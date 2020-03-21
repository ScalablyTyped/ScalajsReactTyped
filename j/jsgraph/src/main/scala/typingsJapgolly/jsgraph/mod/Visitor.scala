package typingsJapgolly.jsgraph.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jsgraph.AnonE
import typingsJapgolly.jsgraph.AnonG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def blackTarget(req: AnonE): Unit
  def discoverVertex(req: AnonG): Unit
  def examineEdge(req: AnonE): Unit
  def examineVertex(req: AnonG): Unit
  def finishVertex(req: AnonG): Unit
  def grayTarget(req: AnonE): Unit
  def initializeVertex(req: AnonG): Unit
  def nonTreeEdge(req: AnonE): Unit
  def startVertex(req: AnonG): Unit
}

object Visitor {
  @scala.inline
  def apply(
    blackTarget: AnonE => Callback,
    discoverVertex: AnonG => Callback,
    examineEdge: AnonE => Callback,
    examineVertex: AnonG => Callback,
    finishVertex: AnonG => Callback,
    grayTarget: AnonE => Callback,
    initializeVertex: AnonG => Callback,
    nonTreeEdge: AnonE => Callback,
    startVertex: AnonG => Callback
  ): Visitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blackTarget")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonE) => blackTarget(t0).runNow()))
    __obj.updateDynamic("discoverVertex")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonG) => discoverVertex(t0).runNow()))
    __obj.updateDynamic("examineEdge")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonE) => examineEdge(t0).runNow()))
    __obj.updateDynamic("examineVertex")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonG) => examineVertex(t0).runNow()))
    __obj.updateDynamic("finishVertex")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonG) => finishVertex(t0).runNow()))
    __obj.updateDynamic("grayTarget")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonE) => grayTarget(t0).runNow()))
    __obj.updateDynamic("initializeVertex")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonG) => initializeVertex(t0).runNow()))
    __obj.updateDynamic("nonTreeEdge")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonE) => nonTreeEdge(t0).runNow()))
    __obj.updateDynamic("startVertex")(js.Any.fromFunction1((t0: typingsJapgolly.jsgraph.AnonG) => startVertex(t0).runNow()))
    __obj.asInstanceOf[Visitor]
  }
}

