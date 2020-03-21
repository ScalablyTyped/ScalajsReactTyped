package typingsJapgolly.angularCommon.httpMod

import typingsJapgolly.angularCommon.AnonHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http", "HttpResponseBase")
@js.native
abstract class HttpResponseBase protected ()
  extends typingsJapgolly.angularCommon.httpHttpMod.HttpResponseBase {
  /**
    * Super-constructor for all responses.
    *
    * The single parameter accepted is an initialization hash. Any properties
    * of the response passed there will override the default values.
    */
  def this(init: AnonHeaders) = this()
  def this(init: AnonHeaders, defaultStatus: Double) = this()
  def this(init: AnonHeaders, defaultStatus: Double, defaultStatusText: String) = this()
}

