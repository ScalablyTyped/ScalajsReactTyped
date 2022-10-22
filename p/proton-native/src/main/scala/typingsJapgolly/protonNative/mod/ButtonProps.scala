package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * The text to display in the button.
    */
  var children: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the button can be clicked.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the button is clicked.
    */
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Whether the button can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ButtonProps {
  
  inline def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  
  extension [Self <: ButtonProps](x: Self) {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
