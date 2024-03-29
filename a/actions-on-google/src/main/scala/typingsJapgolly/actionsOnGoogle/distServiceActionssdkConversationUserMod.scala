package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2PackageEntitlement
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2User
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UserPermissions
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UserProfile
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UserUserVerificationStatus
import typingsJapgolly.googleAuthLibrary.buildSrcAuthLoginticketMod.TokenPayload
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationUserMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/user", "Access")
  @js.native
  open class Access protected () extends StObject {
    /** @hidden */
    def this(user: GoogleActionsV2User) = this()
    
    /**
      * Unique Oauth2 token. Only available with account linking.
      * @public
      */
    var token: js.UndefOr[String] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/user", "Last")
  @js.native
  open class Last protected () extends StObject {
    /** @hidden */
    def this(user: GoogleActionsV2User) = this()
    
    /**
      * Timestamp for the last access from the user.
      * Undefined if never seen.
      * @public
      */
    var seen: js.UndefOr[js.Date] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/user", "Name")
  @js.native
  open class Name protected () extends StObject {
    /** @hidden */
    def this(profile: GoogleActionsV2UserProfile) = this()
    
    /**
      * User's display name.
      * @public
      */
    var display: js.UndefOr[String] = js.native
    
    /**
      * User's family name.
      * @public
      */
    var family: js.UndefOr[String] = js.native
    
    /**
      * User's given name.
      * @public
      */
    var `given`: js.UndefOr[String] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/user", "Profile")
  @js.native
  open class Profile protected () extends StObject {
    /** @hidden */
    def this(user: GoogleActionsV2User) = this()
    
    /** @hidden */
    def _verify(client: OAuth2Client, id: String): js.Promise[TokenPayload] = js.native
    
    /**
      * Gets the Profile Payload object encoded in {@link Profile#token|conv.user.profile.token}.
      * Only retrievable with "Google Sign In" linking type set up for account linking in the console.
      *
      * To access just the email in the payload, you can also use {@link User#email|conv.user.email}.
      *
      * @example
      * ```javascript
      *
      * // Dialogflow
      * const app = dialogflow({
      *   clientId: CLIENT_ID,
      * })
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.ask(new SignIn('To get your account details'))
      * })
      *
      * // Create a Dialogflow intent with the `actions_intent_SIGN_IN` event
      * app.intent('Get Signin', (conv, params, signin) => {
      *   if (signin.status === 'OK') {
      *     const payload = conv.user.profile.payload
      *     conv.ask(`I got your account details. What do you want to do next?`)
      *   } else {
      *     conv.ask(`I won't be able to save your data, but what do you want to do next?`)
      *   }
      * })
      *
      * // Actions SDK
      * const app = actionssdk({
      *   clientId: CLIENT_ID,
      * })
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   conv.ask(new SignIn('To get your account details'))
      * })
      *
      * app.intent('actions.intent.SIGN_IN', (conv, input, signin) => {
      *   if (signin.status === 'OK') {
      *     const payload = conv.user.profile.payload
      *     conv.ask(`I got your account details. What do you want to do next?`)
      *   } else {
      *     conv.ask(`I won't be able to save your data, but what do you want to do next?`)
      *   }
      * })
      * ```
      *
      * @public
      */
    var payload: js.UndefOr[TokenPayload] = js.native
    
    /**
      * The `user.idToken` retrieved from account linking.
      * Only retrievable with "Google Sign In" linking type set up for account linking in the console.
      * @public
      */
    var token: js.UndefOr[String] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/user", "User")
  @js.native
  /** @hidden */
  open class User[TUserStorage] () extends StObject {
    def this(raw: GoogleActionsV2User) = this()
    def this(raw: Unit, initial: TUserStorage) = this()
    def this(raw: GoogleActionsV2User, initial: TUserStorage) = this()
    
    /** @hidden */
    var _id: String = js.native
    
    /** @hidden */
    def _serialize(): String = js.native
    
    /** @hidden */
    def _verifyProfile(client: OAuth2Client, id: String): js.Promise[TokenPayload] = js.native
    
    /** @public */
    var access: Access = js.native
    
    /**
      * Gets the user profile email.
      * Only retrievable with "Google Sign In" linking type set up for account linking in the console.
      *
      * See {@link Profile#payload|conv.user.profile.payload} for all the payload properties.
      *
      * @example
      * ```javascript
      *
      * // Dialogflow
      * const app = dialogflow({
      *   clientId: CLIENT_ID,
      * })
      *
      * app.intent('Default Welcome Intent', conv => {
      *   conv.ask(new SignIn('To get your account details'))
      * })
      *
      * // Create a Dialogflow intent with the `actions_intent_SIGN_IN` event
      * app.intent('Get Signin', (conv, params, signin) => {
      *   if (signin.status === 'OK') {
      *     const email = conv.user.email
      *     conv.ask(`I got your email as ${email}. What do you want to do next?`)
      *   } else {
      *     conv.ask(`I won't be able to save your data, but what do you want to next?`)
      *   }
      * })
      *
      * // Actions SDK
      * const app = actionssdk({
      *   clientId: CLIENT_ID,
      * })
      *
      * app.intent('actions.intent.MAIN', conv => {
      *   conv.ask(new SignIn('To get your account details'))
      * })
      *
      * app.intent('actions.intent.SIGN_IN', (conv, input, signin) => {
      *   if (signin.status === 'OK') {
      *     const email = conv.user.email
      *     conv.ask(`I got your email as ${email}. What do you want to do next?`)
      *   } else {
      *     conv.ask(`I won't be able to save your data, but what do you want to next?`)
      *   }
      * })
      * ```
      *
      * @public
      */
    var email: js.UndefOr[String] = js.native
    
    /**
      * The list of all digital goods that your user purchased from
      * your published Android apps. To enable this feature, see the instructions
      * in the {@link https://developers.google.com/actions/identity/digital-goods|documentation}.
      * @public
      */
    var entitlements: js.Array[GoogleActionsV2PackageEntitlement] = js.native
    
    /** @public */
    var last: Last = js.native
    
    /**
      * The user locale. String represents the regional language
      * information of the user set in their Assistant settings.
      * For example, 'en-US' represents US English.
      * @public
      */
    var locale: String = js.native
    
    /**
      * User's permissioned name info.
      * Properties will be undefined if not request with {@link Permission|conv.ask(new Permission)}
      * @public
      */
    var name: Name = js.native
    
    /** @public */
    var permissions: js.Array[GoogleActionsV2UserPermissions] = js.native
    
    /** @public */
    var profile: Profile = js.native
    
    var raw: GoogleActionsV2User = js.native
    
    /**
      * The data persistent across sessions in JSON format.
      * It exists in the same context as `conv.user.id`
      *
      * @example
      * ```javascript
      *
      * // Actions SDK
      * app.intent('actions.intent.MAIN', conv => {
      *   conv.user.storage.someProperty = 'someValue'
      * })
      *
      * // Dialogflow
      * app.intent('Default Welcome Intent', conv => {
      *   conv.user.storage.someProperty = 'someValue'
      * })
      * ```
      *
      * @public
      */
    var storage: TUserStorage = js.native
    
    /**
      * Determine if the user is 'GUEST' or 'VERIFIED'
      * @public
      */
    var verification: js.UndefOr[GoogleActionsV2UserUserVerificationStatus] = js.native
  }
}
