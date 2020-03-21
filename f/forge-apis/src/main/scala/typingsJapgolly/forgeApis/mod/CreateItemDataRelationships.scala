package typingsJapgolly.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemDataRelationships extends js.Object {
  var parent: js.UndefOr[CreateStorageDataRelationshipsTarget] = js.undefined
  var tip: js.UndefOr[CreateItemDataRelationshipsTip] = js.undefined
}

object CreateItemDataRelationships {
  @scala.inline
  def apply(parent: CreateStorageDataRelationshipsTarget = null, tip: CreateItemDataRelationshipsTip = null): CreateItemDataRelationships = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemDataRelationships]
  }
}

