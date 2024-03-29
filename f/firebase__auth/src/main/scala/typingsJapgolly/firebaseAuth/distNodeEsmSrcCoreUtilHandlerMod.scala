package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPopupRedirectMod.AuthEventType
import typingsJapgolly.firebaseAuth.distNodeEsmSrcModelPublicTypesMod.AuthProvider
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilHandlerMod {
  
  @JSImport("@firebase/auth/dist/node-esm/src/core/util/handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRedirectUrl(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(auth: AuthInternal, provider: AuthProvider, authType: AuthEventType, redirectUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: String,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: String,
    eventId: Unit,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: String,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRedirectUrl(
    auth: AuthInternal,
    provider: AuthProvider,
    authType: AuthEventType,
    redirectUrl: Unit,
    eventId: Unit,
    additionalParams: Record[String, String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getRedirectUrl")(auth.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], authType.asInstanceOf[js.Any], redirectUrl.asInstanceOf[js.Any], eventId.asInstanceOf[js.Any], additionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
}
