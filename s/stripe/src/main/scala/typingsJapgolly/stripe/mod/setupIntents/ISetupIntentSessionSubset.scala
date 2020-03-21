package typingsJapgolly.stripe.mod.setupIntents

import typingsJapgolly.stripe.mod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentSessionSubset extends js.Object {
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * The Stripe account for which the setup is intended.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
}

object ISetupIntentSessionSubset {
  @scala.inline
  def apply(description: String = null, metadata: IMetadata = null, on_behalf_of: String = null): ISetupIntentSessionSubset = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentSessionSubset]
  }
}

