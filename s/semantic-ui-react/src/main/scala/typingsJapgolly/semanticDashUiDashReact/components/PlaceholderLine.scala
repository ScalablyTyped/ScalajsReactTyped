package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.PlaceholderLineProps
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very long`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very short`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.full
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.long
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PlaceholderLine {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PlaceholderLineProps, 
    MountedWithRawType[PlaceholderLineProps, js.Object, RawMounted[PlaceholderLineProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.PlaceholderLineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.default)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod.PlaceholderLineProps])(children: _*)
  }
}

