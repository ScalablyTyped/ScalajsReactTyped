package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessage extends StObject {
  
  /**
    * Gets the component root element
    * @returns {Promise<any>}
    */
  def element(): js.Promise[Any]
  
  /**
    * Checks whether the component found with the given data hook
    * @returns {Promise<boolean>}
    */
  def exists(): js.Promise[Boolean]
  
  /**
    * Gets the message
    * @returns {Promise<string>}
    */
  def getMessage(): js.Promise[String]
  
  /**
    * Gets the role
    * @returns {Promise<string>}
    */
  def getRole(): js.Promise[String | Null]
}
object GetMessage {
  
  inline def apply(
    element: CallbackTo[js.Promise[Any]],
    exists: CallbackTo[js.Promise[Boolean]],
    getMessage: CallbackTo[js.Promise[String]],
    getRole: CallbackTo[js.Promise[String | Null]]
  ): GetMessage = {
    val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn, getMessage = getMessage.toJsFn, getRole = getRole.toJsFn)
    __obj.asInstanceOf[GetMessage]
  }
  
  extension [Self <: GetMessage](x: Self) {
    
    inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMessage", value.toJsFn)
    
    inline def setGetRole(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getRole", value.toJsFn)
  }
}
