package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsTypesMod.ReferenceType
import typingsJapgolly.typescript.mod.Symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/factories/reference", JSImport.Namespace)
@js.native
object referenceMod extends js.Object {
  def createReferenceType(context: Context): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: js.UndefOr[scala.Nothing], includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol): js.UndefOr[ReferenceType] = js.native
  def createReferenceType(context: Context, symbol: Symbol, includeParent: Boolean): js.UndefOr[ReferenceType] = js.native
}

