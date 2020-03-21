package typingsJapgolly.idyllDocument.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.idyllCompiler.mod.AST
import typingsJapgolly.idyllCompiler.mod.Options
import typingsJapgolly.idyllDocument.AnonChildren
import typingsJapgolly.idyllDocument.mod.IdyllDocumentProps
import typingsJapgolly.idyllDocument.mod.default
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IdyllDocument {
  def apply(
    components: js.Any,
    ast: AST = null,
    compilerOptions: Options = null,
    context: /* context */ js.Any => Callback = null,
    datasets: js.Object = null,
    errorComponent: ReactType[AnonChildren] = null,
    initialState: js.Any = null,
    layout: String = null,
    markup: String = null,
    onError: /* err */ js.Error => Callback = null,
    theme: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IdyllDocumentProps, default, Unit, IdyllDocumentProps] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
  
      if (ast != null) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(js.Any.fromFunction1((t0: /* context */ js.Any) => context(t0).runNow()))
    if (datasets != null) __obj.updateDynamic("datasets")(datasets.asInstanceOf[js.Any])
    if (errorComponent != null) __obj.updateDynamic("errorComponent")(errorComponent.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ js.Error) => onError(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.idyllDocument.mod.IdyllDocumentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.idyllDocument.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.idyllDocument.mod.IdyllDocumentProps])(children: _*)
  }
  @JSImport("idyll-document", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

