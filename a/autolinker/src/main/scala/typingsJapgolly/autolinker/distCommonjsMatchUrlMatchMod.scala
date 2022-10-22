package typingsJapgolly.autolinker

import typingsJapgolly.autolinker.anon.RequiredStripPrefixConfig
import typingsJapgolly.autolinker.autolinkerStrings.url
import typingsJapgolly.autolinker.distCommonjsAnchorTagBuilderMod.AnchorTagBuilder
import typingsJapgolly.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatch
import typingsJapgolly.autolinker.distCommonjsMatchAbstractMatchMod.AbstractMatchConfig
import typingsJapgolly.autolinker.distCommonjsMatchMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsMatchUrlMatchMod {
  
  @JSImport("autolinker/dist/commonjs/match/url-match", "UrlMatch")
  @js.native
  open class UrlMatch protected ()
    extends AbstractMatch
       with Match {
    /**
      * @method constructor
      * @param {Object} cfg The configuration properties for the Match
      *   instance, specified in an Object (map).
      */
    def this(cfg: UrlMatchConfig) = this()
    
    /**
      * @cfg {Boolean} decodePercentEncoding (required)
      * @inheritdoc Autolinker#cfg-decodePercentEncoding
      */
    /* private */ val decodePercentEncoding: Any = js.native
    
    /**
      * Returns the url that was matched, assuming the protocol to be 'http://' if the original
      * match was missing a protocol.
      *
      * @return {String}
      */
    def getUrl(): String = js.native
    
    /**
      * Returns a string name for the type of URL match that this class
      * represents.
      *
      * This helps to determine if the match was made in the original text with a
      * prefixed scheme (ex: 'http://www.google.com'), a prefixed 'www' (ex:
      * 'www.google.com'), or was matched by a known top-level domain (ex:
      * 'google.com').
      *
      * @return {"scheme"/"www"/"tld"}
      */
    def getUrlMatchType(): UrlMatchType = js.native
    
    /**
      * @private
      * @property {Boolean} protocolPrepended
      *
      * Will be set to `true` if the 'http://' protocol has been prepended to the {@link #url} (because the
      * {@link #url} did not have a protocol)
      */
    /* private */ var protocolPrepended: Any = js.native
    
    /**
      * @cfg {Boolean} protocolRelativeMatch (required)
      *
      * `true` if the URL is a protocol-relative match. A protocol-relative match
      * is a URL that starts with '//', and will be either http:// or https://
      * based on the protocol that the site is loaded under.
      */
    /* private */ val protocolRelativeMatch: Any = js.native
    
    /**
      * @cfg {Object} stripPrefix (required)
      *
      * The Object form of {@link Autolinker#cfg-stripPrefix}.
      */
    /* private */ val stripPrefix: Any = js.native
    
    /**
      * @cfg {Boolean} stripTrailingSlash (required)
      * @inheritdoc Autolinker#cfg-stripTrailingSlash
      */
    /* private */ val stripTrailingSlash: Any = js.native
    
    /**
      * @public
      * @property {'url'} type
      *
      * A string name for the type of match that this class represents. Can be
      * used in a TypeScript discriminating union to type-narrow from the
      * `Match` type.
      */
    @JSName("type")
    val type_UrlMatch: url = js.native
    
    /**
      * @cfg {String} url (required)
      *
      * The url that was matched.
      */
    /* private */ var url: Any = js.native
    
    /**
      * @cfg {"scheme"/"www"/"tld"} urlMatchType (required)
      *
      * The type of URL match that this class represents. This helps to determine
      * if the match was made in the original text with a prefixed scheme (ex:
      * 'http://www.google.com'), a prefixed 'www' (ex: 'www.google.com'), or
      * was matched by a known top-level domain (ex: 'google.com').
      */
    /* private */ val urlMatchType: Any = js.native
  }
  
  trait UrlMatchConfig
    extends StObject
       with AbstractMatchConfig {
    
    var decodePercentEncoding: Boolean
    
    var protocolRelativeMatch: Boolean
    
    var stripPrefix: RequiredStripPrefixConfig
    
    var stripTrailingSlash: Boolean
    
    var url: String
    
    var urlMatchType: UrlMatchType
  }
  object UrlMatchConfig {
    
    inline def apply(
      decodePercentEncoding: Boolean,
      matchedText: String,
      offset: Double,
      protocolRelativeMatch: Boolean,
      stripPrefix: RequiredStripPrefixConfig,
      stripTrailingSlash: Boolean,
      tagBuilder: AnchorTagBuilder,
      url: String,
      urlMatchType: UrlMatchType
    ): UrlMatchConfig = {
      val __obj = js.Dynamic.literal(decodePercentEncoding = decodePercentEncoding.asInstanceOf[js.Any], matchedText = matchedText.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], protocolRelativeMatch = protocolRelativeMatch.asInstanceOf[js.Any], stripPrefix = stripPrefix.asInstanceOf[js.Any], stripTrailingSlash = stripTrailingSlash.asInstanceOf[js.Any], tagBuilder = tagBuilder.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlMatchType = urlMatchType.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlMatchConfig]
    }
    
    extension [Self <: UrlMatchConfig](x: Self) {
      
      inline def setDecodePercentEncoding(value: Boolean): Self = StObject.set(x, "decodePercentEncoding", value.asInstanceOf[js.Any])
      
      inline def setProtocolRelativeMatch(value: Boolean): Self = StObject.set(x, "protocolRelativeMatch", value.asInstanceOf[js.Any])
      
      inline def setStripPrefix(value: RequiredStripPrefixConfig): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripTrailingSlash(value: Boolean): Self = StObject.set(x, "stripTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlMatchType(value: UrlMatchType): Self = StObject.set(x, "urlMatchType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.autolinker.autolinkerStrings.scheme
    - typingsJapgolly.autolinker.autolinkerStrings.tld
    - typingsJapgolly.autolinker.autolinkerStrings.ipV4
  */
  trait UrlMatchType extends StObject
  object UrlMatchType {
    
    inline def ipV4: typingsJapgolly.autolinker.autolinkerStrings.ipV4 = "ipV4".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.ipV4]
    
    inline def scheme: typingsJapgolly.autolinker.autolinkerStrings.scheme = "scheme".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.scheme]
    
    inline def tld: typingsJapgolly.autolinker.autolinkerStrings.tld = "tld".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.tld]
  }
}
