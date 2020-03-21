package typingsJapgolly.jupyterlabExtensionmanager.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar {
  def apply(
    placeholder: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IProperties, 
    typingsJapgolly.jupyterlabExtensionmanager.mod.SearchBar, 
    Unit, 
    IProperties
  ] = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.jupyterlabExtensionmanager.mod.SearchBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties])(children: _*)
  }
  @JSImport("@jupyterlab/extensionmanager", "SearchBar")
  @js.native
  object componentImport extends js.Object
  
}

