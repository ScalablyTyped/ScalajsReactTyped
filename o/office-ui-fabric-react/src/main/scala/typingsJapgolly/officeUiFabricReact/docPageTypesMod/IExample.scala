package typingsJapgolly.officeUiFabricReact.docPageTypesMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.officeUiFabricReact.AnonRoot
import typingsJapgolly.officeUiFabricReact.AnonTheme
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExample extends js.Object {
  /** Raw source code of the example */
  var code: String
  /** JS String for codepen of the example */
  var codepenJS: js.UndefOr[String] = js.undefined
  var isScrollable: js.UndefOr[Boolean] = js.undefined
  /** Custom styles. Partial version of `IExampleCardProps['styles']`. */
  var styles: js.UndefOr[IStyleFunctionOrObject[AnonTheme, AnonRoot]] = js.undefined
  /** Title of the example */
  var title: String
  /** Working example of the example */
  var view: Element
}

object IExample {
  @scala.inline
  def apply(
    code: String,
    title: String,
    view: VdomElement,
    codepenJS: String = null,
    isScrollable: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[AnonTheme, AnonRoot] = null
  ): IExample = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.rawElement.asInstanceOf[js.Any])
    if (codepenJS != null) __obj.updateDynamic("codepenJS")(codepenJS.asInstanceOf[js.Any])
    if (!js.isUndefined(isScrollable)) __obj.updateDynamic("isScrollable")(isScrollable.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExample]
  }
}

