package typingsJapgolly.reactPose.transitionTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var displayedChildren: js.Array[Element]
  var finishedLeaving: StringDictionary[Boolean]
  var hasInitialized: Boolean
  var indexedChildren: StringDictionary[Element]
  def scheduleChildRemoval(key: String): Unit
}

object State {
  @scala.inline
  def apply(
    displayedChildren: js.Array[Element],
    finishedLeaving: StringDictionary[Boolean],
    hasInitialized: Boolean,
    indexedChildren: StringDictionary[Element],
    scheduleChildRemoval: String => Callback
  ): State = {
    val __obj = js.Dynamic.literal(displayedChildren = displayedChildren.asInstanceOf[js.Any], finishedLeaving = finishedLeaving.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any], indexedChildren = indexedChildren.asInstanceOf[js.Any])
    __obj.updateDynamic("scheduleChildRemoval")(js.Any.fromFunction1((t0: java.lang.String) => scheduleChildRemoval(t0).runNow()))
    __obj.asInstanceOf[State]
  }
}

