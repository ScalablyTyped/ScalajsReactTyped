package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInterface extends StObject {
  
  /**
    * Add the layer to a map.
    * @param {TrimbleMaps.Map} map
    */
  def addTo(map: Map): this.type
  
  /**
    * Returns true if the layer is visible.
    */
  def isVisible(): Boolean
  
  /**
    * Remove the layer from a map.
    */
  def remove(): this.type
  
  /**
    * Set the layer visibility.
    */
  def setVisibility(isVisible: Boolean): this.type
  
  /**
    * Toggle layer visibility.
    */
  def toggleVisibility(): this.type
}
object ContentInterface {
  
  inline def apply(
    addTo: Map => ContentInterface,
    isVisible: CallbackTo[Boolean],
    remove: CallbackTo[ContentInterface],
    setVisibility: Boolean => ContentInterface,
    toggleVisibility: CallbackTo[ContentInterface]
  ): ContentInterface = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), isVisible = isVisible.toJsFn, remove = remove.toJsFn, setVisibility = js.Any.fromFunction1(setVisibility), toggleVisibility = toggleVisibility.toJsFn)
    __obj.asInstanceOf[ContentInterface]
  }
  
  extension [Self <: ContentInterface](x: Self) {
    
    inline def setAddTo(value: Map => ContentInterface): Self = StObject.set(x, "addTo", js.Any.fromFunction1(value))
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setRemove(value: CallbackTo[ContentInterface]): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetVisibility(value: Boolean => ContentInterface): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1(value))
    
    inline def setToggleVisibility(value: CallbackTo[ContentInterface]): Self = StObject.set(x, "toggleVisibility", value.toJsFn)
  }
}
