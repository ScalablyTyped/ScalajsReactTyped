package typingsJapgolly.swaggerExpressMiddleware.mod

import typingsJapgolly.express.mod.Application_
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesSignature extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(/**
    * Options for how the files are served
    */
  options: FilesOptions): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Application_,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router
  ): RequestHandler[ParamsDictionary] = js.native
  def apply(
    /**
    * If an Express Application or Router is passed, then its routing settings will be used.
    */
  router: Router,
    /**
    * Options for how the files are served
    */
  options: FilesOptions
  ): RequestHandler[ParamsDictionary] = js.native
}

