package typingsJapgolly.reactDnd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dndCore.interfacesMod.Backend
import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DndProvider {
  def AnonManager(
    manager: DragDropManager,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    typingsJapgolly.reactDnd.AnonManager, 
    MountedWithRawType[
      typingsJapgolly.reactDnd.AnonManager, 
      js.Object, 
      RawMounted[typingsJapgolly.reactDnd.AnonManager, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactDnd.AnonManager, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDnd.AnonManager])(children: _*)
  }
  def AnonBackend(
    backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => CallbackTo[Backend],
    context: js.Any = null,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    options: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    typingsJapgolly.reactDnd.AnonBackend[js.Any, js.Any], 
    MountedWithRawType[
      typingsJapgolly.reactDnd.AnonBackend[js.Any, js.Any], 
      js.Object, 
      RawMounted[typingsJapgolly.reactDnd.AnonBackend[js.Any, js.Any], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("backend")(js.Any.fromFunction3((t0: /* manager */ typingsJapgolly.dndCore.interfacesMod.DragDropManager, t1: /* globalContext */ js.UndefOr[js.Any], t2: /* configuration */ js.UndefOr[js.Any]) => backend(t0, t1, t2).runNow()))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactDnd.AnonBackend[js.Any, js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDnd.AnonBackend[js.Any, js.Any]])(children: _*)
  }
  @JSImport("react-dnd", "DndProvider")
  @js.native
  object componentImport extends js.Object
  
}

