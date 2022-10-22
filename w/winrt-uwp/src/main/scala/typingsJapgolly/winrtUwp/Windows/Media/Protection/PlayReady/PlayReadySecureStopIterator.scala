package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.anon.ItemsIPlayReadySecureStopServiceRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the IPlayReadySecureStopServiceRequest interface. */
trait PlayReadySecureStopIterator extends StObject {
  
  /** Gets the current item in the PlayReady secure stop collection. */
  var current: IPlayReadySecureStopServiceRequest
  
  /**
    * Retrieves all items in the PlayReady secure stop collection.
    */
  def getMany(): ItemsIPlayReadySecureStopServiceRequest
  
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady secure stop collection. */
  var hasCurrent: Boolean
  
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean
}
object PlayReadySecureStopIterator {
  
  inline def apply(
    current: IPlayReadySecureStopServiceRequest,
    getMany: CallbackTo[ItemsIPlayReadySecureStopServiceRequest],
    hasCurrent: Boolean,
    moveNext: CallbackTo[Boolean]
  ): PlayReadySecureStopIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = getMany.toJsFn, hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = moveNext.toJsFn)
    __obj.asInstanceOf[PlayReadySecureStopIterator]
  }
  
  extension [Self <: PlayReadySecureStopIterator](x: Self) {
    
    inline def setCurrent(value: IPlayReadySecureStopServiceRequest): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGetMany(value: CallbackTo[ItemsIPlayReadySecureStopServiceRequest]): Self = StObject.set(x, "getMany", value.toJsFn)
    
    inline def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
    
    inline def setMoveNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "moveNext", value.toJsFn)
  }
}
