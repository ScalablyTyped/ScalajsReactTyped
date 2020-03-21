package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.modelsMod.TupleType
import typingsJapgolly.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/tuple", JSImport.Namespace)
@js.native
object serializersTypesTupleMod extends js.Object {
  @js.native
  class TupleTypeSerializer () extends TypeSerializerComponent[TupleType]
  
}

