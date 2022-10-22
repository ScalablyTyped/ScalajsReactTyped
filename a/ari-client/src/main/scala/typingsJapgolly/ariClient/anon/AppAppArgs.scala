package typingsJapgolly.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppAppArgs extends StObject {
  
  var app: String
  
  var appArgs: js.UndefOr[String] = js.undefined
}
object AppAppArgs {
  
  inline def apply(app: String): AppAppArgs = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppAppArgs]
  }
  
  extension [Self <: AppAppArgs](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppArgs(value: String): Self = StObject.set(x, "appArgs", value.asInstanceOf[js.Any])
    
    inline def setAppArgsUndefined: Self = StObject.set(x, "appArgs", js.undefined)
  }
}
