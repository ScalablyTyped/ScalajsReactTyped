package typingsJapgolly.jsoncParser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jsoncParser.jsoncParserInts.`0`
import typingsJapgolly.jsoncParser.jsoncParserInts.`10`
import typingsJapgolly.jsoncParser.jsoncParserInts.`11`
import typingsJapgolly.jsoncParser.jsoncParserInts.`12`
import typingsJapgolly.jsoncParser.jsoncParserInts.`13`
import typingsJapgolly.jsoncParser.jsoncParserInts.`14`
import typingsJapgolly.jsoncParser.jsoncParserInts.`15`
import typingsJapgolly.jsoncParser.jsoncParserInts.`16`
import typingsJapgolly.jsoncParser.jsoncParserInts.`17`
import typingsJapgolly.jsoncParser.jsoncParserInts.`1`
import typingsJapgolly.jsoncParser.jsoncParserInts.`2`
import typingsJapgolly.jsoncParser.jsoncParserInts.`3`
import typingsJapgolly.jsoncParser.jsoncParserInts.`4`
import typingsJapgolly.jsoncParser.jsoncParserInts.`5`
import typingsJapgolly.jsoncParser.jsoncParserInts.`6`
import typingsJapgolly.jsoncParser.jsoncParserInts.`7`
import typingsJapgolly.jsoncParser.jsoncParserInts.`8`
import typingsJapgolly.jsoncParser.jsoncParserInts.`9`
import typingsJapgolly.jsoncParser.jsoncParserStrings.CloseBraceExpected
import typingsJapgolly.jsoncParser.jsoncParserStrings.CloseBracketExpected
import typingsJapgolly.jsoncParser.jsoncParserStrings.ColonExpected
import typingsJapgolly.jsoncParser.jsoncParserStrings.CommaExpected
import typingsJapgolly.jsoncParser.jsoncParserStrings.EndOfFileExpected
import typingsJapgolly.jsoncParser.jsoncParserStrings.InvalidCharacter
import typingsJapgolly.jsoncParser.jsoncParserStrings.InvalidCommentToken
import typingsJapgolly.jsoncParser.jsoncParserStrings.InvalidEscapeCharacter
import typingsJapgolly.jsoncParser.jsoncParserStrings.InvalidNumberFormat
import typingsJapgolly.jsoncParser.jsoncParserStrings.InvalidSymbol
import typingsJapgolly.jsoncParser.jsoncParserStrings.InvalidUnicode
import typingsJapgolly.jsoncParser.jsoncParserStrings.PropertyNameExpected
import typingsJapgolly.jsoncParser.jsoncParserStrings.UnexpectedEndOfComment
import typingsJapgolly.jsoncParser.jsoncParserStrings.UnexpectedEndOfNumber
import typingsJapgolly.jsoncParser.jsoncParserStrings.UnexpectedEndOfString
import typingsJapgolly.jsoncParser.jsoncParserStrings.ValueExpected
import typingsJapgolly.jsoncParser.jsoncParserStrings.`Lessthansignunknown ParseErrorCodeGreaterthansign`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonc-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyEdits(text: String, edits: EditResult): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEdits")(text.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createScanner(text: String): JSONScanner = ^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(text.asInstanceOf[js.Any]).asInstanceOf[JSONScanner]
  inline def createScanner(text: String, ignoreTrivia: Boolean): JSONScanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(text.asInstanceOf[js.Any], ignoreTrivia.asInstanceOf[js.Any])).asInstanceOf[JSONScanner]
  
  inline def findNodeAtLocation(root: Node, path: JSONPath): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAtLocation")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def findNodeAtOffset(root: Node, offset: Double): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAtOffset")(root.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def findNodeAtOffset(root: Node, offset: Double, includeRightBound: Boolean): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodeAtOffset")(root.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], includeRightBound.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def format(documentText: String, range: Unit, options: FormattingOptions): EditResult = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(documentText.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditResult]
  inline def format(documentText: String, range: Range, options: FormattingOptions): EditResult = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(documentText.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditResult]
  
  inline def getLocation(text: String, position: Double): Location = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(text.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Location]
  
  inline def getNodePath(node: Node): JSONPath = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodePath")(node.asInstanceOf[js.Any]).asInstanceOf[JSONPath]
  
  inline def getNodeValue(node: Node): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeValue")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def modify(text: String, path: JSONPath, value: Any, options: ModificationOptions): EditResult = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(text.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditResult]
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, errors: js.Array[ParseError]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, errors: js.Array[ParseError], options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, errors: Unit, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseTree(text: String): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
  inline def parseTree(text: String, errors: js.Array[ParseError]): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def parseTree(text: String, errors: js.Array[ParseError], options: ParseOptions): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  inline def parseTree(text: String, errors: Unit, options: ParseOptions): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTree")(text.asInstanceOf[js.Any], errors.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
  
  inline def printParseErrorCode(code: ParseErrorCode): InvalidSymbol | InvalidNumberFormat | PropertyNameExpected | ValueExpected | ColonExpected | CommaExpected | CloseBraceExpected | CloseBracketExpected | EndOfFileExpected | InvalidCommentToken | UnexpectedEndOfComment | UnexpectedEndOfString | UnexpectedEndOfNumber | InvalidUnicode | InvalidEscapeCharacter | InvalidCharacter | (`Lessthansignunknown ParseErrorCodeGreaterthansign`) = ^.asInstanceOf[js.Dynamic].applyDynamic("printParseErrorCode")(code.asInstanceOf[js.Any]).asInstanceOf[InvalidSymbol | InvalidNumberFormat | PropertyNameExpected | ValueExpected | ColonExpected | CommaExpected | CloseBraceExpected | CloseBracketExpected | EndOfFileExpected | InvalidCommentToken | UnexpectedEndOfComment | UnexpectedEndOfString | UnexpectedEndOfNumber | InvalidUnicode | InvalidEscapeCharacter | InvalidCharacter | (`Lessthansignunknown ParseErrorCodeGreaterthansign`)]
  
  inline def stripComments(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripComments")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stripComments(text: String, replaceCh: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stripComments")(text.asInstanceOf[js.Any], replaceCh.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def visit(text: String, visitor: JSONVisitor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(text.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def visit(text: String, visitor: JSONVisitor, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(text.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Edit extends StObject {
    
    /**
      * The new content. Empty content represents a *remove*.
      */
    var content: String
    
    /**
      * The length of the modification. Must not be negative. Empty length represents an *insert*.
      */
    var length: Double
    
    /**
      * The start offset of the modification.
      */
    var offset: Double
  }
  object Edit {
    
    inline def apply(content: String, length: Double, offset: Double): Edit = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edit]
    }
    
    extension [Self <: Edit](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type EditResult = js.Array[Edit]
  
  trait FormattingOptions extends StObject {
    
    /**
      * The default 'end of line' character. If not set, '\n' is used as default.
      */
    var eol: js.UndefOr[String] = js.undefined
    
    /**
      * If set, will add a new line at the end of the document.
      */
    var insertFinalNewline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is indentation based on spaces?
      */
    var insertSpaces: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, will keep line positions as is in the formatting
      */
    var keepLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If indentation is based on spaces (`insertSpaces` = true), the number of spaces that make an indent.
      */
    var tabSize: js.UndefOr[Double] = js.undefined
  }
  object FormattingOptions {
    
    inline def apply(): FormattingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattingOptions]
    }
    
    extension [Self <: FormattingOptions](x: Self) {
      
      inline def setEol(value: String): Self = StObject.set(x, "eol", value.asInstanceOf[js.Any])
      
      inline def setEolUndefined: Self = StObject.set(x, "eol", js.undefined)
      
      inline def setInsertFinalNewline(value: Boolean): Self = StObject.set(x, "insertFinalNewline", value.asInstanceOf[js.Any])
      
      inline def setInsertFinalNewlineUndefined: Self = StObject.set(x, "insertFinalNewline", js.undefined)
      
      inline def setInsertSpaces(value: Boolean): Self = StObject.set(x, "insertSpaces", value.asInstanceOf[js.Any])
      
      inline def setInsertSpacesUndefined: Self = StObject.set(x, "insertSpaces", js.undefined)
      
      inline def setKeepLines(value: Boolean): Self = StObject.set(x, "keepLines", value.asInstanceOf[js.Any])
      
      inline def setKeepLinesUndefined: Self = StObject.set(x, "keepLines", js.undefined)
      
      inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
      
      inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    }
  }
  
  type JSONPath = js.Array[Segment]
  
  trait JSONScanner extends StObject {
    
    /**
      * Returns the zero-based current scan position, which is after the last read token.
      */
    def getPosition(): Double
    
    /**
      * Returns the last read token.
      */
    def getToken(): SyntaxKind
    
    /**
      * An error code of the last scan.
      */
    def getTokenError(): ScanError
    
    /**
      * The length of the last read token.
      */
    def getTokenLength(): Double
    
    /**
      * The zero-based start offset of the last read token.
      */
    def getTokenOffset(): Double
    
    /**
      * The zero-based start character (column) of the last read token.
      */
    def getTokenStartCharacter(): Double
    
    /**
      * The zero-based start line number of the last read token.
      */
    def getTokenStartLine(): Double
    
    /**
      * Returns the last read token value. The value for strings is the decoded string content. For numbers it's of type number, for boolean it's true or false.
      */
    def getTokenValue(): String
    
    /**
      * Read the next token. Returns the token code.
      */
    def scan(): SyntaxKind
    
    /**
      * Sets the scan position to a new offset. A call to 'scan' is needed to get the first token.
      */
    def setPosition(pos: Double): Unit
  }
  object JSONScanner {
    
    inline def apply(
      getPosition: CallbackTo[Double],
      getToken: CallbackTo[SyntaxKind],
      getTokenError: CallbackTo[ScanError],
      getTokenLength: CallbackTo[Double],
      getTokenOffset: CallbackTo[Double],
      getTokenStartCharacter: CallbackTo[Double],
      getTokenStartLine: CallbackTo[Double],
      getTokenValue: CallbackTo[String],
      scan: CallbackTo[SyntaxKind],
      setPosition: Double => Callback
    ): JSONScanner = {
      val __obj = js.Dynamic.literal(getPosition = getPosition.toJsFn, getToken = getToken.toJsFn, getTokenError = getTokenError.toJsFn, getTokenLength = getTokenLength.toJsFn, getTokenOffset = getTokenOffset.toJsFn, getTokenStartCharacter = getTokenStartCharacter.toJsFn, getTokenStartLine = getTokenStartLine.toJsFn, getTokenValue = getTokenValue.toJsFn, scan = scan.toJsFn, setPosition = js.Any.fromFunction1((t0: Double) => setPosition(t0).runNow()))
      __obj.asInstanceOf[JSONScanner]
    }
    
    extension [Self <: JSONScanner](x: Self) {
      
      inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "getPosition", value.toJsFn)
      
      inline def setGetToken(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "getToken", value.toJsFn)
      
      inline def setGetTokenError(value: CallbackTo[ScanError]): Self = StObject.set(x, "getTokenError", value.toJsFn)
      
      inline def setGetTokenLength(value: CallbackTo[Double]): Self = StObject.set(x, "getTokenLength", value.toJsFn)
      
      inline def setGetTokenOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getTokenOffset", value.toJsFn)
      
      inline def setGetTokenStartCharacter(value: CallbackTo[Double]): Self = StObject.set(x, "getTokenStartCharacter", value.toJsFn)
      
      inline def setGetTokenStartLine(value: CallbackTo[Double]): Self = StObject.set(x, "getTokenStartLine", value.toJsFn)
      
      inline def setGetTokenValue(value: CallbackTo[String]): Self = StObject.set(x, "getTokenValue", value.toJsFn)
      
      inline def setScan(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "scan", value.toJsFn)
      
      inline def setSetPosition(value: Double => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait JSONVisitor extends StObject {
    
    /**
      * Invoked when an open bracket is encountered. The offset and length represent the location of the open bracket.
      */
    var onArrayBegin: js.UndefOr[
        js.Function5[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a closing bracket is encountered. The offset and length represent the location of the closing bracket.
      */
    var onArrayEnd: js.UndefOr[
        js.Function4[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * When comments are allowed, invoked when a line or block comment is encountered. The offset and length represent the location of the comment.
      */
    var onComment: js.UndefOr[
        js.Function4[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked on an error.
      */
    var onError: js.UndefOr[
        js.Function5[
          /* error */ ParseErrorCode, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a literal value is encountered. The offset and length represent the location of the literal value.
      */
    var onLiteralValue: js.UndefOr[
        js.Function6[
          /* value */ Any, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when an open brace is encountered and an object is started. The offset and length represent the location of the open brace.
      */
    var onObjectBegin: js.UndefOr[
        js.Function5[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a closing brace is encountered and an object is completed. The offset and length represent the location of the closing brace.
      */
    var onObjectEnd: js.UndefOr[
        js.Function4[
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a property is encountered. The offset and length represent the location of the property name.
      * The `JSONPath` created by the `pathSupplier` refers to the enclosing JSON object, it does not include the
      * property name yet.
      */
    var onObjectProperty: js.UndefOr[
        js.Function6[
          /* property */ String, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          /* pathSupplier */ js.Function0[JSONPath], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Invoked when a comma or colon separator is encountered. The offset and length represent the location of the separator.
      */
    var onSeparator: js.UndefOr[
        js.Function5[
          /* character */ String, 
          /* offset */ Double, 
          /* length */ Double, 
          /* startLine */ Double, 
          /* startCharacter */ Double, 
          Unit
        ]
      ] = js.undefined
  }
  object JSONVisitor {
    
    inline def apply(): JSONVisitor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONVisitor]
    }
    
    extension [Self <: JSONVisitor](x: Self) {
      
      inline def setOnArrayBegin(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Callback
      ): Self = StObject.set(x, "onArrayBegin", js.Any.fromFunction5((t0: /* offset */ Double, t1: /* length */ Double, t2: /* startLine */ Double, t3: /* startCharacter */ Double, t4: /* pathSupplier */ js.Function0[JSONPath]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setOnArrayBeginUndefined: Self = StObject.set(x, "onArrayBegin", js.undefined)
      
      inline def setOnArrayEnd(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Callback
      ): Self = StObject.set(x, "onArrayEnd", js.Any.fromFunction4((t0: /* offset */ Double, t1: /* length */ Double, t2: /* startLine */ Double, t3: /* startCharacter */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnArrayEndUndefined: Self = StObject.set(x, "onArrayEnd", js.undefined)
      
      inline def setOnComment(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Callback
      ): Self = StObject.set(x, "onComment", js.Any.fromFunction4((t0: /* offset */ Double, t1: /* length */ Double, t2: /* startLine */ Double, t3: /* startCharacter */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnCommentUndefined: Self = StObject.set(x, "onComment", js.undefined)
      
      inline def setOnError(
        value: (/* error */ ParseErrorCode, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Callback
      ): Self = StObject.set(x, "onError", js.Any.fromFunction5((t0: /* error */ ParseErrorCode, t1: /* offset */ Double, t2: /* length */ Double, t3: /* startLine */ Double, t4: /* startCharacter */ Double) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLiteralValue(
        value: (/* value */ Any, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Callback
      ): Self = StObject.set(x, "onLiteralValue", js.Any.fromFunction6((t0: /* value */ Any, t1: /* offset */ Double, t2: /* length */ Double, t3: /* startLine */ Double, t4: /* startCharacter */ Double, t5: /* pathSupplier */ js.Function0[JSONPath]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setOnLiteralValueUndefined: Self = StObject.set(x, "onLiteralValue", js.undefined)
      
      inline def setOnObjectBegin(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Callback
      ): Self = StObject.set(x, "onObjectBegin", js.Any.fromFunction5((t0: /* offset */ Double, t1: /* length */ Double, t2: /* startLine */ Double, t3: /* startCharacter */ Double, t4: /* pathSupplier */ js.Function0[JSONPath]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setOnObjectBeginUndefined: Self = StObject.set(x, "onObjectBegin", js.undefined)
      
      inline def setOnObjectEnd(
        value: (/* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Callback
      ): Self = StObject.set(x, "onObjectEnd", js.Any.fromFunction4((t0: /* offset */ Double, t1: /* length */ Double, t2: /* startLine */ Double, t3: /* startCharacter */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnObjectEndUndefined: Self = StObject.set(x, "onObjectEnd", js.undefined)
      
      inline def setOnObjectProperty(
        value: (/* property */ String, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double, /* pathSupplier */ js.Function0[JSONPath]) => Callback
      ): Self = StObject.set(x, "onObjectProperty", js.Any.fromFunction6((t0: /* property */ String, t1: /* offset */ Double, t2: /* length */ Double, t3: /* startLine */ Double, t4: /* startCharacter */ Double, t5: /* pathSupplier */ js.Function0[JSONPath]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setOnObjectPropertyUndefined: Self = StObject.set(x, "onObjectProperty", js.undefined)
      
      inline def setOnSeparator(
        value: (/* character */ String, /* offset */ Double, /* length */ Double, /* startLine */ Double, /* startCharacter */ Double) => Callback
      ): Self = StObject.set(x, "onSeparator", js.Any.fromFunction5((t0: /* character */ String, t1: /* offset */ Double, t2: /* length */ Double, t3: /* startLine */ Double, t4: /* startCharacter */ Double) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setOnSeparatorUndefined: Self = StObject.set(x, "onSeparator", js.undefined)
    }
  }
  
  trait Location extends StObject {
    
    /**
      * If set, the location's offset is at a property key.
      */
    var isAtPropertyKey: Boolean
    
    /**
      * Matches the locations path against a pattern consisting of strings (for properties) and numbers (for array indices).
      * '*' will match a single segment of any property name or index.
      * '**' will match a sequence of segments of any property name or index, or no segment.
      */
    def matches(patterns: JSONPath): Boolean
    
    /**
      * The path describing the location in the JSON document. The path consists of a sequence of strings
      * representing an object property or numbers for array indices.
      */
    var path: JSONPath
    
    /**
      * The previous property key or literal value (string, number, boolean or null) or undefined.
      */
    var previousNode: js.UndefOr[Node] = js.undefined
  }
  object Location {
    
    inline def apply(isAtPropertyKey: Boolean, matches: JSONPath => Boolean, path: JSONPath): Location = {
      val __obj = js.Dynamic.literal(isAtPropertyKey = isAtPropertyKey.asInstanceOf[js.Any], matches = js.Any.fromFunction1(matches), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setIsAtPropertyKey(value: Boolean): Self = StObject.set(x, "isAtPropertyKey", value.asInstanceOf[js.Any])
      
      inline def setMatches(value: JSONPath => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
      
      inline def setPath(value: JSONPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Segment*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPreviousNode(value: Node): Self = StObject.set(x, "previousNode", value.asInstanceOf[js.Any])
      
      inline def setPreviousNodeUndefined: Self = StObject.set(x, "previousNode", js.undefined)
    }
  }
  
  trait ModificationOptions extends StObject {
    
    /**
      * Formatting options. If undefined, the newly inserted code will be inserted unformatted.
      */
    var formattingOptions: js.UndefOr[FormattingOptions] = js.undefined
    
    /**
      * Optional function to define the insertion index given an existing list of properties.
      */
    var getInsertionIndex: js.UndefOr[js.Function1[/* properties */ js.Array[String], Double]] = js.undefined
    
    /**
      * Default false. If `JSONPath` refers to an index of an array and `isArrayInsertion` is `true`, then
      * {@linkcode modify} will insert a new item at that location instead of overwriting its contents.
      */
    var isArrayInsertion: js.UndefOr[Boolean] = js.undefined
  }
  object ModificationOptions {
    
    inline def apply(): ModificationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModificationOptions]
    }
    
    extension [Self <: ModificationOptions](x: Self) {
      
      inline def setFormattingOptions(value: FormattingOptions): Self = StObject.set(x, "formattingOptions", value.asInstanceOf[js.Any])
      
      inline def setFormattingOptionsUndefined: Self = StObject.set(x, "formattingOptions", js.undefined)
      
      inline def setGetInsertionIndex(value: /* properties */ js.Array[String] => Double): Self = StObject.set(x, "getInsertionIndex", js.Any.fromFunction1(value))
      
      inline def setGetInsertionIndexUndefined: Self = StObject.set(x, "getInsertionIndex", js.undefined)
      
      inline def setIsArrayInsertion(value: Boolean): Self = StObject.set(x, "isArrayInsertion", value.asInstanceOf[js.Any])
      
      inline def setIsArrayInsertionUndefined: Self = StObject.set(x, "isArrayInsertion", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    val children: js.UndefOr[js.Array[Node]] = js.undefined
    
    val colonOffset: js.UndefOr[Double] = js.undefined
    
    val length: Double
    
    val offset: Double
    
    val parent: js.UndefOr[Node] = js.undefined
    
    val `type`: NodeType
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object Node {
    
    inline def apply(length: Double, offset: Double, `type`: NodeType): Node = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setColonOffset(value: Double): Self = StObject.set(x, "colonOffset", value.asInstanceOf[js.Any])
      
      inline def setColonOffsetUndefined: Self = StObject.set(x, "colonOffset", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsoncParser.jsoncParserStrings.`object`
    - typingsJapgolly.jsoncParser.jsoncParserStrings.array
    - typingsJapgolly.jsoncParser.jsoncParserStrings.property
    - typingsJapgolly.jsoncParser.jsoncParserStrings.string
    - typingsJapgolly.jsoncParser.jsoncParserStrings.number
    - typingsJapgolly.jsoncParser.jsoncParserStrings.boolean
    - typingsJapgolly.jsoncParser.jsoncParserStrings.`null`
  */
  trait NodeType extends StObject
  object NodeType {
    
    inline def array: typingsJapgolly.jsoncParser.jsoncParserStrings.array = "array".asInstanceOf[typingsJapgolly.jsoncParser.jsoncParserStrings.array]
    
    inline def boolean: typingsJapgolly.jsoncParser.jsoncParserStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.jsoncParser.jsoncParserStrings.boolean]
    
    inline def `null`: typingsJapgolly.jsoncParser.jsoncParserStrings.`null` = "null".asInstanceOf[typingsJapgolly.jsoncParser.jsoncParserStrings.`null`]
    
    inline def number: typingsJapgolly.jsoncParser.jsoncParserStrings.number = "number".asInstanceOf[typingsJapgolly.jsoncParser.jsoncParserStrings.number]
    
    inline def `object`: typingsJapgolly.jsoncParser.jsoncParserStrings.`object` = "object".asInstanceOf[typingsJapgolly.jsoncParser.jsoncParserStrings.`object`]
    
    inline def property: typingsJapgolly.jsoncParser.jsoncParserStrings.property = "property".asInstanceOf[typingsJapgolly.jsoncParser.jsoncParserStrings.property]
    
    inline def string: typingsJapgolly.jsoncParser.jsoncParserStrings.string = "string".asInstanceOf[typingsJapgolly.jsoncParser.jsoncParserStrings.string]
  }
  
  trait ParseError extends StObject {
    
    var error: ParseErrorCode
    
    var length: Double
    
    var offset: Double
  }
  object ParseError {
    
    inline def apply(error: ParseErrorCode, length: Double, offset: Double): ParseError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    extension [Self <: ParseError](x: Self) {
      
      inline def setError(value: ParseErrorCode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsoncParser.jsoncParserInts.`1`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`2`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`3`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`4`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`5`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`6`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`7`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`8`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`9`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`10`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`11`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`12`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`13`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`14`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`15`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`16`
  */
  trait ParseErrorCode extends StObject
  object ParseErrorCode {
    
    inline def CloseBraceExpected: `7` = 7.asInstanceOf[`7`]
    
    inline def CloseBracketExpected: `8` = 8.asInstanceOf[`8`]
    
    inline def ColonExpected: `5` = 5.asInstanceOf[`5`]
    
    inline def CommaExpected: `6` = 6.asInstanceOf[`6`]
    
    inline def EndOfFileExpected: `9` = 9.asInstanceOf[`9`]
    
    inline def InvalidCharacter: `16` = 16.asInstanceOf[`16`]
    
    inline def InvalidCommentToken: `10` = 10.asInstanceOf[`10`]
    
    inline def InvalidEscapeCharacter: `15` = 15.asInstanceOf[`15`]
    
    inline def InvalidNumberFormat: `2` = 2.asInstanceOf[`2`]
    
    inline def InvalidSymbol: `1` = 1.asInstanceOf[`1`]
    
    inline def InvalidUnicode: `14` = 14.asInstanceOf[`14`]
    
    inline def PropertyNameExpected: `3` = 3.asInstanceOf[`3`]
    
    inline def UnexpectedEndOfComment: `11` = 11.asInstanceOf[`11`]
    
    inline def UnexpectedEndOfNumber: `13` = 13.asInstanceOf[`13`]
    
    inline def UnexpectedEndOfString: `12` = 12.asInstanceOf[`12`]
    
    inline def ValueExpected: `4` = 4.asInstanceOf[`4`]
  }
  
  trait ParseOptions extends StObject {
    
    var allowEmptyContent: js.UndefOr[Boolean] = js.undefined
    
    var allowTrailingComma: js.UndefOr[Boolean] = js.undefined
    
    var disallowComments: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setAllowEmptyContent(value: Boolean): Self = StObject.set(x, "allowEmptyContent", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyContentUndefined: Self = StObject.set(x, "allowEmptyContent", js.undefined)
      
      inline def setAllowTrailingComma(value: Boolean): Self = StObject.set(x, "allowTrailingComma", value.asInstanceOf[js.Any])
      
      inline def setAllowTrailingCommaUndefined: Self = StObject.set(x, "allowTrailingComma", js.undefined)
      
      inline def setDisallowComments(value: Boolean): Self = StObject.set(x, "disallowComments", value.asInstanceOf[js.Any])
      
      inline def setDisallowCommentsUndefined: Self = StObject.set(x, "disallowComments", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    /**
      * The length of the range. Must not be negative.
      */
    var length: Double
    
    /**
      * The start offset of the range.
      */
    var offset: Double
  }
  object Range {
    
    inline def apply(length: Double, offset: Double): Range = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsoncParser.jsoncParserInts.`0`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`1`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`2`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`3`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`4`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`5`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`6`
  */
  trait ScanError extends StObject
  object ScanError {
    
    inline def InvalidCharacter: `6` = 6.asInstanceOf[`6`]
    
    inline def InvalidEscapeCharacter: `5` = 5.asInstanceOf[`5`]
    
    inline def InvalidUnicode: `4` = 4.asInstanceOf[`4`]
    
    inline def None: `0` = 0.asInstanceOf[`0`]
    
    inline def UnexpectedEndOfComment: `1` = 1.asInstanceOf[`1`]
    
    inline def UnexpectedEndOfNumber: `3` = 3.asInstanceOf[`3`]
    
    inline def UnexpectedEndOfString: `2` = 2.asInstanceOf[`2`]
  }
  
  type Segment = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsoncParser.jsoncParserInts.`1`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`2`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`3`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`4`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`5`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`6`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`7`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`8`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`9`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`10`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`11`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`12`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`13`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`14`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`15`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`16`
    - typingsJapgolly.jsoncParser.jsoncParserInts.`17`
  */
  trait SyntaxKind extends StObject
  object SyntaxKind {
    
    inline def BlockCommentTrivia: `13` = 13.asInstanceOf[`13`]
    
    inline def CloseBraceToken: `2` = 2.asInstanceOf[`2`]
    
    inline def CloseBracketToken: `4` = 4.asInstanceOf[`4`]
    
    inline def ColonToken: `6` = 6.asInstanceOf[`6`]
    
    inline def CommaToken: `5` = 5.asInstanceOf[`5`]
    
    inline def EOF: `17` = 17.asInstanceOf[`17`]
    
    inline def FalseKeyword: `9` = 9.asInstanceOf[`9`]
    
    inline def LineBreakTrivia: `14` = 14.asInstanceOf[`14`]
    
    inline def LineCommentTrivia: `12` = 12.asInstanceOf[`12`]
    
    inline def NullKeyword: `7` = 7.asInstanceOf[`7`]
    
    inline def NumericLiteral: `11` = 11.asInstanceOf[`11`]
    
    inline def OpenBraceToken: `1` = 1.asInstanceOf[`1`]
    
    inline def OpenBracketToken: `3` = 3.asInstanceOf[`3`]
    
    inline def StringLiteral: `10` = 10.asInstanceOf[`10`]
    
    inline def Trivia: `15` = 15.asInstanceOf[`15`]
    
    inline def TrueKeyword: `8` = 8.asInstanceOf[`8`]
    
    inline def Unknown: `16` = 16.asInstanceOf[`16`]
  }
}
