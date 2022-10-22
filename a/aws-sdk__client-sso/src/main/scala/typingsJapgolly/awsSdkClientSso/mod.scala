package typingsJapgolly.awsSdkClientSso

import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeInvali
import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeResour
import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeTooMan
import typingsJapgolly.awsSdkClientSso.anon.ExceptionOptionTypeUnauth
import typingsJapgolly.awsSdkClientSso.distTypesCommandsGetRoleCredentialsCommandMod.GetRoleCredentialsCommandInput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandInput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountRolesCommandMod.ListAccountRolesCommandOutput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandInput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsListAccountsCommandMod.ListAccountsCommandOutput
import typingsJapgolly.awsSdkClientSso.distTypesCommandsLogoutCommandMod.LogoutCommandInput
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
import typingsJapgolly.awsSdkClientSso.distTypesPaginationInterfacesMod.SSOPaginationConfiguration
import typingsJapgolly.awsSdkClientSso.distTypesSsoclientMod.SSOClientConfig
import typingsJapgolly.awsSdkSmithyClient.distTypesExceptionsMod.ServiceExceptionOptions
import typingsJapgolly.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/client-sso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AccountInfoFilterSensitiveLog(obj: AccountInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("AccountInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "GetRoleCredentialsCommand")
  @js.native
  open class GetRoleCredentialsCommand protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesCommandsMod.GetRoleCredentialsCommand {
    def this(input: GetRoleCredentialsCommandInput) = this()
  }
  
  inline def GetRoleCredentialsRequestFilterSensitiveLog(obj: GetRoleCredentialsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def GetRoleCredentialsResponseFilterSensitiveLog(obj: GetRoleCredentialsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetRoleCredentialsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "InvalidRequestException")
  @js.native
  open class InvalidRequestException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsMod.InvalidRequestException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeInvali) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "ListAccountRolesCommand")
  @js.native
  open class ListAccountRolesCommand protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesCommandsMod.ListAccountRolesCommand {
    def this(input: ListAccountRolesCommandInput) = this()
  }
  
  inline def ListAccountRolesRequestFilterSensitiveLog(obj: ListAccountRolesRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountRolesResponseFilterSensitiveLog(obj: ListAccountRolesResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountRolesResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "ListAccountsCommand")
  @js.native
  open class ListAccountsCommand protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesCommandsMod.ListAccountsCommand {
    def this(input: ListAccountsCommandInput) = this()
  }
  
  inline def ListAccountsRequestFilterSensitiveLog(obj: ListAccountsRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ListAccountsResponseFilterSensitiveLog(obj: ListAccountsResponse): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ListAccountsResponseFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "LogoutCommand")
  @js.native
  open class LogoutCommand protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesCommandsMod.LogoutCommand {
    def this(input: LogoutCommandInput) = this()
  }
  
  inline def LogoutRequestFilterSensitiveLog(obj: LogoutRequest): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("LogoutRequestFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "ResourceNotFoundException")
  @js.native
  open class ResourceNotFoundException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsMod.ResourceNotFoundException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeResour) = this()
  }
  
  inline def RoleCredentialsFilterSensitiveLog(obj: RoleCredentials): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleCredentialsFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def RoleInfoFilterSensitiveLog(obj: RoleInfo): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("RoleInfoFilterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@aws-sdk/client-sso", "SSO")
  @js.native
  open class SSO protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesSsoMod.SSO {
    def this(configuration: SSOClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "SSOClient")
  @js.native
  open class SSOClient protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesSsoclientMod.SSOClient {
    def this(configuration: SSOClientConfig) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "SSOServiceException")
  @js.native
  open class SSOServiceException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsSsoserviceexceptionMod.SSOServiceException {
    /**
      * @internal
      */
    def this(options: ServiceExceptionOptions) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "TooManyRequestsException")
  @js.native
  open class TooManyRequestsException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsMod.TooManyRequestsException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeTooMan) = this()
  }
  
  @JSImport("@aws-sdk/client-sso", "UnauthorizedException")
  @js.native
  open class UnauthorizedException protected ()
    extends typingsJapgolly.awsSdkClientSso.distTypesModelsMod.UnauthorizedException {
    /**
      * @internal
      */
    def this(opts: ExceptionOptionTypeUnauth) = this()
  }
  
  inline def paginateListAccountRoles(
    config: SSOPaginationConfiguration,
    input: ListAccountRolesCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountRolesCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccountRoles")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountRolesCommandOutput]]
  
  inline def paginateListAccounts(
    config: SSOPaginationConfiguration,
    input: ListAccountsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListAccountsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListAccounts")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListAccountsCommandOutput]]
}
