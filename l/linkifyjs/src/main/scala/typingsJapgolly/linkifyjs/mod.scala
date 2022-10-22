package typingsJapgolly.linkifyjs

import typingsJapgolly.linkifyjs.anon.PartialRecordLinkEntityTy
import typingsJapgolly.linkifyjs.anon.PartialRecordLinkEntityTyEmail
import typingsJapgolly.linkifyjs.anon.PartialRecordLinkEntityTyHashtag
import typingsJapgolly.linkifyjs.anon.PartialRecordLinkEntityTyMention
import typingsJapgolly.linkifyjs.anon.PartialRecordLinkEntityTyUrl
import typingsJapgolly.linkifyjs.anon.VArray
import typingsJapgolly.linkifyjs.linkifyjsStrings.ftp
import typingsJapgolly.linkifyjs.linkifyjsStrings.ftps
import typingsJapgolly.linkifyjs.linkifyjsStrings.http
import typingsJapgolly.linkifyjs.linkifyjsStrings.https
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkifyjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(str: String): js.Array[FindResultHash] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[FindResultHash]]
  inline def find(str: String, `type`: LinkEntityType): js.Array[FindResultHash] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(str.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[FindResultHash]]
  
  inline def test(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def test(str: String, `type`: LinkEntityType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(str.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def tokenize(str: String): js.Array[VArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[VArray]]
  
  trait FindResultHash extends StObject {
    
    /**
      * Should be the value of this links `href` attribute.
      */
    var href: String
    
    /**
      * The type of entity found.
      */
    var `type`: LinkEntityType
    
    /**
      * The original entity substring.
      */
    var value: String
  }
  object FindResultHash {
    
    inline def apply(href: String, `type`: LinkEntityType, value: String): FindResultHash = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResultHash]
    }
    
    extension [Self <: FindResultHash](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setType(value: LinkEntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.linkifyjs.linkifyjsStrings.url
    - typingsJapgolly.linkifyjs.linkifyjsStrings.email
    - typingsJapgolly.linkifyjs.linkifyjsStrings.hashtag
    - typingsJapgolly.linkifyjs.linkifyjsStrings.mention
  */
  trait LinkEntityType extends StObject
  object LinkEntityType {
    
    inline def email: typingsJapgolly.linkifyjs.linkifyjsStrings.email = "email".asInstanceOf[typingsJapgolly.linkifyjs.linkifyjsStrings.email]
    
    inline def hashtag: typingsJapgolly.linkifyjs.linkifyjsStrings.hashtag = "hashtag".asInstanceOf[typingsJapgolly.linkifyjs.linkifyjsStrings.hashtag]
    
    inline def mention: typingsJapgolly.linkifyjs.linkifyjsStrings.mention = "mention".asInstanceOf[typingsJapgolly.linkifyjs.linkifyjsStrings.mention]
    
    inline def url: typingsJapgolly.linkifyjs.linkifyjsStrings.url = "url".asInstanceOf[typingsJapgolly.linkifyjs.linkifyjsStrings.url]
  }
  
  trait Options extends StObject {
    
    /**
      * Object of attributes to add to each new link. Note: the class and target
      * attributes have dedicated options.
      *
      * Also accepts a function that takes the unformatted href, the link type
      * (e.g., 'url', 'email', etc.) and returns the object.
      *
      * @default null
      */
    var attributes: js.UndefOr[
        (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]]) | Null
      ] = js.undefined
    
    /**
      * class attribute to use for newly created links.
      *
      * Accepts a function that takes the unformatted href value and link type
      * (e.g., 'url', 'email', etc.) and returns the string.
      *
      * Accepts an object where each key is the link type and each value is the
      * string or function to use for that type.
      */
    var className: js.UndefOr[
        String | PartialRecordLinkEntityTy | (js.Function2[/* href */ String, /* type */ LinkEntityType, String])
      ] = js.undefined
    
    /**
      * Protocol that should be used in href attributes for URLs without a
      * protocol (e.g., github.com).
      *
      * @default 'http'
      */
    var defaultProtocol: js.UndefOr[http | https | ftp | ftps | String] = js.undefined
    
    /**
      * Format the text displayed by a linkified entity. e.g., truncate a long URL.
      *
      * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
      * and each value is the formatting function to use for that type.
      *
      * @default null
      */
    var format: js.UndefOr[
        (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail | Null
      ] = js.undefined
    
    /**
      * Similar to format, except the result of this function will be used as the
      * href attribute of the new link.
      *
      * This is useful when finding hashtags, where you don’t necessarily
      * want the default to be a link to a named anchor.
      *
      * Accepts an object where each key is the link type (e.g., 'url', 'email', etc.),
      * and each value is the formatting function to use for that type.
      *
      * @default null
      */
    var formatHref: js.UndefOr[
        (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail | Null
      ] = js.undefined
    
    /**
      * If `true`, \n line breaks will automatically be converted to `<br>` tags.
      *
      * @default false
      */
    var nl2br: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The tag name to use for each link.
      * For cases where you can’t use anchor tags.
      *
      * Accepts a function that takes the unformatted href,
      * the link type (e.g., 'url', 'email', etc.) and returns the tag name.
      *
      * Accepts an object where each key is the link type,
      * and each value is the tag name to use for that type.
      *
      * @default a
      */
    var tagName: js.UndefOr[
        String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag
      ] = js.undefined
    
    /**
      * target attribute for generated link.
      *
      * Accepts a function that takes the unformatted href,
      * the link type (e.g., 'url', 'email', etc.) and returns the target
      *
      * Accepts an object where each key is the link type,
      * and each value is the target to use for that type.
      *
      * @default { url: '_blank' }
      */
    var target: js.UndefOr[
        String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyMention
      ] = js.undefined
    
    /**
      * validate
      * - Type: Boolean | Function (String value, String type) | Object
      * - Default: null
      *
      * If option resolves to false, the given value will not show up as a link.
      *
      * Accepts a function that takes a discovered link,
      * and the link type (e.g., 'url', 'email', etc.),
      * and returns true if the link should be converted into an anchor tag,
      * and false otherwise.
      *
      * Accepts an object where each key is the link type and each value is the
      * the validation option to use for that type
      *
      * @default null
      */
    var validate: js.UndefOr[
        Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | PartialRecordLinkEntityTyUrl | Null
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributes(
        value: (Record[String, String]) | (js.Function2[/* href */ String, /* type */ LinkEntityType, Record[String, String]])
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesFunction2(value: (/* href */ String, /* type */ LinkEntityType) => Record[String, String]): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
      
      inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setClassName(
        value: String | PartialRecordLinkEntityTy | (js.Function2[/* href */ String, /* type */ LinkEntityType, String])
      ): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "className", js.Any.fromFunction2(value))
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultProtocol(value: http | https | ftp | ftps | String): Self = StObject.set(x, "defaultProtocol", value.asInstanceOf[js.Any])
      
      inline def setDefaultProtocolUndefined: Self = StObject.set(x, "defaultProtocol", js.undefined)
      
      inline def setFormat(
        value: (js.Function2[/* value */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction2(value: (/* value */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatHref(
        value: (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyEmail
      ): Self = StObject.set(x, "formatHref", value.asInstanceOf[js.Any])
      
      inline def setFormatHrefFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "formatHref", js.Any.fromFunction2(value))
      
      inline def setFormatHrefNull: Self = StObject.set(x, "formatHref", null)
      
      inline def setFormatHrefUndefined: Self = StObject.set(x, "formatHref", js.undefined)
      
      inline def setFormatNull: Self = StObject.set(x, "format", null)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setNl2br(value: Boolean): Self = StObject.set(x, "nl2br", value.asInstanceOf[js.Any])
      
      inline def setNl2brUndefined: Self = StObject.set(x, "nl2br", js.undefined)
      
      inline def setTagName(
        value: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyHashtag
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "tagName", js.Any.fromFunction2(value))
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTarget(
        value: String | (js.Function2[/* href */ String, /* type */ LinkEntityType, String]) | PartialRecordLinkEntityTyMention
      ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction2(value: (/* href */ String, /* type */ LinkEntityType) => String): Self = StObject.set(x, "target", js.Any.fromFunction2(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setValidate(
        value: Boolean | (js.Function2[/* href */ String, /* type */ LinkEntityType, Boolean]) | PartialRecordLinkEntityTyUrl
      ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction2(value: (/* href */ String, /* type */ LinkEntityType) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidateNull: Self = StObject.set(x, "validate", null)
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
