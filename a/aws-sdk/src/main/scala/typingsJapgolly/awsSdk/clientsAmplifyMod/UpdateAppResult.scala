package typingsJapgolly.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppResult extends StObject {
  
  /**
    *  Represents the updated Amplify app. 
    */
  var app: App
}
object UpdateAppResult {
  
  inline def apply(app: App): UpdateAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppResult]
  }
  
  extension [Self <: UpdateAppResult](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
