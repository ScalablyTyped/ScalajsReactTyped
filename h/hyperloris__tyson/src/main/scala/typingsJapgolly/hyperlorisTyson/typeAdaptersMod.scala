package typingsJapgolly.hyperlorisTyson

import typingsJapgolly.hyperlorisTyson.typeAdapterFactoryMod.TypeAdapterFactory
import typingsJapgolly.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typingsJapgolly.hyperlorisTyson.typeTokenMod.ClassType
import typingsJapgolly.hyperlorisTyson.typeTokenMod.TypeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/adapters/typeAdapters", JSImport.Namespace)
@js.native
object typeAdaptersMod extends js.Object {
  @js.native
  class TypeAdapters () extends js.Object
  
  /* static members */
  @js.native
  object TypeAdapters extends js.Object {
    var BOOLEAN_FACTORY: TypeAdapterFactory = js.native
    var DATE_FACTORY: TypeAdapterFactory = js.native
    var NUMBER_FACTORY: TypeAdapterFactory = js.native
    var STRING_FACTORY: TypeAdapterFactory = js.native
    def newFactory[TT](`type`: ClassType[TT], typeAdapter: TypeAdapter[TT]): TypeAdapterFactory = js.native
    def newFactory[TT](`type`: TypeToken[TT], typeAdapter: TypeAdapter[TT]): TypeAdapterFactory = js.native
  }
  
}

