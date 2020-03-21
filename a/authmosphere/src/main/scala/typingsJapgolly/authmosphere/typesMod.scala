package typingsJapgolly.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  object LogLevel extends js.Object {
    /* "debug" */ val debug: typingsJapgolly.authmosphere.loggerMod.LogLevel.debug with String = js.native
    /* "error" */ val error: typingsJapgolly.authmosphere.loggerMod.LogLevel.error with String = js.native
    /* "fatal" */ val fatal: typingsJapgolly.authmosphere.loggerMod.LogLevel.fatal with String = js.native
    /* "info" */ val info: typingsJapgolly.authmosphere.loggerMod.LogLevel.info with String = js.native
    /* "trace" */ val trace: typingsJapgolly.authmosphere.loggerMod.LogLevel.trace with String = js.native
    /* "warn" */ val warn: typingsJapgolly.authmosphere.loggerMod.LogLevel.warn with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.authmosphere.loggerMod.LogLevel with String] = js.native
  }
  
  @js.native
  object OAuthGrantType extends js.Object {
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.authmosphere.oauthgranttypeMod.OAuthGrantType with String] = js.native
  }
  
}

