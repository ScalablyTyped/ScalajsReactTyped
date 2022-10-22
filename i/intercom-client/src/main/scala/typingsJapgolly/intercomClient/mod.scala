package typingsJapgolly.intercomClient

import typingsJapgolly.intercomClient.anon.AppApiKey
import typingsJapgolly.intercomClient.anon.Contact
import typingsJapgolly.intercomClient.anon.Email
import typingsJapgolly.intercomClient.anon.IdNumber
import typingsJapgolly.intercomClient.anon.Identifier
import typingsJapgolly.intercomClient.anon.PartialCompany
import typingsJapgolly.intercomClient.anon.PartialCreateMessage
import typingsJapgolly.intercomClient.anon.PartialCreateUpdateUser
import typingsJapgolly.intercomClient.anon.PartialEvent
import typingsJapgolly.intercomClient.anon.PartialLead
import typingsJapgolly.intercomClient.anon.PartialTag
import typingsJapgolly.intercomClient.anon.PartialVisitor
import typingsJapgolly.intercomClient.anon.Segmentid
import typingsJapgolly.intercomClient.anon.Token
import typingsJapgolly.intercomClient.anon.Type
import typingsJapgolly.intercomClient.companyMod.Company
import typingsJapgolly.intercomClient.companyMod.CompanyIdentifier
import typingsJapgolly.intercomClient.eventMod.ListParam
import typingsJapgolly.intercomClient.intercomErrorMod.IntercomError
import typingsJapgolly.intercomClient.leadMod.Lead
import typingsJapgolly.intercomClient.leadMod.LeadIdIdentifier
import typingsJapgolly.intercomClient.leadMod.LeadIdentifier
import typingsJapgolly.intercomClient.messageMod.Message
import typingsJapgolly.intercomClient.scrollMod.Scroll
import typingsJapgolly.intercomClient.tagMod.Tag
import typingsJapgolly.intercomClient.tagMod.TagIdentifier
import typingsJapgolly.intercomClient.tagMod.TagOper
import typingsJapgolly.intercomClient.userMod.User
import typingsJapgolly.intercomClient.userMod.UserEmailIdentifier
import typingsJapgolly.intercomClient.userMod.UserIdIdentifier
import typingsJapgolly.intercomClient.userMod.UserIdentifier
import typingsJapgolly.intercomClient.visitorMod.Visitor
import typingsJapgolly.intercomClient.visitorMod.VisitorIdentifier
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intercom-client", "ApiResponse")
  @js.native
  open class ApiResponse[T] protected () extends IncomingMessage {
    def this(socket: Socket) = this()
    
    var body: T = js.native
  }
  
  @JSImport("intercom-client", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(auth: AppApiKey) = this()
    def this(auth: Token) = this()
    def this(username: String, password: String) = this()
    
    var companies: Companies = js.native
    
    var contacts: Leads = js.native
    
    var events: Events = js.native
    
    var leads: Leads = js.native
    
    var messages: Messages = js.native
    
    var tags: Tags = js.native
    
    def usePromises(): this.type = js.native
    
    /**
      * client library also supports passing in `request` options
      * Note that certain request options (such as `json`, and certain `headers` names cannot be overridden).
      */
    def useRequestOpts(): this.type = js.native
    def useRequestOpts(options: CoreOptions): this.type = js.native
    
    var users: Users = js.native
    
    var visitors: Visitors = js.native
  }
  
  @JSImport("intercom-client", "Companies")
  @js.native
  open class Companies () extends StObject {
    
    def archive(): js.Promise[Company] = js.native
    
    def create(company: CompanyIdentifier & PartialCompany): js.Promise[ApiResponse[Company]] = js.native
    def create(company: CompanyIdentifier & PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
    
    def find(identifier: CompanyIdentifier): js.Promise[ApiResponse[Company]] = js.native
    def find(identifier: CompanyIdentifier, cb: callback[ApiResponse[Company]]): Unit = js.native
    
    def list(): js.Promise[ApiResponse[typingsJapgolly.intercomClient.companyMod.List]] = js.native
    def list(cb: callback[ApiResponse[typingsJapgolly.intercomClient.companyMod.List]]): Unit = js.native
    
    def listBy(params: Segmentid): js.Promise[ApiResponse[typingsJapgolly.intercomClient.companyMod.List]] = js.native
    def listBy(params: Segmentid, cb: callback[ApiResponse[typingsJapgolly.intercomClient.companyMod.List]]): Unit = js.native
    
    var scroll: Scroll[Company] = js.native
    
    def update(company: CompanyIdentifier & PartialCompany): js.Promise[ApiResponse[Company]] = js.native
    def update(company: CompanyIdentifier & PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Events")
  @js.native
  open class Events () extends StObject {
    
    def bulk(operations: js.Array[BulkOperation]): js.Promise[ApiResponse[Any]] = js.native
    def bulk(operations: js.Array[BulkOperation], cb: callback[ApiResponse[Any]]): Unit = js.native
    
    def create(event: PartialEvent): js.Promise[IncomingMessage] = js.native
    def create(event: PartialEvent, cb: callback[IncomingMessage]): Unit = js.native
    
    def listBy(params: ListParam): js.Promise[ApiResponse[typingsJapgolly.intercomClient.companyMod.List]] = js.native
    def listBy(params: ListParam, cb: callback[ApiResponse[typingsJapgolly.intercomClient.companyMod.List]]): Unit = js.native
  }
  
  object IdentityVerification {
    
    @JSImport("intercom-client", "IdentityVerification")
    @js.native
    val ^ : js.Any = js.native
    
    inline def userHash(opts: IdentityVerificationOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("userHash")(opts.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("intercom-client", "Leads")
  @js.native
  open class Leads () extends StObject {
    
    def convert(params: Contact): js.Promise[ApiResponse[Lead]] = js.native
    def convert(params: Contact, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def create(lead: PartialLead): js.Promise[ApiResponse[Lead]] = js.native
    def create(lead: PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def delete(identifier: LeadIdIdentifier): js.Promise[ApiResponse[Lead]] = js.native
    def delete(identifier: LeadIdIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
    def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def list(): js.Promise[ApiResponse[typingsJapgolly.intercomClient.leadMod.List]] = js.native
    def list(cb: callback[ApiResponse[typingsJapgolly.intercomClient.leadMod.List]]): Unit = js.native
    
    def listBy(params: Email): js.Promise[ApiResponse[typingsJapgolly.intercomClient.leadMod.List]] = js.native
    def listBy(params: Email, cb: callback[ApiResponse[typingsJapgolly.intercomClient.leadMod.List]]): Unit = js.native
    
    def update(lead: UserIdentifier & PartialLead): js.Promise[ApiResponse[Lead]] = js.native
    def update(lead: UserIdentifier & PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Messages")
  @js.native
  open class Messages () extends StObject {
    
    def create(message: PartialCreateMessage): js.Promise[ApiResponse[Message]] = js.native
    def create(message: PartialCreateMessage, cb: callback[ApiResponse[Message]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Tags")
  @js.native
  open class Tags () extends StObject {
    
    def create(tag: PartialTag): js.Promise[ApiResponse[Tag]] = js.native
    def create(tag: PartialTag, cb: callback[ApiResponse[Tag]]): Unit = js.native
    
    def delete(tag: TagIdentifier): js.Promise[IncomingMessage] = js.native
    def delete(tag: TagIdentifier, cb: callback[IncomingMessage]): Unit = js.native
    
    def list(): js.Promise[ApiResponse[typingsJapgolly.intercomClient.tagMod.List]] = js.native
    def list(cb: callback[ApiResponse[typingsJapgolly.intercomClient.tagMod.List]]): Unit = js.native
    
    def tag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
    def tag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
    
    def untag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
    def untag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Users")
  @js.native
  open class Users () extends StObject {
    
    def archive(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
    def archive(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
    
    def bulk(operations: js.Array[BulkOperation]): js.Promise[ApiResponse[Any]] = js.native
    def bulk(operations: js.Array[BulkOperation], cb: callback[ApiResponse[Any]]): Unit = js.native
    
    def create(user: PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
    def create(user: PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
    
    def find(identifier: UserEmailIdentifier): js.Promise[ApiResponse[typingsJapgolly.intercomClient.userMod.List]] = js.native
    def find(
      identifier: UserEmailIdentifier,
      cb: callback[ApiResponse[typingsJapgolly.intercomClient.userMod.List]]
    ): Unit = js.native
    def find(identifier: UserIdIdentifier): js.Promise[ApiResponse[User]] = js.native
    def find(identifier: UserIdIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
    def find(identifier: UserIdentifier): js.Promise[ApiResponse[User | typingsJapgolly.intercomClient.userMod.List]] = js.native
    def find(
      identifier: UserIdentifier,
      cb: callback[ApiResponse[User | typingsJapgolly.intercomClient.userMod.List]]
    ): Unit = js.native
    
    def list(): js.Promise[ApiResponse[typingsJapgolly.intercomClient.userMod.List]] = js.native
    def list(cb: callback[ApiResponse[typingsJapgolly.intercomClient.userMod.List]]): Unit = js.native
    
    def listBy(params: Segmentid): js.Promise[ApiResponse[typingsJapgolly.intercomClient.userMod.List]] = js.native
    def listBy(params: Segmentid, cb: callback[ApiResponse[typingsJapgolly.intercomClient.userMod.List]]): Unit = js.native
    
    def requestPermanentDeletion(id: String): js.Promise[IdNumber] = js.native
    def requestPermanentDeletion(id: String, cb: callback[IdNumber]): Unit = js.native
    
    def requestPermanentDeletionByParams(identifier: UserIdentifier): js.Promise[IdNumber] = js.native
    def requestPermanentDeletionByParams(identifier: UserIdentifier, cb: callback[IdNumber]): Unit = js.native
    
    var scroll: Scroll[User] = js.native
    
    def update(user: UserIdentifier & PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
    def update(user: UserIdentifier & PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Visitors")
  @js.native
  open class Visitors () extends StObject {
    
    def convert(params: Identifier): js.Promise[ApiResponse[Lead]] = js.native
    def convert(params: Identifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
    def convert(params: Type): js.Promise[ApiResponse[User]] = js.native
    def convert(params: Type, cb: callback[ApiResponse[User]]): Unit = js.native
    
    def delete(id: String): js.Promise[ApiResponse[Visitor]] = js.native
    def delete(id: String, cb: callback[ApiResponse[Visitor]]): Unit = js.native
    
    def find(identifier: VisitorIdentifier): js.Promise[ApiResponse[Visitor]] = js.native
    def find(identifier: VisitorIdentifier, cb: callback[ApiResponse[Visitor]]): Unit = js.native
    
    def update(visitor: VisitorIdentifier & PartialVisitor): js.Promise[ApiResponse[Visitor]] = js.native
    def update(visitor: VisitorIdentifier & PartialVisitor, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  }
  
  trait BulkOperation extends StObject {
    
    var create: js.UndefOr[Any] = js.undefined
    
    var delete: js.UndefOr[Any] = js.undefined
  }
  object BulkOperation {
    
    inline def apply(): BulkOperation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BulkOperation]
    }
    
    extension [Self <: BulkOperation](x: Self) {
      
      inline def setCreate(value: Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDelete(value: Any): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    }
  }
  
  trait IdentityVerificationOptions extends StObject {
    
    var identifier: String
    
    var secretKey: String
  }
  object IdentityVerificationOptions {
    
    inline def apply(identifier: String, secretKey: String): IdentityVerificationOptions = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityVerificationOptions]
    }
    
    extension [Self <: IdentityVerificationOptions](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  type callback[T] = (js.Function1[/* d */ T, Unit]) | (js.Function2[/* err */ IntercomError, /* d */ T, Unit])
}
