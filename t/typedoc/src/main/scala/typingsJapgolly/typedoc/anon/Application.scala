package typingsJapgolly.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  var application: typingsJapgolly.typedoc.mod.Application
}
object Application {
  
  inline def apply(application: typingsJapgolly.typedoc.mod.Application): Application = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  
  extension [Self <: Application](x: Self) {
    
    inline def setApplication(value: typingsJapgolly.typedoc.mod.Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
