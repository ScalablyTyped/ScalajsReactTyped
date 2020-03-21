package typingsJapgolly.ink.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ink.inkStrings.`column-reverse`
import typingsJapgolly.ink.inkStrings.`flex-end`
import typingsJapgolly.ink.inkStrings.`flex-start`
import typingsJapgolly.ink.inkStrings.`row-reverse`
import typingsJapgolly.ink.inkStrings.`space-around`
import typingsJapgolly.ink.inkStrings.`space-between`
import typingsJapgolly.ink.inkStrings.`truncate-end`
import typingsJapgolly.ink.inkStrings.`truncate-middle`
import typingsJapgolly.ink.inkStrings.`truncate-start`
import typingsJapgolly.ink.inkStrings.center
import typingsJapgolly.ink.inkStrings.column
import typingsJapgolly.ink.inkStrings.row
import typingsJapgolly.ink.inkStrings.truncate
import typingsJapgolly.ink.inkStrings.wrap
import typingsJapgolly.ink.mod.BoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Box {
  def apply(
    alignItems: `flex-start` | center | `flex-end` = null,
    flexBasis: String | Double = null,
    flexDirection: row | `row-reverse` | column | `column-reverse` = null,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    height: Double | String = null,
    justifyContent: `flex-start` | center | `flex-end` | `space-between` | `space-around` = null,
    margin: Int | Double = null,
    marginBottom: Int | Double = null,
    marginLeft: Int | Double = null,
    marginRight: Int | Double = null,
    marginTop: Int | Double = null,
    marginX: Int | Double = null,
    marginY: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    padding: Int | Double = null,
    paddingBottom: Int | Double = null,
    paddingLeft: Int | Double = null,
    paddingRight: Int | Double = null,
    paddingTop: Int | Double = null,
    paddingX: Int | Double = null,
    paddingY: Int | Double = null,
    textWrap: wrap | truncate | `truncate-start` | `truncate-middle` | `truncate-end` = null,
    width: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BoxProps, typingsJapgolly.ink.mod.Box, Unit, BoxProps] = {
    val __obj = js.Dynamic.literal()
  
      if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (textWrap != null) __obj.updateDynamic("textWrap")(textWrap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.ink.mod.BoxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.ink.mod.Box](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.ink.mod.BoxProps])(children: _*)
  }
  @JSImport("ink", "Box")
  @js.native
  object componentImport extends js.Object
  
}

