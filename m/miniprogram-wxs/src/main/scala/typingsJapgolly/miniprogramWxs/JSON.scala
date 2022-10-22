package typingsJapgolly.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSON extends StObject {
  
  /**
    * Converts a JavaScript Object Notation (JSON) string into an object.
    * @param text A valid JSON string.
    * @param reviver A function that transforms the results. This function is called for each member of the object.
    * If a member contains nested objects, the nested objects are transformed before the parent object is.
    */
  def parse(text: java.lang.String): Any = js.native
  def parse(
    text: java.lang.String,
    reviver: js.ThisFunction2[/* this */ Any, /* key */ java.lang.String, /* value */ Any, Any]
  ): Any = js.native
  
  /**
    * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
    * @param value A JavaScript value, usually an object or array, to be converted.
    * @param replacer A function that transforms the results.
    * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
    */
  def stringify(value: Any): java.lang.String = js.native
  def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ java.lang.String, /* value */ Any, Any]
  ): java.lang.String = js.native
  def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ java.lang.String, /* value */ Any, Any],
    space: java.lang.String
  ): java.lang.String = js.native
  def stringify(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ java.lang.String, /* value */ Any, Any],
    space: Double
  ): java.lang.String = js.native
  def stringify(value: Any, replacer: Null, space: java.lang.String): java.lang.String = js.native
  def stringify(value: Any, replacer: Null, space: Double): java.lang.String = js.native
  def stringify(value: Any, replacer: Unit, space: java.lang.String): java.lang.String = js.native
  def stringify(value: Any, replacer: Unit, space: Double): java.lang.String = js.native
  def stringify(value: Any, replacer: Array[Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: Any, replacer: Array[Double | java.lang.String], space: java.lang.String): java.lang.String = js.native
  def stringify(value: Any, replacer: Array[Double | java.lang.String], space: Double): java.lang.String = js.native
}
