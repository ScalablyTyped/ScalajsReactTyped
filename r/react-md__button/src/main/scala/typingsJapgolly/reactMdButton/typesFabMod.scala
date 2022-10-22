package typingsJapgolly.reactMdButton

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFabMod {
  
  @JSImport("@react-md/button/types/FAB", "FAB")
  @js.native
  val FAB: ForwardRefExoticComponent[FABProps & RefAttributes[HTMLSpanElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.`bottom-left`
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.`bottom-right`
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.`top-left`
    - typingsJapgolly.reactMdButton.reactMdButtonStrings.`top-right`
  */
  type FABPosition = _FABPosition | Null
  
  trait FABProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * The position within the viewport to display the button as a floating action
      * button.
      */
    var position: js.UndefOr[FABPosition] = js.undefined
  }
  object FABProps {
    
    inline def apply(): FABProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FABProps]
    }
    
    extension [Self <: FABProps](x: Self) {
      
      inline def setPosition(value: FABPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionNull: Self = StObject.set(x, "position", null)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  trait _FABPosition extends StObject
}
