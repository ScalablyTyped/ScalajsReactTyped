package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.ReflectionKind
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.DeclarationReflection
import typingsJapgolly.typescript.mod.Declaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/declaration", JSImport.Namespace)
@js.native
object declarationMod extends js.Object {
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
}

