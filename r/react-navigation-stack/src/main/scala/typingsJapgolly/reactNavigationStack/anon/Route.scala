package typingsJapgolly.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var route: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]
}
object Route {
  
  inline def apply(route: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]): Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setRoute(value: typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.Route[String]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
