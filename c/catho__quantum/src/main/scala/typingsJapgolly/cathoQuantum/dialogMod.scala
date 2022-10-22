package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.cathoQuantum.anon.`12`
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@catho/quantum/Dialog", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DialogProps, js.Object, Any]
  
  type Dialog = japgolly.scalajs.react.facade.React.Component[DialogProps & js.Object, js.Object]
  
  trait DialogProps extends StObject {
    
    var children: js.Array[Node] | Node
    
    var closeOnTime: js.UndefOr[Double] = js.undefined
    
    var disableClickOutside: Boolean
    
    var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var theme: js.UndefOr[`12`] = js.undefined
  }
  object DialogProps {
    
    inline def apply(disableClickOutside: Boolean): DialogProps = {
      val __obj = js.Dynamic.literal(disableClickOutside = disableClickOutside.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[DialogProps]
    }
    
    extension [Self <: DialogProps](x: Self) {
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCloseOnTime(value: Double): Self = StObject.set(x, "closeOnTime", value.asInstanceOf[js.Any])
      
      inline def setCloseOnTimeUndefined: Self = StObject.set(x, "closeOnTime", js.undefined)
      
      inline def setDisableClickOutside(value: Boolean): Self = StObject.set(x, "disableClickOutside", value.asInstanceOf[js.Any])
      
      inline def setOnClickOutside(value: Callback): Self = StObject.set(x, "onClickOutside", value.toJsFn)
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setTheme(value: `12`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
