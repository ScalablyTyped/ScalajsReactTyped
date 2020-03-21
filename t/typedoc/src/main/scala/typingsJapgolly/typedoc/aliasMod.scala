package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typescript.mod.TypeAliasDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/alias", JSImport.Namespace)
@js.native
object aliasMod extends js.Object {
  @js.native
  class AliasConverter () extends ConverterNodeComponent[TypeAliasDeclaration]
  
}

