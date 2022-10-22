package typingsJapgolly.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationOptions
  extends StObject
     with ObjectOptions {
  
  /**
    * Root entry point for the View tree of your Application.
    */
  var region: String
}
object ApplicationOptions {
  
  inline def apply(region: String): ApplicationOptions = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationOptions]
  }
  
  extension [Self <: ApplicationOptions](x: Self) {
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
