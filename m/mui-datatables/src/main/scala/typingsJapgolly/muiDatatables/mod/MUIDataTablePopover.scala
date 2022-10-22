package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTablePopover extends StObject {
  
  var action: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var anchorEl: js.UndefOr[Node] = js.undefined
  
  var anchorOrigin: js.UndefOr[Any] = js.undefined
  
  var classes: js.UndefOr[js.Object] = js.undefined
  
  var content: js.UndefOr[Node] = js.undefined
  
  var elevation: js.UndefOr[Double] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var onExited: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var option: js.UndefOr[Boolean] = js.undefined
  
  var ref: js.UndefOr[Any] = js.undefined
  
  var refExit: js.UndefOr[js.Function1[/* args */ Any, Any]] = js.undefined
  
  var transformOrigin: js.UndefOr[Any] = js.undefined
  
  var trigger: js.UndefOr[Node] = js.undefined
}
object MUIDataTablePopover {
  
  inline def apply(): MUIDataTablePopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTablePopover]
  }
  
  extension [Self <: MUIDataTablePopover](x: Self) {
    
    inline def setAction(value: /* args */ Any => Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAnchorEl(value: VdomNode): Self = StObject.set(x, "anchorEl", value.rawNode.asInstanceOf[js.Any])
    
    inline def setAnchorElNull: Self = StObject.set(x, "anchorEl", null)
    
    inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
    
    inline def setAnchorElVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "anchorEl", js.Array(value*))
    
    inline def setAnchorElVdomElement(value: VdomElement): Self = StObject.set(x, "anchorEl", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAnchorOrigin(value: Any): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
    
    inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
    
    inline def setClasses(value: js.Object): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setOnClose(value: /* args */ Any => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnExited(value: /* args */ Any => Any): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
    
    inline def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    
    inline def setOption(value: Boolean): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefExit(value: /* args */ Any => Any): Self = StObject.set(x, "refExit", js.Any.fromFunction1(value))
    
    inline def setRefExitUndefined: Self = StObject.set(x, "refExit", js.undefined)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTransformOrigin(value: Any): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
    
    inline def setTrigger(value: VdomNode): Self = StObject.set(x, "trigger", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTriggerNull: Self = StObject.set(x, "trigger", null)
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "trigger", js.Array(value*))
    
    inline def setTriggerVdomElement(value: VdomElement): Self = StObject.set(x, "trigger", value.rawElement.asInstanceOf[js.Any])
  }
}
