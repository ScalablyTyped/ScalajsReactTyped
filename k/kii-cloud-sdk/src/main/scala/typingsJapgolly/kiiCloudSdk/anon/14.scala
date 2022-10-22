package typingsJapgolly.kiiCloudSdk.anon

import org.scalajs.dom.Blob
import typingsJapgolly.kiiCloudSdk.KiiCloud.KiiObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  def failure(obj: KiiObject, anErrorString: String): Any
  
  def success(obj: KiiObject, bodyBlob: Blob): Any
}
object `14` {
  
  inline def apply(failure: (KiiObject, String) => Any, success: (KiiObject, Blob) => Any): `14` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setFailure(value: (KiiObject, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: (KiiObject, Blob) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
