package typingsJapgolly.stormReactDiagrams.defaultLinkModelMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.AnonLocked
import typingsJapgolly.stormReactDiagrams.BaseEventBaseModelBaseEnt
import typingsJapgolly.stormReactDiagrams.BaseEventDefaultLinkModel
import typingsJapgolly.stormReactDiagrams.BaseEventDefaultLinkModelEntity
import typingsJapgolly.stormReactDiagrams.BaseEventLinkModelLinkMod
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultLinkModelListener extends LinkModelListener {
  var colorChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModel, Unit]] = js.undefined
  var widthChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModelEntity, Unit]] = js.undefined
}

object DefaultLinkModelListener {
  @scala.inline
  def apply(
    colorChanged: /* event */ BaseEventDefaultLinkModel => Callback = null,
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[js.Any]], DefaultLinkModelListener]] => Callback = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Callback = null,
    selectionChanged: /* event */ BaseEventBaseModelBaseEnt => Callback = null,
    sourcePortChanged: /* event */ BaseEventLinkModelLinkMod => Callback = null,
    targetPortChanged: /* event */ BaseEventLinkModelLinkMod => Callback = null,
    widthChanged: /* event */ BaseEventDefaultLinkModelEntity => Callback = null
  ): DefaultLinkModelListener = {
    val __obj = js.Dynamic.literal()
    if (colorChanged != null) __obj.updateDynamic("colorChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventDefaultLinkModel) => colorChanged(t0).runNow()))
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[
  typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel[
    typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity[typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener[js.Any]], 
    typingsJapgolly.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModelListener
  ]]) => entityRemoved(t0).runNow()))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[js.Any] with typingsJapgolly.stormReactDiagrams.AnonLocked) => lockChanged(t0).runNow()))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventBaseModelBaseEnt) => selectionChanged(t0).runNow()))
    if (sourcePortChanged != null) __obj.updateDynamic("sourcePortChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventLinkModelLinkMod) => sourcePortChanged(t0).runNow()))
    if (targetPortChanged != null) __obj.updateDynamic("targetPortChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventLinkModelLinkMod) => targetPortChanged(t0).runNow()))
    if (widthChanged != null) __obj.updateDynamic("widthChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventDefaultLinkModelEntity) => widthChanged(t0).runNow()))
    __obj.asInstanceOf[DefaultLinkModelListener]
  }
}

