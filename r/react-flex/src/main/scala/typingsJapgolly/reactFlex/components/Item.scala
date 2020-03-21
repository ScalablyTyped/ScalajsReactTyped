package typingsJapgolly.reactFlex.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFlex.mod.ItemProps
import typingsJapgolly.reactFlex.reactFlexStrings.`fit-content`
import typingsJapgolly.reactFlex.reactFlexStrings.`max-content`
import typingsJapgolly.reactFlex.reactFlexStrings.`min-content`
import typingsJapgolly.reactFlex.reactFlexStrings.auto
import typingsJapgolly.reactFlex.reactFlexStrings.content
import typingsJapgolly.reactFlex.reactFlexStrings.fit
import typingsJapgolly.reactFlex.reactFlexStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Item {
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    column: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    flex: Double | String | Boolean = null,
    flexBasis: Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit = null,
    flexGrow: Double | String | Boolean = null,
    flexShrink: Double | String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    justifyContent: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ItemProps, typingsJapgolly.reactFlex.mod.Item, Unit, ItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFlex.mod.ItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFlex.mod.Item](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFlex.mod.ItemProps])(children: _*)
  }
  @JSImport("react-flex", "Item")
  @js.native
  object componentImport extends js.Object
  
}

