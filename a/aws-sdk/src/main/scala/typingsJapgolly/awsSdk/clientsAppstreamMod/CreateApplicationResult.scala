package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResult extends StObject {
  
  var Application: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.Application] = js.undefined
}
object CreateApplicationResult {
  
  inline def apply(): CreateApplicationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResult]
  }
  
  extension [Self <: CreateApplicationResult](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
  }
}
