package typingsJapgolly.winrt.Windows.UI.ApplicationSettings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsPaneStatics extends js.Object {
  var edge: SettingsEdgeLocation
  def getForCurrentView(): SettingsPane
  def show(): Unit
}

object ISettingsPaneStatics {
  @scala.inline
  def apply(edge: SettingsEdgeLocation, getForCurrentView: CallbackTo[SettingsPane], show: Callback): ISettingsPaneStatics = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[ISettingsPaneStatics]
  }
}

