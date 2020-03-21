package typingsJapgolly.typedoc.reflectionsDeclarationMod

import typingsJapgolly.typedoc.modelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationHierarchy extends js.Object {
  var isTarget: js.UndefOr[Boolean] = js.undefined
  var next: js.UndefOr[DeclarationHierarchy] = js.undefined
  var types: js.Array[Type]
}

object DeclarationHierarchy {
  @scala.inline
  def apply(
    types: js.Array[Type],
    isTarget: js.UndefOr[Boolean] = js.undefined,
    next: DeclarationHierarchy = null
  ): DeclarationHierarchy = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    if (!js.isUndefined(isTarget)) __obj.updateDynamic("isTarget")(isTarget.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationHierarchy]
  }
}

