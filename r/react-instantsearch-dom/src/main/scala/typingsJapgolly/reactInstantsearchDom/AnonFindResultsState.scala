package typingsJapgolly.reactInstantsearchDom

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFindResultsState extends js.Object {
  var InstantSearch: ComponentClassP[js.Object]
  def findResultsState(App: ComponentType[_], props: js.Any): js.Promise[_]
}

object AnonFindResultsState {
  @scala.inline
  def apply(
    InstantSearch: ComponentClassP[js.Object],
    findResultsState: (ComponentType[js.Any], js.Any) => CallbackTo[js.Promise[js.Any]]
  ): AnonFindResultsState = {
    val __obj = js.Dynamic.literal(InstantSearch = InstantSearch.asInstanceOf[js.Any])
    __obj.updateDynamic("findResultsState")(js.Any.fromFunction2((t0: typingsJapgolly.react.mod.ComponentType[js.Any], t1: js.Any) => findResultsState(t0, t1).runNow()))
    __obj.asInstanceOf[AnonFindResultsState]
  }
}

