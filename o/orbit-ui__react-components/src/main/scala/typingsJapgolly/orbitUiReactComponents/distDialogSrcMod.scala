package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distDialogSrcDialogMod.InnerDialogProps
import typingsJapgolly.orbitUiReactComponents.distDialogSrcDialogTriggerContextMod.DialogTriggerContextType
import typingsJapgolly.orbitUiReactComponents.distDialogSrcDialogTriggerMod.InnerDialogTriggerProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", "Dialog")
  @js.native
  val Dialog: OrbitComponent[HTMLElement, InnerDialogProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", "DialogTrigger")
  @js.native
  val DialogTrigger: OrbitComponent[HTMLElement, InnerDialogTriggerProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/dialog/src", "DialogTriggerContext")
  @js.native
  val DialogTriggerContext: Context[DialogTriggerContextType] = js.native
  
  inline def InnerDialog(
    hasIdRoleSizeDismissableFocusZIndexAriaLabelAriaLabelledByAriaDescribedByWrapperPropsAsChildrenForwardedRefRest: InnerDialogProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialog")(hasIdRoleSizeDismissableFocusZIndexAriaLabelAriaLabelledByAriaDescribedByWrapperPropsAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerDialogTrigger(
    hasOpenPropDefaultOpenOnOpenChangeDismissableZIndexAsChildrenForwardedRefRest: InnerDialogTriggerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDialogTrigger")(hasOpenPropDefaultOpenOnOpenChangeDismissableZIndexAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDialogTriggerContext(): DialogTriggerContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useDialogTriggerContext")().asInstanceOf[DialogTriggerContextType]
}
