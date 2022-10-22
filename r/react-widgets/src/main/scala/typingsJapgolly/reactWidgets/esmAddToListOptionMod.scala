package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAddToListOptionMod {
  
  object default {
    
    inline def apply(hasChildrenProps: AddToListOptionProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-widgets/esm/AddToListOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.activeId")
      @js.native
      def activeId: Requireable[String] = js.native
      inline def activeId_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeId")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.focused")
      @js.native
      def focused: Requireable[Boolean] = js.native
      inline def focused_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focused")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.onSelect")
      @js.native
      def onSelect: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onSelect_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("react-widgets/esm/AddToListOption", "default.propTypes.searchTerm")
      @js.native
      def searchTerm: Requireable[String] = js.native
      inline def searchTerm_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchTerm")(x.asInstanceOf[js.Any])
    }
  }
  
  trait AddToListOptionProps extends StObject {
    
    var children: Node
    
    def onSelect(event: ReactMouseEventFrom[org.scalajs.dom.Element]): Unit
  }
  object AddToListOptionProps {
    
    inline def apply(onSelect: ReactMouseEventFrom[org.scalajs.dom.Element] => Callback): AddToListOptionProps = {
      val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1((t0: ReactMouseEventFrom[org.scalajs.dom.Element]) => onSelect(t0).runNow()), children = null)
      __obj.asInstanceOf[AddToListOptionProps]
    }
    
    extension [Self <: AddToListOptionProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: ReactMouseEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactMouseEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
    }
  }
}
