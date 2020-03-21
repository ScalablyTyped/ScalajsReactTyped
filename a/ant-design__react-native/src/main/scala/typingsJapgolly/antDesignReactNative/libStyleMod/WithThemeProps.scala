package typingsJapgolly.antDesignReactNative.libStyleMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithThemeProps[T, S] extends js.Object {
  var styles: js.UndefOr[S] = js.undefined
  def children(styles: T with StringDictionary[js.Any], theme: Theme): Node
  def themeStyles(theme: Theme): T
}

object WithThemeProps {
  @scala.inline
  def apply[T, S](
    children: (T with StringDictionary[js.Any], Theme) => CallbackTo[Node],
    themeStyles: Theme => CallbackTo[T],
    styles: S = null
  ): WithThemeProps[T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction2((t0: T with org.scalablytyped.runtime.StringDictionary[js.Any], t1: typingsJapgolly.antDesignReactNative.libStyleMod.Theme) => children(t0, t1).runNow()))
    __obj.updateDynamic("themeStyles")(js.Any.fromFunction1((t0: typingsJapgolly.antDesignReactNative.libStyleMod.Theme) => themeStyles(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithThemeProps[T, S]]
  }
}

