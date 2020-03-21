package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typescript.mod.ModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/module", JSImport.Namespace)
@js.native
object moduleMod extends js.Object {
  @js.native
  class ModuleConverter () extends ConverterNodeComponent[ModuleDeclaration]
  
}

