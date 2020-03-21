package typingsJapgolly.vscode.mod

import typingsJapgolly.vscode.AnonAutoClosingPairs
import typingsJapgolly.vscode.AnonBrackets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageConfiguration extends js.Object {
  /**
  		 * **Deprecated** Do not use.
  		 *
  		 * @deprecated * Use the autoClosingPairs property in the language configuration file instead.
  		 */
  var __characterPairSupport: js.UndefOr[AnonAutoClosingPairs] = js.undefined
  /**
  		 * **Deprecated** Do not use.
  		 *
  		 * @deprecated Will be replaced by a better API soon.
  		 */
  var __electricCharacterSupport: js.UndefOr[AnonBrackets] = js.undefined
  /**
  		 * The language's brackets.
  		 * This configuration implicitly affects pressing Enter around these brackets.
  		 */
  var brackets: js.UndefOr[js.Array[CharacterPair]] = js.undefined
  /**
  		 * The language's comment settings.
  		 */
  var comments: js.UndefOr[CommentRule] = js.undefined
  /**
  		 * The language's indentation settings.
  		 */
  var indentationRules: js.UndefOr[IndentationRule] = js.undefined
  /**
  		 * The language's rules to be evaluated when pressing Enter.
  		 */
  var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.undefined
  /**
  		 * The language's word definition.
  		 * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
  		 * to provide a word definition that uses exclusion of known separators.
  		 * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
  		 *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
  		 */
  var wordPattern: js.UndefOr[js.RegExp] = js.undefined
}

object LanguageConfiguration {
  @scala.inline
  def apply(
    __characterPairSupport: AnonAutoClosingPairs = null,
    __electricCharacterSupport: AnonBrackets = null,
    brackets: js.Array[CharacterPair] = null,
    comments: CommentRule = null,
    indentationRules: IndentationRule = null,
    onEnterRules: js.Array[OnEnterRule] = null,
    wordPattern: js.RegExp = null
  ): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (__characterPairSupport != null) __obj.updateDynamic("__characterPairSupport")(__characterPairSupport.asInstanceOf[js.Any])
    if (__electricCharacterSupport != null) __obj.updateDynamic("__electricCharacterSupport")(__electricCharacterSupport.asInstanceOf[js.Any])
    if (brackets != null) __obj.updateDynamic("brackets")(brackets.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (indentationRules != null) __obj.updateDynamic("indentationRules")(indentationRules.asInstanceOf[js.Any])
    if (onEnterRules != null) __obj.updateDynamic("onEnterRules")(onEnterRules.asInstanceOf[js.Any])
    if (wordPattern != null) __obj.updateDynamic("wordPattern")(wordPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageConfiguration]
  }
}

