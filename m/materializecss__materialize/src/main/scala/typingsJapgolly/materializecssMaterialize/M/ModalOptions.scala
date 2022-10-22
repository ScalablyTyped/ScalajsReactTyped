package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Modal
  */
trait ModalOptions extends StObject {
  
  /**
    * Allow modal to be dismissed by keyboard or overlay click.
    * @default true
    */
  var dismissible: Boolean
  
  /**
    * Ending top offset
    * @default '10%'
    */
  var endingTop: String
  
  /**
    * Transition in duration in milliseconds.
    * @default 250
    */
  var inDuration: Double
  
  /**
    * Callback function called after modal is closed
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  
  /**
    * Callback function called before modal is closed
    * @default null
    */
  def onCloseStart(el: Element): Unit
  
  /**
    * Callback function called after modal is opened
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  
  /**
    * Callback function called before modal is opened
    * @default null
    */
  def onOpenStart(el: Element): Unit
  
  /**
    * Opacity of the modal overlay.
    * @default 0.5
    */
  var opacity: Double
  
  /**
    * Transition out duration in milliseconds.
    * @default 250
    */
  var outDuration: Double
  
  /**
    * Prevent page from scrolling while modal is open
    * @default true
    */
  var preventScrolling: Boolean
  
  /**
    * Starting top offset
    * @default '4%'
    */
  var startingTop: String
}
object ModalOptions {
  
  inline def apply(
    dismissible: Boolean,
    endingTop: String,
    inDuration: Double,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    opacity: Double,
    outDuration: Double,
    preventScrolling: Boolean,
    startingTop: String
  ): ModalOptions = {
    val __obj = js.Dynamic.literal(dismissible = dismissible.asInstanceOf[js.Any], endingTop = endingTop.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1((t0: Element) => onCloseEnd(t0).runNow()), onCloseStart = js.Any.fromFunction1((t0: Element) => onCloseStart(t0).runNow()), onOpenEnd = js.Any.fromFunction1((t0: Element) => onOpenEnd(t0).runNow()), onOpenStart = js.Any.fromFunction1((t0: Element) => onOpenStart(t0).runNow()), opacity = opacity.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any], preventScrolling = preventScrolling.asInstanceOf[js.Any], startingTop = startingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalOptions]
  }
  
  extension [Self <: ModalOptions](x: Self) {
    
    inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
    
    inline def setEndingTop(value: String): Self = StObject.set(x, "endingTop", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Callback): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnCloseStart(value: Element => Callback): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenEnd(value: Element => Callback): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenStart(value: Element => Callback): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setPreventScrolling(value: Boolean): Self = StObject.set(x, "preventScrolling", value.asInstanceOf[js.Any])
    
    inline def setStartingTop(value: String): Self = StObject.set(x, "startingTop", value.asInstanceOf[js.Any])
  }
}
