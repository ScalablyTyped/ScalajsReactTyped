package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.ClearInputGroupContextProps
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.InputGroupContextType
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupButtonAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupMenuAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.UseInputGroupSelectAddonPropsReturn
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupMod.InnerInputGroupProps
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcTextAddonMod.InnerTextAddonProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputGroupMod {
  
  @JSImport("@orbit-ui/react-components/dist/input-group", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearInputGroupContext(hasChildren: ClearInputGroupContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearInputGroupContext")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerInputGroup(hasFluidDisabledReadOnlyAsChildrenForwardedRefRest: InnerInputGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerInputGroup")(hasFluidDisabledReadOnlyAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerTextAddon(props: InnerTextAddonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerTextAddon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/input-group", "InputGroup")
  @js.native
  val InputGroup: OrbitComponent[HTMLElement, InnerInputGroupProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/input-group", "InputGroupContext")
  @js.native
  val InputGroupContext: Context[InputGroupContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/input-group", "TextAddon")
  @js.native
  val TextAddon: OrbitComponent[HTMLElement, InnerTextAddonProps] = js.native
  
  inline def useInputGroupAddonProps(): js.Tuple2[UseInputGroupAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupAddonPropsReturn, Boolean]]
  
  inline def useInputGroupButtonAddonProps(): js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupButtonAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean]]
  
  inline def useInputGroupContext(): js.Tuple2[InputGroupContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupContext")().asInstanceOf[js.Tuple2[InputGroupContextType, Boolean]]
  
  inline def useInputGroupMenuAddonProps(): js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupMenuAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean]]
  
  inline def useInputGroupProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
  
  inline def useInputGroupSelectAddonProps(): js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupSelectAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean]]
  
  inline def useInputGroupTextInputProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupTextInputProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
}
