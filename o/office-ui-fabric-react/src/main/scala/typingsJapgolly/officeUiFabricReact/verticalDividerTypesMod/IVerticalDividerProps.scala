package typingsJapgolly.officeUiFabricReact.verticalDividerTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerticalDividerProps extends js.Object {
  /**
    * className that will be placed on the divider wrapper div
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Use styles instead.
    * Optional function to generate the class names for the divider for custom styling
    */
  var getClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.undefined
  /**
    * Optional override stylings that will get merged with the dividers styles.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles]] = js.undefined
  /**
    * The theme that should be used to render the vertical divider.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IVerticalDividerProps {
  @scala.inline
  def apply(
    className: String = null,
    getClassNames: /* theme */ ITheme => CallbackTo[IVerticalDividerClassNames] = null,
    styles: IStyleFunctionOrObject[IVerticalDividerPropsStyles, IVerticalDividerStyles] = null,
    theme: ITheme = null
  ): IVerticalDividerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getClassNames != null) __obj.updateDynamic("getClassNames")(js.Any.fromFunction1((t0: /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme) => getClassNames(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerticalDividerProps]
  }
}

