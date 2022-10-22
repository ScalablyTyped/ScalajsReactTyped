package typingsJapgolly.documentdbServer

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContext extends StObject {
  
  /** Gets the collection object. */
  def getCollection(): ICollection
  
  /** Gets the request object. */
  def getRequest(): IRequest
  
  /**
    * Gets the response object.
    * Note: this is not available in pre-triggers.
    */
  def getResponse(): IResponse
}
object IContext {
  
  inline def apply(
    getCollection: CallbackTo[ICollection],
    getRequest: CallbackTo[IRequest],
    getResponse: CallbackTo[IResponse]
  ): IContext = {
    val __obj = js.Dynamic.literal(getCollection = getCollection.toJsFn, getRequest = getRequest.toJsFn, getResponse = getResponse.toJsFn)
    __obj.asInstanceOf[IContext]
  }
  
  extension [Self <: IContext](x: Self) {
    
    inline def setGetCollection(value: CallbackTo[ICollection]): Self = StObject.set(x, "getCollection", value.toJsFn)
    
    inline def setGetRequest(value: CallbackTo[IRequest]): Self = StObject.set(x, "getRequest", value.toJsFn)
    
    inline def setGetResponse(value: CallbackTo[IResponse]): Self = StObject.set(x, "getResponse", value.toJsFn)
  }
}
