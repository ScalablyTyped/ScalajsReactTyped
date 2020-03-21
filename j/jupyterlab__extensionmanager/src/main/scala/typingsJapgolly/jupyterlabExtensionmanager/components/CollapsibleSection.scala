package typingsJapgolly.jupyterlabExtensionmanager.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CollapsibleSection {
  def apply(
    header: String,
    errorMessage: String = null,
    headerElements: VdomNode = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onCollapse: /* isOpen */ Boolean => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IProperties, 
    typingsJapgolly.jupyterlabExtensionmanager.mod.CollapsibleSection, 
    Unit, 
    IProperties
  ] = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
  
      if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (headerElements != null) __obj.updateDynamic("headerElements")(headerElements.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onCollapse(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.jupyterlabExtensionmanager.mod.CollapsibleSection](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties])(children: _*)
  }
  @JSImport("@jupyterlab/extensionmanager", "CollapsibleSection")
  @js.native
  object componentImport extends js.Object
  
}

