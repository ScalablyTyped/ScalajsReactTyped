package typingsJapgolly.matrixJsSdk.anon

import typingsJapgolly.matrixJsSdk.mod.SearchBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  // the batch token to pass in the query string
  var body: SearchBody
  
  var next_batch: js.UndefOr[String] = js.undefined
}
object Body {
  
  inline def apply(body: SearchBody): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: SearchBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setNext_batch(value: String): Self = StObject.set(x, "next_batch", value.asInstanceOf[js.Any])
    
    inline def setNext_batchUndefined: Self = StObject.set(x, "next_batch", js.undefined)
  }
}
