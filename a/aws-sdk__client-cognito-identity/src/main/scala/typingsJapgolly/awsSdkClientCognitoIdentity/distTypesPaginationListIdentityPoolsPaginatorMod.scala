package typingsJapgolly.awsSdkClientCognitoIdentity

import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandInput
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCommandsListIdentityPoolsCommandMod.ListIdentityPoolsCommandOutput
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesPaginationInterfacesMod.CognitoIdentityPaginationConfiguration
import typingsJapgolly.awsSdkTypes.distTypesPaginationMod.Paginator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationListIdentityPoolsPaginatorMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/pagination/ListIdentityPoolsPaginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginateListIdentityPools(
    config: CognitoIdentityPaginationConfiguration,
    input: ListIdentityPoolsCommandInput,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additionalArguments because its type any is not an array type */ additionalArguments: Any
  ): Paginator[ListIdentityPoolsCommandOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("paginateListIdentityPools")(config.asInstanceOf[js.Any], input.asInstanceOf[js.Any], additionalArguments.asInstanceOf[js.Any])).asInstanceOf[Paginator[ListIdentityPoolsCommandOutput]]
}
