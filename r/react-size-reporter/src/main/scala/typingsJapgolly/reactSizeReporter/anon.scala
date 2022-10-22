package typingsJapgolly.reactSizeReporter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactSizeReporter.mod.ReactSizeReporterRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    // Children with static or dynamic height or width
    var children: Node
    
    // Callback called on mount and size changes.
    def onSizeChange(newDimensions: Height): Unit
    
    var ref: js.UndefOr[Ref[ReactSizeReporterRef]] = js.undefined
  }
  object Children {
    
    inline def apply(onSizeChange: Height => Callback): Children = {
      val __obj = js.Dynamic.literal(onSizeChange = js.Any.fromFunction1((t0: Height) => onSizeChange(t0).runNow()), children = null)
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnSizeChange(value: Height => Callback): Self = StObject.set(x, "onSizeChange", js.Any.fromFunction1((t0: Height) => value(t0).runNow()))
      
      inline def setRef(value: Ref[ReactSizeReporterRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: ReactSizeReporterRef | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: ReactSizeReporterRef | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
