package typingsJapgolly.amazonCognitoAuthJs

import typingsJapgolly.amazonCognitoAuthJs.mod.CognitoAuthOptions
import typingsJapgolly.amazonCognitoAuthJs.mod.CognitoSessionData
import typingsJapgolly.amazonCognitoAuthJs.mod.CookieStorageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AmazonCognitoIdentity {
    
    @JSGlobal("AmazonCognitoIdentity.CognitoAccessToken")
    @js.native
    open class CognitoAccessToken protected ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.CognitoAccessToken {
      /**
        * Constructs a new CognitoAccessToken object
        * @param AccessToken The JWT access token.
        */
      def this(AccessToken: String) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoAuth")
    @js.native
    open class CognitoAuth protected ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.CognitoAuth {
      /**
        * Constructs a new CognitoAuth object
        * @param options Creation options
        */
      def this(options: CognitoAuthOptions) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoAuthSession")
    @js.native
    open class CognitoAuthSession protected ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.CognitoAuthSession {
      /**
        * Constructs a new CognitoUserSession object
        * @param sessionData The session's tokens, scopes, and state.
        */
      def this(sessionData: CognitoSessionData) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoIdToken")
    @js.native
    open class CognitoIdToken protected ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.CognitoIdToken {
      /**
        * Constructs a new CognitoIdToken object
        * @param IdToken The JWT Id token
        */
      def this(IdToken: String) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoRefreshToken")
    @js.native
    open class CognitoRefreshToken protected ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.CognitoRefreshToken {
      /**
        * Constructs a new CognitoRefreshToken object
        * @param RefreshToken The JWT refresh token.
        */
      def this(RefreshToken: String) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoTokenScopes")
    @js.native
    open class CognitoTokenScopes protected ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.CognitoTokenScopes {
      /**
        * Constructs a new CognitoTokenScopes object
        * @param TokenScopesArray The token scopes
        */
      def this(TokenScopesArray: js.Array[String]) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CookieStorage")
    @js.native
    open class CookieStorage protected ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.CookieStorage {
      /**
        * Constructs a new CookieStorage object
        * @param data Creation options.
        */
      def this(data: CookieStorageOptions) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.DateHelper")
    @js.native
    open class DateHelper ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.DateHelper
    
    @JSGlobal("AmazonCognitoIdentity.StorageHelper")
    @js.native
    /**
      * This is used to get a storage object
      * @returns the storage
      */
    open class StorageHelper ()
      extends typingsJapgolly.amazonCognitoAuthJs.mod.StorageHelper
  }
}
