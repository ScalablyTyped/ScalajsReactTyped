package typingsJapgolly.rebass.mod

import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.styledComponents.styledComponentsMod.CSSObject
import typingsJapgolly.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps
  extends RefAttributes[js.Any] {
  var as: js.UndefOr[ElementType] = js.undefined
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    as: ElementType = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    key: Key = null,
    ref: Ref = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

