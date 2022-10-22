package typingsJapgolly.leafletEditable.leafletMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When editing a feature (marker, polyline…), an editor is attached to it.
  * This editor basically knows how to handle the edition.
  */
trait BaseEditor extends StObject {
  
  /**
    * Remove editing tools.
    */
  def disable(): Editor
  
  /**
    * Return true if any drawing action is ongoing with this editor.
    */
  def drawing(): Boolean
  
  /**
    * Set up the drawing tools for the feature to be editable.
    */
  def enable(): Editor
}
object BaseEditor {
  
  inline def apply(disable: CallbackTo[Editor], drawing: CallbackTo[Boolean], enable: CallbackTo[Editor]): BaseEditor = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, drawing = drawing.toJsFn, enable = enable.toJsFn)
    __obj.asInstanceOf[BaseEditor]
  }
  
  extension [Self <: BaseEditor](x: Self) {
    
    inline def setDisable(value: CallbackTo[Editor]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setDrawing(value: CallbackTo[Boolean]): Self = StObject.set(x, "drawing", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[Editor]): Self = StObject.set(x, "enable", value.toJsFn)
  }
}
