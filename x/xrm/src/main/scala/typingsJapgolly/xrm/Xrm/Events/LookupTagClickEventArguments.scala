package typingsJapgolly.xrm.Xrm.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.TagValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupTagClickEventArguments extends StObject {
  
  /**
    * Gets the selected tag value
    * @returns The lookups TagValue object
    */
  def getTagValue(): TagValue
  
  /**
    * Returns a boolean value to indicate if the lookups onClick has been prevented.
    * @returns true if saving is prevented, otherwise false.
    */
  def isDefaultPrevented(): Boolean
  
  /**
    * Prevents the default onClick behaviour from executing.
    * All remaining "onLookupTagClick" handlers will continue execution.
    */
  def preventDefault(): Unit
}
object LookupTagClickEventArguments {
  
  inline def apply(
    getTagValue: CallbackTo[TagValue],
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: Callback
  ): LookupTagClickEventArguments = {
    val __obj = js.Dynamic.literal(getTagValue = getTagValue.toJsFn, isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.toJsFn)
    __obj.asInstanceOf[LookupTagClickEventArguments]
  }
  
  extension [Self <: LookupTagClickEventArguments](x: Self) {
    
    inline def setGetTagValue(value: CallbackTo[TagValue]): Self = StObject.set(x, "getTagValue", value.toJsFn)
    
    inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
  }
}
