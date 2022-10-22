package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrimitive extends StObject {
  
  /**
    * Gets the css cursor value when the primitive has events on it.
    * @returns css cursor string when primitive has events on it.
    */
  def getCursor(): String
  
  /**
    * Gets whether the primitive is visible.
    * @returns A boolean indicating whether the primitive is visible or not.
    */
  def getVisible(): Boolean
  
  /** Optional property to store any additional metadata for this primitive. */
  var metadata: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the options for customizing the IPrimitive.
    * @param options The options for customizing the IPrimitive.
    */
  def setOptions(options: IPrimitiveOptions): Unit
}
object IPrimitive {
  
  inline def apply(
    getCursor: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setOptions: IPrimitiveOptions => Callback
  ): IPrimitive = {
    val __obj = js.Dynamic.literal(getCursor = getCursor.toJsFn, getVisible = getVisible.toJsFn, setOptions = js.Any.fromFunction1((t0: IPrimitiveOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[IPrimitive]
  }
  
  extension [Self <: IPrimitive](x: Self) {
    
    inline def setGetCursor(value: CallbackTo[String]): Self = StObject.set(x, "getCursor", value.toJsFn)
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSetOptions(value: IPrimitiveOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IPrimitiveOptions) => value(t0).runNow()))
  }
}
