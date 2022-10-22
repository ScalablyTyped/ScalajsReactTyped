package typingsJapgolly.passwordHash

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("password-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(password: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(password.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generate(password: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isHashed(password: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHashed")(password.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def verify(password: String, hashedPassword: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(password.asInstanceOf[js.Any], hashedPassword.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var saltLength: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
      
      inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    }
  }
}
