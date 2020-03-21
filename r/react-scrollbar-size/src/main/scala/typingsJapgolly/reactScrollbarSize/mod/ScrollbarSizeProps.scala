package typingsJapgolly.reactScrollbarSize.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollbarSizeProps extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.undefined
}

object ScrollbarSizeProps {
  @scala.inline
  def apply(
    onChange: /* measurement */ Measurement => Callback = null,
    onLoad: /* measurement */ Measurement => Callback = null
  ): ScrollbarSizeProps = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* measurement */ typingsJapgolly.reactScrollbarSize.mod.Measurement) => onChange(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* measurement */ typingsJapgolly.reactScrollbarSize.mod.Measurement) => onLoad(t0).runNow()))
    __obj.asInstanceOf[ScrollbarSizeProps]
  }
}

