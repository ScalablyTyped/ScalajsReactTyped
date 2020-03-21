package typingsJapgolly.swaggerNodeRunner.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.swaggerNodeRunner.AnonSwagger
import typingsJapgolly.swaggerNodeRunner.AnonSwaggerMetadata
import typingsJapgolly.swaggerSchemaOfficial.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends EventEmitter {
  /**
    * Nested Key Value description for _backpipes_ module
    * @see {@link https://github.com/apigee-127/bagpipes#pipes|Github Source}
    */
  var bagpipes: StringDictionary[js.Any] = js.native
  var config: ConfigInternal = js.native
  /**
    * Current OpenAPI Specification (formaly known as Swagger RESTful API Documentation Specification)
    * @see {@link http://swagger.io/specification/|Swagger Specs}
    */
  var swagger: Spec = js.native
  var swaggerSecurityHandlers: js.UndefOr[SwaggerSecurityHandlers] = js.native
  /**
    * References to Swagger Tools Midleware (from _swagger-tools_ module)     *
    * @see {@link https://github.com/apigee-127/swagger-tools|Github Source}
    */
  var swaggerTools: AnonSwaggerMetadata = js.native
  /** Create new Connect middleware */
  def connectMiddleware(): ConnectMiddleware = js.native
  def defaultErrorHandler(): js.Any = js.native
  /** Create new Express middleware */
  def expressMiddleware(): ExpressMiddleware = js.native
  /** Fetch a _bagpipe_ pipe */
  def getPipe(req: AnonSwagger): js.Any = js.native
  /** Create new Hapi middleware */
  def hapiMiddleware(): HapiMiddleware = js.native
  /** Resolves path (relative to `config.appRoot`) */
  def resolveAppPath(to: js.Any*): String = js.native
  /** Create new Restify middleware */
  def restifyMiddleware(): RestifyMiddleware = js.native
  /** Create new Sails middleware */
  def sailsMiddleware(): SailsMiddleware = js.native
}

