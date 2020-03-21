package typingsJapgolly.scriptExtHtmlWebpackPlugin

import typingsJapgolly.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase
import typingsJapgolly.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.all
import typingsJapgolly.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typingsJapgolly.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined script-ext-html-webpack-plugin.script-ext-html-webpack-plugin.ScriptMatchingPatternHash & {  chunks ? :'initial' | 'async' | 'all'} */
trait ScriptMatchingPatternHash extends js.Object {
  var chunks: js.UndefOr[initial | async | all] = js.undefined
  var test: ScriptMatchingPatternBase
}

object ScriptMatchingPatternHash {
  @scala.inline
  def apply(test: ScriptMatchingPatternBase, chunks: initial | async | all = null): ScriptMatchingPatternHash = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptMatchingPatternHash]
  }
}

