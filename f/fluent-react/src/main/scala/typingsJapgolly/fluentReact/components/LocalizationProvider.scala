package typingsJapgolly.fluentReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fluent.mod.FluentBundle
import typingsJapgolly.fluentReact.mod.LocalizationProviderProps
import typingsJapgolly.fluentReact.mod.Node
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocalizationProvider {
  def apply(
    bundles: IterableIterator[FluentBundle],
    parseMarkup: /* str */ String => CallbackTo[js.Array[Node]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LocalizationProviderProps, 
    typingsJapgolly.fluentReact.mod.LocalizationProvider, 
    Unit, 
    LocalizationProviderProps
  ] = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any])
  
      if (parseMarkup != null) __obj.updateDynamic("parseMarkup")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => parseMarkup(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fluentReact.mod.LocalizationProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fluentReact.mod.LocalizationProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fluentReact.mod.LocalizationProviderProps])(children: _*)
  }
  @JSImport("fluent-react", "LocalizationProvider")
  @js.native
  object componentImport extends js.Object
  
}

