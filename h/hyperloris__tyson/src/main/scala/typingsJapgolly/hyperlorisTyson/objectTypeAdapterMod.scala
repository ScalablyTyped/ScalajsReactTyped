package typingsJapgolly.hyperlorisTyson

import typingsJapgolly.hyperlorisTyson.mod.Tyson
import typingsJapgolly.hyperlorisTyson.typeAdapterFactoryMod.TypeAdapterFactory
import typingsJapgolly.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typingsJapgolly.hyperlorisTyson.typeTokenMod.TypeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/adapters/objectTypeAdapter", JSImport.Namespace)
@js.native
object objectTypeAdapterMod extends js.Object {
  @js.native
  class ObjectTypeAdapter protected ()
    extends TypeAdapter[js.Any] {
    def this(tyson: Tyson, typeToken: TypeToken[_]) = this()
    var _jsonPropertyMetadataMap: js.Any = js.native
    var _typeToken: js.Any = js.native
    var _tyson: js.Any = js.native
    /**
      * This method extracts all the metadata of the class and saves them in a map.
      * In this way the reflection operations are performed only once when the adapter is created.
      */
    /* private */ def loadMetadata(): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ObjectTypeAdapter extends js.Object {
    val FACTORY: TypeAdapterFactory = js.native
  }
  
}

