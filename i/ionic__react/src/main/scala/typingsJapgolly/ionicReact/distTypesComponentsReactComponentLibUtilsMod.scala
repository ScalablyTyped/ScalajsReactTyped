package typingsJapgolly.ionicReact

import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicReact.anon.ElementeventskeystringeEv
import typingsJapgolly.ionicReact.distTypesComponentsReactComponentLibInterfacesMod.StyleReactProps
import typingsJapgolly.ionicReact.ionicReactStrings.style
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReactComponentLibUtilsMod {
  
  @JSImport("@ionic/react/dist/types/components/react-component-lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachProps(node: HTMLElement, newProps: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def attachProps(node: HTMLElement, newProps: Any, oldProps: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def camelToDashCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelToDashCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createForwardRef[PropType, ElementType](ReactComponent: Any, displayName: String): ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createForwardRef")(ReactComponent.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[StencilReactExternalProps[PropType, ElementType]]) & RefAttributes[ElementType]
  ]]
  
  inline def dashToPascalCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dashToPascalCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def defineCustomElement(tagName: String, customElement: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineCustomElement")(tagName.asInstanceOf[js.Any], customElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getClassName(classList: DOMTokenList, newProps: Any, oldProps: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassName")(classList.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isCoveredByReact(eventNameSuffix: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoveredByReact")(eventNameSuffix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mergeRefs(refs: (js.UndefOr[StencilReactForwardedRef[Any] | Ref[Any]])*): RefFn[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RefFn[Any]]
  
  inline def setRef(ref: Ref[Any] | StencilReactForwardedRef[Any], value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRef(ref: Unit, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type StencilReactExternalProps[PropType, ElementType] = PropType & (Omit[HTMLAttributes[ElementType], style]) & StyleReactProps
  
  type StencilReactForwardedRef[T] = (js.Function1[/* instance */ T | Null, Unit]) | (MutableRefObject[T | Null]) | Null
}
