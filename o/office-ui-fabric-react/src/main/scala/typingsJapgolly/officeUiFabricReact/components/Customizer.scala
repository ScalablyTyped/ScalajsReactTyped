package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uifabricUtilities.ReadonlyICustomizerContex
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.customizationsMod.ISettings
import typingsJapgolly.uifabricUtilities.customizationsMod.ISettingsFunction
import typingsJapgolly.uifabricUtilities.customizerContextMod.ICustomizerContext
import typingsJapgolly.uifabricUtilities.customizerTypesMod.ICustomizerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Customizer {
  def apply(
    componentRef: IRefObject[_] = null,
    contextTransform: /* context */ ReadonlyICustomizerContex => CallbackTo[ICustomizerContext] = null,
    scopedSettings: ISettings | ISettingsFunction = null,
    settings: ISettings | ISettingsFunction = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICustomizerProps, 
    typingsJapgolly.officeUiFabricReact.mod.Customizer, 
    Unit, 
    ICustomizerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextTransform != null) __obj.updateDynamic("contextTransform")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.uifabricUtilities.ReadonlyICustomizerContex) => contextTransform(t0).runNow()))
    if (scopedSettings != null) __obj.updateDynamic("scopedSettings")(scopedSettings.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.uifabricUtilities.customizerTypesMod.ICustomizerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.Customizer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.uifabricUtilities.customizerTypesMod.ICustomizerProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "Customizer")
  @js.native
  object componentImport extends js.Object
  
}

