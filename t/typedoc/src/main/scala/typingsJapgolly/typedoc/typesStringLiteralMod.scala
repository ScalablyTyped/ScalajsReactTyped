package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/string-literal", JSImport.Namespace)
@js.native
object typesStringLiteralMod extends js.Object {
  @js.native
  class StringLiteralType protected () extends Type {
    def this(value: String) = this()
    var value: String = js.native
    def equals(`type`: StringLiteralType): Boolean = js.native
  }
  
}

