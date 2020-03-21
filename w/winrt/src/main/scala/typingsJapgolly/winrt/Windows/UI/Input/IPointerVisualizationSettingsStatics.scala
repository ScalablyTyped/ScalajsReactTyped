package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerVisualizationSettingsStatics extends js.Object {
  def getForCurrentView(): PointerVisualizationSettings
}

object IPointerVisualizationSettingsStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[PointerVisualizationSettings]): IPointerVisualizationSettingsStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.asInstanceOf[IPointerVisualizationSettingsStatics]
  }
}

