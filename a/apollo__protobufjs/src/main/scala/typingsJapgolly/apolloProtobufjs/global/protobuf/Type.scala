package typingsJapgolly.apolloProtobufjs.global.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.Codegen
import typingsJapgolly.apolloProtobufjs.mod.IType
import typingsJapgolly.apolloProtobufjs.mod.TypeDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("protobuf.Type")
@js.native
open class Type protected ()
  extends typingsJapgolly.apolloProtobufjs.mod.Type {
  /**
    * Constructs a new reflected message type instance.
    * @param name Message name
    * @param [options] Declared options
    */
  def this(name: String) = this()
  def this(name: String, options: StringDictionary[Any]) = this()
}
/* static members */
object Type {
  
  @JSGlobal("protobuf.Type")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  inline def d[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](): TypeDecorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("d")().asInstanceOf[TypeDecorator[T]]
  inline def d[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](typeName: String): TypeDecorator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("d")(typeName.asInstanceOf[js.Any]).asInstanceOf[TypeDecorator[T]]
  
  /**
    * Creates a message type from a message type descriptor.
    * @param name Message name
    * @param json Message type descriptor
    * @returns Created message type
    */
  inline def fromJSON(name: String, json: IType): typingsJapgolly.apolloProtobufjs.mod.Type = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloProtobufjs.mod.Type]
  
  /**
    * Generates a constructor function for the specified type.
    * @param mtype Message type
    * @returns Codegen instance
    */
  inline def generateConstructor(mtype: typingsJapgolly.apolloProtobufjs.mod.Type): Codegen = ^.asInstanceOf[js.Dynamic].applyDynamic("generateConstructor")(mtype.asInstanceOf[js.Any]).asInstanceOf[Codegen]
}
