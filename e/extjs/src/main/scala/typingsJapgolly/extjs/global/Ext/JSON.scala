package typingsJapgolly.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.JSON")
@js.native
open class JSON ()
  extends StObject
     with typingsJapgolly.extjs.Ext.JSON
/* static members */
object JSON {
  
  @JSGlobal("Ext.JSON")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Decodes parses a JSON string to an object
    * @param json String The JSON string
    * @param safe Boolean True to return null, false to throw an exception if the JSON is invalid.
    * @returns Object The resulting object
    */
  inline def decode(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")().asInstanceOf[Any]
  inline def decode(json: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(json.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(json: java.lang.String, safe: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(json.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(json: Unit, safe: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(json.asInstanceOf[js.Any], safe.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /** [Method] Encodes an Object Array or other value
    * @param o Object The variable to encode
    * @returns String The JSON string
    */
  inline def encode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")().asInstanceOf[java.lang.String]
  inline def encode(o: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(o.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Encodes a Date
    * @param d Date The Date to encode
    * @returns String The string literal to use in a JSON string.
    */
  inline def encodeDate(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDate")().asInstanceOf[java.lang.String]
  inline def encodeDate(d: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDate")(d.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Encodes a String
    * @param s String The String to encode
    * @returns String The string literal to use in a JSON string.
    */
  inline def encodeString(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeString")().asInstanceOf[java.lang.String]
  inline def encodeString(s: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeString")(s.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] The function which encode uses to encode all javascript values to their JSON representations when Ext USE_NATIVE_JSON
    * @param o Object Any javascript value to be converted to its JSON representation
    * @returns String The JSON representation of the passed value.
    */
  inline def encodeValue(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeValue")().asInstanceOf[java.lang.String]
  inline def encodeValue(o: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeValue")(o.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
