package typingsJapgolly.typescript

import typingsJapgolly.typescript.typescriptMod.NodeArray
import typingsJapgolly.typescript.typescriptMod.TypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeArguments extends js.Object {
  var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.undefined
}

object Anon_TypeArguments {
  @scala.inline
  def apply(typeArguments: NodeArray[TypeNode] = null): Anon_TypeArguments = {
    val __obj = js.Dynamic.literal()
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeArguments]
  }
}

