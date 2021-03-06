package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON extends js.Object {
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: typingsJapgolly.minappEnv.minappEnvStrings.JSON = js.native
  /**
    * Converts a JavaScript Object Notation (JSON) string into an object.
    * @param text A valid JSON string.
    * @param reviver A function that transforms the results. This function is called for each member of the object.
    * If a member contains nested objects, the nested objects are transformed before the parent object is.
    */
  def parse(text: java.lang.String): js.Any = js.native
  def parse(text: java.lang.String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  /**
    * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
    * @param value A JavaScript value, usually an object or array, to be converted.
    * @param replacer A function that transforms the results.
    * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
    */
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: java.lang.String
  ): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: Double
  ): java.lang.String = js.native
  def stringify(value: js.Any, replacer: Null, space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: Null, space: Double): java.lang.String = js.native
  def stringify(value: js.Any, replacer: Array[Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: js.Any, replacer: Array[Double | java.lang.String], space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: Array[Double | java.lang.String], space: Double): java.lang.String = js.native
}

/**
  * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
  */
@JSGlobal("JSON")
@js.native
object JSON extends TopLevel[JSON]

