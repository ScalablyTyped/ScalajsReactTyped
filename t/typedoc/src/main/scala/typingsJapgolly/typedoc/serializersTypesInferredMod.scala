package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.modelsMod.InferredType
import typingsJapgolly.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/inferred", JSImport.Namespace)
@js.native
object serializersTypesInferredMod extends js.Object {
  @js.native
  class InferredTypeSerializer () extends TypeSerializerComponent[InferredType]
  
}

