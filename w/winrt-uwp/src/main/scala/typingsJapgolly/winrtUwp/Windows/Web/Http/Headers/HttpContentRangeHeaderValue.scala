package typingsJapgolly.winrtUwp.Windows.Web.Http.Headers

import typingsJapgolly.winrtUwp.AnonContentRangeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Range HTTP header on HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue")
@js.native
class HttpContentRangeHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a content length.
    * @param length The length, in bytes, of the full content entity body.
    */
  def this(length: Double) = this()
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a start and stop position.
    * @param from The position, in bytes, at which to start sending data.
    * @param to The position, in bytes, at which to stop sending data.
    */
  def this(from: Double, to: Double) = this()
  /**
    * Initializes a new instance of the HttpContentRangeHeaderValue class with a start and stop position and a content length.
    * @param from The position, in bytes, at which to start sending data.
    * @param to The position, in bytes, at which to stop sending data.
    * @param length The length, in bytes, of the full content entity body.
    */
  def this(from: Double, to: Double, length: Double) = this()
  /** Gets the position at which to start sending data in the Content-Range HTTP header. */
  var firstBytePosition: Double = js.native
  /** Gets the position at which to stop sending data in the Content-Range HTTP header. */
  var lastBytePosition: Double = js.native
  /** Gets the length of the full content entity body in the Content-Range HTTP header. */
  var length: Double = js.native
  /** Gets or sets the value of the range units used in the Content-Range HTTP header. */
  var unit: String = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpContentRangeHeaderValue")
@js.native
object HttpContentRangeHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpContentRangeHeaderValue instance.
    * @param input A string that represents the content range information in the Content-Range HTTP header.
    * @return An HttpContentRangeHeaderValue instance.
    */
  def parse(input: String): HttpContentRangeHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpContentRangeHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): AnonContentRangeHeaderValue = js.native
}

