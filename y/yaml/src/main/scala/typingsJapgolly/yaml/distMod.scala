package typingsJapgolly.yaml

import typingsJapgolly.yaml.anon.AfterKey
import typingsJapgolly.yaml.anon.End
import typingsJapgolly.yaml.anon.Value
import typingsJapgolly.yaml.distDocApplyReviverMod.Reviver
import typingsJapgolly.yaml.distDocDocumentMod.Document.Parsed
import typingsJapgolly.yaml.distDocDocumentMod.Replacer
import typingsJapgolly.yaml.distErrorsMod.ErrorCode
import typingsJapgolly.yaml.distNodesNodeMod.Node
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distOptionsMod.CreateNodeOptions
import typingsJapgolly.yaml.distOptionsMod.DocumentOptions
import typingsJapgolly.yaml.distOptionsMod.ParseOptions
import typingsJapgolly.yaml.distOptionsMod.SchemaOptions
import typingsJapgolly.yaml.distOptionsMod.ToJSOptions
import typingsJapgolly.yaml.distOptionsMod.ToStringOptions
import typingsJapgolly.yaml.distParseCstMod.BlockMap
import typingsJapgolly.yaml.distParseCstMod.BlockScalar
import typingsJapgolly.yaml.distParseCstMod.BlockSequence
import typingsJapgolly.yaml.distParseCstMod.CollectionItem
import typingsJapgolly.yaml.distParseCstMod.FlowCollection
import typingsJapgolly.yaml.distParseCstMod.FlowScalar
import typingsJapgolly.yaml.distParseCstMod.Token
import typingsJapgolly.yaml.distParseCstMod.TokenType_
import typingsJapgolly.yaml.distParseCstVisitMod.VisitPath
import typingsJapgolly.yaml.distParseCstVisitMod.Visitor
import typingsJapgolly.yaml.distPublicApiMod.EmptyStream
import typingsJapgolly.yaml.distVisitMod.asyncVisitor
import typingsJapgolly.yaml.distVisitMod.visitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("yaml/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist", "Alias")
  @js.native
  open class Alias protected ()
    extends typingsJapgolly.yaml.distNodesAliasMod.Alias {
    def this(source: String) = this()
  }
  
  object CST {
    
    @JSImport("yaml/dist", "CST")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist", "CST.BOM")
    @js.native
    val BOM: /* "\\uFEFF" */ String = js.native
    
    @JSImport("yaml/dist", "CST.DOCUMENT")
    @js.native
    val DOCUMENT: /* "\\u0002" */ String = js.native
    
    @JSImport("yaml/dist", "CST.FLOW_END")
    @js.native
    val FLOW_END: /* "\\u0018" */ String = js.native
    
    @JSImport("yaml/dist", "CST.SCALAR")
    @js.native
    val SCALAR: /* "\\u001F" */ String = js.native
    
    inline def createScalarToken(value: String, context: End): BlockScalar | FlowScalar = (^.asInstanceOf[js.Dynamic].applyDynamic("createScalarToken")(value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[BlockScalar | FlowScalar]
    
    inline def isCollection(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")().asInstanceOf[Boolean]
    inline def isCollection(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isScalar(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")().asInstanceOf[Boolean]
    inline def isScalar(token: Token): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def prettyToken(token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyToken")(token.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def resolveAsScalar(): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")().asInstanceOf[Value | Null]
    inline def resolveAsScalar(token: Null, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(
      token: Null,
      strict: Boolean,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(
      token: Null,
      strict: Unit,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(token: Unit, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(
      token: Unit,
      strict: Boolean,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(
      token: Unit,
      strict: Unit,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(token: BlockScalar): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value]
    inline def resolveAsScalar(token: BlockScalar, strict: Boolean): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value]
    inline def resolveAsScalar(
      token: BlockScalar,
      strict: Boolean,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
    inline def resolveAsScalar(
      token: BlockScalar,
      strict: Unit,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
    inline def resolveAsScalar(token: FlowScalar): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value]
    inline def resolveAsScalar(token: FlowScalar, strict: Boolean): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value]
    inline def resolveAsScalar(
      token: FlowScalar,
      strict: Boolean,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
    inline def resolveAsScalar(
      token: FlowScalar,
      strict: Unit,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value]
    inline def resolveAsScalar(token: Token): Value | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any]).asInstanceOf[Value | Null]
    inline def resolveAsScalar(token: Token, strict: Boolean): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(
      token: Token,
      strict: Boolean,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    inline def resolveAsScalar(
      token: Token,
      strict: Unit,
      onError: js.Function3[/* offset */ Double, /* code */ ErrorCode, /* message */ String, Unit]
    ): Value | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAsScalar")(token.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Value | Null]
    
    inline def setScalarValue(token: Token, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setScalarValue(token: Token, value: String, context: AfterKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScalarValue")(token.asInstanceOf[js.Any], value.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stringify(cst: CollectionItem): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(cst.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(cst: Token): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(cst.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def tokenType(source: String): TokenType_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenType")(source.asInstanceOf[js.Any]).asInstanceOf[TokenType_ | Null]
    
    object visit {
      
      inline def apply(cst: CollectionItem, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(cst.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def apply(cst: typingsJapgolly.yaml.distParseCstMod.Document, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(cst.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("yaml/dist", "CST.visit")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("yaml/dist", "CST.visit.BREAK")
      @js.native
      def BREAK: js.Symbol = js.native
      inline def BREAK_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BREAK")(x.asInstanceOf[js.Any])
      
      @JSImport("yaml/dist", "CST.visit.REMOVE")
      @js.native
      def REMOVE: js.Symbol = js.native
      inline def REMOVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(x.asInstanceOf[js.Any])
      
      @JSImport("yaml/dist", "CST.visit.SKIP")
      @js.native
      def SKIP: js.Symbol = js.native
      inline def SKIP_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
      
      @JSImport("yaml/dist", "CST.visit.itemAtPath")
      @js.native
      def itemAtPath: js.Function2[
            /* cst */ typingsJapgolly.yaml.distParseCstMod.Document | CollectionItem, 
            /* path */ VisitPath, 
            js.UndefOr[CollectionItem]
          ] = js.native
      inline def itemAtPath_=(
        x: js.Function2[
              /* cst */ typingsJapgolly.yaml.distParseCstMod.Document | CollectionItem, 
              /* path */ VisitPath, 
              js.UndefOr[CollectionItem]
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemAtPath")(x.asInstanceOf[js.Any])
      
      @JSImport("yaml/dist", "CST.visit.parentCollection")
      @js.native
      def parentCollection: js.Function2[
            /* cst */ typingsJapgolly.yaml.distParseCstMod.Document | CollectionItem, 
            /* path */ VisitPath, 
            BlockMap | BlockSequence | FlowCollection
          ] = js.native
      inline def parentCollection_=(
        x: js.Function2[
              /* cst */ typingsJapgolly.yaml.distParseCstMod.Document | CollectionItem, 
              /* path */ VisitPath, 
              BlockMap | BlockSequence | FlowCollection
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentCollection")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("yaml/dist", "Composer")
  @js.native
  open class Composer ()
    extends typingsJapgolly.yaml.distComposeComposerMod.Composer {
    def this(options: ParseOptions & DocumentOptions & SchemaOptions) = this()
  }
  
  @JSImport("yaml/dist", "Document")
  @js.native
  /**
    * @param value - The initial value for the document, which will be wrapped
    *   in a Node container.
    */
  open class Document[T /* <: Node[Any] */] ()
    extends typingsJapgolly.yaml.distDocDocumentMod.Document[T] {
    def this(value: Any) = this()
    def this(value: Any, options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions) = this()
    def this(value: Any, replacer: Replacer) = this()
    def this(value: Unit, options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions) = this()
    def this(
      value: Any,
      replacer: Null,
      options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions
    ) = this()
    def this(
      value: Any,
      replacer: Replacer,
      options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions
    ) = this()
  }
  
  @JSImport("yaml/dist", "Lexer")
  @js.native
  open class Lexer ()
    extends typingsJapgolly.yaml.distParseLexerMod.Lexer
  
  @JSImport("yaml/dist", "LineCounter")
  @js.native
  open class LineCounter ()
    extends typingsJapgolly.yaml.distParseLineCounterMod.LineCounter
  
  @JSImport("yaml/dist", "Pair")
  @js.native
  open class Pair[K, V] protected ()
    extends typingsJapgolly.yaml.distNodesPairMod.Pair[K, V] {
    def this(key: K) = this()
    def this(key: K, value: V) = this()
  }
  
  @JSImport("yaml/dist", "Parser")
  @js.native
  /**
    * @param onNewLine - If defined, called separately with the start position of
    *   each new line (in `parse()`, including the start of input).
    */
  open class Parser ()
    extends typingsJapgolly.yaml.distParseParserMod.Parser {
    def this(onNewLine: js.Function1[/* offset */ Double, Unit]) = this()
  }
  
  @JSImport("yaml/dist", "Scalar")
  @js.native
  open class Scalar[T] protected ()
    extends typingsJapgolly.yaml.distNodesScalarMod.Scalar[T] {
    def this(value: T) = this()
  }
  /* static members */
  object Scalar {
    
    @JSImport("yaml/dist", "Scalar.BLOCK_FOLDED")
    @js.native
    val BLOCK_FOLDED: /* "BLOCK_FOLDED" */ String = js.native
    
    @JSImport("yaml/dist", "Scalar.BLOCK_LITERAL")
    @js.native
    val BLOCK_LITERAL: /* "BLOCK_LITERAL" */ String = js.native
    
    @JSImport("yaml/dist", "Scalar.PLAIN")
    @js.native
    val PLAIN: /* "PLAIN" */ String = js.native
    
    @JSImport("yaml/dist", "Scalar.QUOTE_DOUBLE")
    @js.native
    val QUOTE_DOUBLE: /* "QUOTE_DOUBLE" */ String = js.native
    
    @JSImport("yaml/dist", "Scalar.QUOTE_SINGLE")
    @js.native
    val QUOTE_SINGLE: /* "QUOTE_SINGLE" */ String = js.native
  }
  
  @JSImport("yaml/dist", "Schema")
  @js.native
  open class Schema protected ()
    extends typingsJapgolly.yaml.distSchemaSchemaMod.Schema {
    def this(hasCompatCustomTagsMergeResolveKnownTagsSchemaSortMapEntriesToStringDefaults: SchemaOptions) = this()
  }
  
  @JSImport("yaml/dist", "YAMLError")
  @js.native
  open class YAMLError protected ()
    extends typingsJapgolly.yaml.distErrorsMod.YAMLError {
    def this(
      name: typingsJapgolly.yaml.yamlStrings.YAMLParseError | typingsJapgolly.yaml.yamlStrings.YAMLWarning,
      pos: js.Tuple2[Double, Double],
      code: ErrorCode,
      message: String
    ) = this()
  }
  
  @JSImport("yaml/dist", "YAMLMap")
  @js.native
  open class YAMLMap[K, V] ()
    extends typingsJapgolly.yaml.distNodesYamlmapMod.YAMLMap[K, V] {
    def this(schema: typingsJapgolly.yaml.distSchemaSchemaMod.Schema) = this()
  }
  
  @JSImport("yaml/dist", "YAMLOMap")
  @js.native
  open class YAMLOMap ()
    extends typingsJapgolly.yaml.distSchemaYaml1Dot1OmapMod.YAMLOMap
  /* static members */
  object YAMLOMap {
    
    @JSImport("yaml/dist", "YAMLOMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist", "YAMLOMap.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("yaml/dist", "YAMLParseError")
  @js.native
  open class YAMLParseError protected ()
    extends typingsJapgolly.yaml.distErrorsMod.YAMLParseError {
    def this(pos: js.Tuple2[Double, Double], code: ErrorCode, message: String) = this()
  }
  
  @JSImport("yaml/dist", "YAMLSeq")
  @js.native
  open class YAMLSeq[T] ()
    extends typingsJapgolly.yaml.distNodesYamlseqMod.YAMLSeq[T] {
    def this(schema: typingsJapgolly.yaml.distSchemaSchemaMod.Schema) = this()
  }
  
  @JSImport("yaml/dist", "YAMLSet")
  @js.native
  open class YAMLSet[T] ()
    extends typingsJapgolly.yaml.distSchemaYaml1Dot1SetMod.YAMLSet[T] {
    def this(schema: typingsJapgolly.yaml.distSchemaSchemaMod.Schema) = this()
  }
  /* static members */
  object YAMLSet {
    
    @JSImport("yaml/dist", "YAMLSet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist", "YAMLSet.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("yaml/dist", "YAMLWarning")
  @js.native
  open class YAMLWarning protected ()
    extends typingsJapgolly.yaml.distErrorsMod.YAMLWarning {
    def this(pos: js.Tuple2[Double, Double], code: ErrorCode, message: String) = this()
  }
  
  inline def isAlias(node: Any): /* is yaml.yaml/dist/nodes/Alias.Alias */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlias")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Alias.Alias */ Boolean]
  
  inline def isCollection[K, V](node: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDocument[T /* <: Node[Any] */](node: Any): /* is yaml.yaml/dist/doc/Document.Document<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/doc/Document.Document<T> */ Boolean]
  
  inline def isMap[K, V](node: Any): /* is yaml.yaml/dist/nodes/YAMLMap.YAMLMap<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMap")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/YAMLMap.YAMLMap<K, V> */ Boolean]
  
  inline def isNode[T](node: Any): /* is yaml.yaml/dist/nodes/Node.Node<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Node.Node<T> */ Boolean]
  
  inline def isPair[K, V](node: Any): /* is yaml.yaml/dist/nodes/Pair.Pair<K, V> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPair")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Pair.Pair<K, V> */ Boolean]
  
  inline def isScalar[T](node: Any): /* is yaml.yaml/dist/nodes/Scalar.Scalar<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalar")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/Scalar.Scalar<T> */ Boolean]
  
  inline def isSeq[T](node: Any): /* is yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSeq")(node.asInstanceOf[js.Any]).asInstanceOf[/* is yaml.yaml/dist/nodes/YAMLSeq.YAMLSeq<T> */ Boolean]
  
  inline def parse(src: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(src: String, options: ParseOptions & DocumentOptions & SchemaOptions & ToJSOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(src: String, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(
    src: String,
    reviver: Reviver,
    options: ParseOptions & DocumentOptions & SchemaOptions & ToJSOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseAllDocuments[T /* <: ParsedNode */](source: String): js.Array[Parsed[T]] | EmptyStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAllDocuments")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parsed[T]] | EmptyStream]
  inline def parseAllDocuments[T /* <: ParsedNode */](source: String, options: ParseOptions & DocumentOptions & SchemaOptions): js.Array[Parsed[T]] | EmptyStream = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAllDocuments")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Parsed[T]] | EmptyStream]
  
  inline def parseDocument[T /* <: ParsedNode */](source: String): Parsed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(source.asInstanceOf[js.Any]).asInstanceOf[Parsed[T]]
  inline def parseDocument[T /* <: ParsedNode */](source: String, options: ParseOptions & DocumentOptions & SchemaOptions): Parsed[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parsed[T]]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(
    value: Any,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Null,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Unit,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Replacer,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object visit {
    
    inline def apply(node: Null, visitor: visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(node: typingsJapgolly.yaml.distDocDocumentMod.Document[Node[Any]], visitor: visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(node: Node[Any], visitor: visitor): Unit = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yaml/dist", "visit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist", "visit.BREAK")
    @js.native
    def BREAK: js.Symbol = js.native
    inline def BREAK_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BREAK")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist", "visit.REMOVE")
    @js.native
    def REMOVE: js.Symbol = js.native
    inline def REMOVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist", "visit.SKIP")
    @js.native
    def SKIP: js.Symbol = js.native
    inline def SKIP_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
  }
  
  object visitAsync {
    
    inline def apply(node: Null, visitor: asyncVisitor): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply(node: typingsJapgolly.yaml.distDocDocumentMod.Document[Node[Any]], visitor: asyncVisitor): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def apply(node: Node[Any], visitor: asyncVisitor): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("yaml/dist", "visitAsync")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist", "visitAsync.BREAK")
    @js.native
    def BREAK: js.Symbol = js.native
    inline def BREAK_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BREAK")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist", "visitAsync.REMOVE")
    @js.native
    def REMOVE: js.Symbol = js.native
    inline def REMOVE_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist", "visitAsync.SKIP")
    @js.native
    def SKIP: js.Symbol = js.native
    inline def SKIP_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKIP")(x.asInstanceOf[js.Any])
  }
}
