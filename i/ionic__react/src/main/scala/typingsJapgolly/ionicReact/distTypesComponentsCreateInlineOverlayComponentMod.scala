package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesComponentsUtilsMod.IonicReactExternalProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsCreateInlineOverlayComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createInlineOverlayComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInlineOverlayComponent[PropType, ElementType](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInlineOverlayComponent")(tagName.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createInlineOverlayComponent[PropType, ElementType](tagName: String, defineCustomElement: js.Function0[Unit]): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createInlineOverlayComponent")(tagName.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
}
