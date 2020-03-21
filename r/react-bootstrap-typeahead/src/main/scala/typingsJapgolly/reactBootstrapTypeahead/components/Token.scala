package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrapTypeahead.mod.TokenProps
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Token {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[div] = null,
    ClassAttributes: ClassAttributes[div] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    onRemove: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TokenProps, typingsJapgolly.reactBootstrapTypeahead.mod.Token, Unit, TokenProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    onRemove.foreach(p => __obj.updateDynamic("onRemove")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTypeahead.mod.TokenProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTypeahead.mod.Token](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.TokenProps])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "Token")
  @js.native
  object componentImport extends js.Object
  
}

