package typingsJapgolly.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.Codegen
import typingsJapgolly.protobufjs.mod.IType
import typingsJapgolly.protobufjs.mod.TypeDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Type")
@js.native
class Type protected ()
  extends typingsJapgolly.protobufjs.mod.Type {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[js.Any]) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Type")
@js.native
object Type extends js.Object {
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  def d[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](): TypeDecorator[T] = js.native
  def d[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](typeName: String): TypeDecorator[T] = js.native
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  def fromJSON(name: String, json: IType): typingsJapgolly.protobufjs.mod.Type = js.native
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  def generateConstructor(mtype: typingsJapgolly.protobufjs.mod.Type): Codegen = js.native
}

