package typingsJapgolly.materializecssMaterialize.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.left
import typingsJapgolly.materializecssMaterialize.materializecssMaterializeStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownOptions extends StObject {
  
  /**
    * Defines the edge the menu is aligned to
    * @default 'left'
    */
  var alignment: left | right
  
  /**
    * If true, automatically focus dropdown el for keyboard
    * @default true
    */
  var autoTrigger: Boolean
  
  /**
    * If true, close dropdown on item click
    * @default true
    */
  var closeOnClick: Boolean
  
  /**
    * If true, constrainWidth to the size of the dropdown activator
    * @default true
    */
  var constrainWidth: Boolean
  
  /**
    * Provide an element that will be the bounding container of the dropdown
    * @default null
    */
  var container: Element
  
  /**
    * If false, the dropdown will show below the trigger
    * @default true
    */
  var coverTrigger: Boolean
  
  /**
    * If true, the dropdown will open on hover
    * @default false
    */
  var hover: Boolean
  
  /**
    * The duration of the transition enter in milliseconds
    * @default 150
    */
  var inDuration: Double
  
  /**
    * Function called when dropdown finishes exiting
    * @default null
    */
  def onCloseEnd(el: Element): Unit
  
  /**
    * Function called when dropdown starts exiting
    * @default null
    */
  def onCloseStart(el: Element): Unit
  
  /**
    * Function called when dropdown finishes entering
    * @default null
    */
  def onOpenEnd(el: Element): Unit
  
  /**
    * Function called when dropdown starts entering
    * @default null
    */
  def onOpenStart(el: Element): Unit
  
  /**
    * The duration of the transition out in milliseconds
    * @default 250
    */
  var outDuration: Double
}
object DropdownOptions {
  
  inline def apply(
    alignment: left | right,
    autoTrigger: Boolean,
    closeOnClick: Boolean,
    constrainWidth: Boolean,
    container: Element,
    coverTrigger: Boolean,
    hover: Boolean,
    inDuration: Double,
    onCloseEnd: Element => Callback,
    onCloseStart: Element => Callback,
    onOpenEnd: Element => Callback,
    onOpenStart: Element => Callback,
    outDuration: Double
  ): DropdownOptions = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], autoTrigger = autoTrigger.asInstanceOf[js.Any], closeOnClick = closeOnClick.asInstanceOf[js.Any], constrainWidth = constrainWidth.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], coverTrigger = coverTrigger.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], onCloseEnd = js.Any.fromFunction1((t0: Element) => onCloseEnd(t0).runNow()), onCloseStart = js.Any.fromFunction1((t0: Element) => onCloseStart(t0).runNow()), onOpenEnd = js.Any.fromFunction1((t0: Element) => onOpenEnd(t0).runNow()), onOpenStart = js.Any.fromFunction1((t0: Element) => onOpenStart(t0).runNow()), outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownOptions]
  }
  
  extension [Self <: DropdownOptions](x: Self) {
    
    inline def setAlignment(value: left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAutoTrigger(value: Boolean): Self = StObject.set(x, "autoTrigger", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setConstrainWidth(value: Boolean): Self = StObject.set(x, "constrainWidth", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setCoverTrigger(value: Boolean): Self = StObject.set(x, "coverTrigger", value.asInstanceOf[js.Any])
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOnCloseEnd(value: Element => Callback): Self = StObject.set(x, "onCloseEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnCloseStart(value: Element => Callback): Self = StObject.set(x, "onCloseStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenEnd(value: Element => Callback): Self = StObject.set(x, "onOpenEnd", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOnOpenStart(value: Element => Callback): Self = StObject.set(x, "onOpenStart", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
  }
}
