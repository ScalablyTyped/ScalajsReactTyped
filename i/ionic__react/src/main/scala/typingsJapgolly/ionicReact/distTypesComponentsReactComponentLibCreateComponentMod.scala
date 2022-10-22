package typingsJapgolly.ionicReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibUtilsMod.StencilReactExternalProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReactComponentLibCreateComponentMod {
  
  @JSImport("@ionic/react/dist/types/components/react-component-lib/createComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @js.native
  trait HTMLStencilElement
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def componentOnReady(): js.Promise[this.type] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  
  trait StencilReactInternalProps[ElementType]
    extends StObject
       with HTMLAttributes[ElementType] {
    
    var forwardedRef: RefHandle[ElementType]
    
    var ref: js.UndefOr[Ref[Any]] = js.undefined
  }
  object StencilReactInternalProps {
    
    inline def apply[ElementType](forwardedRef: RefHandle[ElementType]): StencilReactInternalProps[ElementType] = {
      val __obj = js.Dynamic.literal(forwardedRef = forwardedRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[StencilReactInternalProps[ElementType]]
    }
    
    extension [Self <: StencilReactInternalProps[?], ElementType](x: Self & StencilReactInternalProps[ElementType]) {
      
      inline def setForwardedRef(value: RefHandle[ElementType]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
