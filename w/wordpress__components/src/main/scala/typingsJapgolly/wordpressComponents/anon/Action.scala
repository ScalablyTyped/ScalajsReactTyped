package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action
  extends StObject
     with _OptionCompletion {
  
  var action: `insert-at-caret`
  
  var value: Node
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal(action = "insert-at-caret", value = null)
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: `insert-at-caret`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setValue(value: VdomNode): Self = StObject.set(x, "value", value.rawNode.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
  }
}
