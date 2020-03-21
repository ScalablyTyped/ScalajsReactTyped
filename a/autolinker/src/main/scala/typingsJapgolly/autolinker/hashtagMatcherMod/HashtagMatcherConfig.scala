package typingsJapgolly.autolinker.hashtagMatcherMod

import typingsJapgolly.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import typingsJapgolly.autolinker.autolinkerMod.HashtagServices
import typingsJapgolly.autolinker.matcherMatcherMod.MatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashtagMatcherConfig extends MatcherConfig {
  var serviceName: HashtagServices
}

object HashtagMatcherConfig {
  @scala.inline
  def apply(serviceName: HashtagServices, tagBuilder: AnchorTagBuilder): HashtagMatcherConfig = {
    val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashtagMatcherConfig]
  }
}

