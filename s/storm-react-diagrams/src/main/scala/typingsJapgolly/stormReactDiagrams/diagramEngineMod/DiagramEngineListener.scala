package typingsJapgolly.stormReactDiagrams.diagramEngineMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.AnonLocked
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEngineListener
  extends BaseListener[js.Any] {
  var labelFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var linkFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var nodeFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var portFactoriesUpdated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var repaintCanvas: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object DiagramEngineListener {
  @scala.inline
  def apply(
    labelFactoriesUpdated: js.UndefOr[Callback] = js.undefined,
    linkFactoriesUpdated: js.UndefOr[Callback] = js.undefined,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Callback = null,
    nodeFactoriesUpdated: js.UndefOr[Callback] = js.undefined,
    portFactoriesUpdated: js.UndefOr[Callback] = js.undefined,
    repaintCanvas: js.UndefOr[Callback] = js.undefined
  ): DiagramEngineListener = {
    val __obj = js.Dynamic.literal()
    labelFactoriesUpdated.foreach(p => __obj.updateDynamic("labelFactoriesUpdated")(p.toJsFn))
    linkFactoriesUpdated.foreach(p => __obj.updateDynamic("linkFactoriesUpdated")(p.toJsFn))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[js.Any] with typingsJapgolly.stormReactDiagrams.AnonLocked) => lockChanged(t0).runNow()))
    nodeFactoriesUpdated.foreach(p => __obj.updateDynamic("nodeFactoriesUpdated")(p.toJsFn))
    portFactoriesUpdated.foreach(p => __obj.updateDynamic("portFactoriesUpdated")(p.toJsFn))
    repaintCanvas.foreach(p => __obj.updateDynamic("repaintCanvas")(p.toJsFn))
    __obj.asInstanceOf[DiagramEngineListener]
  }
}

