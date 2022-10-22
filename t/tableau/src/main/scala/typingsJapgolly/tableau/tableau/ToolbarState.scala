package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarState extends StObject {
  
  /** Gets the Viz object associated with the toolbar. */
  def getViz(): Viz
  
  /**
    * Gets a value indicating whether the specified toolbar button is enabled.
    * The supported buttons are defined in the ToobarButtonName enum.
    * Currently, only Undo and Redo are supported.
    * Checking this property with a toolbar button that is not supported causes an InvalidToolbarButtonName error.
    */
  def isButtonEnabled(toolbarButtonName: ToolbarButtonName): Boolean
}
object ToolbarState {
  
  inline def apply(getViz: CallbackTo[Viz], isButtonEnabled: ToolbarButtonName => Boolean): ToolbarState = {
    val __obj = js.Dynamic.literal(getViz = getViz.toJsFn, isButtonEnabled = js.Any.fromFunction1(isButtonEnabled))
    __obj.asInstanceOf[ToolbarState]
  }
  
  extension [Self <: ToolbarState](x: Self) {
    
    inline def setGetViz(value: CallbackTo[Viz]): Self = StObject.set(x, "getViz", value.toJsFn)
    
    inline def setIsButtonEnabled(value: ToolbarButtonName => Boolean): Self = StObject.set(x, "isButtonEnabled", js.Any.fromFunction1(value))
  }
}
