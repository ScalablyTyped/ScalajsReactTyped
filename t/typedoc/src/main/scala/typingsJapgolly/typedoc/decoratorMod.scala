package typingsJapgolly.typedoc

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.typedoc.abstractMod.Decorator
import typingsJapgolly.typedoc.decoratorWrapperMod.DecoratorWrapper
import typingsJapgolly.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/decorator", JSImport.Namespace)
@js.native
object decoratorMod extends js.Object {
  @js.native
  class DecoratorContainerSerializer () extends SerializerComponent[DecoratorWrapper] {
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_DecoratorContainerSerializer: Instantiable1[/* decorator */ Decorator, DecoratorWrapper] = js.native
  }
  
  /* static members */
  @js.native
  object DecoratorContainerSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

