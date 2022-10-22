package typingsJapgolly.commonTags

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.commonTags.anon.Conjunction
import typingsJapgolly.commonTags.commonTagsStrings._empty
import typingsJapgolly.commonTags.commonTagsStrings.all
import typingsJapgolly.commonTags.commonTagsStrings.end
import typingsJapgolly.commonTags.commonTagsStrings.initial
import typingsJapgolly.commonTags.commonTagsStrings.left
import typingsJapgolly.commonTags.commonTagsStrings.right
import typingsJapgolly.commonTags.commonTagsStrings.start
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("common-tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("common-tags", "TemplateTag")
  @js.native
  /**
    * New Tag Constructor
    * @deprecated
    */
  open class TemplateTagCls ()
    extends StObject
       with TemplateTag {
    def this(transformers: (PluginFunction | TemplateTransformer[Any])*) = this()
    def this(transformers: js.Array[TemplateTransformer[Any]]) = this()
  }
  
  @JSImport("common-tags", "codeBlock")
  @js.native
  val codeBlock: TemplateTag = js.native
  
  @JSImport("common-tags", "commaLists")
  @js.native
  val commaLists: TemplateTag = js.native
  
  @JSImport("common-tags", "commaListsAnd")
  @js.native
  val commaListsAnd: TemplateTag = js.native
  
  @JSImport("common-tags", "commaListsOr")
  @js.native
  val commaListsOr: TemplateTag = js.native
  
  inline def createTag(): TemplateTag = ^.asInstanceOf[js.Dynamic].applyDynamic("createTag")().asInstanceOf[TemplateTag]
  inline def createTag(transformers: (PluginFunction | TemplateTransformer[Any])*): TemplateTag = ^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(transformers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TemplateTag]
  inline def createTag(transformers: js.Array[TemplateTransformer[Any]]): TemplateTag = ^.asInstanceOf[js.Dynamic].applyDynamic("createTag")(transformers.asInstanceOf[js.Any]).asInstanceOf[TemplateTag]
  
  @JSImport("common-tags", "html")
  @js.native
  val html: TemplateTag = js.native
  
  @JSImport("common-tags", "id")
  @js.native
  val id: TemplateTag = js.native
  
  inline def inlineArrayTransformer(): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineArrayTransformer")().asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def inlineArrayTransformer(opts: Conjunction): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineArrayTransformer")(opts.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  
  @JSImport("common-tags", "inlineLists")
  @js.native
  val inlineLists: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLine")
  @js.native
  val oneLine: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineCommaLists")
  @js.native
  val oneLineCommaLists: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineCommaListsAnd")
  @js.native
  val oneLineCommaListsAnd: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineCommaListsOr")
  @js.native
  val oneLineCommaListsOr: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineInlineLists")
  @js.native
  val oneLineInlineLists: TemplateTag = js.native
  
  @JSImport("common-tags", "oneLineTrim")
  @js.native
  val oneLineTrim: TemplateTag = js.native
  
  inline def replaceResultTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceResultTransformer(replaceWhat: String, replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceResultTransformer(replaceWhat: js.RegExp, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceResultTransformer(
    replaceWhat: js.RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]
  ): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceResultTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  
  inline def replaceStringTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceStringTransformer(replaceWhat: String, replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceStringTransformer(replaceWhat: js.RegExp, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceStringTransformer(
    replaceWhat: js.RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]
  ): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStringTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  
  inline def replaceSubstitutionTransformer(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceSubstitutionTransformer(replaceWhat: String, replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceSubstitutionTransformer(replaceWhat: js.RegExp, replaceWith: String): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def replaceSubstitutionTransformer(
    replaceWhat: js.RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ Any, String]
  ): TemplateTransformer[StringDictionary[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceSubstitutionTransformer")(replaceWhat.asInstanceOf[js.Any], replaceWith.asInstanceOf[js.Any])).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  
  @JSImport("common-tags", "safeHtml")
  @js.native
  val safeHtml: TemplateTag = js.native
  
  @JSImport("common-tags", "source")
  @js.native
  val source: TemplateTag = js.native
  
  inline def splitStringTransformer(splitBy: String): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitStringTransformer")(splitBy.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  
  @JSImport("common-tags", "stripIndent")
  @js.native
  val stripIndent: TemplateTag = js.native
  
  inline def stripIndentTransformer(): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndentTransformer")().asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def stripIndentTransformer(`type`: initial | all): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripIndentTransformer")(`type`.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  
  @JSImport("common-tags", "stripIndents")
  @js.native
  val stripIndents: TemplateTag = js.native
  
  inline def trimResultTransformer(): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimResultTransformer")().asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  inline def trimResultTransformer(side: start | end | left | right | _empty): TemplateTransformer[StringDictionary[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimResultTransformer")(side.asInstanceOf[js.Any]).asInstanceOf[TemplateTransformer[StringDictionary[Any]]]
  
  @js.native
  trait JSTag extends StObject {
    
    def apply(literals: TemplateStringsArray, placeholders: Any*): String = js.native
  }
  
  type PluginFunction = js.Function2[/* oldValue */ String, /* newValue */ String, TemplateTransformer[Any]]
  
  @js.native
  trait TemplateTag extends StObject {
    
    def apply(literals: TemplateStringsArray, placeholders: Any*): String = js.native
    def apply(str: String): String = js.native
    def apply(tag: JSTag): TemplateTag = js.native
  }
  
  trait TemplateTransformer[TCtx] extends StObject {
    
    /**
      * Called before everything else.
      * The result of this hook will be passed to other hooks as `context`.
      * If omitted, `context` will be an empty object.
      */
    var getInitialContext: js.UndefOr[js.Function0[TCtx]] = js.undefined
    
    /**
      * Called when all substitutions have been parsed
      * `endResult` is the final value.
      */
    var onEndResult: js.UndefOr[js.Function2[/* endResult */ String, /* context */ TCtx, String]] = js.undefined
    
    /**
      * Called when the tag encounters a string.
      * (a string is whatever's not inside "${}" in your template literal)
      * `str` is the value of the current string
      */
    var onString: js.UndefOr[js.Function2[/* str */ String, /* context */ TCtx, String]] = js.undefined
    
    /**
      * Called when the tag encounters a substitution.
      * (a substitution is whatever's inside "${}" in your template literal)
      * `substitution` is the value of the current substitution
      * `resultSoFar` is the end result up to the point of this substitution
      */
    var onSubstitution: js.UndefOr[
        js.Function3[/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx, String]
      ] = js.undefined
  }
  object TemplateTransformer {
    
    inline def apply[TCtx](): TemplateTransformer[TCtx] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateTransformer[TCtx]]
    }
    
    extension [Self <: TemplateTransformer[?], TCtx](x: Self & TemplateTransformer[TCtx]) {
      
      inline def setGetInitialContext(value: CallbackTo[TCtx]): Self = StObject.set(x, "getInitialContext", value.toJsFn)
      
      inline def setGetInitialContextUndefined: Self = StObject.set(x, "getInitialContext", js.undefined)
      
      inline def setOnEndResult(value: (/* endResult */ String, /* context */ TCtx) => String): Self = StObject.set(x, "onEndResult", js.Any.fromFunction2(value))
      
      inline def setOnEndResultUndefined: Self = StObject.set(x, "onEndResult", js.undefined)
      
      inline def setOnString(value: (/* str */ String, /* context */ TCtx) => String): Self = StObject.set(x, "onString", js.Any.fromFunction2(value))
      
      inline def setOnStringUndefined: Self = StObject.set(x, "onString", js.undefined)
      
      inline def setOnSubstitution(value: (/* substitution */ String, /* resultSoFar */ String, /* context */ TCtx) => String): Self = StObject.set(x, "onSubstitution", js.Any.fromFunction3(value))
      
      inline def setOnSubstitutionUndefined: Self = StObject.set(x, "onSubstitution", js.undefined)
    }
  }
}
