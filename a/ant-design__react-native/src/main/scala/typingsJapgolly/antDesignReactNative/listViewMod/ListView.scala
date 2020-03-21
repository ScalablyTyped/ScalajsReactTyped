package typingsJapgolly.antDesignReactNative.listViewMod

import typingsJapgolly.antDesignReactNative.AnonRefresh
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListView[T]
  extends Component[ListViewProps[T], ListViewState, js.Any] {
  var ulv: AnonRefresh = js.native
  def refresh(): Unit = js.native
}

