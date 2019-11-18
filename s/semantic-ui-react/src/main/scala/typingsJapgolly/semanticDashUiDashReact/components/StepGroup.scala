package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.StepGroupProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepMod.StepProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`1`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`2`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`3`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`4`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`5`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`6`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`7`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactNumbers.`8`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.eight
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.five
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.four
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.one
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.seven
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.six
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.tablet
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.three
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepGroup {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[StepProps] = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | big | huge | massive = null,
    stackable: tablet = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`1` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`2` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`3` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`5` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`6` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`7` | typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`8` | one | two | three | four | five | six | seven | eight = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    StepGroupProps, 
    MountedWithRawType[StepGroupProps, js.Object, RawMounted[StepGroupProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stackable != null) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.StepGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.default)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.StepGroupProps])(children: _*)
  }
}

