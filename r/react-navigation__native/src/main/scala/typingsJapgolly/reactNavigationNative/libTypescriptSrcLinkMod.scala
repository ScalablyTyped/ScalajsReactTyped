package typingsJapgolly.reactNavigationNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.Text
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.global.ReactNavigation.RootParamList
import typingsJapgolly.reactNavigationNative.libTypescriptSrcUseLinkToMod.To
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcLinkMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/Link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: RootParamList */](hasToActionRest: Props[ParamList]): CElement[TextProps, Text] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasToActionRest.asInstanceOf[js.Any]).asInstanceOf[CElement[TextProps, Text]]
  
  trait Props[ParamList /* <: RootParamList */]
    extends StObject
       with TextProps {
    
    var action: js.UndefOr[NavigationAction] = js.undefined
    
    @JSName("children")
    var children_Props: Node
    
    @JSName("onPress")
    var onPress_Props: js.UndefOr[
        js.Function1[/* e */ ReactMouseEventFrom[HTMLAnchorElement] | GestureResponderEvent, Unit]
      ] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var to: To[ParamList, /* keyof ParamList */ String]
  }
  object Props {
    
    inline def apply[ParamList /* <: RootParamList */](to: To[ParamList, /* keyof ParamList */ String]): Props[ParamList] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props[ParamList]]
    }
    
    extension [Self <: Props[?], ParamList /* <: RootParamList */](x: Self & Props[ParamList]) {
      
      inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnPress(value: /* e */ ReactMouseEventFrom[HTMLAnchorElement] | GestureResponderEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLAnchorElement] | GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTo(value: To[ParamList, /* keyof ParamList */ String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
