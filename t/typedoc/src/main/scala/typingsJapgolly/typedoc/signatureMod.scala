package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.ReflectionKind
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.SignatureReflection
import typingsJapgolly.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/signature", JSImport.Namespace)
@js.native
object signatureMod extends js.Object {
  def createSignature(context: Context, node: SignatureDeclaration, name: String, kind: ReflectionKind): SignatureReflection = js.native
}

