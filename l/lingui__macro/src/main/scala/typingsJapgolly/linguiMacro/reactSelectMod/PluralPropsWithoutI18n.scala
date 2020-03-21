package typingsJapgolly.linguiMacro.reactSelectMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiMacro.renderMod.RenderProps
import typingsJapgolly.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralPropsWithoutI18n
  extends RenderProps
     with /* exact */ StringDictionary[ReactNode] {
  var few: js.UndefOr[Node] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var many: js.UndefOr[Node] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var one: js.UndefOr[Node] = js.undefined
  var other: Node
  var two: js.UndefOr[Node] = js.undefined
  var value: Double | String
  var zero: js.UndefOr[Node] = js.undefined
}

object PluralPropsWithoutI18n {
  @scala.inline
  def apply(
    value: Double | String,
    StringDictionary: /* exact */ StringDictionary[Node] = null,
    className: String = null,
    description: String = null,
    few: VdomNode = null,
    id: String = null,
    many: VdomNode = null,
    offset: Double | String = null,
    one: VdomNode = null,
    other: VdomNode = null,
    render: VdomNode = null,
    two: VdomNode = null,
    zero: VdomNode = null
  ): PluralPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (few != null) __obj.updateDynamic("few")(few.rawNode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.rawNode.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.rawNode.asInstanceOf[js.Any])
    if (other != null) __obj.updateDynamic("other")(other.rawNode.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.rawNode.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralPropsWithoutI18n]
  }
}

