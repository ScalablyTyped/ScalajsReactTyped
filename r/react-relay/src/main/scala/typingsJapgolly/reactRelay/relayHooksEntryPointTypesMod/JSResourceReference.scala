package typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSResourceReference[TModule] extends StObject {
  
  def getModuleId(): String
  
  def getModuleIfRequired(): TModule | Null
  
  def load(): js.Promise[TModule]
}
object JSResourceReference {
  
  inline def apply[TModule](
    getModuleId: CallbackTo[String],
    getModuleIfRequired: CallbackTo[TModule | Null],
    load: CallbackTo[js.Promise[TModule]]
  ): JSResourceReference[TModule] = {
    val __obj = js.Dynamic.literal(getModuleId = getModuleId.toJsFn, getModuleIfRequired = getModuleIfRequired.toJsFn, load = load.toJsFn)
    __obj.asInstanceOf[JSResourceReference[TModule]]
  }
  
  extension [Self <: JSResourceReference[?], TModule](x: Self & JSResourceReference[TModule]) {
    
    inline def setGetModuleId(value: CallbackTo[String]): Self = StObject.set(x, "getModuleId", value.toJsFn)
    
    inline def setGetModuleIfRequired(value: CallbackTo[TModule | Null]): Self = StObject.set(x, "getModuleIfRequired", value.toJsFn)
    
    inline def setLoad(value: CallbackTo[js.Promise[TModule]]): Self = StObject.set(x, "load", value.toJsFn)
  }
}
