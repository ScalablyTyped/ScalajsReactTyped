package typingsJapgolly.jupyterlabApputils.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabApputils.toolbarMod.CommandToolbarButtonComponent.IProps
import typingsJapgolly.phosphorCommands.mod.CommandRegistry
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommandToolbarButtonComponent {
  def apply(
    commands: CommandRegistry,
    id: String,
    args: ReadonlyJSONObject = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[IProps, MountedWithRawType[IProps, js.Object, RawMounted[IProps, js.Object]]] = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
      if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.jupyterlabApputils.toolbarMod.CommandToolbarButtonComponent.IProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabApputils.toolbarMod.CommandToolbarButtonComponent.IProps])(children: _*)
  }
  @JSImport("@jupyterlab/apputils", "CommandToolbarButtonComponent")
  @js.native
  object componentImport extends js.Object
  
}

