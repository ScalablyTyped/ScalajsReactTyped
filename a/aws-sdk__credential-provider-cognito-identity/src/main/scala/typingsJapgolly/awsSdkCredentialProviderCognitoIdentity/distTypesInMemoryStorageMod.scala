package typingsJapgolly.awsSdkCredentialProviderCognitoIdentity

import typingsJapgolly.awsSdkCredentialProviderCognitoIdentity.distTypesStorageMod.Storage
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInMemoryStorageMod {
  
  @JSImport("@aws-sdk/credential-provider-cognito-identity/dist-types/InMemoryStorage", "InMemoryStorage")
  @js.native
  open class InMemoryStorage ()
    extends StObject
       with Storage {
    def this(store: Record[String, String]) = this()
    
    /* CompleteClass */
    override def getItem(key: String): String | Null | (js.Promise[String | Null]) = js.native
    
    /* CompleteClass */
    override def removeItem(key: String): Unit | js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setItem(key: String, data: String): Unit | js.Promise[Unit] = js.native
    
    /* private */ var store: Any = js.native
  }
}
