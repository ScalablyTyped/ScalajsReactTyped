package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/union", JSImport.Namespace)
@js.native
object unionMod extends js.Object {
  @js.native
  class UnionType protected () extends Type {
    def this(types: js.Array[Type]) = this()
    var types: js.Array[Type] = js.native
    def equals(`type`: UnionType): Boolean = js.native
  }
  
}

