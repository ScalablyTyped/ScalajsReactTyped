package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.anon.`8`
import typingsJapgolly.ionicReact.anon.`9`
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibCreateComponentMod.HTMLStencilElement
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibCreateComponentMod.StencilReactInternalProps
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibCreateOverlayComponentMod.OverlayElement
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibCreateOverlayComponentMod.ReactOverlayProps
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibUtilsMod.StencilReactExternalProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReactComponentLibMod {
  
  @JSImport("@ionic/react/dist/types/components/react-component-lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createOverlayComponent[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](tagName: String, controller: `8`[OverlayType]): ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlayComponent")(tagName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  inline def createOverlayComponent[OverlayComponent /* <: js.Object */, OverlayType /* <: OverlayElement */](tagName: String, controller: `8`[OverlayType], customElement: Any): ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOverlayComponent")(tagName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any], customElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[OverlayComponent & ReactOverlayProps & `9`[OverlayType]]) & RefAttributes[OverlayType]
  ]]
  
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](tagName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](
    tagName: String,
    ReactComponentContext: Unit,
    manipulatePropsFunction: js.Function2[
      /* originalProps */ StencilReactInternalProps[ElementType], 
      /* propsToPass */ Any, 
      ExpandedPropsTypes
    ]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], ReactComponentContext.asInstanceOf[js.Any], manipulatePropsFunction.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](
    tagName: String,
    ReactComponentContext: Unit,
    manipulatePropsFunction: js.Function2[
      /* originalProps */ StencilReactInternalProps[ElementType], 
      /* propsToPass */ Any, 
      ExpandedPropsTypes
    ],
    defineCustomElement: js.Function0[Unit]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], ReactComponentContext.asInstanceOf[js.Any], manipulatePropsFunction.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](
    tagName: String,
    ReactComponentContext: Unit,
    manipulatePropsFunction: Unit,
    defineCustomElement: js.Function0[Unit]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], ReactComponentContext.asInstanceOf[js.Any], manipulatePropsFunction.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](tagName: String, ReactComponentContext: Context[ContextStateType]): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], ReactComponentContext.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](
    tagName: String,
    ReactComponentContext: Context[ContextStateType],
    manipulatePropsFunction: js.Function2[
      /* originalProps */ StencilReactInternalProps[ElementType], 
      /* propsToPass */ Any, 
      ExpandedPropsTypes
    ]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], ReactComponentContext.asInstanceOf[js.Any], manipulatePropsFunction.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](
    tagName: String,
    ReactComponentContext: Context[ContextStateType],
    manipulatePropsFunction: js.Function2[
      /* originalProps */ StencilReactInternalProps[ElementType], 
      /* propsToPass */ Any, 
      ExpandedPropsTypes
    ],
    defineCustomElement: js.Function0[Unit]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], ReactComponentContext.asInstanceOf[js.Any], manipulatePropsFunction.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  inline def createReactComponent[PropType, ElementType /* <: HTMLStencilElement */, ContextStateType, ExpandedPropsTypes](
    tagName: String,
    ReactComponentContext: Context[ContextStateType],
    manipulatePropsFunction: Unit,
    defineCustomElement: js.Function0[Unit]
  ): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReactComponent")(tagName.asInstanceOf[js.Any], ReactComponentContext.asInstanceOf[js.Any], manipulatePropsFunction.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
}
