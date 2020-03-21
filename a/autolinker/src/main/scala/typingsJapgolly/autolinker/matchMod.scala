package typingsJapgolly.autolinker

import typingsJapgolly.autolinker.emailMatchMod.EmailMatchConfig
import typingsJapgolly.autolinker.hashtagMatchMod.HashtagMatchConfig
import typingsJapgolly.autolinker.matchMatchMod.MatchConfig
import typingsJapgolly.autolinker.mentionMatchMod.MentionMatchConfig
import typingsJapgolly.autolinker.phoneMatchMod.PhoneMatchConfig
import typingsJapgolly.autolinker.urlMatchMod.UrlMatchConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker/dist/commonjs/match", JSImport.Namespace)
@js.native
object matchMod extends js.Object {
  @js.native
  class EmailMatch protected ()
    extends typingsJapgolly.autolinker.emailMatchMod.EmailMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: EmailMatchConfig) = this()
  }
  
  @js.native
  class HashtagMatch protected ()
    extends typingsJapgolly.autolinker.hashtagMatchMod.HashtagMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: HashtagMatchConfig) = this()
  }
  
  @js.native
  abstract class Match protected ()
    extends typingsJapgolly.autolinker.matchMatchMod.Match {
    /**
      * @member Autolinker.match.Match
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MatchConfig) = this()
  }
  
  @js.native
  class MentionMatch protected ()
    extends typingsJapgolly.autolinker.mentionMatchMod.MentionMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: MentionMatchConfig) = this()
  }
  
  @js.native
  class PhoneMatch protected ()
    extends typingsJapgolly.autolinker.phoneMatchMod.PhoneMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: PhoneMatchConfig) = this()
  }
  
  @js.native
  class UrlMatch protected ()
    extends typingsJapgolly.autolinker.urlMatchMod.UrlMatch {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
  }
  
}

