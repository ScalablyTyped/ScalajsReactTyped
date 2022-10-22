package typingsJapgolly.ionicReact

import org.scalajs.dom.DOMTokenList
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicReact.anon.ElementeventskeystringeEv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReactComponentLibUtilsAttachPropsMod {
  
  @JSImport("@ionic/react/dist/types/components/react-component-lib/utils/attachProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachProps(node: HTMLElement, newProps: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def attachProps(node: HTMLElement, newProps: Any, oldProps: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachProps")(node.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getClassName(classList: DOMTokenList, newProps: Any, oldProps: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassName")(classList.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], oldProps.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isCoveredByReact(eventNameSuffix: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCoveredByReact")(eventNameSuffix.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def syncEvent(node: ElementeventskeystringeEv, eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncEvent(
    node: ElementeventskeystringeEv,
    eventName: String,
    newEventHandler: js.Function1[/* e */ Event, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEvent")(node.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], newEventHandler.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
