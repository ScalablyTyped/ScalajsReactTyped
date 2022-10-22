package typingsJapgolly.formol

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictk
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var no: Node
    
    var yes: Node
  }
  object Dictk {
    
    inline def apply(): Dictk = {
      val __obj = js.Dynamic.literal(no = null, yes = null)
      __obj.asInstanceOf[Dictk]
    }
    
    extension [Self <: Dictk](x: Self) {
      
      inline def setNo(value: VdomNode): Self = StObject.set(x, "no", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNoNull: Self = StObject.set(x, "no", null)
      
      inline def setNoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "no", js.Array(value*))
      
      inline def setNoVdomElement(value: VdomElement): Self = StObject.set(x, "no", value.rawElement.asInstanceOf[js.Any])
      
      inline def setYes(value: VdomNode): Self = StObject.set(x, "yes", value.rawNode.asInstanceOf[js.Any])
      
      inline def setYesNull: Self = StObject.set(x, "yes", null)
      
      inline def setYesVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "yes", js.Array(value*))
      
      inline def setYesVdomElement(value: VdomElement): Self = StObject.set(x, "yes", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
