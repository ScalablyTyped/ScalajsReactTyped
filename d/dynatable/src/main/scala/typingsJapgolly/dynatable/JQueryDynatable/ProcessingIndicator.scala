package typingsJapgolly.dynatable.JQueryDynatable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dynatable.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingIndicator extends StObject {
  
  /** Insert the processing indicator inside the page */
  def attach(): Unit
  
  /**
    * Generate the html markup for the processing indicator
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery
  
  /** Hide the processing indicator */
  def hide(): Unit
  
  /** Set up the processing indicator */
  def init(): Unit
  
  /**
    * Position the processing indicator at the center
    *
    * @return A jQuery object containing the processing indicator
    */
  def position(): JQuery
  
  /** Show the processing indicator */
  def show(): Unit
}
object ProcessingIndicator {
  
  inline def apply(
    attach: Callback,
    create: CallbackTo[JQuery],
    hide: Callback,
    init: Callback,
    position: CallbackTo[JQuery],
    show: Callback
  ): ProcessingIndicator = {
    val __obj = js.Dynamic.literal(attach = attach.toJsFn, create = create.toJsFn, hide = hide.toJsFn, init = init.toJsFn, position = position.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[ProcessingIndicator]
  }
  
  extension [Self <: ProcessingIndicator](x: Self) {
    
    inline def setAttach(value: Callback): Self = StObject.set(x, "attach", value.toJsFn)
    
    inline def setCreate(value: CallbackTo[JQuery]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setPosition(value: CallbackTo[JQuery]): Self = StObject.set(x, "position", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
