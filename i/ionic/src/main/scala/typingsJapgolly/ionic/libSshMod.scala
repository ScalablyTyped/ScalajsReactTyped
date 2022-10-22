package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.IdNumber
import typingsJapgolly.ionic.anon.PartialPaginateArgsResponMax
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IPaginator
import typingsJapgolly.ionic.definitionsMod.PaginatorState
import typingsJapgolly.ionic.definitionsMod.ResourceClientCreate
import typingsJapgolly.ionic.definitionsMod.ResourceClientDelete
import typingsJapgolly.ionic.definitionsMod.ResourceClientLoad
import typingsJapgolly.ionic.definitionsMod.ResourceClientPaginate
import typingsJapgolly.ionic.definitionsMod.Response
import typingsJapgolly.ionic.definitionsMod.SSHKey
import typingsJapgolly.ionic.libHttpMod.ResourceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSshMod {
  
  @JSImport("ionic/lib/ssh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/ssh", "ERROR_SSH_INVALID_PRIVKEY")
  @js.native
  val ERROR_SSH_INVALID_PRIVKEY: /* "SSH_INVALID_PRIVKEY" */ String = js.native
  
  @JSImport("ionic/lib/ssh", "ERROR_SSH_INVALID_PUBKEY")
  @js.native
  val ERROR_SSH_INVALID_PUBKEY: /* "SSH_INVALID_PUBKEY" */ String = js.native
  
  @JSImport("ionic/lib/ssh", "ERROR_SSH_MISSING_PRIVKEY")
  @js.native
  val ERROR_SSH_MISSING_PRIVKEY: /* "SSH_MISSING_PRIVKEY" */ String = js.native
  
  @JSImport("ionic/lib/ssh", "SSHKeyClient")
  @js.native
  open class SSHKeyClient protected ()
    extends ResourceClient
       with ResourceClientLoad[SSHKey]
       with ResourceClientDelete
       with ResourceClientCreate[SSHKey, SSHKeyCreateDetails]
       with ResourceClientPaginate[SSHKey] {
    def this(hasClientTokenUser: SSHKeyClientDeps) = this()
    
    /* protected */ var client: IClient = js.native
    
    /* CompleteClass */
    override def create(details: SSHKeyCreateDetails): js.Promise[SSHKey] = js.native
    
    def load(id: String): js.Promise[SSHKey] = js.native
    
    def paginate(args: PartialPaginateArgsResponMax): IPaginator[Response[js.Array[SSHKey]], PaginatorState] = js.native
    
    /* protected */ var token: String = js.native
    
    /* protected */ var user: IdNumber = js.native
  }
  
  inline def getGeneratedPrivateKeyPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeneratedPrivateKeyPath")().asInstanceOf[js.Promise[String]]
  inline def getGeneratedPrivateKeyPath(userId: Double): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeneratedPrivateKeyPath")(userId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def parsePublicKey(pubkey: String): js.Tuple4[String, String, String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePublicKey")(pubkey.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[String, String, String, String]]
  
  inline def parsePublicKeyFile(pubkeyPath: String): js.Promise[js.Tuple4[String, String, String, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePublicKeyFile")(pubkeyPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple4[String, String, String, String]]]
  
  inline def validatePrivateKey(keyPath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePrivateKey")(keyPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait SSHKeyClientDeps extends StObject {
    
    val client: IClient
    
    val token: String
    
    val user: IdNumber
  }
  object SSHKeyClientDeps {
    
    inline def apply(client: IClient, token: String, user: IdNumber): SSHKeyClientDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSHKeyClientDeps]
    }
    
    extension [Self <: SSHKeyClientDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUser(value: IdNumber): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait SSHKeyCreateDetails extends StObject {
    
    var pubkey: String
  }
  object SSHKeyCreateDetails {
    
    inline def apply(pubkey: String): SSHKeyCreateDetails = {
      val __obj = js.Dynamic.literal(pubkey = pubkey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSHKeyCreateDetails]
    }
    
    extension [Self <: SSHKeyCreateDetails](x: Self) {
      
      inline def setPubkey(value: String): Self = StObject.set(x, "pubkey", value.asInstanceOf[js.Any])
    }
  }
}
