package typingsJapgolly.babelParser.mod

import typingsJapgolly.babelParser.babelParserStrings.minimal
import typingsJapgolly.babelParser.babelParserStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipelineOperatorPluginOptions extends js.Object {
  var proposal: minimal | smart
}

object PipelineOperatorPluginOptions {
  @scala.inline
  def apply(proposal: minimal | smart): PipelineOperatorPluginOptions = {
    val __obj = js.Dynamic.literal(proposal = proposal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PipelineOperatorPluginOptions]
  }
}

