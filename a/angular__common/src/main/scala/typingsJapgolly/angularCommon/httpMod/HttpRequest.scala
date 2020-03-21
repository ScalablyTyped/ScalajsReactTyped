package typingsJapgolly.angularCommon.httpMod

import typingsJapgolly.angularCommon.AnonParams
import typingsJapgolly.angularCommon.angularCommonStrings.DELETE
import typingsJapgolly.angularCommon.angularCommonStrings.GET
import typingsJapgolly.angularCommon.angularCommonStrings.HEAD
import typingsJapgolly.angularCommon.angularCommonStrings.JSONP
import typingsJapgolly.angularCommon.angularCommonStrings.OPTIONS
import typingsJapgolly.angularCommon.angularCommonStrings.PATCH
import typingsJapgolly.angularCommon.angularCommonStrings.POST
import typingsJapgolly.angularCommon.angularCommonStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http", "HttpRequest")
@js.native
class HttpRequest[T] protected ()
  extends typingsJapgolly.angularCommon.httpHttpMod.HttpRequest[T] {
  def this(method: String, url: String) = this()
  def this(method: DELETE, url: String) = this()
  def this(method: GET, url: String) = this()
  def this(method: HEAD, url: String) = this()
  def this(method: JSONP, url: String) = this()
  def this(method: OPTIONS, url: String) = this()
  def this(method: PATCH, url: String) = this()
  def this(method: POST, url: String) = this()
  def this(method: PUT, url: String) = this()
  def this(method: String, url: String, body: T) = this()
  def this(method: DELETE, url: String, init: AnonParams) = this()
  def this(method: GET, url: String, init: AnonParams) = this()
  def this(method: HEAD, url: String, init: AnonParams) = this()
  def this(method: JSONP, url: String, init: AnonParams) = this()
  def this(method: OPTIONS, url: String, init: AnonParams) = this()
  def this(method: PATCH, url: String, body: T) = this()
  def this(method: POST, url: String, body: T) = this()
  def this(method: PUT, url: String, body: T) = this()
  def this(method: String, url: String, body: T, init: AnonParams) = this()
  def this(method: String, url: String, body: Null, init: AnonParams) = this()
  def this(method: PATCH, url: String, body: T, init: AnonParams) = this()
  def this(method: PATCH, url: String, body: Null, init: AnonParams) = this()
  def this(method: POST, url: String, body: T, init: AnonParams) = this()
  def this(method: POST, url: String, body: Null, init: AnonParams) = this()
  def this(method: PUT, url: String, body: T, init: AnonParams) = this()
  def this(method: PUT, url: String, body: Null, init: AnonParams) = this()
}

