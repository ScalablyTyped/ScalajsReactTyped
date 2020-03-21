package typingsJapgolly.reactHelmetAsync.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactHelmetAsync.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HelmetProvider {
  def apply(
    context: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProviderProps, 
    typingsJapgolly.reactHelmetAsync.mod.HelmetProvider, 
    Unit, 
    ProviderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHelmetAsync.mod.ProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHelmetAsync.mod.HelmetProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHelmetAsync.mod.ProviderProps])(children: _*)
  }
  @JSImport("react-helmet-async", "HelmetProvider")
  @js.native
  object componentImport extends js.Object
  
}

