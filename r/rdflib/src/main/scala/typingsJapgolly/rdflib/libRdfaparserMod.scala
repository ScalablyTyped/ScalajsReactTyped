package typingsJapgolly.rdflib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rdflib.anon.Incomplete
import typingsJapgolly.rdflib.anon.LocalName
import typingsJapgolly.rdflib.anon.Pattern
import typingsJapgolly.rdflib.anon.SelfClosing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRdfaparserMod {
  
  @JSImport("rdflib/lib/rdfaparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdflib/lib/rdfaparser", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RDFaProcessor {
    def this(kb: Any, options: Any) = this()
    
    /* CompleteClass */
    var absURIRE: js.RegExp = js.native
    
    /* CompleteClass */
    override def addTriple(origin: Any, subject: Any, predicate: Any, `object`: Any): Unit = js.native
    
    /* CompleteClass */
    override def ancestorPath(node: Any): String = js.native
    
    /* CompleteClass */
    var blankCounter: Double = js.native
    
    /* CompleteClass */
    var blankNodes: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def copyMappings(mappings: Any): js.Object = js.native
    
    /* CompleteClass */
    override def copyProperties(): Unit = js.native
    
    /* CompleteClass */
    override def deriveDateTimeType(value: Any): String | Null = js.native
    
    /* CompleteClass */
    var finishedHandlers: js.Array[Any] = js.native
    
    /* CompleteClass */
    var htmlOptions: SelfClosing = js.native
    
    /* CompleteClass */
    var inXHTMLMode: Boolean = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
    
    /* CompleteClass */
    var kb: Any = js.native
    
    /* CompleteClass */
    var langAttributes: js.Array[LocalName] = js.native
    
    /* CompleteClass */
    var language: Any = js.native
    
    /* CompleteClass */
    override def newBlankNode(): String = js.native
    
    /* CompleteClass */
    override def newSubjectOrigin(origin: Any, subject: Any): Unit = js.native
    
    /* CompleteClass */
    var options: Any = js.native
    
    /* CompleteClass */
    override def parseCURIE(value: Any, prefixes: Any, base: Any): Any = js.native
    
    /* CompleteClass */
    override def parseCURIEOrURI(value: Any, prefixes: Any, base: Any): Any = js.native
    
    /* CompleteClass */
    override def parsePredicate(value: Any, defaultVocabulary: Any, terms: Any, prefixes: Any, base: Any, ignoreTerms: Any): Any = js.native
    
    /* CompleteClass */
    override def parsePrefixMappings(str: Any, target: Any): Unit = js.native
    
    /* CompleteClass */
    override def parseSafeCURIEOrCURIEOrURI(value: Any, prefixes: Any, base: Any): Any = js.native
    
    /* CompleteClass */
    override def parseTermOrCURIEOrAbsURI(value: Any, defaultVocabulary: Any, terms: Any, prefixes: Any, base: Any): Any = js.native
    
    /* CompleteClass */
    override def parseTermOrCURIEOrURI(value: Any, defaultVocabulary: Any, terms: Any, prefixes: Any, base: Any): Any = js.native
    
    /* CompleteClass */
    override def parseURI(uri: Any): Any = js.native
    
    /* CompleteClass */
    override def process(node: Any, options: Any): Unit = js.native
    
    /* CompleteClass */
    override def push(parent: Any, subject: Any): Incomplete = js.native
    
    /* CompleteClass */
    override def resolveAndNormalize(base: Any, uri: Any): String = js.native
    
    /* CompleteClass */
    override def setContext(node: Any): Unit = js.native
    
    /* CompleteClass */
    override def setHTMLContext(): Unit = js.native
    
    /* CompleteClass */
    override def setInitialContext(): Unit = js.native
    
    /* CompleteClass */
    override def setXHTMLContext(): Unit = js.native
    
    /* CompleteClass */
    override def setXMLContext(): Unit = js.native
    
    /* CompleteClass */
    var target: Any = js.native
    
    /* CompleteClass */
    var theOne: String = js.native
    
    /* CompleteClass */
    override def toRDFNodeObject(x: Any): Any = js.native
    
    /* CompleteClass */
    override def tokenize(str: Any): Any = js.native
    
    /* CompleteClass */
    override def trim(str: Any): Any = js.native
    
    /* CompleteClass */
    var vocabulary: Any = js.native
  }
  object default {
    
    @JSImport("rdflib/lib/rdfaparser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.HTMLLiteralURI")
    @js.native
    val HTMLLiteralURI: String = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.NCNAME")
    @js.native
    val NCNAME: js.RegExp = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.PlainLiteralURI")
    @js.native
    val PlainLiteralURI: String = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.XMLLiteralURI")
    @js.native
    val XMLLiteralURI: String = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.dateTimeTypes")
    @js.native
    val dateTimeTypes: js.Array[Pattern] = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.nameChar")
    @js.native
    val nameChar: String = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.nameStartChar")
    @js.native
    val nameStartChar: String = js.native
    
    @JSImport("rdflib/lib/rdfaparser", "default.objectURI")
    @js.native
    val objectURI: String = js.native
    
    /* static member */
    inline def parseRDFaDOM(dom: Any, kb: Any, base: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRDFaDOM")(dom.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def tokenize(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* static member */
    inline def trim(str: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("rdflib/lib/rdfaparser", "default.typeURI")
    @js.native
    val typeURI: String = js.native
  }
  
  inline def parseRDFaDOM(dom: Any, kb: Any, base: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRDFaDOM")(dom.asInstanceOf[js.Any], kb.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait RDFaProcessor extends StObject {
    
    var absURIRE: js.RegExp
    
    def addTriple(origin: Any, subject: Any, predicate: Any, `object`: Any): Unit
    
    def ancestorPath(node: Any): String
    
    var blankCounter: Double
    
    var blankNodes: js.Array[Any]
    
    def copyMappings(mappings: Any): js.Object
    
    def copyProperties(): Unit
    
    def deriveDateTimeType(value: Any): String | Null
    
    var finishedHandlers: js.Array[Any]
    
    var htmlOptions: SelfClosing
    
    var inHTMLMode: js.UndefOr[Boolean] = js.undefined
    
    var inXHTMLMode: Boolean
    
    def init(): Unit
    
    var kb: Any
    
    var langAttributes: js.Array[LocalName]
    
    var language: Any
    
    def newBlankNode(): String
    
    def newSubjectOrigin(origin: Any, subject: Any): Unit
    
    var options: Any
    
    def parseCURIE(value: Any, prefixes: Any, base: Any): Any
    
    def parseCURIEOrURI(value: Any, prefixes: Any, base: Any): Any
    
    def parsePredicate(value: Any, defaultVocabulary: Any, terms: Any, prefixes: Any, base: Any, ignoreTerms: Any): Any
    
    def parsePrefixMappings(str: Any, target: Any): Unit
    
    def parseSafeCURIEOrCURIEOrURI(value: Any, prefixes: Any, base: Any): Any
    
    def parseTermOrCURIEOrAbsURI(value: Any, defaultVocabulary: Any, terms: Any, prefixes: Any, base: Any): Any
    
    def parseTermOrCURIEOrURI(value: Any, defaultVocabulary: Any, terms: Any, prefixes: Any, base: Any): Any
    
    def parseURI(uri: Any): Any
    
    def process(node: Any, options: Any): Unit
    
    def push(parent: Any, subject: Any): Incomplete
    
    def resolveAndNormalize(base: Any, uri: Any): String
    
    def setContext(node: Any): Unit
    
    def setHTMLContext(): Unit
    
    def setInitialContext(): Unit
    
    def setXHTMLContext(): Unit
    
    def setXMLContext(): Unit
    
    var target: Any
    
    var theOne: String
    
    def toRDFNodeObject(x: Any): Any
    
    def tokenize(str: Any): Any
    
    def trim(str: Any): Any
    
    var vocabulary: Any
  }
  object RDFaProcessor {
    
    inline def apply(
      absURIRE: js.RegExp,
      addTriple: (Any, Any, Any, Any) => Callback,
      ancestorPath: Any => String,
      blankCounter: Double,
      blankNodes: js.Array[Any],
      copyMappings: Any => js.Object,
      copyProperties: Callback,
      deriveDateTimeType: Any => String | Null,
      finishedHandlers: js.Array[Any],
      htmlOptions: SelfClosing,
      inXHTMLMode: Boolean,
      init: Callback,
      kb: Any,
      langAttributes: js.Array[LocalName],
      language: Any,
      newBlankNode: CallbackTo[String],
      newSubjectOrigin: (Any, Any) => Callback,
      options: Any,
      parseCURIE: (Any, Any, Any) => Any,
      parseCURIEOrURI: (Any, Any, Any) => Any,
      parsePredicate: (Any, Any, Any, Any, Any, Any) => Any,
      parsePrefixMappings: (Any, Any) => Callback,
      parseSafeCURIEOrCURIEOrURI: (Any, Any, Any) => Any,
      parseTermOrCURIEOrAbsURI: (Any, Any, Any, Any, Any) => Any,
      parseTermOrCURIEOrURI: (Any, Any, Any, Any, Any) => Any,
      parseURI: Any => Any,
      process: (Any, Any) => Callback,
      push: (Any, Any) => Incomplete,
      resolveAndNormalize: (Any, Any) => String,
      setContext: Any => Callback,
      setHTMLContext: Callback,
      setInitialContext: Callback,
      setXHTMLContext: Callback,
      setXMLContext: Callback,
      target: Any,
      theOne: String,
      toRDFNodeObject: Any => Any,
      tokenize: Any => Any,
      trim: Any => Any,
      vocabulary: Any
    ): RDFaProcessor = {
      val __obj = js.Dynamic.literal(absURIRE = absURIRE.asInstanceOf[js.Any], addTriple = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (addTriple(t0, t1, t2, t3)).runNow()), ancestorPath = js.Any.fromFunction1(ancestorPath), blankCounter = blankCounter.asInstanceOf[js.Any], blankNodes = blankNodes.asInstanceOf[js.Any], copyMappings = js.Any.fromFunction1(copyMappings), copyProperties = copyProperties.toJsFn, deriveDateTimeType = js.Any.fromFunction1(deriveDateTimeType), finishedHandlers = finishedHandlers.asInstanceOf[js.Any], htmlOptions = htmlOptions.asInstanceOf[js.Any], inXHTMLMode = inXHTMLMode.asInstanceOf[js.Any], init = init.toJsFn, kb = kb.asInstanceOf[js.Any], langAttributes = langAttributes.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], newBlankNode = newBlankNode.toJsFn, newSubjectOrigin = js.Any.fromFunction2((t0: Any, t1: Any) => (newSubjectOrigin(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], parseCURIE = js.Any.fromFunction3(parseCURIE), parseCURIEOrURI = js.Any.fromFunction3(parseCURIEOrURI), parsePredicate = js.Any.fromFunction6(parsePredicate), parsePrefixMappings = js.Any.fromFunction2((t0: Any, t1: Any) => (parsePrefixMappings(t0, t1)).runNow()), parseSafeCURIEOrCURIEOrURI = js.Any.fromFunction3(parseSafeCURIEOrCURIEOrURI), parseTermOrCURIEOrAbsURI = js.Any.fromFunction5(parseTermOrCURIEOrAbsURI), parseTermOrCURIEOrURI = js.Any.fromFunction5(parseTermOrCURIEOrURI), parseURI = js.Any.fromFunction1(parseURI), process = js.Any.fromFunction2((t0: Any, t1: Any) => (process(t0, t1)).runNow()), push = js.Any.fromFunction2(push), resolveAndNormalize = js.Any.fromFunction2(resolveAndNormalize), setContext = js.Any.fromFunction1((t0: Any) => setContext(t0).runNow()), setHTMLContext = setHTMLContext.toJsFn, setInitialContext = setInitialContext.toJsFn, setXHTMLContext = setXHTMLContext.toJsFn, setXMLContext = setXMLContext.toJsFn, target = target.asInstanceOf[js.Any], theOne = theOne.asInstanceOf[js.Any], toRDFNodeObject = js.Any.fromFunction1(toRDFNodeObject), tokenize = js.Any.fromFunction1(tokenize), trim = js.Any.fromFunction1(trim), vocabulary = vocabulary.asInstanceOf[js.Any])
      __obj.asInstanceOf[RDFaProcessor]
    }
    
    extension [Self <: RDFaProcessor](x: Self) {
      
      inline def setAbsURIRE(value: js.RegExp): Self = StObject.set(x, "absURIRE", value.asInstanceOf[js.Any])
      
      inline def setAddTriple(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "addTriple", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAncestorPath(value: Any => String): Self = StObject.set(x, "ancestorPath", js.Any.fromFunction1(value))
      
      inline def setBlankCounter(value: Double): Self = StObject.set(x, "blankCounter", value.asInstanceOf[js.Any])
      
      inline def setBlankNodes(value: js.Array[Any]): Self = StObject.set(x, "blankNodes", value.asInstanceOf[js.Any])
      
      inline def setBlankNodesVarargs(value: Any*): Self = StObject.set(x, "blankNodes", js.Array(value*))
      
      inline def setCopyMappings(value: Any => js.Object): Self = StObject.set(x, "copyMappings", js.Any.fromFunction1(value))
      
      inline def setCopyProperties(value: Callback): Self = StObject.set(x, "copyProperties", value.toJsFn)
      
      inline def setDeriveDateTimeType(value: Any => String | Null): Self = StObject.set(x, "deriveDateTimeType", js.Any.fromFunction1(value))
      
      inline def setFinishedHandlers(value: js.Array[Any]): Self = StObject.set(x, "finishedHandlers", value.asInstanceOf[js.Any])
      
      inline def setFinishedHandlersVarargs(value: Any*): Self = StObject.set(x, "finishedHandlers", js.Array(value*))
      
      inline def setHtmlOptions(value: SelfClosing): Self = StObject.set(x, "htmlOptions", value.asInstanceOf[js.Any])
      
      inline def setInHTMLMode(value: Boolean): Self = StObject.set(x, "inHTMLMode", value.asInstanceOf[js.Any])
      
      inline def setInHTMLModeUndefined: Self = StObject.set(x, "inHTMLMode", js.undefined)
      
      inline def setInXHTMLMode(value: Boolean): Self = StObject.set(x, "inXHTMLMode", value.asInstanceOf[js.Any])
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setKb(value: Any): Self = StObject.set(x, "kb", value.asInstanceOf[js.Any])
      
      inline def setLangAttributes(value: js.Array[LocalName]): Self = StObject.set(x, "langAttributes", value.asInstanceOf[js.Any])
      
      inline def setLangAttributesVarargs(value: LocalName*): Self = StObject.set(x, "langAttributes", js.Array(value*))
      
      inline def setLanguage(value: Any): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setNewBlankNode(value: CallbackTo[String]): Self = StObject.set(x, "newBlankNode", value.toJsFn)
      
      inline def setNewSubjectOrigin(value: (Any, Any) => Callback): Self = StObject.set(x, "newSubjectOrigin", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParseCURIE(value: (Any, Any, Any) => Any): Self = StObject.set(x, "parseCURIE", js.Any.fromFunction3(value))
      
      inline def setParseCURIEOrURI(value: (Any, Any, Any) => Any): Self = StObject.set(x, "parseCURIEOrURI", js.Any.fromFunction3(value))
      
      inline def setParsePredicate(value: (Any, Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "parsePredicate", js.Any.fromFunction6(value))
      
      inline def setParsePrefixMappings(value: (Any, Any) => Callback): Self = StObject.set(x, "parsePrefixMappings", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setParseSafeCURIEOrCURIEOrURI(value: (Any, Any, Any) => Any): Self = StObject.set(x, "parseSafeCURIEOrCURIEOrURI", js.Any.fromFunction3(value))
      
      inline def setParseTermOrCURIEOrAbsURI(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "parseTermOrCURIEOrAbsURI", js.Any.fromFunction5(value))
      
      inline def setParseTermOrCURIEOrURI(value: (Any, Any, Any, Any, Any) => Any): Self = StObject.set(x, "parseTermOrCURIEOrURI", js.Any.fromFunction5(value))
      
      inline def setParseURI(value: Any => Any): Self = StObject.set(x, "parseURI", js.Any.fromFunction1(value))
      
      inline def setProcess(value: (Any, Any) => Callback): Self = StObject.set(x, "process", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setPush(value: (Any, Any) => Incomplete): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setResolveAndNormalize(value: (Any, Any) => String): Self = StObject.set(x, "resolveAndNormalize", js.Any.fromFunction2(value))
      
      inline def setSetContext(value: Any => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetHTMLContext(value: Callback): Self = StObject.set(x, "setHTMLContext", value.toJsFn)
      
      inline def setSetInitialContext(value: Callback): Self = StObject.set(x, "setInitialContext", value.toJsFn)
      
      inline def setSetXHTMLContext(value: Callback): Self = StObject.set(x, "setXHTMLContext", value.toJsFn)
      
      inline def setSetXMLContext(value: Callback): Self = StObject.set(x, "setXMLContext", value.toJsFn)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTheOne(value: String): Self = StObject.set(x, "theOne", value.asInstanceOf[js.Any])
      
      inline def setToRDFNodeObject(value: Any => Any): Self = StObject.set(x, "toRDFNodeObject", js.Any.fromFunction1(value))
      
      inline def setTokenize(value: Any => Any): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
      
      inline def setTrim(value: Any => Any): Self = StObject.set(x, "trim", js.Any.fromFunction1(value))
      
      inline def setVocabulary(value: Any): Self = StObject.set(x, "vocabulary", value.asInstanceOf[js.Any])
    }
  }
}
