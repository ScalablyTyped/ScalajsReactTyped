package typingsJapgolly.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSlots[TSlots] extends js.Object {
  var slots: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typingsJapgolly.uifabricFoundation.uifabricFoundationStrings.AnonSlots with TSlots
  ] = js.undefined
}

object AnonSlots {
  @scala.inline
  def apply[TSlots](
    slots: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotOptions<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[key]>>}
    */ typingsJapgolly.uifabricFoundation.uifabricFoundationStrings.AnonSlots with TSlots = null
  ): AnonSlots[TSlots] = {
    val __obj = js.Dynamic.literal()
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSlots[TSlots]]
  }
}

