package typingsJapgolly.autolinker

import typingsJapgolly.autolinker.hashtagMatcherMod.HashtagMatcherConfig
import typingsJapgolly.autolinker.matcherMatcherMod.MatcherConfig
import typingsJapgolly.autolinker.mentionMatcherMod.MentionMatcherConfig
import typingsJapgolly.autolinker.urlMatcherMod.UrlMatcherConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  @js.native
  class EmailMatcher ()
    extends typingsJapgolly.autolinker.emailMatcherMod.EmailMatcher
  
  @js.native
  class HashtagMatcher protected ()
    extends typingsJapgolly.autolinker.hashtagMatcherMod.HashtagMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: HashtagMatcherConfig) = this()
  }
  
  @js.native
  abstract class Matcher protected ()
    extends typingsJapgolly.autolinker.matcherMatcherMod.Matcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Matcher
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatcherConfig) = this()
  }
  
  @js.native
  class MentionMatcher protected ()
    extends typingsJapgolly.autolinker.mentionMatcherMod.MentionMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: MentionMatcherConfig) = this()
  }
  
  @js.native
  class PhoneMatcher ()
    extends typingsJapgolly.autolinker.phoneMatcherMod.PhoneMatcher
  
  @js.native
  class UrlMatcher protected ()
    extends typingsJapgolly.autolinker.urlMatcherMod.UrlMatcher {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match instance,
      *   specified in an Object (map).
      */
    def this(cfg: UrlMatcherConfig) = this()
  }
  
}

