package typingsJapgolly.stormReactDiagrams.linkModelMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.AnonLocked
import typingsJapgolly.stormReactDiagrams.BaseEventBaseModelBaseEnt
import typingsJapgolly.stormReactDiagrams.BaseEventLinkModelLinkMod
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkModelListener extends BaseModelListener {
  var sourcePortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.undefined
  var targetPortChanged: js.UndefOr[js.Function1[/* event */ BaseEventLinkModelLinkMod, Unit]] = js.undefined
}

object LinkModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[js.Any]], LinkModelListener]] => Callback = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Callback = null,
    selectionChanged: /* event */ BaseEventBaseModelBaseEnt => Callback = null,
    sourcePortChanged: /* event */ BaseEventLinkModelLinkMod => Callback = null,
    targetPortChanged: /* event */ BaseEventLinkModelLinkMod => Callback = null
  ): LinkModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[
  typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel[
    typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity[typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener[js.Any]], 
    typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModelListener
  ]]) => entityRemoved(t0).runNow()))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[js.Any] with typingsJapgolly.stormReactDiagrams.AnonLocked) => lockChanged(t0).runNow()))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventBaseModelBaseEnt) => selectionChanged(t0).runNow()))
    if (sourcePortChanged != null) __obj.updateDynamic("sourcePortChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventLinkModelLinkMod) => sourcePortChanged(t0).runNow()))
    if (targetPortChanged != null) __obj.updateDynamic("targetPortChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventLinkModelLinkMod) => targetPortChanged(t0).runNow()))
    __obj.asInstanceOf[LinkModelListener]
  }
}

