package typingsJapgolly.swaggerExpressMiddleware.mod

import typingsJapgolly.express.mod.Application_
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRequestSignature extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(/**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application_
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Application_,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * An Express Application or Router.
    * If provided, this will be used to register path-param middleware via Router.Param
    */
  router: Router,
    /**
    * Options for each of the request-parsing middleware
    */
  options: ParseRequestOptions
  ): RequestHandler[ParamsDictionary] = js.native
}

