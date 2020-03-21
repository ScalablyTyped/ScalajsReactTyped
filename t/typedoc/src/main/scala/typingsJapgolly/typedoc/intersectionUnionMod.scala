package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/intersection-union", JSImport.Namespace)
@js.native
object intersectionUnionMod extends js.Object {
  @js.native
  class IntersectionTypeSerializer () extends TypeSerializerComponent[IntersectionUnion]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedoc.modelsMod.IntersectionType
    - typingsJapgolly.typedoc.modelsMod.UnionType
  */
  trait IntersectionUnion extends js.Object
  
}

