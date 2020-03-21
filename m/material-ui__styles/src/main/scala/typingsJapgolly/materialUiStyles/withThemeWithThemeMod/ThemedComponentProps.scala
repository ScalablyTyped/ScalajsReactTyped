package typingsJapgolly.materialUiStyles.withThemeWithThemeMod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.materialUiStyles.defaultThemeMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<@material-ui/styles.@material-ui/styles/defaultTheme.DefaultTheme>> */
trait ThemedComponentProps extends js.Object {
  var innerRef: js.UndefOr[Ref] = js.undefined
  var ref: js.UndefOr[Ref] = js.undefined
  var theme: js.UndefOr[DefaultTheme] = js.undefined
}

object ThemedComponentProps {
  @scala.inline
  def apply(innerRef: Ref = null, ref: Ref = null, theme: DefaultTheme = null): ThemedComponentProps = {
    val __obj = js.Dynamic.literal()
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedComponentProps]
  }
}

