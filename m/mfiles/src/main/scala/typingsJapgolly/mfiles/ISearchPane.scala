package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPane extends js.Object {
  val Available: Boolean
  val Events: ISearchPaneEvents
  var Visible: Boolean
  def SetTheme(theme: ITheme): Unit
}

object ISearchPane {
  @scala.inline
  def apply(Available: Boolean, Events: ISearchPaneEvents, SetTheme: ITheme => Callback, Visible: Boolean): ISearchPane = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("SetTheme")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.ITheme) => SetTheme(t0).runNow()))
    __obj.asInstanceOf[ISearchPane]
  }
}

