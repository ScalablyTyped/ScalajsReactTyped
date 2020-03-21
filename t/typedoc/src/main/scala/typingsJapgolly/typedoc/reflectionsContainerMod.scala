package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.modelsMod.ContainerReflection
import typingsJapgolly.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/container", JSImport.Namespace)
@js.native
object reflectionsContainerMod extends js.Object {
  @js.native
  class ContainerReflectionSerializer () extends ReflectionSerializerComponent[ContainerReflection]
  
}

