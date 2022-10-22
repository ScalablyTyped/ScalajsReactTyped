package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesComponentsUtilsMod.IonicReactExternalProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsCreateRoutingComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/createRoutingComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRoutingComponent[PropType, ElementType](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoutingComponent")(tagName.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createRoutingComponent[PropType, ElementType](tagName: String, customElement: Any): ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoutingComponent")(tagName.asInstanceOf[js.Any], customElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[IonicReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
}
