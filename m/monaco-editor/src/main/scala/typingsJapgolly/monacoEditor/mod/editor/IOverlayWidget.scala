package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOverlayWidget extends StObject {
  
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement
  
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String
  
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null
}
object IOverlayWidget {
  
  inline def apply(
    getDomNode: CallbackTo[HTMLElement],
    getId: CallbackTo[String],
    getPosition: CallbackTo[IOverlayWidgetPosition | Null]
  ): IOverlayWidget = {
    val __obj = js.Dynamic.literal(getDomNode = getDomNode.toJsFn, getId = getId.toJsFn, getPosition = getPosition.toJsFn)
    __obj.asInstanceOf[IOverlayWidget]
  }
  
  extension [Self <: IOverlayWidget](x: Self) {
    
    inline def setGetDomNode(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getDomNode", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[IOverlayWidgetPosition | Null]): Self = StObject.set(x, "getPosition", value.toJsFn)
  }
}
