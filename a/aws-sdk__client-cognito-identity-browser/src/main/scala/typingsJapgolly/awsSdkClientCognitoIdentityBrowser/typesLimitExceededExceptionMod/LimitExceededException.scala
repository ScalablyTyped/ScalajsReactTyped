package typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesLimitExceededExceptionMod

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.createIdentityPoolExceptionsUnionMod.CreateIdentityPoolExceptionsUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.getIdExceptionsUnionMod.GetIdExceptionsUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.updateIdentityPoolExceptionsUnionMod.UpdateIdentityPoolExceptionsUnion
import typingsJapgolly.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitExceededException
  extends ServiceException[LimitExceededExceptionDetails]
     with CreateIdentityPoolExceptionsUnion
     with GetIdExceptionsUnion
     with UpdateIdentityPoolExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typingsJapgolly.awsSdkClientCognitoIdentityBrowser.awsSdkClientCognitoIdentityBrowserStrings.LimitExceededException = js.native
}

