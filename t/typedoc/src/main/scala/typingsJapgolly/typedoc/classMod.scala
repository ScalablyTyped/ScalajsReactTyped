package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typescript.mod.ClassDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  @js.native
  class ClassConverter () extends ConverterNodeComponent[ClassDeclaration]
  
}

