package typingsJapgolly.languageTags

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.languageTags.languageTagsStrings.extlang
import typingsJapgolly.languageTags.languageTagsStrings.language
import typingsJapgolly.languageTags.languageTagsStrings.region
import typingsJapgolly.languageTags.languageTagsStrings.script
import typingsJapgolly.languageTags.languageTagsStrings.variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtagMod {
  
  @JSImport("language-tags/Subtag", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Subtag {
    
    /**
      * Returns a date string reflecting the date the subtag was added to the registry.
      *
      * ```
      * > tags.language('ja').added();
      * '2005-10-16'
      * ```
      */
    /* CompleteClass */
    override def added(): String = js.native
    
    /**
      * Returns an array of comments, if any, otherwise returns an empty array.
      *
      * ```
      * > tags.language('nmf').comments();
      * ['see ntx']
      * ```
      */
    /* CompleteClass */
    override def comments(): js.Array[String] = js.native
    
    /**
      * Returns a date string reflecting the deprecation date if the subtag is deprecated, otherwise returns `null`.
      *
      * ```
      * > tags.language('ja').deprecated();
      * '2008-11-22'
      * ```
      */
    /* CompleteClass */
    override def deprecated(): String | Null = js.native
    
    /**
      * Returns an array of description strings (a subtag may have more than one description).
      *
      * ```
      * > tags.language('ro').descriptions();
      * ['Romanian', 'Moldavian', 'Moldovan']
      * ```
      */
    /* CompleteClass */
    override def descriptions(): js.Array[String] = js.native
    
    /**
      *
      * Return the subtag code formatted according to the case conventions defined in
      * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
      *
      * - language codes are made lowercase ('mn' for Mongolian)
      * - script codes are made lowercase with the initial letter capitalized ('Cyrl' for Cyrillic)
      * - country codes are capitalized ('MN' for Mongolia)
      */
    /* CompleteClass */
    override def format(): String = js.native
    
    /**
      * Returns a preferred subtag as a `Subtag` object if the subtag is deprecated. For example, `ro` is preferred over
      * deprecated `mo`.
      *
      * ```
      * > tags.language('mo').preferred();
      * Subtag
      * ```
      */
    /* CompleteClass */
    override def preferred(): Subtag | Null = js.native
    
    /**
      * Returns the subtag scope as a string, or `null` if the subtag has no scope.
      *
      * Tip: if the subtag represents a macrolanguage, you can use `tags.languages(macrolanguage)` to get a list of all
      * the macrolanguage's individual languages.
      *
      * ```
      * > tags.language('zh').scope();
      * 'macrolanguage'
      * > tags.language('nah').scope();
      * 'collection'
      * ```
      */
    /* CompleteClass */
    override def scope(): String | Null = js.native
    
    /**
      * For subtags of type 'language' or 'extlang', returns a `Subtag` object representing the language's default
      * script. See [RFC 5646 section 3.1.9](http://tools.ietf.org/html/rfc5646#section-3.1.9) for a definition of
      * 'Suppress-Script'.
      */
    /* CompleteClass */
    override def script(): Subtag | Null = js.native
    
    /**
      * Get the subtag type (either 'language', 'extlang', 'script', 'region' or 'variant'). See
      * [RFC 5646 section 2.2](http://tools.ietf.org/html/rfc5646#section-2.2) for type definitions.
      */
    /* CompleteClass */
    override def `type`(): language | extlang | script | region | variant = js.native
  }
  
  trait Subtag extends StObject {
    
    /**
      * Returns a date string reflecting the date the subtag was added to the registry.
      *
      * ```
      * > tags.language('ja').added();
      * '2005-10-16'
      * ```
      */
    def added(): String
    
    /**
      * Returns an array of comments, if any, otherwise returns an empty array.
      *
      * ```
      * > tags.language('nmf').comments();
      * ['see ntx']
      * ```
      */
    def comments(): js.Array[String]
    
    /**
      * Returns a date string reflecting the deprecation date if the subtag is deprecated, otherwise returns `null`.
      *
      * ```
      * > tags.language('ja').deprecated();
      * '2008-11-22'
      * ```
      */
    def deprecated(): String | Null
    
    /**
      * Returns an array of description strings (a subtag may have more than one description).
      *
      * ```
      * > tags.language('ro').descriptions();
      * ['Romanian', 'Moldavian', 'Moldovan']
      * ```
      */
    def descriptions(): js.Array[String]
    
    /**
      *
      * Return the subtag code formatted according to the case conventions defined in
      * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
      *
      * - language codes are made lowercase ('mn' for Mongolian)
      * - script codes are made lowercase with the initial letter capitalized ('Cyrl' for Cyrillic)
      * - country codes are capitalized ('MN' for Mongolia)
      */
    def format(): String
    
    /**
      * Returns a preferred subtag as a `Subtag` object if the subtag is deprecated. For example, `ro` is preferred over
      * deprecated `mo`.
      *
      * ```
      * > tags.language('mo').preferred();
      * Subtag
      * ```
      */
    def preferred(): Subtag | Null
    
    /**
      * Returns the subtag scope as a string, or `null` if the subtag has no scope.
      *
      * Tip: if the subtag represents a macrolanguage, you can use `tags.languages(macrolanguage)` to get a list of all
      * the macrolanguage's individual languages.
      *
      * ```
      * > tags.language('zh').scope();
      * 'macrolanguage'
      * > tags.language('nah').scope();
      * 'collection'
      * ```
      */
    def scope(): String | Null
    
    /**
      * For subtags of type 'language' or 'extlang', returns a `Subtag` object representing the language's default
      * script. See [RFC 5646 section 3.1.9](http://tools.ietf.org/html/rfc5646#section-3.1.9) for a definition of
      * 'Suppress-Script'.
      */
    def script(): Subtag | Null
    
    /**
      * Get the subtag type (either 'language', 'extlang', 'script', 'region' or 'variant'). See
      * [RFC 5646 section 2.2](http://tools.ietf.org/html/rfc5646#section-2.2) for type definitions.
      */
    def `type`(): language | extlang | script | region | variant
  }
  object Subtag {
    
    inline def apply(
      added: CallbackTo[String],
      comments: CallbackTo[js.Array[String]],
      deprecated: CallbackTo[String | Null],
      descriptions: CallbackTo[js.Array[String]],
      format: CallbackTo[String],
      preferred: CallbackTo[Subtag | Null],
      scope: CallbackTo[String | Null],
      script: CallbackTo[Subtag | Null],
      `type`: CallbackTo[language | extlang | script | region | variant]
    ): Subtag = {
      val __obj = js.Dynamic.literal(added = added.toJsFn, comments = comments.toJsFn, deprecated = deprecated.toJsFn, descriptions = descriptions.toJsFn, format = format.toJsFn, preferred = preferred.toJsFn, scope = scope.toJsFn, script = script.toJsFn)
      __obj.updateDynamic("type")(`type`.toJsFn)
      __obj.asInstanceOf[Subtag]
    }
    
    extension [Self <: Subtag](x: Self) {
      
      inline def setAdded(value: CallbackTo[String]): Self = StObject.set(x, "added", value.toJsFn)
      
      inline def setComments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "comments", value.toJsFn)
      
      inline def setDeprecated(value: CallbackTo[String | Null]): Self = StObject.set(x, "deprecated", value.toJsFn)
      
      inline def setDescriptions(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "descriptions", value.toJsFn)
      
      inline def setFormat(value: CallbackTo[String]): Self = StObject.set(x, "format", value.toJsFn)
      
      inline def setPreferred(value: CallbackTo[Subtag | Null]): Self = StObject.set(x, "preferred", value.toJsFn)
      
      inline def setScope(value: CallbackTo[String | Null]): Self = StObject.set(x, "scope", value.toJsFn)
      
      inline def setScript(value: CallbackTo[Subtag | Null]): Self = StObject.set(x, "script", value.toJsFn)
      
      inline def setType(value: CallbackTo[language | extlang | script | region | variant]): Self = StObject.set(x, "type", value.toJsFn)
    }
  }
}
