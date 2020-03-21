package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a document's interval.
  */
@JSGlobal("Interval")
@js.native
/**
  * Initiates a new Interval object instance with the specified settings.
  * @param start The interval's start position.
  * @param length The interval's length.
  */
class Interval () extends js.Object {
  def this(start: Double) = this()
  def this(start: Double, length: Double) = this()
  /**
    * Gets the interval's character length.
    */
  var length: Double = js.native
  /**
    * Gets the interval's start position in the document.
    */
  var start: Double = js.native
}

