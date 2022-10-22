package typingsJapgolly.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFunctionCodeLocationMod {
  
  trait FunctionCodeLocation extends StObject {
    
    /**
      * <p>The presigned URL you can use to download the function's .zip file that you previously uploaded. The URL is valid for up to 10 minutes.</p>
      */
    var Location: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The repository from which you can download the function.</p>
      */
    var RepositoryType: js.UndefOr[String] = js.undefined
  }
  object FunctionCodeLocation {
    
    inline def apply(): FunctionCodeLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionCodeLocation]
    }
    
    extension [Self <: FunctionCodeLocation](x: Self) {
      
      inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
      
      inline def setRepositoryType(value: String): Self = StObject.set(x, "RepositoryType", value.asInstanceOf[js.Any])
      
      inline def setRepositoryTypeUndefined: Self = StObject.set(x, "RepositoryType", js.undefined)
    }
  }
  
  type UnmarshalledFunctionCodeLocation = FunctionCodeLocation
}
