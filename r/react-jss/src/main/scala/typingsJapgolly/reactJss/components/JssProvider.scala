package typingsJapgolly.reactJss.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jss.mod.CreateGenerateIdOptions
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.SheetsRegistry
import typingsJapgolly.jss.mod.StyleSheet
import typingsJapgolly.reactJss.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object JssProvider {
  def apply(
    classNamePrefix: String = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[String] = null,
    id: CreateGenerateIdOptions = null,
    jss: Jss = null,
    registry: SheetsRegistry = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonChildren, typingsJapgolly.reactJss.mod.JssProvider, Unit, AnonChildren] = {
    val __obj = js.Dynamic.literal()
  
      if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.mod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String]]) => generateId(t0, t1).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJss.AnonChildren, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJss.mod.JssProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJss.AnonChildren])(children: _*)
  }
  @JSImport("react-jss", "JssProvider")
  @js.native
  object componentImport extends js.Object
  
}

