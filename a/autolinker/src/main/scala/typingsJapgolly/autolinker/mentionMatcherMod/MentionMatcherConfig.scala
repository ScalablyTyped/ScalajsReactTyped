package typingsJapgolly.autolinker.mentionMatcherMod

import typingsJapgolly.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typingsJapgolly.autolinker.autolinkerMod.MentionServices
import typingsJapgolly.autolinker.matcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionMatcherConfig extends MatcherConfig {
  var serviceName: MentionServices
}

object MentionMatcherConfig {
  @scala.inline
  def apply(serviceName: MentionServices, tagBuilder: AnchorTagBuilder): MentionMatcherConfig = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MentionMatcherConfig]
  }
}

