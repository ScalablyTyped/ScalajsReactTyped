package typingsJapgolly.typedoc

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.typedoc.fileMod.SourceReference
import typingsJapgolly.typedoc.serializationComponentsMod.SerializerComponent
import typingsJapgolly.typedoc.sourceReferenceWrapperMod.SourceReferenceWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", JSImport.Namespace)
@js.native
object sourceReferenceMod extends js.Object {
  @js.native
  class SourceReferenceContainerSerializer () extends SerializerComponent[SourceReferenceWrapper] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_SourceReferenceContainerSerializer: Instantiable1[/* sourceReference */ SourceReference, SourceReferenceWrapper] = js.native
  }
  
  /* static members */
  @js.native
  object SourceReferenceContainerSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

