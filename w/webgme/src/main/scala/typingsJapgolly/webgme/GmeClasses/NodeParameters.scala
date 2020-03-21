package typingsJapgolly.webgme.GmeClasses

import typingsJapgolly.webgme.Core.GUID
import typingsJapgolly.webgme.Core.Node
import typingsJapgolly.webgme.GmeCommon.RelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeParameters extends js.Object {
  /** the base of the node to be created. */
  var base: js.UndefOr[Node | Null] = js.undefined
  /** the GUID of the node to be created */
  var guid: js.UndefOr[GUID] = js.undefined
  /** the parent of the node to be created. */
  var parent: js.UndefOr[Node | Null] = js.undefined
  /** the relative id of the node to be created 
    * (if reserved, the function returns the node behind the relative id) */
  var relid: js.UndefOr[RelId] = js.undefined
}

object NodeParameters {
  @scala.inline
  def apply(base: Node = null, guid: GUID = null, parent: Node = null, relid: RelId = null): NodeParameters = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (relid != null) __obj.updateDynamic("relid")(relid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParameters]
  }
}

