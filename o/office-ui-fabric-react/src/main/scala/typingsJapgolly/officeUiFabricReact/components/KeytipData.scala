package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.keytipDataTypesMod.IKeytip
import typingsJapgolly.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irendercomponentMod.IRenderComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipData {
  def apply(
    ariaDescribedBy: String = null,
    componentRef: IRefObject[IKeytip] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    keytipProps: IKeytipProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Object => CallbackTo[Element]
  ): UnmountedWithRoot[
    IKeytipDataProps with IRenderComponent[js.Object], 
    typingsJapgolly.officeUiFabricReact.mod.KeytipData, 
    Unit, 
    IKeytipDataProps with IRenderComponent[js.Object]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: js.Object) => children(t0).runNow()))
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps with typingsJapgolly.uifabricUtilities.irendercomponentMod.IRenderComponent[js.Object], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.officeUiFabricReact.mod.KeytipData](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps with typingsJapgolly.uifabricUtilities.irendercomponentMod.IRenderComponent[js.Object]])
  }
  @JSImport("office-ui-fabric-react", "KeytipData")
  @js.native
  object componentImport extends js.Object
  
}

