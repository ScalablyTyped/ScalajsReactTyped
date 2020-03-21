package typingsJapgolly.vscodeLanguageserverProtocol.protocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.AnonCodeActionLiteralSupport
import typingsJapgolly.vscodeLanguageserverProtocol.AnonCompletionItem
import typingsJapgolly.vscodeLanguageserverProtocol.AnonContentFormat
import typingsJapgolly.vscodeLanguageserverProtocol.AnonDidSave
import typingsJapgolly.vscodeLanguageserverProtocol.AnonDynamicRegistration
import typingsJapgolly.vscodeLanguageserverProtocol.AnonHierarchicalDocumentSymbolSupport
import typingsJapgolly.vscodeLanguageserverProtocol.AnonLinkSupport
import typingsJapgolly.vscodeLanguageserverProtocol.AnonPrepareSupport
import typingsJapgolly.vscodeLanguageserverProtocol.AnonRelatedInformation
import typingsJapgolly.vscodeLanguageserverProtocol.AnonSignatureInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentClientCapabilities extends js.Object {
  /**
    * Capabilities specific to the `textDocument/codeAction`
    */
  var codeAction: js.UndefOr[AnonCodeActionLiteralSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/codeLens`
    */
  var codeLens: js.UndefOr[AnonDynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/completion`
    */
  var completion: js.UndefOr[AnonCompletionItem] = js.undefined
  /**
    * Capabilities specific to the `textDocument/definition`
    */
  var definition: js.UndefOr[AnonLinkSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentHighlight`
    */
  var documentHighlight: js.UndefOr[AnonDynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentLink`
    */
  var documentLink: js.UndefOr[AnonDynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/documentSymbol`
    */
  var documentSymbol: js.UndefOr[AnonHierarchicalDocumentSymbolSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/formatting`
    */
  var formatting: js.UndefOr[AnonDynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/hover`
    */
  var hover: js.UndefOr[AnonContentFormat] = js.undefined
  /**
    * Capabilities specific to the `textDocument/onTypeFormatting`
    */
  var onTypeFormatting: js.UndefOr[AnonDynamicRegistration] = js.undefined
  /**
    * Capabilities specific to `textDocument/publishDiagnostics`.
    */
  var publishDiagnostics: js.UndefOr[AnonRelatedInformation] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rangeFormatting`
    */
  var rangeFormatting: js.UndefOr[AnonDynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/references`
    */
  var references: js.UndefOr[AnonDynamicRegistration] = js.undefined
  /**
    * Capabilities specific to the `textDocument/rename`
    */
  var rename: js.UndefOr[AnonPrepareSupport] = js.undefined
  /**
    * Capabilities specific to the `textDocument/signatureHelp`
    */
  var signatureHelp: js.UndefOr[AnonSignatureInformation] = js.undefined
  /**
    * Defines which synchronization capabilities the client supports.
    */
  var synchronization: js.UndefOr[AnonDidSave] = js.undefined
}

object TextDocumentClientCapabilities {
  @scala.inline
  def apply(
    codeAction: AnonCodeActionLiteralSupport = null,
    codeLens: AnonDynamicRegistration = null,
    completion: AnonCompletionItem = null,
    definition: AnonLinkSupport = null,
    documentHighlight: AnonDynamicRegistration = null,
    documentLink: AnonDynamicRegistration = null,
    documentSymbol: AnonHierarchicalDocumentSymbolSupport = null,
    formatting: AnonDynamicRegistration = null,
    hover: AnonContentFormat = null,
    onTypeFormatting: AnonDynamicRegistration = null,
    publishDiagnostics: AnonRelatedInformation = null,
    rangeFormatting: AnonDynamicRegistration = null,
    references: AnonDynamicRegistration = null,
    rename: AnonPrepareSupport = null,
    signatureHelp: AnonSignatureInformation = null,
    synchronization: AnonDidSave = null
  ): TextDocumentClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (codeAction != null) __obj.updateDynamic("codeAction")(codeAction.asInstanceOf[js.Any])
    if (codeLens != null) __obj.updateDynamic("codeLens")(codeLens.asInstanceOf[js.Any])
    if (completion != null) __obj.updateDynamic("completion")(completion.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (documentHighlight != null) __obj.updateDynamic("documentHighlight")(documentHighlight.asInstanceOf[js.Any])
    if (documentLink != null) __obj.updateDynamic("documentLink")(documentLink.asInstanceOf[js.Any])
    if (documentSymbol != null) __obj.updateDynamic("documentSymbol")(documentSymbol.asInstanceOf[js.Any])
    if (formatting != null) __obj.updateDynamic("formatting")(formatting.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (onTypeFormatting != null) __obj.updateDynamic("onTypeFormatting")(onTypeFormatting.asInstanceOf[js.Any])
    if (publishDiagnostics != null) __obj.updateDynamic("publishDiagnostics")(publishDiagnostics.asInstanceOf[js.Any])
    if (rangeFormatting != null) __obj.updateDynamic("rangeFormatting")(rangeFormatting.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(rename.asInstanceOf[js.Any])
    if (signatureHelp != null) __obj.updateDynamic("signatureHelp")(signatureHelp.asInstanceOf[js.Any])
    if (synchronization != null) __obj.updateDynamic("synchronization")(synchronization.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentClientCapabilities]
  }
}

