package typingsJapgolly.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAuthorizerRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  /**
    * Specifies the required credentials as an IAM role for API Gateway to invoke the authorizer. To specify an IAM role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To use resource-based permissions on the Lambda function, specify null. Supported only for REQUEST authorizers.
    */
  var AuthorizerCredentialsArn: js.UndefOr[Arn] = js.native
  /**
    * Authorizer caching is not currently supported. Don't specify this value for authorizers.
    */
  var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.native
  /**
    * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
    */
  var AuthorizerType: typingsJapgolly.awsSdk.apigatewayv2Mod.AuthorizerType = js.native
  /**
    * The authorizer's Uniform Resource Identifier (URI). For REQUEST authorizers, this must be a well-formed Lambda function URI, for example, arn:aws:apigateway:us-west-2:lambda:path/2015-03-31/functions/arn:aws:lambda:us-west-2:{account_id}:function:{lambda_function_name}/invocations. In general, the URI has this form: arn:aws:apigateway:{region}:lambda:path/{service_api}
    , where {region} is the same as the region hosting the Lambda function, path indicates that the remaining substring in the URI should be treated as the path to the resource, including the initial /. For Lambda functions, this is usually of the form /2015-03-31/functions/[FunctionARN]/invocations. Supported only for REQUEST authorizers.
    */
  var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  /**
    * The identity source for which authorization is requested. For a REQUEST authorizer, this is optional. The value is a set of one or more mapping expressions of the specified request parameters. Currently, the identity source can be headers, query string parameters, stage variables, and context parameters. For example, if an Auth header and a Name query string parameter are defined as identity sources, this value is route.request.header.Auth, route.request.querystring.Name. These parameters will be used to perform runtime validation for Lambda-based authorizers by verifying all of the identity-related request parameters are present in the request, not null, and non-empty. Only when this is true does the authorizer invoke the authorizer Lambda function. Otherwise, it returns a 401 Unauthorized response without calling the Lambda function. For JWT, a single entry that specifies where to extract the JSON Web Token (JWT )from inbound requests. Currently only header-based and query parameter-based selections are supported, for example "$request.header.Authorization".
    */
  var IdentitySource: IdentitySourceList = js.native
  /**
    * This parameter is not used.
    */
  var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  var JwtConfiguration: js.UndefOr[JWTConfiguration] = js.native
  /**
    * The name of the authorizer.
    */
  var Name: StringWithLengthBetween1And128 = js.native
}

object CreateAuthorizerRequest {
  @scala.inline
  def apply(
    ApiId: string,
    AuthorizerType: AuthorizerType,
    IdentitySource: IdentitySourceList,
    Name: StringWithLengthBetween1And128,
    AuthorizerCredentialsArn: Arn = null,
    AuthorizerResultTtlInSeconds: Int | Double = null,
    AuthorizerUri: UriWithLengthBetween1And2048 = null,
    IdentityValidationExpression: StringWithLengthBetween0And1024 = null,
    JwtConfiguration: JWTConfiguration = null
  ): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], AuthorizerType = AuthorizerType.asInstanceOf[js.Any], IdentitySource = IdentitySource.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (AuthorizerCredentialsArn != null) __obj.updateDynamic("AuthorizerCredentialsArn")(AuthorizerCredentialsArn.asInstanceOf[js.Any])
    if (AuthorizerResultTtlInSeconds != null) __obj.updateDynamic("AuthorizerResultTtlInSeconds")(AuthorizerResultTtlInSeconds.asInstanceOf[js.Any])
    if (AuthorizerUri != null) __obj.updateDynamic("AuthorizerUri")(AuthorizerUri.asInstanceOf[js.Any])
    if (IdentityValidationExpression != null) __obj.updateDynamic("IdentityValidationExpression")(IdentityValidationExpression.asInstanceOf[js.Any])
    if (JwtConfiguration != null) __obj.updateDynamic("JwtConfiguration")(JwtConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
}

