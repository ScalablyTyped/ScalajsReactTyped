package typingsJapgolly.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.fluxStandardAction.mod._FluxStandardActionAuto because Already inherited */ trait FluxStandardActionWithMeta[Type /* <: String */, Payload, Meta] extends FluxStandardAction[Type, Payload, Meta] {
  /**
    * The required `meta` property MAY be any type of value.
    * It is intended for any extra information that is not part of the payload.
    */
  @JSName("meta")
  var meta_FluxStandardActionWithMeta: Meta
}

object FluxStandardActionWithMeta {
  @scala.inline
  def apply[Type /* <: String */, Payload, Meta](meta: Meta, `type`: Type, error: js.UndefOr[Boolean] = js.undefined, payload: Payload = null): FluxStandardActionWithMeta[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardActionWithMeta[Type, Payload, Meta]]
  }
}

