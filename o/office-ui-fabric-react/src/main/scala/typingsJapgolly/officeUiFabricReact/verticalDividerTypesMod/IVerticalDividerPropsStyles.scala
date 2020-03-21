package typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Divider/VerticalDivider.types.IVerticalDividerProps, 'theme' | 'getClassNames' | 'className'> */
trait IVerticalDividerPropsStyles extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var getClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IVerticalDividerPropsStyles {
  @scala.inline
  def apply(
    className: String = null,
    getClassNames: /* theme */ ITheme => CallbackTo[IVerticalDividerClassNames] = null,
    theme: ITheme = null
  ): IVerticalDividerPropsStyles = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction1((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme) => getClassNames(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerticalDividerPropsStyles]
  }
}

