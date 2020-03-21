package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.TypeParameterType
import typingsJapgolly.typescript.mod.TypeParameterDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/type-parameter", JSImport.Namespace)
@js.native
object typeParameterMod extends js.Object {
  def createTypeParameter(context: Context, node: TypeParameterDeclaration): js.UndefOr[TypeParameterType] = js.native
}

