package typingsJapgolly.videoReact.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlBarProps extends StObject {
  
  /**
    * Hide the control bar automatically after the player is inactive,
    * default: `true`
    */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The waiting time for auto hide after player is inactive (in milliseconds),
    * default: `3000`
    */
  var autoHideTime: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Do not render the control bar if set it to true, default: `false`
    */
  var disableCompletely: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Do not render default controls, only use custom ones provided as children
    * of `<ControlBar>`
    */
  var disableDefaultControls: js.UndefOr[Boolean] = js.undefined
}
object ControlBarProps {
  
  inline def apply(): ControlBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlBarProps]
  }
  
  extension [Self <: ControlBarProps](x: Self) {
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoHideTime(value: Double): Self = StObject.set(x, "autoHideTime", value.asInstanceOf[js.Any])
    
    inline def setAutoHideTimeUndefined: Self = StObject.set(x, "autoHideTime", js.undefined)
    
    inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisableCompletely(value: Boolean): Self = StObject.set(x, "disableCompletely", value.asInstanceOf[js.Any])
    
    inline def setDisableCompletelyUndefined: Self = StObject.set(x, "disableCompletely", js.undefined)
    
    inline def setDisableDefaultControls(value: Boolean): Self = StObject.set(x, "disableDefaultControls", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultControlsUndefined: Self = StObject.set(x, "disableDefaultControls", js.undefined)
  }
}
