package typingsJapgolly.arangodb

import typingsJapgolly.arangodb.ArangoDB.JwtAlgorithm
import typingsJapgolly.arangodb.Foxx.SessionStorage
import typingsJapgolly.arangodb.arangodbStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxSessionsStoragesJwtMod {
  
  inline def apply(options: String): SessionStorage = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SessionStorage]
  inline def apply(options: SafeJwtStorageOptions): SessionStorage = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SessionStorage]
  inline def apply(options: UnsafeJwtStorageOptions): SessionStorage = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[SessionStorage]
  
  @JSImport("@arangodb/foxx/sessions/storages/jwt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SafeJwtStorageOptions extends StObject {
    
    var algorithm: js.UndefOr[JwtAlgorithm] = js.undefined
    
    var maxExp: js.UndefOr[Double] = js.undefined
    
    var secret: String
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var verify: js.UndefOr[Boolean] = js.undefined
  }
  object SafeJwtStorageOptions {
    
    inline def apply(secret: String): SafeJwtStorageOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeJwtStorageOptions]
    }
    
    extension [Self <: SafeJwtStorageOptions](x: Self) {
      
      inline def setAlgorithm(value: JwtAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setMaxExp(value: Double): Self = StObject.set(x, "maxExp", value.asInstanceOf[js.Any])
      
      inline def setMaxExpUndefined: Self = StObject.set(x, "maxExp", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  trait UnsafeJwtStorageOptions extends StObject {
    
    var algorithm: none
    
    var maxExp: js.UndefOr[Double] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var verify: js.UndefOr[Boolean] = js.undefined
  }
  object UnsafeJwtStorageOptions {
    
    inline def apply(): UnsafeJwtStorageOptions = {
      val __obj = js.Dynamic.literal(algorithm = "none")
      __obj.asInstanceOf[UnsafeJwtStorageOptions]
    }
    
    extension [Self <: UnsafeJwtStorageOptions](x: Self) {
      
      inline def setAlgorithm(value: none): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setMaxExp(value: Double): Self = StObject.set(x, "maxExp", value.asInstanceOf[js.Any])
      
      inline def setMaxExpUndefined: Self = StObject.set(x, "maxExp", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
}
