package typingsJapgolly.openfin.entityTypeMod

import typingsJapgolly.openfin.frameFrameMod.Frame
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.transportMod.default
import typingsJapgolly.openfin.viewViewMod.View
import typingsJapgolly.openfin.windowWindowMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/util/entity-type", "getInstanceByEntityType")
@js.native
object getInstanceByEntityType extends js.Object {
  def apply(entityType: String, wire: default, identity: Identity): View | Window | Frame = js.native
}

