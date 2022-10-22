package typingsJapgolly.evernote.mod

import typingsJapgolly.evernote.anon.AccountEmailDomain
import typingsJapgolly.evernote.anon.AuthenticationToken
import typingsJapgolly.evernote.anon.MessageStoreUrl
import typingsJapgolly.evernote.anon.NoteStoreUrl
import typingsJapgolly.evernote.anon.Profiles
import typingsJapgolly.evernote.anon.Settings
import typingsJapgolly.evernote.mod.Types.ServiceLevel
import typingsJapgolly.evernote.mod.Types.Timestamp
import typingsJapgolly.evernote.mod.Types.User
import typingsJapgolly.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserStore {
  
  @JSImport("evernote", "UserStore.AuthenticationResult")
  @js.native
  open class AuthenticationResult () extends StObject {
    def this(args: AuthenticationToken) = this()
    
    var authenticationToken: js.UndefOr[String] = js.native
    
    var currentTime: js.UndefOr[Timestamp] = js.native
    
    var expiration: js.UndefOr[Timestamp] = js.native
    
    var noteStoreUrl: js.UndefOr[String] = js.native
    
    var publicUserInfo: js.UndefOr[PublicUserInfo] = js.native
    
    var secondFactorDeliveryHint: js.UndefOr[String] = js.native
    
    var secondFactorRequired: js.UndefOr[Boolean] = js.native
    
    var urls: js.UndefOr[UserUrls] = js.native
    
    var user: js.UndefOr[User] = js.native
    
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
  
  @JSImport("evernote", "UserStore.BootstrapInfo")
  @js.native
  open class BootstrapInfo () extends StObject {
    def this(args: Profiles) = this()
    
    var profiles: js.UndefOr[js.Array[BootstrapProfile]] = js.native
  }
  
  @JSImport("evernote", "UserStore.BootstrapProfile")
  @js.native
  open class BootstrapProfile () extends StObject {
    def this(args: Settings) = this()
    
    var name: js.UndefOr[String] = js.native
    
    var settings: js.UndefOr[BootstrapSettings] = js.native
  }
  
  @JSImport("evernote", "UserStore.BootstrapSettings")
  @js.native
  open class BootstrapSettings () extends StObject {
    def this(args: AccountEmailDomain) = this()
    
    var accountEmailDomain: js.UndefOr[String] = js.native
    
    var enableFacebookSharing: js.UndefOr[Boolean] = js.native
    
    var enableGiftSubscriptions: js.UndefOr[Boolean] = js.native
    
    var enableGoogle: js.UndefOr[Boolean] = js.native
    
    var enableLinkedInSharing: js.UndefOr[Boolean] = js.native
    
    var enablePublicNotebooks: js.UndefOr[Boolean] = js.native
    
    var enableSharedNotebooks: js.UndefOr[Boolean] = js.native
    
    var enableSingleNoteSharing: js.UndefOr[Boolean] = js.native
    
    var enableSponsoredAccounts: js.UndefOr[Boolean] = js.native
    
    var enableSupportTickets: js.UndefOr[Boolean] = js.native
    
    var enableTwitterSharing: js.UndefOr[Boolean] = js.native
    
    var marketingUrl: js.UndefOr[String] = js.native
    
    var serviceHost: js.UndefOr[String] = js.native
    
    var supportUrl: js.UndefOr[String] = js.native
  }
  
  @JSImport("evernote", "UserStore.EDAM_VERSION_MAJOR")
  @js.native
  val EDAM_VERSION_MAJOR: Double = js.native
  
  @JSImport("evernote", "UserStore.EDAM_VERSION_MINOR")
  @js.native
  val EDAM_VERSION_MINOR: Double = js.native
  
  @JSImport("evernote", "UserStore.PublicUserInfo")
  @js.native
  open class PublicUserInfo () extends StObject {
    def this(args: NoteStoreUrl) = this()
    
    var noteStoreUrl: js.UndefOr[String] = js.native
    
    var serviceLevel: js.UndefOr[ServiceLevel] = js.native
    
    var userId: js.UndefOr[UserID] = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
  
  @JSImport("evernote", "UserStore.UserUrls")
  @js.native
  open class UserUrls () extends StObject {
    def this(args: MessageStoreUrl) = this()
    
    var messageStoreUrl: js.UndefOr[String] = js.native
    
    var noteStoreUrl: js.UndefOr[String] = js.native
    
    var userStoreUrl: js.UndefOr[String] = js.native
    
    var userWebSocketUrl: js.UndefOr[String] = js.native
    
    var utilityUrl: js.UndefOr[String] = js.native
    
    var webApiUrlPrefix: js.UndefOr[String] = js.native
  }
}
