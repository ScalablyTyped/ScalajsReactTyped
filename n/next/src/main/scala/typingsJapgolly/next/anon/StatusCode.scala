package typingsJapgolly.next.anon

import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.next.nextInts.`301`
import typingsJapgolly.next.nextInts.`302`
import typingsJapgolly.next.nextInts.`303`
import typingsJapgolly.next.nextInts.`307`
import typingsJapgolly.next.nextInts.`308`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusCode
  extends StObject
     with typingsJapgolly.next.typesMod.Redirect {
  
  var basePath: js.UndefOr[`false`] = js.undefined
  
  var destination: String
  
  var statusCode: `301` | `302` | `303` | `307` | `308`
}
object StatusCode {
  
  inline def apply(destination: String, statusCode: `301` | `302` | `303` | `307` | `308`): StatusCode = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusCode]
  }
  
  extension [Self <: StatusCode](x: Self) {
    
    inline def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: `301` | `302` | `303` | `307` | `308`): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
