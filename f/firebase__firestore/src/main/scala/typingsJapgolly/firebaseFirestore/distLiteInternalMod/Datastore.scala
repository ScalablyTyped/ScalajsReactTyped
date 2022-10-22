package typingsJapgolly.firebaseFirestore.distLiteInternalMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Datastore and its related methods are a wrapper around the external Google
  * Cloud Datastore grpc API, which provides an interface that is more convenient
  * for the rest of the client SDK architecture to consume.
  */
trait Datastore extends StObject {
  
  def terminate(): Unit
}
object Datastore {
  
  inline def apply(terminate: Callback): Datastore = {
    val __obj = js.Dynamic.literal(terminate = terminate.toJsFn)
    __obj.asInstanceOf[Datastore]
  }
  
  extension [Self <: Datastore](x: Self) {
    
    inline def setTerminate(value: Callback): Self = StObject.set(x, "terminate", value.toJsFn)
  }
}
