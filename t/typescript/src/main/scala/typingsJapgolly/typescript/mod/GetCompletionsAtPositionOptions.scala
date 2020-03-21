package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.typescriptStrings.`non-relative`
import typingsJapgolly.typescript.typescriptStrings.auto
import typingsJapgolly.typescript.typescriptStrings.double
import typingsJapgolly.typescript.typescriptStrings.index
import typingsJapgolly.typescript.typescriptStrings.js_
import typingsJapgolly.typescript.typescriptStrings.minimal
import typingsJapgolly.typescript.typescriptStrings.relative
import typingsJapgolly.typescript.typescriptStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCompletionsAtPositionOptions extends UserPreferences {
  /** @deprecated Use includeCompletionsForModuleExports */
  var includeExternalModuleExports: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Use includeCompletionsWithInsertText */
  var includeInsertTextCompletions: js.UndefOr[Boolean] = js.undefined
  /**
    * If the editor is asking for completions because a certain character was typed
    * (as opposed to when the user explicitly requested them) this should be set.
    */
  var triggerCharacter: js.UndefOr[CompletionsTriggerCharacter] = js.undefined
}

object GetCompletionsAtPositionOptions {
  @scala.inline
  def apply(
    allowTextChangesInNewFiles: js.UndefOr[Boolean] = js.undefined,
    disableSuggestions: js.UndefOr[Boolean] = js.undefined,
    importModuleSpecifierEnding: minimal | index | js_ = null,
    importModuleSpecifierPreference: auto | relative | `non-relative` = null,
    includeAutomaticOptionalChainCompletions: js.UndefOr[Boolean] = js.undefined,
    includeCompletionsForModuleExports: js.UndefOr[Boolean] = js.undefined,
    includeCompletionsWithInsertText: js.UndefOr[Boolean] = js.undefined,
    includeExternalModuleExports: js.UndefOr[Boolean] = js.undefined,
    includeInsertTextCompletions: js.UndefOr[Boolean] = js.undefined,
    providePrefixAndSuffixTextForRename: js.UndefOr[Boolean] = js.undefined,
    quotePreference: auto | double | single = null,
    triggerCharacter: CompletionsTriggerCharacter = null
  ): GetCompletionsAtPositionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTextChangesInNewFiles)) __obj.updateDynamic("allowTextChangesInNewFiles")(allowTextChangesInNewFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSuggestions)) __obj.updateDynamic("disableSuggestions")(disableSuggestions.asInstanceOf[js.Any])
    if (importModuleSpecifierEnding != null) __obj.updateDynamic("importModuleSpecifierEnding")(importModuleSpecifierEnding.asInstanceOf[js.Any])
    if (importModuleSpecifierPreference != null) __obj.updateDynamic("importModuleSpecifierPreference")(importModuleSpecifierPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAutomaticOptionalChainCompletions)) __obj.updateDynamic("includeAutomaticOptionalChainCompletions")(includeAutomaticOptionalChainCompletions.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCompletionsForModuleExports)) __obj.updateDynamic("includeCompletionsForModuleExports")(includeCompletionsForModuleExports.asInstanceOf[js.Any])
    if (!js.isUndefined(includeCompletionsWithInsertText)) __obj.updateDynamic("includeCompletionsWithInsertText")(includeCompletionsWithInsertText.asInstanceOf[js.Any])
    if (!js.isUndefined(includeExternalModuleExports)) __obj.updateDynamic("includeExternalModuleExports")(includeExternalModuleExports.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInsertTextCompletions)) __obj.updateDynamic("includeInsertTextCompletions")(includeInsertTextCompletions.asInstanceOf[js.Any])
    if (!js.isUndefined(providePrefixAndSuffixTextForRename)) __obj.updateDynamic("providePrefixAndSuffixTextForRename")(providePrefixAndSuffixTextForRename.asInstanceOf[js.Any])
    if (quotePreference != null) __obj.updateDynamic("quotePreference")(quotePreference.asInstanceOf[js.Any])
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCompletionsAtPositionOptions]
  }
}

