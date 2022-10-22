package typingsJapgolly.cliHighlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemeMod {
  
  @JSImport("cli-highlight/dist/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cli-highlight/dist/theme", "DEFAULT_THEME")
  @js.native
  val DEFAULT_THEME: Theme = js.native
  
  inline def fromJson(json: JsonTheme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(json.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def parse(json: String): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def plain(codePart: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("plain")(codePart.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringify(theme: Theme): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(theme.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toJson(theme: Theme): JsonTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(theme.asInstanceOf[js.Any]).asInstanceOf[JsonTheme]
  
  type JsonTheme = Tokens[Style | js.Array[Style]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cliHighlight.cliHighlightStrings.reset
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bold
    - typingsJapgolly.cliHighlight.cliHighlightStrings.dim
    - typingsJapgolly.cliHighlight.cliHighlightStrings.italic
    - typingsJapgolly.cliHighlight.cliHighlightStrings.underline
    - typingsJapgolly.cliHighlight.cliHighlightStrings.inverse
    - typingsJapgolly.cliHighlight.cliHighlightStrings.hidden
    - typingsJapgolly.cliHighlight.cliHighlightStrings.strikethrough
    - typingsJapgolly.cliHighlight.cliHighlightStrings.black
    - typingsJapgolly.cliHighlight.cliHighlightStrings.red
    - typingsJapgolly.cliHighlight.cliHighlightStrings.green
    - typingsJapgolly.cliHighlight.cliHighlightStrings.yellow
    - typingsJapgolly.cliHighlight.cliHighlightStrings.blue
    - typingsJapgolly.cliHighlight.cliHighlightStrings.magenta
    - typingsJapgolly.cliHighlight.cliHighlightStrings.cyan
    - typingsJapgolly.cliHighlight.cliHighlightStrings.white
    - typingsJapgolly.cliHighlight.cliHighlightStrings.gray
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bgBlack
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bgRed
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bgGreen
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bgYellow
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bgBlue
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bgMagenta
    - typingsJapgolly.cliHighlight.cliHighlightStrings.bgCyan
    - typingsJapgolly.cliHighlight.cliHighlightStrings.plain
  */
  trait Style extends StObject
  object Style {
    
    inline def bgBlack: typingsJapgolly.cliHighlight.cliHighlightStrings.bgBlack = "bgBlack".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bgBlack]
    
    inline def bgBlue: typingsJapgolly.cliHighlight.cliHighlightStrings.bgBlue = "bgBlue".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bgBlue]
    
    inline def bgCyan: typingsJapgolly.cliHighlight.cliHighlightStrings.bgCyan = "bgCyan".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bgCyan]
    
    inline def bgGreen: typingsJapgolly.cliHighlight.cliHighlightStrings.bgGreen = "bgGreen".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bgGreen]
    
    inline def bgMagenta: typingsJapgolly.cliHighlight.cliHighlightStrings.bgMagenta = "bgMagenta".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bgMagenta]
    
    inline def bgRed: typingsJapgolly.cliHighlight.cliHighlightStrings.bgRed = "bgRed".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bgRed]
    
    inline def bgYellow: typingsJapgolly.cliHighlight.cliHighlightStrings.bgYellow = "bgYellow".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bgYellow]
    
    inline def black: typingsJapgolly.cliHighlight.cliHighlightStrings.black = "black".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.black]
    
    inline def blue: typingsJapgolly.cliHighlight.cliHighlightStrings.blue = "blue".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.blue]
    
    inline def bold: typingsJapgolly.cliHighlight.cliHighlightStrings.bold = "bold".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.bold]
    
    inline def cyan: typingsJapgolly.cliHighlight.cliHighlightStrings.cyan = "cyan".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.cyan]
    
    inline def dim: typingsJapgolly.cliHighlight.cliHighlightStrings.dim = "dim".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.dim]
    
    inline def gray: typingsJapgolly.cliHighlight.cliHighlightStrings.gray = "gray".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.gray]
    
    inline def green: typingsJapgolly.cliHighlight.cliHighlightStrings.green = "green".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.green]
    
    inline def hidden: typingsJapgolly.cliHighlight.cliHighlightStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.hidden]
    
    inline def inverse: typingsJapgolly.cliHighlight.cliHighlightStrings.inverse = "inverse".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.inverse]
    
    inline def italic: typingsJapgolly.cliHighlight.cliHighlightStrings.italic = "italic".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.italic]
    
    inline def magenta: typingsJapgolly.cliHighlight.cliHighlightStrings.magenta = "magenta".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.magenta]
    
    inline def plain: typingsJapgolly.cliHighlight.cliHighlightStrings.plain = "plain".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.plain]
    
    inline def red: typingsJapgolly.cliHighlight.cliHighlightStrings.red = "red".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.red]
    
    inline def reset: typingsJapgolly.cliHighlight.cliHighlightStrings.reset = "reset".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.reset]
    
    inline def strikethrough: typingsJapgolly.cliHighlight.cliHighlightStrings.strikethrough = "strikethrough".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.strikethrough]
    
    inline def underline: typingsJapgolly.cliHighlight.cliHighlightStrings.underline = "underline".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.underline]
    
    inline def white: typingsJapgolly.cliHighlight.cliHighlightStrings.white = "white".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.white]
    
    inline def yellow: typingsJapgolly.cliHighlight.cliHighlightStrings.yellow = "yellow".asInstanceOf[typingsJapgolly.cliHighlight.cliHighlightStrings.yellow]
  }
  
  trait Theme
    extends StObject
       with Tokens[js.Function1[/* codePart */ String, String]] {
    
    /**
      * things not matched by any token
      */
    var default: js.UndefOr[js.Function1[/* codePart */ String, String]] = js.undefined
  }
  object Theme {
    
    inline def apply(): Theme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setDefault(value: /* codePart */ String => String): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  trait Tokens[T] extends StObject {
    
    /**
      * added or changed line in a diff
      */
    var addition: js.UndefOr[T] = js.undefined
    
    /**
      * name of an attribute with no language defined semantics (keys in JSON, setting names in .ini), also sub-attribute within another highlighted object, like XML tag
      */
    var attr: js.UndefOr[T] = js.undefined
    
    /**
      * name of an attribute followed by a structured value part, like CSS properties
      */
    var attribute: js.UndefOr[T] = js.undefined
    
    /**
      * built-in or library object (constant, class, function)
      */
    var built_in: js.UndefOr[T] = js.undefined
    
    /**
      * s-expression name from the language standard library
      */
    var `builtin-name`: js.UndefOr[T] = js.undefined
    
    /**
      * list item bullet in text markup
      */
    var bullet: js.UndefOr[T] = js.undefined
    
    /**
      * class or class-level declaration (interfaces, traits, modules, etc)
      */
    var `class`: js.UndefOr[T] = js.undefined
    
    /**
      * code block in text markup
      */
    var code: js.UndefOr[T] = js.undefined
    
    /**
      * comment
      */
    var comment: js.UndefOr[T] = js.undefined
    
    /**
      * deleted line in a diff
      */
    var deletion: js.UndefOr[T] = js.undefined
    
    /**
      * documentation markup within comments
      */
    var doctag: js.UndefOr[T] = js.undefined
    
    /**
      * emphasis in text markup
      */
    var emphasis: js.UndefOr[T] = js.undefined
    
    /**
      * mathematical formula in text markup
      */
    var formula: js.UndefOr[T] = js.undefined
    
    /**
      * function or method declaration
      */
    var function: js.UndefOr[T] = js.undefined
    
    /**
      * keyword in a regular Algol-style language
      */
    var keyword: js.UndefOr[T] = js.undefined
    
    /**
      * hyperlink in text markup
      */
    var link: js.UndefOr[T] = js.undefined
    
    /**
      * special identifier for a built-in value ("true", "false", "null")
      */
    var literal: js.UndefOr[T] = js.undefined
    
    /**
      * flags, modifiers, annotations, processing instructions, preprocessor directive, etc
      */
    var meta: js.UndefOr[T] = js.undefined
    
    /**
      * keyword or built-in within meta construct
      */
    var `meta-keyword`: js.UndefOr[T] = js.undefined
    
    /**
      * string within meta construct
      */
    var `meta-string`: js.UndefOr[T] = js.undefined
    
    /**
      * name of an XML tag, the first word in an s-expression
      */
    var name: js.UndefOr[T] = js.undefined
    
    /**
      * number, including units and modifiers, if any.
      */
    var number: js.UndefOr[T] = js.undefined
    
    /**
      * block of function arguments (parameters) at the place of declaration
      */
    var params: js.UndefOr[T] = js.undefined
    
    /**
      * quotation in text markup
      */
    var quote: js.UndefOr[T] = js.undefined
    
    /**
      * literal regular expression
      */
    var regexp: js.UndefOr[T] = js.undefined
    
    /**
      * heading of a section in a config file, heading in text markup
      */
    var section: js.UndefOr[T] = js.undefined
    
    /**
      * [attr] selector in CSS
      */
    var `selector-attr`: js.UndefOr[T] = js.undefined
    
    /**
      * .class selector in CSS
      */
    var `selector-class`: js.UndefOr[T] = js.undefined
    
    /**
      * #id selector in CSS
      */
    var `selector-id`: js.UndefOr[T] = js.undefined
    
    /**
      * :pseudo selector in CSS
      */
    var `selector-pseudo`: js.UndefOr[T] = js.undefined
    
    /**
      * tag selector in CSS
      */
    var `selector-tag`: js.UndefOr[T] = js.undefined
    
    /**
      * literal string, character
      */
    var string: js.UndefOr[T] = js.undefined
    
    /**
      * strong emphasis in text markup
      */
    var strong: js.UndefOr[T] = js.undefined
    
    /**
      * parsed section inside a literal string
      */
    var subst: js.UndefOr[T] = js.undefined
    
    /**
      * symbolic constant, interned string, goto label
      */
    var symbol: js.UndefOr[T] = js.undefined
    
    /**
      * XML/HTML tag
      */
    var tag: js.UndefOr[T] = js.undefined
    
    /**
      * tag of a template language
      */
    var `template-tag`: js.UndefOr[T] = js.undefined
    
    /**
      * variable in a template language
      */
    var `template-variable`: js.UndefOr[T] = js.undefined
    
    /**
      * name of a class or a function at the place of declaration
      */
    var title: js.UndefOr[T] = js.undefined
    
    /**
      * user-defined type in a language with first-class syntactically significant types, like Haskell
      */
    var `type`: js.UndefOr[T] = js.undefined
    
    /**
      * variable in a config or a template file, environment var expansion in a script
      */
    var variable: js.UndefOr[T] = js.undefined
  }
  object Tokens {
    
    inline def apply[T](): Tokens[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tokens[T]]
    }
    
    extension [Self <: Tokens[?], T](x: Self & Tokens[T]) {
      
      inline def setAddition(value: T): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
      
      inline def setAdditionUndefined: Self = StObject.set(x, "addition", js.undefined)
      
      inline def setAttr(value: T): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
      
      inline def setAttribute(value: T): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setBuilt_in(value: T): Self = StObject.set(x, "built_in", value.asInstanceOf[js.Any])
      
      inline def setBuilt_inUndefined: Self = StObject.set(x, "built_in", js.undefined)
      
      inline def `setBuiltin-name`(value: T): Self = StObject.set(x, "builtin-name", value.asInstanceOf[js.Any])
      
      inline def `setBuiltin-nameUndefined`: Self = StObject.set(x, "builtin-name", js.undefined)
      
      inline def setBullet(value: T): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setClass(value: T): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCode(value: T): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setComment(value: T): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDeletion(value: T): Self = StObject.set(x, "deletion", value.asInstanceOf[js.Any])
      
      inline def setDeletionUndefined: Self = StObject.set(x, "deletion", js.undefined)
      
      inline def setDoctag(value: T): Self = StObject.set(x, "doctag", value.asInstanceOf[js.Any])
      
      inline def setDoctagUndefined: Self = StObject.set(x, "doctag", js.undefined)
      
      inline def setEmphasis(value: T): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
      
      inline def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
      
      inline def setFormula(value: T): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
      
      inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
      
      inline def setFunction(value: T): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setKeyword(value: T): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setLink(value: T): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLiteral(value: T): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
      
      inline def setMeta(value: T): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def `setMeta-keyword`(value: T): Self = StObject.set(x, "meta-keyword", value.asInstanceOf[js.Any])
      
      inline def `setMeta-keywordUndefined`: Self = StObject.set(x, "meta-keyword", js.undefined)
      
      inline def `setMeta-string`(value: T): Self = StObject.set(x, "meta-string", value.asInstanceOf[js.Any])
      
      inline def `setMeta-stringUndefined`: Self = StObject.set(x, "meta-string", js.undefined)
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNumber(value: T): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setQuote(value: T): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setRegexp(value: T): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      inline def setSection(value: T): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
      
      inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
      
      inline def `setSelector-attr`(value: T): Self = StObject.set(x, "selector-attr", value.asInstanceOf[js.Any])
      
      inline def `setSelector-attrUndefined`: Self = StObject.set(x, "selector-attr", js.undefined)
      
      inline def `setSelector-class`(value: T): Self = StObject.set(x, "selector-class", value.asInstanceOf[js.Any])
      
      inline def `setSelector-classUndefined`: Self = StObject.set(x, "selector-class", js.undefined)
      
      inline def `setSelector-id`(value: T): Self = StObject.set(x, "selector-id", value.asInstanceOf[js.Any])
      
      inline def `setSelector-idUndefined`: Self = StObject.set(x, "selector-id", js.undefined)
      
      inline def `setSelector-pseudo`(value: T): Self = StObject.set(x, "selector-pseudo", value.asInstanceOf[js.Any])
      
      inline def `setSelector-pseudoUndefined`: Self = StObject.set(x, "selector-pseudo", js.undefined)
      
      inline def `setSelector-tag`(value: T): Self = StObject.set(x, "selector-tag", value.asInstanceOf[js.Any])
      
      inline def `setSelector-tagUndefined`: Self = StObject.set(x, "selector-tag", js.undefined)
      
      inline def setString(value: T): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setStrong(value: T): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      inline def setSubst(value: T): Self = StObject.set(x, "subst", value.asInstanceOf[js.Any])
      
      inline def setSubstUndefined: Self = StObject.set(x, "subst", js.undefined)
      
      inline def setSymbol(value: T): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setTag(value: T): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def `setTemplate-tag`(value: T): Self = StObject.set(x, "template-tag", value.asInstanceOf[js.Any])
      
      inline def `setTemplate-tagUndefined`: Self = StObject.set(x, "template-tag", js.undefined)
      
      inline def `setTemplate-variable`(value: T): Self = StObject.set(x, "template-variable", value.asInstanceOf[js.Any])
      
      inline def `setTemplate-variableUndefined`: Self = StObject.set(x, "template-variable", js.undefined)
      
      inline def setTitle(value: T): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVariable(value: T): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    }
  }
}
