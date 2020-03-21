package typingsJapgolly.vscodeLanguageserverProtocol.protocolTypeDefinitionMod

import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDefinitionServerCapabilities extends js.Object {
  /**
    * The server provides Goto Type Definition support.
    */
  var typeDefinitionProvider: js.UndefOr[Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions)] = js.undefined
}

object TypeDefinitionServerCapabilities {
  @scala.inline
  def apply(
    typeDefinitionProvider: Boolean | (TextDocumentRegistrationOptions with StaticRegistrationOptions) = null
  ): TypeDefinitionServerCapabilities = {
    val __obj = js.Dynamic.literal()
    if (typeDefinitionProvider != null) __obj.updateDynamic("typeDefinitionProvider")(typeDefinitionProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinitionServerCapabilities]
  }
}

