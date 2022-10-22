package typingsJapgolly.parse5

import typingsJapgolly.parse5.distCjsCommonHtmlMod.NS
import typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID
import typingsJapgolly.parse5.distCjsCommonTokenMod.Attribute
import typingsJapgolly.parse5.distCjsCommonTokenMod.TagToken
import typingsJapgolly.parse5.distCjsParserMod.ParserOptions
import typingsJapgolly.parse5.distCjsSerializerMod.SerializerOptions
import typingsJapgolly.parse5.distCjsTokenizerMod.TokenHandler
import typingsJapgolly.parse5.distCjsTokenizerMod.TokenizerOptions
import typingsJapgolly.parse5.distCjsTreeAdaptersDefaultMod.DefaultTreeAdapterMap
import typingsJapgolly.parse5.distCjsTreeAdaptersInterfaceMod.TreeAdapter
import typingsJapgolly.parse5.distCjsTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import typingsJapgolly.parse5.parse5Ints.`0`
import typingsJapgolly.parse5.parse5Ints.`1`
import typingsJapgolly.parse5.parse5Ints.`2`
import typingsJapgolly.parse5.parse5Ints.`3`
import typingsJapgolly.parse5.parse5Ints.`4`
import typingsJapgolly.parse5.parse5Ints.`68`
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsMod {
  
  @JSImport("parse5/dist/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("parse5/dist/cjs", "Parser")
  @js.native
  open class Parser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] ()
    extends typingsJapgolly.parse5.distCjsParserMod.Parser[T] {
    def this(options: ParserOptions[T]) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: Unit,
      document: Unit,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: Null,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
    def this(
      options: ParserOptions[T],
      document: Unit,
      fragmentContext: Unit,
      scriptHandler: js.Function1[
            /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ /* pendingScript */ js.Any, 
            Unit
          ]
    ) = this()
  }
  /* static members */
  object Parser {
    
    @JSImport("parse5/dist/cjs", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](): typingsJapgolly.parse5.distCjsParserMod.Parser[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")().asInstanceOf[typingsJapgolly.parse5.distCjsParserMod.Parser[T]]
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Null, options: ParserOptions[T]): typingsJapgolly.parse5.distCjsParserMod.Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.parse5.distCjsParserMod.Parser[T]]
    inline def getFragmentParser[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Unit, options: ParserOptions[T]): typingsJapgolly.parse5.distCjsParserMod.Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.parse5.distCjsParserMod.Parser[T]]
    
    inline def getFragmentParser_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): typingsJapgolly.parse5.distCjsParserMod.Parser[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.parse5.distCjsParserMod.Parser[T]]
    inline def getFragmentParser_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
      options: ParserOptions[T]
    ): typingsJapgolly.parse5.distCjsParserMod.Parser[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFragmentParser")(fragmentContext.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.parse5.distCjsParserMod.Parser[T]]
    
    inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
    inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
  }
  
  object Token {
    
    @JSImport("parse5/dist/cjs", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parse5/dist/cjs", "Token.TokenType")
    @js.native
    object TokenType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType & Double] = js.native
      
      /* 0 */ val CHARACTER: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.CHARACTER & Double = js.native
      
      /* 5 */ val COMMENT: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.COMMENT & Double = js.native
      
      /* 6 */ val DOCTYPE: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.DOCTYPE & Double = js.native
      
      /* 4 */ val END_TAG: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.END_TAG & Double = js.native
      
      /* 7 */ val EOF: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.EOF & Double = js.native
      
      /* 8 */ val HIBERNATION: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.HIBERNATION & Double = js.native
      
      /* 1 */ val NULL_CHARACTER: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.NULL_CHARACTER & Double = js.native
      
      /* 3 */ val START_TAG: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.START_TAG & Double = js.native
      
      /* 2 */ val WHITESPACE_CHARACTER: typingsJapgolly.parse5.distCjsCommonTokenMod.TokenType.WHITESPACE_CHARACTER & Double = js.native
    }
    
    inline def getTokenAttr(token: TagToken, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenAttr")(token.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  }
  
  @JSImport("parse5/dist/cjs", "Tokenizer")
  @js.native
  open class Tokenizer protected ()
    extends typingsJapgolly.parse5.distCjsTokenizerMod.Tokenizer {
    def this(options: TokenizerOptions, handler: TokenHandler) = this()
  }
  
  object TokenizerMode {
    
    @JSImport("parse5/dist/cjs", "TokenizerMode.CDATA_SECTION")
    @js.native
    val CDATA_SECTION: `68` = js.native
    
    @JSImport("parse5/dist/cjs", "TokenizerMode.DATA")
    @js.native
    val DATA: `0` = js.native
    
    @JSImport("parse5/dist/cjs", "TokenizerMode.PLAINTEXT")
    @js.native
    val PLAINTEXT: `4` = js.native
    
    @JSImport("parse5/dist/cjs", "TokenizerMode.RAWTEXT")
    @js.native
    val RAWTEXT: `2` = js.native
    
    @JSImport("parse5/dist/cjs", "TokenizerMode.RCDATA")
    @js.native
    val RCDATA: `1` = js.native
    
    @JSImport("parse5/dist/cjs", "TokenizerMode.SCRIPT_DATA")
    @js.native
    val SCRIPT_DATA: `3` = js.native
  }
  
  @JSImport("parse5/dist/cjs", "defaultTreeAdapter")
  @js.native
  val defaultTreeAdapter: TreeAdapter[DefaultTreeAdapterMap] = js.native
  
  object foreignContent {
    
    @JSImport("parse5/dist/cjs", "foreignContent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parse5/dist/cjs", "foreignContent.SVG_TAG_NAMES_ADJUSTMENT_MAP")
    @js.native
    val SVG_TAG_NAMES_ADJUSTMENT_MAP: Map[String, String] = js.native
    
    inline def adjustTokenMathMLAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenMathMLAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def adjustTokenSVGAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenSVGAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def adjustTokenSVGTagName(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenSVGTagName")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def adjustTokenXMLAttrs(token: TagToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustTokenXMLAttrs")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def causesExit(startTagToken: TagToken): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("causesExit")(startTagToken.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isIntegrationPoint(tn: TAG_ID, ns: NS, attrs: js.Array[Attribute]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntegrationPoint")(tn.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isIntegrationPoint(tn: TAG_ID, ns: NS, attrs: js.Array[Attribute], foreignNS: NS): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIntegrationPoint")(tn.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], foreignNS.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object html {
    
    @JSImport("parse5/dist/cjs", "html")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("parse5/dist/cjs", "html.ATTRS")
    @js.native
    object ATTRS extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS & String] = js.native
      
      /* "action" */ val ACTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.ACTION & String = js.native
      
      /* "color" */ val COLOR: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.COLOR & String = js.native
      
      /* "encoding" */ val ENCODING: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.ENCODING & String = js.native
      
      /* "face" */ val FACE: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.FACE & String = js.native
      
      /* "name" */ val NAME: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.NAME & String = js.native
      
      /* "prompt" */ val PROMPT: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.PROMPT & String = js.native
      
      /* "size" */ val SIZE: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.SIZE & String = js.native
      
      /* "type" */ val TYPE: typingsJapgolly.parse5.distCjsCommonHtmlMod.ATTRS.TYPE & String = js.native
    }
    
    @JSImport("parse5/dist/cjs", "html.DOCUMENT_MODE")
    @js.native
    object DOCUMENT_MODE extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.parse5.distCjsCommonHtmlMod.DOCUMENT_MODE & String] = js.native
      
      /* "limited-quirks" */ val LIMITED_QUIRKS: typingsJapgolly.parse5.distCjsCommonHtmlMod.DOCUMENT_MODE.LIMITED_QUIRKS & String = js.native
      
      /* "no-quirks" */ val NO_QUIRKS: typingsJapgolly.parse5.distCjsCommonHtmlMod.DOCUMENT_MODE.NO_QUIRKS & String = js.native
      
      /* "quirks" */ val QUIRKS: typingsJapgolly.parse5.distCjsCommonHtmlMod.DOCUMENT_MODE.QUIRKS & String = js.native
    }
    
    @JSImport("parse5/dist/cjs", "html.NS")
    @js.native
    object NS extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.parse5.distCjsCommonHtmlMod.NS & String] = js.native
      
      /* "http://www.w3.org/1999/xhtml" */ val HTML: typingsJapgolly.parse5.distCjsCommonHtmlMod.NS.HTML & String = js.native
      
      /* "http://www.w3.org/1998/Math/MathML" */ val MATHML: typingsJapgolly.parse5.distCjsCommonHtmlMod.NS.MATHML & String = js.native
      
      /* "http://www.w3.org/2000/svg" */ val SVG: typingsJapgolly.parse5.distCjsCommonHtmlMod.NS.SVG & String = js.native
      
      /* "http://www.w3.org/1999/xlink" */ val XLINK: typingsJapgolly.parse5.distCjsCommonHtmlMod.NS.XLINK & String = js.native
      
      /* "http://www.w3.org/XML/1998/namespace" */ val XML: typingsJapgolly.parse5.distCjsCommonHtmlMod.NS.XML & String = js.native
      
      /* "http://www.w3.org/2000/xmlns/" */ val XMLNS: typingsJapgolly.parse5.distCjsCommonHtmlMod.NS.XMLNS & String = js.native
    }
    
    @JSImport("parse5/dist/cjs", "html.SPECIAL_ELEMENTS")
    @js.native
    val SPECIAL_ELEMENTS: Record[NS, Set[TAG_ID]] = js.native
    
    @JSImport("parse5/dist/cjs", "html.TAG_ID")
    @js.native
    object TAG_ID extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID & Double] = js.native
      
      /* 1 */ val A: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.A & Double = js.native
      
      /* 2 */ val ADDRESS: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.ADDRESS & Double = js.native
      
      /* 3 */ val ANNOTATION_XML: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.ANNOTATION_XML & Double = js.native
      
      /* 4 */ val APPLET: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.APPLET & Double = js.native
      
      /* 5 */ val AREA: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.AREA & Double = js.native
      
      /* 6 */ val ARTICLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.ARTICLE & Double = js.native
      
      /* 7 */ val ASIDE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.ASIDE & Double = js.native
      
      /* 8 */ val B: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.B & Double = js.native
      
      /* 9 */ val BASE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BASE & Double = js.native
      
      /* 10 */ val BASEFONT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BASEFONT & Double = js.native
      
      /* 11 */ val BGSOUND: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BGSOUND & Double = js.native
      
      /* 12 */ val BIG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BIG & Double = js.native
      
      /* 13 */ val BLOCKQUOTE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BLOCKQUOTE & Double = js.native
      
      /* 14 */ val BODY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BODY & Double = js.native
      
      /* 15 */ val BR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BR & Double = js.native
      
      /* 16 */ val BUTTON: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.BUTTON & Double = js.native
      
      /* 17 */ val CAPTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.CAPTION & Double = js.native
      
      /* 18 */ val CENTER: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.CENTER & Double = js.native
      
      /* 19 */ val CODE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.CODE & Double = js.native
      
      /* 20 */ val COL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.COL & Double = js.native
      
      /* 21 */ val COLGROUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.COLGROUP & Double = js.native
      
      /* 22 */ val DD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DD & Double = js.native
      
      /* 23 */ val DESC: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DESC & Double = js.native
      
      /* 24 */ val DETAILS: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DETAILS & Double = js.native
      
      /* 25 */ val DIALOG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DIALOG & Double = js.native
      
      /* 26 */ val DIR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DIR & Double = js.native
      
      /* 27 */ val DIV: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DIV & Double = js.native
      
      /* 28 */ val DL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DL & Double = js.native
      
      /* 29 */ val DT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.DT & Double = js.native
      
      /* 30 */ val EM: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.EM & Double = js.native
      
      /* 31 */ val EMBED: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.EMBED & Double = js.native
      
      /* 32 */ val FIELDSET: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FIELDSET & Double = js.native
      
      /* 33 */ val FIGCAPTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FIGCAPTION & Double = js.native
      
      /* 34 */ val FIGURE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FIGURE & Double = js.native
      
      /* 35 */ val FONT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FONT & Double = js.native
      
      /* 36 */ val FOOTER: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FOOTER & Double = js.native
      
      /* 37 */ val FOREIGN_OBJECT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FOREIGN_OBJECT & Double = js.native
      
      /* 38 */ val FORM: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FORM & Double = js.native
      
      /* 39 */ val FRAME: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FRAME & Double = js.native
      
      /* 40 */ val FRAMESET: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.FRAMESET & Double = js.native
      
      /* 41 */ val H1: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.H1 & Double = js.native
      
      /* 42 */ val H2: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.H2 & Double = js.native
      
      /* 43 */ val H3: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.H3 & Double = js.native
      
      /* 44 */ val H4: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.H4 & Double = js.native
      
      /* 45 */ val H5: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.H5 & Double = js.native
      
      /* 46 */ val H6: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.H6 & Double = js.native
      
      /* 47 */ val HEAD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.HEAD & Double = js.native
      
      /* 48 */ val HEADER: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.HEADER & Double = js.native
      
      /* 49 */ val HGROUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.HGROUP & Double = js.native
      
      /* 50 */ val HR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.HR & Double = js.native
      
      /* 51 */ val HTML: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.HTML & Double = js.native
      
      /* 52 */ val I: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.I & Double = js.native
      
      /* 56 */ val IFRAME: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.IFRAME & Double = js.native
      
      /* 54 */ val IMAGE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.IMAGE & Double = js.native
      
      /* 53 */ val IMG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.IMG & Double = js.native
      
      /* 55 */ val INPUT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.INPUT & Double = js.native
      
      /* 57 */ val KEYGEN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.KEYGEN & Double = js.native
      
      /* 58 */ val LABEL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.LABEL & Double = js.native
      
      /* 59 */ val LI: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.LI & Double = js.native
      
      /* 60 */ val LINK: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.LINK & Double = js.native
      
      /* 61 */ val LISTING: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.LISTING & Double = js.native
      
      /* 62 */ val MAIN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MAIN & Double = js.native
      
      /* 63 */ val MALIGNMARK: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MALIGNMARK & Double = js.native
      
      /* 64 */ val MARQUEE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MARQUEE & Double = js.native
      
      /* 65 */ val MATH: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MATH & Double = js.native
      
      /* 66 */ val MENU: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MENU & Double = js.native
      
      /* 67 */ val META: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.META & Double = js.native
      
      /* 68 */ val MGLYPH: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MGLYPH & Double = js.native
      
      /* 69 */ val MI: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MI & Double = js.native
      
      /* 71 */ val MN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MN & Double = js.native
      
      /* 70 */ val MO: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MO & Double = js.native
      
      /* 72 */ val MS: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MS & Double = js.native
      
      /* 73 */ val MTEXT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.MTEXT & Double = js.native
      
      /* 74 */ val NAV: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.NAV & Double = js.native
      
      /* 75 */ val NOBR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.NOBR & Double = js.native
      
      /* 77 */ val NOEMBED: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.NOEMBED & Double = js.native
      
      /* 76 */ val NOFRAMES: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.NOFRAMES & Double = js.native
      
      /* 78 */ val NOSCRIPT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.NOSCRIPT & Double = js.native
      
      /* 79 */ val OBJECT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.OBJECT & Double = js.native
      
      /* 80 */ val OL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.OL & Double = js.native
      
      /* 81 */ val OPTGROUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.OPTGROUP & Double = js.native
      
      /* 82 */ val OPTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.OPTION & Double = js.native
      
      /* 83 */ val P: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.P & Double = js.native
      
      /* 84 */ val PARAM: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.PARAM & Double = js.native
      
      /* 85 */ val PLAINTEXT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.PLAINTEXT & Double = js.native
      
      /* 86 */ val PRE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.PRE & Double = js.native
      
      /* 87 */ val RB: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.RB & Double = js.native
      
      /* 88 */ val RP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.RP & Double = js.native
      
      /* 89 */ val RT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.RT & Double = js.native
      
      /* 90 */ val RTC: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.RTC & Double = js.native
      
      /* 91 */ val RUBY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.RUBY & Double = js.native
      
      /* 92 */ val S: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.S & Double = js.native
      
      /* 93 */ val SCRIPT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SCRIPT & Double = js.native
      
      /* 94 */ val SECTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SECTION & Double = js.native
      
      /* 95 */ val SELECT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SELECT & Double = js.native
      
      /* 97 */ val SMALL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SMALL & Double = js.native
      
      /* 96 */ val SOURCE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SOURCE & Double = js.native
      
      /* 98 */ val SPAN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SPAN & Double = js.native
      
      /* 99 */ val STRIKE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.STRIKE & Double = js.native
      
      /* 100 */ val STRONG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.STRONG & Double = js.native
      
      /* 101 */ val STYLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.STYLE & Double = js.native
      
      /* 102 */ val SUB: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SUB & Double = js.native
      
      /* 103 */ val SUMMARY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SUMMARY & Double = js.native
      
      /* 104 */ val SUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SUP & Double = js.native
      
      /* 119 */ val SVG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.SVG & Double = js.native
      
      /* 105 */ val TABLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TABLE & Double = js.native
      
      /* 106 */ val TBODY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TBODY & Double = js.native
      
      /* 110 */ val TD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TD & Double = js.native
      
      /* 107 */ val TEMPLATE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TEMPLATE & Double = js.native
      
      /* 108 */ val TEXTAREA: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TEXTAREA & Double = js.native
      
      /* 109 */ val TFOOT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TFOOT & Double = js.native
      
      /* 111 */ val TH: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TH & Double = js.native
      
      /* 112 */ val THEAD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.THEAD & Double = js.native
      
      /* 113 */ val TITLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TITLE & Double = js.native
      
      /* 114 */ val TR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TR & Double = js.native
      
      /* 115 */ val TRACK: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TRACK & Double = js.native
      
      /* 116 */ val TT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.TT & Double = js.native
      
      /* 117 */ val U: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.U & Double = js.native
      
      /* 118 */ val UL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.UL & Double = js.native
      
      /* 0 */ val UNKNOWN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.UNKNOWN & Double = js.native
      
      /* 120 */ val VAR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.VAR & Double = js.native
      
      /* 121 */ val WBR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.WBR & Double = js.native
      
      /* 122 */ val XMP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_ID.XMP & Double = js.native
    }
    
    @JSImport("parse5/dist/cjs", "html.TAG_NAMES")
    @js.native
    object TAG_NAMES extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES & String] = js.native
      
      /* "a" */ val A: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.A & String = js.native
      
      /* "address" */ val ADDRESS: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.ADDRESS & String = js.native
      
      /* "annotation-xml" */ val ANNOTATION_XML: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.ANNOTATION_XML & String = js.native
      
      /* "applet" */ val APPLET: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.APPLET & String = js.native
      
      /* "area" */ val AREA: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.AREA & String = js.native
      
      /* "article" */ val ARTICLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.ARTICLE & String = js.native
      
      /* "aside" */ val ASIDE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.ASIDE & String = js.native
      
      /* "b" */ val B: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.B & String = js.native
      
      /* "base" */ val BASE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BASE & String = js.native
      
      /* "basefont" */ val BASEFONT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BASEFONT & String = js.native
      
      /* "bgsound" */ val BGSOUND: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BGSOUND & String = js.native
      
      /* "big" */ val BIG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BIG & String = js.native
      
      /* "blockquote" */ val BLOCKQUOTE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BLOCKQUOTE & String = js.native
      
      /* "body" */ val BODY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BODY & String = js.native
      
      /* "br" */ val BR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BR & String = js.native
      
      /* "button" */ val BUTTON: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.BUTTON & String = js.native
      
      /* "caption" */ val CAPTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.CAPTION & String = js.native
      
      /* "center" */ val CENTER: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.CENTER & String = js.native
      
      /* "code" */ val CODE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.CODE & String = js.native
      
      /* "col" */ val COL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.COL & String = js.native
      
      /* "colgroup" */ val COLGROUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.COLGROUP & String = js.native
      
      /* "dd" */ val DD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DD & String = js.native
      
      /* "desc" */ val DESC: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DESC & String = js.native
      
      /* "details" */ val DETAILS: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DETAILS & String = js.native
      
      /* "dialog" */ val DIALOG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DIALOG & String = js.native
      
      /* "dir" */ val DIR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DIR & String = js.native
      
      /* "div" */ val DIV: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DIV & String = js.native
      
      /* "dl" */ val DL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DL & String = js.native
      
      /* "dt" */ val DT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.DT & String = js.native
      
      /* "em" */ val EM: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.EM & String = js.native
      
      /* "embed" */ val EMBED: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.EMBED & String = js.native
      
      /* "fieldset" */ val FIELDSET: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FIELDSET & String = js.native
      
      /* "figcaption" */ val FIGCAPTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FIGCAPTION & String = js.native
      
      /* "figure" */ val FIGURE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FIGURE & String = js.native
      
      /* "font" */ val FONT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FONT & String = js.native
      
      /* "footer" */ val FOOTER: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FOOTER & String = js.native
      
      /* "foreignObject" */ val FOREIGN_OBJECT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FOREIGN_OBJECT & String = js.native
      
      /* "form" */ val FORM: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FORM & String = js.native
      
      /* "frame" */ val FRAME: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FRAME & String = js.native
      
      /* "frameset" */ val FRAMESET: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.FRAMESET & String = js.native
      
      /* "h1" */ val H1: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.H1 & String = js.native
      
      /* "h2" */ val H2: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.H2 & String = js.native
      
      /* "h3" */ val H3: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.H3 & String = js.native
      
      /* "h4" */ val H4: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.H4 & String = js.native
      
      /* "h5" */ val H5: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.H5 & String = js.native
      
      /* "h6" */ val H6: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.H6 & String = js.native
      
      /* "head" */ val HEAD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.HEAD & String = js.native
      
      /* "header" */ val HEADER: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.HEADER & String = js.native
      
      /* "hgroup" */ val HGROUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.HGROUP & String = js.native
      
      /* "hr" */ val HR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.HR & String = js.native
      
      /* "html" */ val HTML: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.HTML & String = js.native
      
      /* "i" */ val I: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.I & String = js.native
      
      /* "iframe" */ val IFRAME: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.IFRAME & String = js.native
      
      /* "image" */ val IMAGE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.IMAGE & String = js.native
      
      /* "img" */ val IMG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.IMG & String = js.native
      
      /* "input" */ val INPUT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.INPUT & String = js.native
      
      /* "keygen" */ val KEYGEN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.KEYGEN & String = js.native
      
      /* "label" */ val LABEL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.LABEL & String = js.native
      
      /* "li" */ val LI: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.LI & String = js.native
      
      /* "link" */ val LINK: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.LINK & String = js.native
      
      /* "listing" */ val LISTING: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.LISTING & String = js.native
      
      /* "main" */ val MAIN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MAIN & String = js.native
      
      /* "malignmark" */ val MALIGNMARK: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MALIGNMARK & String = js.native
      
      /* "marquee" */ val MARQUEE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MARQUEE & String = js.native
      
      /* "math" */ val MATH: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MATH & String = js.native
      
      /* "menu" */ val MENU: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MENU & String = js.native
      
      /* "meta" */ val META: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.META & String = js.native
      
      /* "mglyph" */ val MGLYPH: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MGLYPH & String = js.native
      
      /* "mi" */ val MI: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MI & String = js.native
      
      /* "mn" */ val MN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MN & String = js.native
      
      /* "mo" */ val MO: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MO & String = js.native
      
      /* "ms" */ val MS: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MS & String = js.native
      
      /* "mtext" */ val MTEXT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.MTEXT & String = js.native
      
      /* "nav" */ val NAV: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.NAV & String = js.native
      
      /* "nobr" */ val NOBR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.NOBR & String = js.native
      
      /* "noembed" */ val NOEMBED: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.NOEMBED & String = js.native
      
      /* "noframes" */ val NOFRAMES: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.NOFRAMES & String = js.native
      
      /* "noscript" */ val NOSCRIPT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.NOSCRIPT & String = js.native
      
      /* "object" */ val OBJECT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.OBJECT & String = js.native
      
      /* "ol" */ val OL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.OL & String = js.native
      
      /* "optgroup" */ val OPTGROUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.OPTGROUP & String = js.native
      
      /* "option" */ val OPTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.OPTION & String = js.native
      
      /* "p" */ val P: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.P & String = js.native
      
      /* "param" */ val PARAM: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.PARAM & String = js.native
      
      /* "plaintext" */ val PLAINTEXT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.PLAINTEXT & String = js.native
      
      /* "pre" */ val PRE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.PRE & String = js.native
      
      /* "rb" */ val RB: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.RB & String = js.native
      
      /* "rp" */ val RP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.RP & String = js.native
      
      /* "rt" */ val RT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.RT & String = js.native
      
      /* "rtc" */ val RTC: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.RTC & String = js.native
      
      /* "ruby" */ val RUBY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.RUBY & String = js.native
      
      /* "s" */ val S: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.S & String = js.native
      
      /* "script" */ val SCRIPT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SCRIPT & String = js.native
      
      /* "section" */ val SECTION: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SECTION & String = js.native
      
      /* "select" */ val SELECT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SELECT & String = js.native
      
      /* "small" */ val SMALL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SMALL & String = js.native
      
      /* "source" */ val SOURCE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SOURCE & String = js.native
      
      /* "span" */ val SPAN: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SPAN & String = js.native
      
      /* "strike" */ val STRIKE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.STRIKE & String = js.native
      
      /* "strong" */ val STRONG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.STRONG & String = js.native
      
      /* "style" */ val STYLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.STYLE & String = js.native
      
      /* "sub" */ val SUB: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SUB & String = js.native
      
      /* "summary" */ val SUMMARY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SUMMARY & String = js.native
      
      /* "sup" */ val SUP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SUP & String = js.native
      
      /* "svg" */ val SVG: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.SVG & String = js.native
      
      /* "table" */ val TABLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TABLE & String = js.native
      
      /* "tbody" */ val TBODY: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TBODY & String = js.native
      
      /* "td" */ val TD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TD & String = js.native
      
      /* "template" */ val TEMPLATE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TEMPLATE & String = js.native
      
      /* "textarea" */ val TEXTAREA: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TEXTAREA & String = js.native
      
      /* "tfoot" */ val TFOOT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TFOOT & String = js.native
      
      /* "th" */ val TH: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TH & String = js.native
      
      /* "thead" */ val THEAD: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.THEAD & String = js.native
      
      /* "title" */ val TITLE: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TITLE & String = js.native
      
      /* "tr" */ val TR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TR & String = js.native
      
      /* "track" */ val TRACK: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TRACK & String = js.native
      
      /* "tt" */ val TT: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.TT & String = js.native
      
      /* "u" */ val U: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.U & String = js.native
      
      /* "ul" */ val UL: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.UL & String = js.native
      
      /* "var" */ val VAR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.VAR & String = js.native
      
      /* "wbr" */ val WBR: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.WBR & String = js.native
      
      /* "xmp" */ val XMP: typingsJapgolly.parse5.distCjsCommonHtmlMod.TAG_NAMES.XMP & String = js.native
    }
    
    inline def getTagID(tagName: String): TAG_ID = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagID")(tagName.asInstanceOf[js.Any]).asInstanceOf[TAG_ID]
    
    inline def hasUnescapedText(tn: String, scriptingEnabled: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasUnescapedText")(tn.asInstanceOf[js.Any], scriptingEnabled.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isNumberedHeader(tn: TAG_ID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberedHeader")(tn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
  inline def parse[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['document'] */ js.Any]
  
  inline def parseFragment[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](fragmentContext: Null, html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  inline def parseFragment[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  inline def parseFragment[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](html: String, options: ParserOptions[T]): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  
  inline def parseFragment_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    fragmentContext: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
    html: String,
    options: ParserOptions[T]
  ): /* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFragment")(fragmentContext.asInstanceOf[js.Any], html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T['documentFragment'] */ js.Any]
  
  inline def serializeOuter_node[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeOuter")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serializeOuter_node[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['node'] */ js.Any,
    options: SerializerOptions[T]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeOuter")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serialize_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize_parentNode[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
    node: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any,
    options: SerializerOptions[T]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
