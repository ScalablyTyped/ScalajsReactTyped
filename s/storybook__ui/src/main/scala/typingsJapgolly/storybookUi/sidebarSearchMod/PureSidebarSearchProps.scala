package typingsJapgolly.storybookUi.sidebarSearchMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/ui.@storybook/ui/dist/components/sidebar/SidebarSearch.FilterFieldProps & {onChange (arg : string): void} */
trait PureSidebarSearchProps extends js.Object {
  def onChange(arg: String): Unit
}

object PureSidebarSearchProps {
  @scala.inline
  def apply(onChange: String => Callback): PureSidebarSearchProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: java.lang.String) => onChange(t0).runNow()))
    __obj.asInstanceOf[PureSidebarSearchProps]
  }
}

