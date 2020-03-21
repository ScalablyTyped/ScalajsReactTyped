package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeNodeConverter
import typingsJapgolly.typescript.mod.ThisTypeNode
import typingsJapgolly.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/this", JSImport.Namespace)
@js.native
object thisMod extends js.Object {
  @js.native
  class ThisConverter () extends TypeNodeConverter[Type, ThisTypeNode]
  
}

