package typingsJapgolly.antDesignReactNative.cardHeaderMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.PickCardStyleheaderConten
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderPropsType extends WithThemeStyles[PickCardStyleheaderConten] {
  var extra: js.UndefOr[Node] = js.undefined
  /** need url of img, if this is string. */
  var thumb: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object CardHeaderPropsType {
  @scala.inline
  def apply(
    extra: VdomNode = null,
    styles: Partial[PickCardStyleheaderConten] = null,
    thumb: VdomNode = null,
    title: VdomNode = null
  ): CardHeaderPropsType = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderPropsType]
  }
}

