package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.ReflectionKind
import typingsJapgolly.typedoc.commentsMod.Comment
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.DeclarationReflection
import typingsJapgolly.typedoc.modelsMod.SignatureReflection
import typingsJapgolly.typedoc.modelsMod.TypeParameterType
import typingsJapgolly.typedoc.modelsTypesMod.ReferenceType
import typingsJapgolly.typedoc.reflectionsMod.ParameterReflection
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.ParameterDeclaration
import typingsJapgolly.typescript.mod.SignatureDeclaration
import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories", JSImport.Namespace)
@js.native
object factoriesMod extends js.Object {
  def createComment(node: Node): js.UndefOr[Comment] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind): js.UndefOr[DeclarationReflection] = js.native
  def createDeclaration(context: Context, node: Declaration, kind: ReflectionKind, name: String): js.UndefOr[DeclarationReflection] = js.native
  def createParameter(context: Context, node: ParameterDeclaration): js.UndefOr[ParameterReflection] = js.native
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
  def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = js.native
}

