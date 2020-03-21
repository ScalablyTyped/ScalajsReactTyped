package typingsJapgolly.hyperlorisTyson

import typingsJapgolly.hyperlorisTyson.mod.Tyson
import typingsJapgolly.hyperlorisTyson.typeAdapterFactoryMod.TypeAdapterFactory
import typingsJapgolly.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typingsJapgolly.hyperlorisTyson.typeTokenMod.ClassType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/tysonBuilder", JSImport.Namespace)
@js.native
object tysonBuilderMod extends js.Object {
  @js.native
  class TysonBuilder () extends js.Object {
    var _factories: js.Any = js.native
    var _serializeNulls: js.Any = js.native
    val factories: js.Array[TypeAdapterFactory] = js.native
    val serializeNulls: Boolean = js.native
    /**
      * Returns a new instance of Tyson configured with the options currently set in this builder.
      *
      * @returns {Tyson} a Tyson instance
      * @memberof TysonBuilder
      */
    def build(): Tyson = js.native
    /**
      * Configure Tyson to serialize null fields. By default, Tyson omits all fields that are null
      * during serialization.
      *
      * @returns {TysonBuilder} a reference to this TysonBuilder
      * @memberof TysonBuilder
      */
    def enableNullsSerialization(): TysonBuilder = js.native
    /**
      * This method register a new type adapter for a specific type.
      * You can use this to configure Tyson for custom serialization or deserialization.
      * If a type adapter was previously registered for the specified type,
      * it is overwritten (even the built-in).
      *
      * @template T
      * @param {ClassType<T>} type the type for the type adapter being registered
      * @param {TypeAdapter<T>} typeAdapter
      * @returns {TysonBuilder} a reference to this TysonBuilder
      * @memberof TysonBuilder
      */
    def registerTypeAdapter[T](`type`: ClassType[T], typeAdapter: TypeAdapter[T]): TysonBuilder = js.native
    /**
      * Register a factory.
      *
      * @param {TypeAdapterFactory} factory
      * @returns {TysonBuilder} a reference to this TysonBuilder
      * @memberof TysonBuilder
      */
    def registerTypeAdapterFactory(factory: TypeAdapterFactory): TysonBuilder = js.native
  }
  
}

