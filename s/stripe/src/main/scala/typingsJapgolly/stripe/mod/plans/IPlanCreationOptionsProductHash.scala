package typingsJapgolly.stripe.mod.plans

import typingsJapgolly.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanCreationOptionsProductHash extends js.Object {
  /**
    * The identifier for the product. Must be unique. If not provided, an identifier will be randomly generated.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional information about the object in a structured
    * format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.undefined
  /**
    * The product’s name, meant to be displayable to the customer.
    */
  var name: String
  /**
    * An arbitrary string to be displayed on your customer’s credit card statement. This may be up to 22 characters. The statement description may not
    * include <>”’ characters, and will appear on your customer’s statement in capital letters. Non-ASCII characters are automatically stripped. While
    * most banks display this information consistently, some may display it incorrectly or not at all.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
}

object IPlanCreationOptionsProductHash {
  @scala.inline
  def apply(
    name: String,
    id: String = null,
    metadata: IOptionsMetadata = null,
    statement_descriptor: String = null
  ): IPlanCreationOptionsProductHash = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlanCreationOptionsProductHash]
  }
}

