package typingsJapgolly.loopback.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context
  * @interface
  * @property {Principal[]} principals An Array of principals
  * @property {() => void} model The model class
  * @property {string} modelName The model name
  * @property {string} modelId The model id
  * @property {string} property The model property/method/relation name
  * @property {string} method The model method to be invoked
  * @property {string} accessType The access type
  * @property {AccessToken} accessToken The access toke
  * @returns {AccessContext}
  */
trait Context extends StObject {
  
  /** The access type */
  var accesType: String
  
  /** The access token */
  var accessToken: AccessToken
  
  /** The model method to be invoked */
  var method: String
  
  /** The model class */
  def model(): Unit
  
  /** The model id */
  var modelId: String
  
  /** The model name */
  var modelName: String
  
  /** An Array of principals */
  var principals: js.Array[Principal]
  
  /** The model property/method/relation name */
  var property: String
}
object Context {
  
  inline def apply(
    accesType: String,
    accessToken: AccessToken,
    method: String,
    model: Callback,
    modelId: String,
    modelName: String,
    principals: js.Array[Principal],
    property: String
  ): Context = {
    val __obj = js.Dynamic.literal(accesType = accesType.asInstanceOf[js.Any], accessToken = accessToken.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], model = model.toJsFn, modelId = modelId.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setAccesType(value: String): Self = StObject.set(x, "accesType", value.asInstanceOf[js.Any])
    
    inline def setAccessToken(value: AccessToken): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Callback): Self = StObject.set(x, "model", value.toJsFn)
    
    inline def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setPrincipals(value: js.Array[Principal]): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "principals", js.Array(value*))
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
