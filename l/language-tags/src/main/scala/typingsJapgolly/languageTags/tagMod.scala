package typingsJapgolly.languageTags

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.languageTags.languageTagsStrings.grandfathered
import typingsJapgolly.languageTags.languageTagsStrings.redundant
import typingsJapgolly.languageTags.languageTagsStrings.tag
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_DEPRECATED
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_DUPLICATE_VARIANT
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_EXTLANG
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_LANGUAGE
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_REGION
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_SCRIPT
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_NO_LANGUAGE
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_SUBTAG_DEPRECATED
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_SUPPRESS_SCRIPT
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_TOO_LONG
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_UNKNOWN
import typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_WRONG_ORDER
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("language-tags/Tag", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Tag {
    
    /**
      * For grandfathered or redundant tags, returns a date string reflecting the date the tag was added to the registry.
      */
    /* CompleteClass */
    override def added(): String = js.native
    
    /**
      * For grandfathered or redundant tags, returns a date string reflecting the deprecation date if the tag is
      * deprecated.
      *
      * ```
      * > tags('zh-cmn-Hant').deprecated();
      * '2009-07-29'
      * ```
      */
    /* CompleteClass */
    override def deprecated(): String | Null = js.native
    
    /**
      * Returns an array of tag descriptions for grandfathered or redundant tags, otherwise returns an empty array.
      */
    /* CompleteClass */
    override def descriptions(): js.Array[String] = js.native
    
    /**
      * Returns an array of `Error` objects if the tag is invalid. The `message` property of each is readable and helpful
      * enough for UI output. The `code` property can be checked against the `Tag.ERR_*` constants. Each error will also
      * have either a `subtag` or `tag` property with the code of the offending tag.
      */
    /* CompleteClass */
    override def errors(): js.Array[LanguageTagsError] = js.native
    
    /**
      * Find a subtag of the given type from those making up the tag.
      */
    /* CompleteClass */
    override def find(`type`: String): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^] = js.native
    
    /**
      * Format a tag according to the case conventions defined in
      * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
      *
      * ```
      * > tags('en-gb').format();
      * 'en-GB'
      * ```
      */
    /* CompleteClass */
    override def format(): String = js.native
    
    /**
      * Shortcut for `tag.find('language')`.
      */
    /* CompleteClass */
    override def language(): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^] = js.native
    
    /**
      * If the tag is listed as 'deprecated' or 'redundant' it might have a preferred value. This method returns a `Tag`
      * object if so.
      *
      * ```
      * > tags('zh-cmn-Hant').preferred();
      * Tag
      * ```
      */
    /* CompleteClass */
    override def preferred(): Tag = js.native
    
    /**
      * Shortcut for `tag.find('region')`.
      */
    /* CompleteClass */
    override def region(): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^] = js.native
    
    /**
      * Shortcut for `tag.find('script')`.
      */
    /* CompleteClass */
    override def script(): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^] = js.native
    
    /**
      * Returns an array of subtags making up the tag, as `Subtag` objects.
      */
    /* CompleteClass */
    override def subtags(): js.Array[typingsJapgolly.languageTags.subtagMod.^] = js.native
    
    /**
      * Returns `grandfathered` if the tag is grandfathered, `redundant` if the tag is redundant, and `tag` if neither.
      * For a definition of grandfathered and redundant tags, see
      * [RFC 5646 section 2.2.8](http://tools.ietf.org/html/rfc5646#section-2.2.8).
      */
    /* CompleteClass */
    override def `type`(): grandfathered | redundant | tag = js.native
    
    /**
      * Returns `true` if the tag is valid, `false` otherwise.
      */
    /* CompleteClass */
    override def valid(): Boolean = js.native
  }
  @JSImport("language-tags/Tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_DEPRECATED")
  @js.native
  def ERR_DEPRECATED: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_DEPRECATED = js.native
  inline def ERR_DEPRECATED_=(x: ERR_DEPRECATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_DEPRECATED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_DUPLICATE_VARIANT")
  @js.native
  def ERR_DUPLICATE_VARIANT: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_DUPLICATE_VARIANT = js.native
  inline def ERR_DUPLICATE_VARIANT_=(x: ERR_DUPLICATE_VARIANT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_DUPLICATE_VARIANT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_EXTLANG")
  @js.native
  def ERR_EXTRA_EXTLANG: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_EXTLANG = js.native
  inline def ERR_EXTRA_EXTLANG_=(x: ERR_EXTRA_EXTLANG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_EXTLANG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_LANGUAGE")
  @js.native
  def ERR_EXTRA_LANGUAGE: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_LANGUAGE = js.native
  inline def ERR_EXTRA_LANGUAGE_=(x: ERR_EXTRA_LANGUAGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_LANGUAGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_REGION")
  @js.native
  def ERR_EXTRA_REGION: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_REGION = js.native
  inline def ERR_EXTRA_REGION_=(x: ERR_EXTRA_REGION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_REGION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_EXTRA_SCRIPT")
  @js.native
  def ERR_EXTRA_SCRIPT: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_EXTRA_SCRIPT = js.native
  inline def ERR_EXTRA_SCRIPT_=(x: ERR_EXTRA_SCRIPT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_EXTRA_SCRIPT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_NO_LANGUAGE")
  @js.native
  def ERR_NO_LANGUAGE: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_NO_LANGUAGE = js.native
  inline def ERR_NO_LANGUAGE_=(x: ERR_NO_LANGUAGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_NO_LANGUAGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_SUBTAG_DEPRECATED")
  @js.native
  def ERR_SUBTAG_DEPRECATED: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_SUBTAG_DEPRECATED = js.native
  inline def ERR_SUBTAG_DEPRECATED_=(x: ERR_SUBTAG_DEPRECATED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_SUBTAG_DEPRECATED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_SUPPRESS_SCRIPT")
  @js.native
  def ERR_SUPPRESS_SCRIPT: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_SUPPRESS_SCRIPT = js.native
  inline def ERR_SUPPRESS_SCRIPT_=(x: ERR_SUPPRESS_SCRIPT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_SUPPRESS_SCRIPT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_TOO_LONG")
  @js.native
  def ERR_TOO_LONG: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_TOO_LONG = js.native
  inline def ERR_TOO_LONG_=(x: ERR_TOO_LONG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_TOO_LONG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_UNKNOWN")
  @js.native
  def ERR_UNKNOWN: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_UNKNOWN = js.native
  inline def ERR_UNKNOWN_=(x: ERR_UNKNOWN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_UNKNOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("language-tags/Tag", "ERR_WRONG_ORDER")
  @js.native
  def ERR_WRONG_ORDER: typingsJapgolly.languageTags.tagMod.ErrorCode.ERR_WRONG_ORDER = js.native
  inline def ERR_WRONG_ORDER_=(x: ERR_WRONG_ORDER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERR_WRONG_ORDER")(x.asInstanceOf[js.Any])
  
  @js.native
  sealed trait ErrorCode extends StObject
  // These are really static integers assigned to Tag.
  @JSImport("language-tags/Tag", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @js.native
    sealed trait ERR_DEPRECATED
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_DUPLICATE_VARIANT
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_EXTLANG
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_LANGUAGE
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_REGION
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_EXTRA_SCRIPT
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_NO_LANGUAGE
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_SUBTAG_DEPRECATED
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_SUPPRESS_SCRIPT
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_TOO_LONG
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_UNKNOWN
      extends StObject
         with ErrorCode
    
    @js.native
    sealed trait ERR_WRONG_ORDER
      extends StObject
         with ErrorCode
  }
  
  // This class isn’t exposed. It’s an error instance that has additional properties.
  trait LanguageTagsError
    extends StObject
       with Error {
    
    var code: ErrorCode
    
    var subtag: typingsJapgolly.languageTags.subtagMod.^
    
    var tag: Tag
  }
  object LanguageTagsError {
    
    inline def apply(
      code: ErrorCode,
      message: String,
      name: String,
      subtag: typingsJapgolly.languageTags.subtagMod.^,
      tag: Tag
    ): LanguageTagsError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtag = subtag.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageTagsError]
    }
    
    extension [Self <: LanguageTagsError](x: Self) {
      
      inline def setCode(value: ErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setSubtag(value: typingsJapgolly.languageTags.subtagMod.^): Self = StObject.set(x, "subtag", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    /**
      * For grandfathered or redundant tags, returns a date string reflecting the date the tag was added to the registry.
      */
    def added(): String
    
    /**
      * For grandfathered or redundant tags, returns a date string reflecting the deprecation date if the tag is
      * deprecated.
      *
      * ```
      * > tags('zh-cmn-Hant').deprecated();
      * '2009-07-29'
      * ```
      */
    def deprecated(): String | Null
    
    /**
      * Returns an array of tag descriptions for grandfathered or redundant tags, otherwise returns an empty array.
      */
    def descriptions(): js.Array[String]
    
    /**
      * Returns an array of `Error` objects if the tag is invalid. The `message` property of each is readable and helpful
      * enough for UI output. The `code` property can be checked against the `Tag.ERR_*` constants. Each error will also
      * have either a `subtag` or `tag` property with the code of the offending tag.
      */
    def errors(): js.Array[LanguageTagsError]
    
    /**
      * Find a subtag of the given type from those making up the tag.
      */
    def find(`type`: String): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]
    
    /**
      * Format a tag according to the case conventions defined in
      * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
      *
      * ```
      * > tags('en-gb').format();
      * 'en-GB'
      * ```
      */
    def format(): String
    
    /**
      * Shortcut for `tag.find('language')`.
      */
    def language(): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]
    
    /**
      * If the tag is listed as 'deprecated' or 'redundant' it might have a preferred value. This method returns a `Tag`
      * object if so.
      *
      * ```
      * > tags('zh-cmn-Hant').preferred();
      * Tag
      * ```
      */
    def preferred(): Tag
    
    /**
      * Shortcut for `tag.find('region')`.
      */
    def region(): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]
    
    /**
      * Shortcut for `tag.find('script')`.
      */
    def script(): js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]
    
    /**
      * Returns an array of subtags making up the tag, as `Subtag` objects.
      */
    def subtags(): js.Array[typingsJapgolly.languageTags.subtagMod.^]
    
    /**
      * Returns `grandfathered` if the tag is grandfathered, `redundant` if the tag is redundant, and `tag` if neither.
      * For a definition of grandfathered and redundant tags, see
      * [RFC 5646 section 2.2.8](http://tools.ietf.org/html/rfc5646#section-2.2.8).
      */
    def `type`(): grandfathered | redundant | tag
    
    /**
      * Returns `true` if the tag is valid, `false` otherwise.
      */
    def valid(): Boolean
  }
  object Tag {
    
    inline def apply(
      added: CallbackTo[String],
      deprecated: CallbackTo[String | Null],
      descriptions: CallbackTo[js.Array[String]],
      errors: CallbackTo[js.Array[LanguageTagsError]],
      find: String => js.UndefOr[typingsJapgolly.languageTags.subtagMod.^],
      format: CallbackTo[String],
      language: CallbackTo[js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]],
      preferred: CallbackTo[Tag],
      region: CallbackTo[js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]],
      script: CallbackTo[js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]],
      subtags: CallbackTo[js.Array[typingsJapgolly.languageTags.subtagMod.^]],
      `type`: CallbackTo[grandfathered | redundant | tag],
      valid: CallbackTo[Boolean]
    ): Tag = {
      val __obj = js.Dynamic.literal(added = added.toJsFn, deprecated = deprecated.toJsFn, descriptions = descriptions.toJsFn, errors = errors.toJsFn, find = js.Any.fromFunction1(find), format = format.toJsFn, language = language.toJsFn, preferred = preferred.toJsFn, region = region.toJsFn, script = script.toJsFn, subtags = subtags.toJsFn, valid = valid.toJsFn)
      __obj.updateDynamic("type")(`type`.toJsFn)
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setAdded(value: CallbackTo[String]): Self = StObject.set(x, "added", value.toJsFn)
      
      inline def setDeprecated(value: CallbackTo[String | Null]): Self = StObject.set(x, "deprecated", value.toJsFn)
      
      inline def setDescriptions(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "descriptions", value.toJsFn)
      
      inline def setErrors(value: CallbackTo[js.Array[LanguageTagsError]]): Self = StObject.set(x, "errors", value.toJsFn)
      
      inline def setFind(value: String => js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setFormat(value: CallbackTo[String]): Self = StObject.set(x, "format", value.toJsFn)
      
      inline def setLanguage(value: CallbackTo[js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]]): Self = StObject.set(x, "language", value.toJsFn)
      
      inline def setPreferred(value: CallbackTo[Tag]): Self = StObject.set(x, "preferred", value.toJsFn)
      
      inline def setRegion(value: CallbackTo[js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setScript(value: CallbackTo[js.UndefOr[typingsJapgolly.languageTags.subtagMod.^]]): Self = StObject.set(x, "script", value.toJsFn)
      
      inline def setSubtags(value: CallbackTo[js.Array[typingsJapgolly.languageTags.subtagMod.^]]): Self = StObject.set(x, "subtags", value.toJsFn)
      
      inline def setType(value: CallbackTo[grandfathered | redundant | tag]): Self = StObject.set(x, "type", value.toJsFn)
      
      inline def setValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "valid", value.toJsFn)
    }
  }
}
