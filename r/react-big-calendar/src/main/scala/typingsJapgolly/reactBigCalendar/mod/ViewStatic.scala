package typingsJapgolly.reactBigCalendar.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStatic extends js.Object {
  def navigate(date: js.Date, action: NavigateAction, props: js.Any): js.Date
  def title(date: js.Date, options: TitleOptions): String
}

object ViewStatic {
  @scala.inline
  def apply(
    navigate: (js.Date, NavigateAction, js.Any) => CallbackTo[js.Date],
    title: (js.Date, TitleOptions) => CallbackTo[String]
  ): ViewStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("navigate")(js.Any.fromFunction3((t0: js.Date, t1: typingsJapgolly.reactBigCalendar.mod.NavigateAction, t2: js.Any) => navigate(t0, t1, t2).runNow()))
    __obj.updateDynamic("title")(js.Any.fromFunction2((t0: js.Date, t1: typingsJapgolly.reactBigCalendar.mod.TitleOptions) => title(t0, t1).runNow()))
    __obj.asInstanceOf[ViewStatic]
  }
}

