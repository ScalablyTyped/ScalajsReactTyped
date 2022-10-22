package typingsJapgolly.awsSdkClientSso

import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeInvali
import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeResour
import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeTooMan
import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeUnauth
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.AccountInfo
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.GetRoleCredentialsRequest
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.GetRoleCredentialsResponse
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountRolesRequest
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountRolesResponse
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountsRequest
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountsResponse
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.LogoutRequest
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.RoleCredentials
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.RoleInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AccountInfoFilterSensitiveLog(obj: AccountInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AccountInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetRoleCredentialsRequestFilterSensitiveLog(obj: GetRoleCredentialsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetRoleCredentialsResponseFilterSensitiveLog(obj: GetRoleCredentialsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.InvalidRequestException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  inline def ListAccountRolesRequestFilterSensitiveLog(obj: ListAccountRolesRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountRolesResponseFilterSensitiveLog(obj: ListAccountRolesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountsRequestFilterSensitiveLog(obj: ListAccountsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountsResponseFilterSensitiveLog(obj: ListAccountsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def LogoutRequestFilterSensitiveLog(obj: LogoutRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LogoutRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ResourceNotFoundException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  inline def RoleCredentialsFilterSensitiveLog(obj: RoleCredentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleCredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RoleInfoFilterSensitiveLog(obj: RoleInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "TooManyRequestsException")
  @js.native
  open class TooManyRequestsException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.TooManyRequestsException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
  }
  
  @JSImport("@aws-sdk/client-sso/dist-types/models", "UnauthorizedException")
  @js.native
  open class UnauthorizedException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.UnauthorizedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
  }
}
