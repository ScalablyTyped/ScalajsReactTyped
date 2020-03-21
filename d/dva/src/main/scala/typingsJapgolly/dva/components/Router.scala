package typingsJapgolly.dva.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Router {
  def apply(
    history: History[LocationState],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RouterProps, typingsJapgolly.dva.routerMod.Router, Unit, RouterProps] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouter.mod.RouterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.dva.routerMod.Router](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouter.mod.RouterProps])(children: _*)
  }
  @JSImport("dva/router", "Router")
  @js.native
  object componentImport extends js.Object
  
}

