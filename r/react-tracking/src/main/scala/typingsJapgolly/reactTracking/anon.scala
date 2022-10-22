package typingsJapgolly.reactTracking

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactTracking.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
  }
  object Data {
    
    inline def apply(): Data = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{}> */
  trait PropsWithChildren extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object PropsWithChildren {
    
    inline def apply(): PropsWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsWithChildren]
    }
    
    extension [Self <: PropsWithChildren](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Tracking[T] extends StObject {
    
    var tracking: Options[T] & Data
  }
  object Tracking {
    
    inline def apply[T](tracking: Options[T] & Data): Tracking[T] = {
      val __obj = js.Dynamic.literal(tracking = tracking.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tracking[T]]
    }
    
    extension [Self <: Tracking[?], T](x: Self & Tracking[T]) {
      
      inline def setTracking(value: Options[T] & Data): Self = StObject.set(x, "tracking", value.asInstanceOf[js.Any])
    }
  }
}
