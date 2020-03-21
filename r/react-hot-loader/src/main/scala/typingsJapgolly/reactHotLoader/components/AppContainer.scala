package typingsJapgolly.reactHotLoader.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactHotLoader.mod.AppChildren
import typingsJapgolly.reactHotLoader.mod.AppContainerProps
import typingsJapgolly.reactHotLoader.mod.ErrorReporterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppContainer {
  def apply(
    errorBoundary: js.UndefOr[Boolean] = js.undefined,
    errorReporter: ComponentType[ErrorReporterProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AppContainerProps with AppChildren, 
    typingsJapgolly.reactHotLoader.mod.AppContainer, 
    Unit, 
    AppContainerProps with AppChildren
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(errorBoundary)) __obj.updateDynamic("errorBoundary")(errorBoundary.asInstanceOf[js.Any])
    if (errorReporter != null) __obj.updateDynamic("errorReporter")(errorReporter.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHotLoader.mod.AppContainerProps with typingsJapgolly.reactHotLoader.mod.AppChildren, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHotLoader.mod.AppContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHotLoader.mod.AppContainerProps with typingsJapgolly.reactHotLoader.mod.AppChildren])(children: _*)
  }
  @JSImport("react-hot-loader", "AppContainer")
  @js.native
  object componentImport extends js.Object
  
}

