package typingsJapgolly.reactNativeSwipeout

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.delete
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.primary
import typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-swipeout", JSImport.Default)
  @js.native
  open class default () extends Component[SwipeoutProperties, Any, Any]
  
  type Swipeout = japgolly.scalajs.react.facade.React.Component[SwipeoutProperties & js.Object, js.Object]
  
  trait SwipeoutButtonProperties extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[Element] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var text: js.UndefOr[Node] = js.undefined
    
    var `type`: js.UndefOr[
        typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
      ] = js.undefined
    
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object SwipeoutButtonProperties {
    
    inline def apply(): SwipeoutButtonProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutButtonProperties]
    }
    
    extension [Self <: SwipeoutButtonProperties](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setComponent(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
      
      inline def setType(
        value: typingsJapgolly.reactNativeSwipeout.reactNativeSwipeoutStrings.default | delete | primary | secondary
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  trait SwipeoutProperties extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var buttonWidth: js.UndefOr[Double] = js.undefined
    
    var close: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
    
    var onClose: js.UndefOr[
        js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
      ] = js.undefined
    
    var onOpen: js.UndefOr[
        js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
      ] = js.undefined
    
    var openLeft: js.UndefOr[Boolean] = js.undefined
    
    var openRight: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
    
    var rowId: js.UndefOr[Double] = js.undefined
    
    var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ Boolean, Unit]] = js.undefined
    
    var sectionId: js.UndefOr[Double] = js.undefined
    
    var sensitivity: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object SwipeoutProperties {
    
    inline def apply(): SwipeoutProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutProperties]
    }
    
    extension [Self <: SwipeoutProperties](x: Self) {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setButtonWidth(value: Double): Self = StObject.set(x, "buttonWidth", value.asInstanceOf[js.Any])
      
      inline def setButtonWidthUndefined: Self = StObject.set(x, "buttonWidth", js.undefined)
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLeft(value: js.Array[SwipeoutButtonProperties]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: SwipeoutButtonProperties*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setOnClose(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction3((t0: /* sectionId */ Double, t1: /* rowId */ Double, t2: /* direction */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction3((t0: /* sectionId */ Double, t1: /* rowId */ Double, t2: /* direction */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpenLeft(value: Boolean): Self = StObject.set(x, "openLeft", value.asInstanceOf[js.Any])
      
      inline def setOpenLeftUndefined: Self = StObject.set(x, "openLeft", js.undefined)
      
      inline def setOpenRight(value: Boolean): Self = StObject.set(x, "openRight", value.asInstanceOf[js.Any])
      
      inline def setOpenRightUndefined: Self = StObject.set(x, "openRight", js.undefined)
      
      inline def setRight(value: js.Array[SwipeoutButtonProperties]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: SwipeoutButtonProperties*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setRowId(value: Double): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
      
      inline def setRowIdUndefined: Self = StObject.set(x, "rowId", js.undefined)
      
      inline def setScroll(value: /* scrollEnabled */ Boolean => Callback): Self = StObject.set(x, "scroll", js.Any.fromFunction1((t0: /* scrollEnabled */ Boolean) => value(t0).runNow()))
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSectionId(value: Double): Self = StObject.set(x, "sectionId", value.asInstanceOf[js.Any])
      
      inline def setSectionIdUndefined: Self = StObject.set(x, "sectionId", js.undefined)
      
      inline def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
      
      inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
