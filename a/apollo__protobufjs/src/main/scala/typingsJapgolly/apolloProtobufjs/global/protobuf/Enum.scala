package typingsJapgolly.apolloProtobufjs.global.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("protobuf.Enum")
@js.native
open class Enum protected ()
  extends typingsJapgolly.apolloProtobufjs.mod.Enum {
  /**
    * Constructs a new enum instance.
    * @param name Unique name within its namespace
    * @param [values] Enum values as an object, by name
    * @param [options] Declared options
    * @param [comment] The comment for this enum
    * @param [comments] The value comments for this enum
    */
  def this(name: String) = this()
  def this(name: String, values: StringDictionary[Double]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[Any]) = this()
  def this(name: String, values: Unit, options: StringDictionary[Any]) = this()
  def this(name: String, values: StringDictionary[Double], options: StringDictionary[Any], comment: String) = this()
  def this(name: String, values: StringDictionary[Double], options: Unit, comment: String) = this()
  def this(name: String, values: Unit, options: StringDictionary[Any], comment: String) = this()
  def this(name: String, values: Unit, options: Unit, comment: String) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: StringDictionary[Any],
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: Unit,
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[Double],
    options: Unit,
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[Any],
    comment: String,
    comments: StringDictionary[String]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[Any],
    comment: Unit,
    comments: StringDictionary[String]
  ) = this()
  def this(name: String, values: Unit, options: Unit, comment: String, comments: StringDictionary[String]) = this()
  def this(name: String, values: Unit, options: Unit, comment: Unit, comments: StringDictionary[String]) = this()
}
/* static members */
object Enum {
  
  @JSGlobal("protobuf.Enum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IEnum): typingsJapgolly.apolloProtobufjs.mod.Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Enum]
}
