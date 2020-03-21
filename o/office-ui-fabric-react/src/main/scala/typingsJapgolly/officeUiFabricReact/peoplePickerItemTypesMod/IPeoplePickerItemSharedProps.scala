package typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod

import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerItemSharedProps extends js.Object {
  /** Additional CSS class(es) to apply to the PeoplePickerItem root element. */
  var className: js.UndefOr[String] = js.undefined
  /** Theme provided by High-Order Component. */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IPeoplePickerItemSharedProps {
  @scala.inline
  def apply(className: String = null, theme: ITheme = null): IPeoplePickerItemSharedProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSharedProps]
  }
}

