package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.placeholderLineMod.PlaceholderLineProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`very long`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`very short`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.full
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.long
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.medium
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.short
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
    _overrides: StringDictionary[js.Any] = null
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
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticUiReact.placeholderLineMod.PlaceholderLineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.placeholderLineMod.PlaceholderLineProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderLine", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

