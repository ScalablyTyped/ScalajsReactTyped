package typingsJapgolly.hedron.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.hedron.mod.ProviderProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    breakpoints: StringDictionary[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    padding: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProviderProps with HTMLProps[HTMLElement], 
    typingsJapgolly.hedron.mod.Provider, 
    Unit, 
    ProviderProps with HTMLProps[HTMLElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.hedron.mod.ProviderProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.hedron.mod.Provider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.hedron.mod.ProviderProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLElement]])(children: _*)
  }
  @JSImport("hedron", "Provider")
  @js.native
  object componentImport extends js.Object
  
}

