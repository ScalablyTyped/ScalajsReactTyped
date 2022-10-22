package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.googleGax.mod.fallback.protobufMinimal.Type
import typingsJapgolly.protobufjs.mod.Codegen
import typingsJapgolly.protobufjs.mod.IType
import typingsJapgolly.protobufjs.mod.Message
import typingsJapgolly.protobufjs.mod.TypeDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTypeInstantiable
  extends StObject
     with Instantiable1[/* name */ String, Type] {
  
  /**
    * Type decorator (TypeScript).
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Decorator function
    */
  def d[T /* <: Message[T] */](): TypeDecorator[T] = js.native
  def d[T /* <: Message[T] */](typeName: String): TypeDecorator[T] = js.native
  
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
