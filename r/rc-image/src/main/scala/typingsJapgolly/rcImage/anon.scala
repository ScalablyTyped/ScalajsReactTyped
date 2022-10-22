package typingsJapgolly.rcImage

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: js.UndefOr[Node] = js.undefined
    
    var left: js.UndefOr[Node] = js.undefined
    
    var right: js.UndefOr[Node] = js.undefined
    
    var rotateLeft: js.UndefOr[Node] = js.undefined
    
    var rotateRight: js.UndefOr[Node] = js.undefined
    
    var zoomIn: js.UndefOr[Node] = js.undefined
    
    var zoomOut: js.UndefOr[Node] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: VdomNode): Self = StObject.set(x, "close", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseNull: Self = StObject.set(x, "close", null)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCloseVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "close", js.Array(value*))
      
      inline def setCloseVdomElement(value: VdomElement): Self = StObject.set(x, "close", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLeft(value: VdomNode): Self = StObject.set(x, "left", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setLeftVdomElement(value: VdomElement): Self = StObject.set(x, "left", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRight(value: VdomNode): Self = StObject.set(x, "right", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setRightVdomElement(value: VdomElement): Self = StObject.set(x, "right", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRotateLeft(value: VdomNode): Self = StObject.set(x, "rotateLeft", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRotateLeftNull: Self = StObject.set(x, "rotateLeft", null)
      
      inline def setRotateLeftUndefined: Self = StObject.set(x, "rotateLeft", js.undefined)
      
      inline def setRotateLeftVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "rotateLeft", js.Array(value*))
      
      inline def setRotateLeftVdomElement(value: VdomElement): Self = StObject.set(x, "rotateLeft", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRotateRight(value: VdomNode): Self = StObject.set(x, "rotateRight", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRotateRightNull: Self = StObject.set(x, "rotateRight", null)
      
      inline def setRotateRightUndefined: Self = StObject.set(x, "rotateRight", js.undefined)
      
      inline def setRotateRightVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "rotateRight", js.Array(value*))
      
      inline def setRotateRightVdomElement(value: VdomElement): Self = StObject.set(x, "rotateRight", value.rawElement.asInstanceOf[js.Any])
      
      inline def setZoomIn(value: VdomNode): Self = StObject.set(x, "zoomIn", value.rawNode.asInstanceOf[js.Any])
      
      inline def setZoomInNull: Self = StObject.set(x, "zoomIn", null)
      
      inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      inline def setZoomInVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "zoomIn", js.Array(value*))
      
      inline def setZoomInVdomElement(value: VdomElement): Self = StObject.set(x, "zoomIn", value.rawElement.asInstanceOf[js.Any])
      
      inline def setZoomOut(value: VdomNode): Self = StObject.set(x, "zoomOut", value.rawNode.asInstanceOf[js.Any])
      
      inline def setZoomOutNull: Self = StObject.set(x, "zoomOut", null)
      
      inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
      
      inline def setZoomOutVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "zoomOut", js.Array(value*))
      
      inline def setZoomOutVdomElement(value: VdomElement): Self = StObject.set(x, "zoomOut", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
