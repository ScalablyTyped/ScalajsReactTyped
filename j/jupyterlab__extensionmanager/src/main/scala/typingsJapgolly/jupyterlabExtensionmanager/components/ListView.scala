package typingsJapgolly.jupyterlabExtensionmanager.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabExtensionmanager.modelMod.Action
import typingsJapgolly.jupyterlabExtensionmanager.modelMod.IEntry
import typingsJapgolly.jupyterlabExtensionmanager.widgetMod.ListView.IProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListView {
  def apply(
    entries: js.Array[IEntry],
    numPages: Double,
    onPage: Double => Callback,
    performAction: (Action, IEntry) => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IProperties, 
    MountedWithRawType[IProperties, js.Object, RawMounted[IProperties, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPage")(js.Any.fromFunction1((t0: scala.Double) => onPage(t0).runNow()))
    __obj.updateDynamic("performAction")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabExtensionmanager.modelMod.Action, t1: typingsJapgolly.jupyterlabExtensionmanager.modelMod.IEntry) => performAction(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.jupyterlabExtensionmanager.widgetMod.ListView.IProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabExtensionmanager.widgetMod.ListView.IProperties])(children: _*)
  }
  @JSImport("@jupyterlab/extensionmanager", "ListView")
  @js.native
  object componentImport extends js.Object
  
}

