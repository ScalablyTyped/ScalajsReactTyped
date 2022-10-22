package typingsJapgolly.azureMsalCommon.distUtilsConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SSOTypes extends StObject
@JSImport("@azure/msal-common/dist/utils/Constants", "SSOTypes")
@js.native
object SSOTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SSOTypes & String] = js.native
  
  @js.native
  sealed trait ACCOUNT
    extends StObject
       with SSOTypes
  /* "account" */ val ACCOUNT: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.ACCOUNT & String = js.native
  
  @js.native
  sealed trait ACCOUNT_ID
    extends StObject
       with SSOTypes
  /* "accountIdentifier" */ val ACCOUNT_ID: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.ACCOUNT_ID & String = js.native
  
  @js.native
  sealed trait CONSUMERS
    extends StObject
       with SSOTypes
  /* "consumers" */ val CONSUMERS: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.CONSUMERS & String = js.native
  
  @js.native
  sealed trait DOMAIN_HINT
    extends StObject
       with SSOTypes
  /* "domain_hint" */ val DOMAIN_HINT: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.DOMAIN_HINT & String = js.native
  
  @js.native
  sealed trait HOMEACCOUNT_ID
    extends StObject
       with SSOTypes
  /* "homeAccountIdentifier" */ val HOMEACCOUNT_ID: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.HOMEACCOUNT_ID & String = js.native
  
  @js.native
  sealed trait ID_TOKEN
    extends StObject
       with SSOTypes
  /* "id_token" */ val ID_TOKEN: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.ID_TOKEN & String = js.native
  
  @js.native
  sealed trait LOGIN_HINT
    extends StObject
       with SSOTypes
  /* "login_hint" */ val LOGIN_HINT: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.LOGIN_HINT & String = js.native
  
  @js.native
  sealed trait ORGANIZATIONS
    extends StObject
       with SSOTypes
  /* "organizations" */ val ORGANIZATIONS: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.ORGANIZATIONS & String = js.native
  
  @js.native
  sealed trait SID
    extends StObject
       with SSOTypes
  /* "sid" */ val SID: typingsJapgolly.azureMsalCommon.distUtilsConstantsMod.SSOTypes.SID & String = js.native
}
