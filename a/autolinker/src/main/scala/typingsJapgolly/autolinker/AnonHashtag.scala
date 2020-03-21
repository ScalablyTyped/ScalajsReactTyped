package typingsJapgolly.autolinker

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.autolinker.emailMatchMod.EmailMatch
import typingsJapgolly.autolinker.emailMatchMod.EmailMatchConfig
import typingsJapgolly.autolinker.hashtagMatchMod.HashtagMatch
import typingsJapgolly.autolinker.hashtagMatchMod.HashtagMatchConfig
import typingsJapgolly.autolinker.matchMatchMod.Match
import typingsJapgolly.autolinker.matchMatchMod.MatchConfig
import typingsJapgolly.autolinker.mentionMatchMod.MentionMatch
import typingsJapgolly.autolinker.mentionMatchMod.MentionMatchConfig
import typingsJapgolly.autolinker.phoneMatchMod.PhoneMatch
import typingsJapgolly.autolinker.phoneMatchMod.PhoneMatchConfig
import typingsJapgolly.autolinker.urlMatchMod.UrlMatch
import typingsJapgolly.autolinker.urlMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHashtag extends js.Object {
  var Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch]
  var Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch]
  var Match: Instantiable1[/* cfg */ MatchConfig, typingsJapgolly.autolinker.matchMatchMod.Match]
  var Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch]
  var Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch]
  var Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
}

object AnonHashtag {
  @scala.inline
  def apply(
    Email: Instantiable1[/* cfg */ EmailMatchConfig, EmailMatch],
    Hashtag: Instantiable1[/* cfg */ HashtagMatchConfig, HashtagMatch],
    Match: Instantiable1[/* cfg */ MatchConfig, Match],
    Mention: Instantiable1[/* cfg */ MentionMatchConfig, MentionMatch],
    Phone: Instantiable1[/* cfg */ PhoneMatchConfig, PhoneMatch],
    Url: Instantiable1[/* cfg */ UrlMatchConfig, UrlMatch]
  ): AnonHashtag = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], Hashtag = Hashtag.asInstanceOf[js.Any], Match = Match.asInstanceOf[js.Any], Mention = Mention.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHashtag]
  }
}

