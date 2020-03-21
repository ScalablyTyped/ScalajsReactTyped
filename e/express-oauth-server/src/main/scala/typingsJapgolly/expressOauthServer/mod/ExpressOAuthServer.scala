package typingsJapgolly.expressOauthServer.mod

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.oauth2Server.mod.AuthenticateOptions
import typingsJapgolly.oauth2Server.mod.AuthorizationCode
import typingsJapgolly.oauth2Server.mod.AuthorizeOptions
import typingsJapgolly.oauth2Server.mod.Token
import typingsJapgolly.oauth2Server.mod.TokenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressOAuthServer extends js.Object {
  var server: typingsJapgolly.oauth2Server.mod.^ = js.native
  def authenticate(): js.Function3[
    /* request */ Request_[ParamsDictionary], 
    /* response */ Response_, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authenticate(options: AuthenticateOptions): js.Function3[
    /* request */ Request_[ParamsDictionary], 
    /* response */ Response_, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def authorize(): js.Function3[
    /* request */ Request_[ParamsDictionary], 
    /* response */ Response_, 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def authorize(options: AuthorizeOptions): js.Function3[
    /* request */ Request_[ParamsDictionary], 
    /* response */ Response_, 
    /* next */ NextFunction, 
    js.Promise[AuthorizationCode]
  ] = js.native
  def token(): js.Function3[
    /* request */ Request_[ParamsDictionary], 
    /* response */ Response_, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
  def token(options: TokenOptions): js.Function3[
    /* request */ Request_[ParamsDictionary], 
    /* response */ Response_, 
    /* next */ NextFunction, 
    js.Promise[Token]
  ] = js.native
}

