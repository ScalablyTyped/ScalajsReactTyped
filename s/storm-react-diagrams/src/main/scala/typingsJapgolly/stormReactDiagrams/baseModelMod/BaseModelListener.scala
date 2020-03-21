package typingsJapgolly.stormReactDiagrams.baseModelMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.AnonLocked
import typingsJapgolly.stormReactDiagrams.BaseEventBaseModelBaseEnt
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent
import typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModelListener
  extends BaseListener[js.Any] {
  var entityRemoved: js.UndefOr[
    js.Function1[/* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[_]], this.type]], Unit]
  ] = js.undefined
  var selectionChanged: js.UndefOr[js.Function1[/* event */ BaseEventBaseModelBaseEnt, Unit]] = js.undefined
}

object BaseModelListener {
  @scala.inline
  def apply(
    entityRemoved: /* event */ BaseEvent[BaseModel[BaseEntity[BaseListener[js.Any]], BaseModelListener]] => Callback = null,
    lockChanged: /* event */ BaseEvent[js.Any] with AnonLocked => Callback = null,
    selectionChanged: /* event */ BaseEventBaseModelBaseEnt => Callback = null
  ): BaseModelListener = {
    val __obj = js.Dynamic.literal()
    if (entityRemoved != null) __obj.updateDynamic("entityRemoved")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[
  typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModel[
    typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEntity[typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseListener[js.Any]], 
    typingsJapgolly.stormReactDiagrams.baseModelMod.BaseModelListener
  ]]) => entityRemoved(t0).runNow()))
    if (lockChanged != null) __obj.updateDynamic("lockChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.baseEntityMod.BaseEvent[js.Any] with typingsJapgolly.stormReactDiagrams.AnonLocked) => lockChanged(t0).runNow()))
    if (selectionChanged != null) __obj.updateDynamic("selectionChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.stormReactDiagrams.BaseEventBaseModelBaseEnt) => selectionChanged(t0).runNow()))
    __obj.asInstanceOf[BaseModelListener]
  }
}

