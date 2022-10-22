package typingsJapgolly.lockfileLintApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Packages extends StObject {
    
    var packages: typingsJapgolly.lockfileLintApi.mod.Packages
  }
  object Packages {
    
    inline def apply(packages: typingsJapgolly.lockfileLintApi.mod.Packages): Packages = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packages]
    }
    
    extension [Self <: Packages](x: Self) {
      
      inline def setPackages(value: typingsJapgolly.lockfileLintApi.mod.Packages): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    }
  }
}
