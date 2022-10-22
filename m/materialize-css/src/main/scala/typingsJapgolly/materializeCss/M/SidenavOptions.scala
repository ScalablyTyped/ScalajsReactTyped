package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.materializeCssStrings.left
import typingsJapgolly.materializeCss.materializeCssStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Sidenav
  */
trait SidenavOptions extends StObject {
  
  /**
    * Allow swipe gestures to open/close Sidenav
    * @default true
    */
  var draggable: Boolean
  
  /**
    * Side of screen on which Sidenav appears
    * @default 'left'
    */
  var edge: left | right
  
  /**
    * Length in ms of enter transition
    * @default 250
    */
  var inDuration: Double
  
  /**
    * Function called when sidenav finishes exiting
    */
  def onCloseEnd(elem: Element): Unit
  
  /**
    * Function called when sidenav starts exiting
    */
  def onCloseStart(elem: Element): Unit
  
  /**
    * Function called when sidenav finishes entering
    */
  def onOpenEnd(elem: Element): Unit
  
  /**
    * Function called when sidenav starts entering
    */
  def onOpenStart(elem: Element): Unit
  
  /**
    * Length in ms of exit transition
    * @default 200
    */
  var outDuration: Double
}
object SidenavOptions {
  
  inline def apply(
    draggable: Boolean,
    edge: left | right,
    inDuration: Double,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    outDuration: Double
  ): SidenavOptions = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1((t0: Element) => onCloseEnd(t0).runNow()), onCloseStart = js.Any.fromFunction1((t0: Element) => onCloseStart(t0).runNow()), onOpenEnd = js.Any.fromFunction1((t0: Element) => onOpenEnd(t0).runNow()), onOpenStart = js.Any.fromFunction1((t0: Element) => onOpenStart(t0).runNow()), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidenavOptions]
  }
  
  extension [Self <: SidenavOptions](x: Self) {
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setEdge(value: left | right): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Callback): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnCloseStart(value: Element => Callback): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenEnd(value: Element => Callback): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenStart(value: Element => Callback): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
