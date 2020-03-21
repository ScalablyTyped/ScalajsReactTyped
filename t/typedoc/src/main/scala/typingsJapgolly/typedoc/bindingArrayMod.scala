package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeNodeConverter
import typingsJapgolly.typescript.mod.BindingPattern
import typingsJapgolly.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/binding-array", JSImport.Namespace)
@js.native
object bindingArrayMod extends js.Object {
  @js.native
  class BindingArrayConverter () extends TypeNodeConverter[Type, BindingPattern]
  
}

