package typingsJapgolly.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOptions extends js.Object {
  var discriminator: js.UndefOr[Discriminator] = js.undefined
  /**
    * Is false by default.
    */
  var keepDiscriminatorProperty: js.UndefOr[Boolean] = js.undefined
}

object TypeOptions {
  @scala.inline
  def apply(discriminator: Discriminator = null, keepDiscriminatorProperty: js.UndefOr[Boolean] = js.undefined): TypeOptions = {
    val __obj = js.Dynamic.literal()
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDiscriminatorProperty)) __obj.updateDynamic("keepDiscriminatorProperty")(keepDiscriminatorProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOptions]
  }
}

