package typingsJapgolly.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeDefinition extends js.Object {
  /**
    * Capabilities specific to the `textDocument/typeDefinition`
    */
  var typeDefinition: js.UndefOr[AnonLinkSupport] = js.undefined
}

object AnonTypeDefinition {
  @scala.inline
  def apply(typeDefinition: AnonLinkSupport = null): AnonTypeDefinition = {
    val __obj = js.Dynamic.literal()
    if (typeDefinition != null) __obj.updateDynamic("typeDefinition")(typeDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeDefinition]
  }
}

