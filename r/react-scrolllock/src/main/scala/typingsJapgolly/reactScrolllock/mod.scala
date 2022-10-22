package typingsJapgolly.reactScrolllock

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scrolllock", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ScrollLockProps, js.Object, Any]
  
  @JSImport("react-scrolllock", "TouchScrollable")
  @js.native
  open class TouchScrollable protected ()
    extends Component[OneChildrenElement, js.Object, Any] {
    def this(props: OneChildrenElement) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OneChildrenElement, context: Any) = this()
  }
  
  trait OneChildrenElement extends StObject {
    
    var children: js.UndefOr[Element] = js.undefined
  }
  object OneChildrenElement {
    
    inline def apply(): OneChildrenElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OneChildrenElement]
    }
    
    extension [Self <: OneChildrenElement](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type ScrollLock = japgolly.scalajs.react.facade.React.Component[ScrollLockProps & js.Object, js.Object]
  
  trait ScrollLockProps
    extends StObject
       with OneChildrenElement {
    
    var accountForScrollbars: js.UndefOr[Boolean] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollLockProps {
    
    inline def apply(): ScrollLockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollLockProps]
    }
    
    extension [Self <: ScrollLockProps](x: Self) {
      
      inline def setAccountForScrollbars(value: Boolean): Self = StObject.set(x, "accountForScrollbars", value.asInstanceOf[js.Any])
      
      inline def setAccountForScrollbarsUndefined: Self = StObject.set(x, "accountForScrollbars", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    }
  }
}
