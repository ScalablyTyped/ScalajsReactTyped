package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/intrinsic", JSImport.Namespace)
@js.native
object typesIntrinsicMod extends js.Object {
  @js.native
  class IntrinsicType protected () extends Type {
    def this(name: String) = this()
    var name: String = js.native
    def equals(`type`: IntrinsicType): Boolean = js.native
  }
  
}

