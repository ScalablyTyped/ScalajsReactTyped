package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.Decorator
import typingsJapgolly.typedoc.fileMod.SourceReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/models", JSImport.Namespace)
@js.native
object serializersModelsMod extends js.Object {
  @js.native
  class DecoratorWrapper protected ()
    extends typingsJapgolly.typedoc.decoratorWrapperMod.DecoratorWrapper {
    def this(decorator: Decorator) = this()
  }
  
  @js.native
  class SourceReferenceWrapper protected ()
    extends typingsJapgolly.typedoc.sourceReferenceWrapperMod.SourceReferenceWrapper {
    def this(sourceReference: SourceReference) = this()
  }
  
}

