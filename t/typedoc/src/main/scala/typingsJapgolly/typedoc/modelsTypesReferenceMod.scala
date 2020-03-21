package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.Reflection
import typingsJapgolly.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/reference", JSImport.Namespace)
@js.native
object modelsTypesReferenceMod extends js.Object {
  @js.native
  class ReferenceType protected () extends Type {
    def this(name: String, symbolID: Double) = this()
    def this(name: String, symbolID: Double, reflection: Reflection) = this()
    var name: String = js.native
    var reflection: js.UndefOr[Reflection] = js.native
    var symbolID: Double = js.native
    var typeArguments: js.UndefOr[js.Array[Type]] = js.native
    def equals(`type`: ReferenceType): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ReferenceType extends js.Object {
    var SYMBOL_ID_RESOLVED: Double = js.native
    var SYMBOL_ID_RESOLVE_BY_NAME: Double = js.native
  }
  
}

