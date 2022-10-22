package typingsJapgolly.istanbulLibReport

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMap
import typingsJapgolly.istanbulLibCoverage.mod.CoverageSummary
import typingsJapgolly.istanbulLibCoverage.mod.FileCoverage
import typingsJapgolly.istanbulLibReport.anon.PartialContextOptions
import typingsJapgolly.istanbulLibReport.anon.PartialReportBaseOptions
import typingsJapgolly.istanbulLibReport.anon.PartialWatermarks
import typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.branches
import typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.functions
import typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.lines
import typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.statements
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-lib-report", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("istanbul-lib-report", "ConsoleWriter")
  @js.native
  open class ConsoleWriter () extends ContentWriter {
    
    def write(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "ContentWriter")
  @js.native
  open class ContentWriter () extends StObject {
    
    /**
      * closes this content writer. Should be called after all writes are complete.
      */
    def close(): Unit = js.native
    
    /**
      * returns the colorized version of a string. Typically,
      * content writers that write to files will return the
      * same string and ones writing to a tty will wrap it in
      * appropriate escape sequences.
      */
    def colorize(str: String): String = js.native
    def colorize(str: String, clazz: String): String = js.native
    
    /**
      * writes a string appended with a newline to the destination
      */
    def println(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "FileContentWriter")
  @js.native
  open class FileContentWriter protected () extends ContentWriter {
    def this(fileDescriptor: Double) = this()
    
    def write(str: String): Unit = js.native
  }
  
  @JSImport("istanbul-lib-report", "FileWriter")
  @js.native
  open class FileWriter protected () extends StObject {
    def this(baseDir: String) = this()
    
    /**
      * copies a file from a source directory to a destination name
      */
    def copyFile(source: String, dest: String): Unit = js.native
    def copyFile(source: String, dest: String, header: String): Unit = js.native
    
    /**
      * returns a content writer for writing content to the supplied file.
      */
    def writeFile(): ContentWriter = js.native
    def writeFile(file: String): ContentWriter = js.native
    
    /**
      * returns a FileWriter that is rooted at the supplied subdirectory
      */
    def writeForDir(subdir: String): FileWriter = js.native
  }
  /* static members */
  object FileWriter {
    
    @JSImport("istanbul-lib-report", "FileWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getOutput(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutput")().asInstanceOf[String]
    
    inline def resetOutput(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetOutput")().asInstanceOf[Unit]
    
    inline def startCapture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startCapture")().asInstanceOf[Unit]
    
    inline def stopCapture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopCapture")().asInstanceOf[Unit]
  }
  
  @JSImport("istanbul-lib-report", "ReportBase")
  @js.native
  open class ReportBase () extends StObject {
    def this(options: PartialReportBaseOptions) = this()
    
    def execute(context: Context): Unit = js.native
  }
  
  inline def createContext(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[Context]
  inline def createContext(options: PartialContextOptions): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(options.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def getDefaultWatermarks(): Watermarks = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultWatermarks")().asInstanceOf[Watermarks]
  
  @js.native
  trait Context extends StObject {
    
    /**
      * returns the coverage class given a coverage
      * types and a percentage value.
      */
    def classForPercent(`type`: statements | functions | branches | lines, value: Double): String = js.native
    
    var data: Any = js.native
    
    var dir: String = js.native
    
    /**
      * returns the source code for the specified file path or throws if
      * the source could not be found.
      */
    def getSource(filepath: String): String = js.native
    
    def getTree(): Tree[Node] = js.native
    def getTree(summarizer: Summarizers): Tree[Node] = js.native
    
    /**
      * returns a full visitor given a partial one.
      */
    def getVisitor[N /* <: Node */](visitor: Partial[Visitor[N]]): Visitor[N] = js.native
    
    /**
      * returns a FileWriter implementation for reporting use. Also available
      * as the `writer` property on the context.
      */
    def getWriter(): FileWriter = js.native
    
    /**
      * returns an XML writer for the supplied content writer
      */
    def getXmlWriter(contentWriter: ContentWriter): XmlWriter = js.native
    
    def sourceFinder(filepath: String): String = js.native
    
    var watermarks: Watermarks = js.native
    
    var writer: FileWriter = js.native
  }
  
  trait ContextOptions extends StObject {
    
    var coverageMap: CoverageMap
    
    var defaultSummarizer: Summarizers
    
    var dir: String
    
    def sourceFinder(filepath: String): String
    
    var watermarks: PartialWatermarks
  }
  object ContextOptions {
    
    inline def apply(
      coverageMap: CoverageMap,
      defaultSummarizer: Summarizers,
      dir: String,
      sourceFinder: String => String,
      watermarks: PartialWatermarks
    ): ContextOptions = {
      val __obj = js.Dynamic.literal(coverageMap = coverageMap.asInstanceOf[js.Any], defaultSummarizer = defaultSummarizer.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], sourceFinder = js.Any.fromFunction1(sourceFinder), watermarks = watermarks.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextOptions]
    }
    
    extension [Self <: ContextOptions](x: Self) {
      
      inline def setCoverageMap(value: CoverageMap): Self = StObject.set(x, "coverageMap", value.asInstanceOf[js.Any])
      
      inline def setDefaultSummarizer(value: Summarizers): Self = StObject.set(x, "defaultSummarizer", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setSourceFinder(value: String => String): Self = StObject.set(x, "sourceFinder", js.Any.fromFunction1(value))
      
      inline def setWatermarks(value: PartialWatermarks): Self = StObject.set(x, "watermarks", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    def isRoot(): Boolean
    
    def visit(visitor: Visitor[Node], state: Any): Unit
  }
  object Node {
    
    inline def apply(isRoot: CallbackTo[Boolean], visit: (Visitor[Node], Any) => Callback): Node = {
      val __obj = js.Dynamic.literal(isRoot = isRoot.toJsFn, visit = js.Any.fromFunction2((t0: Visitor[Node], t1: Any) => (visit(t0, t1)).runNow()))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setIsRoot(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRoot", value.toJsFn)
      
      inline def setVisit(value: (Visitor[Node], Any) => Callback): Self = StObject.set(x, "visit", js.Any.fromFunction2((t0: Visitor[Node], t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  trait ReportBaseOptions extends StObject {
    
    var summarizer: Summarizers
  }
  object ReportBaseOptions {
    
    inline def apply(summarizer: Summarizers): ReportBaseOptions = {
      val __obj = js.Dynamic.literal(summarizer = summarizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportBaseOptions]
    }
    
    extension [Self <: ReportBaseOptions](x: Self) {
      
      inline def setSummarizer(value: Summarizers): Self = StObject.set(x, "summarizer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportNode
    extends StObject
       with Node {
    
    def addChild(child: ReportNode): Unit
    
    def asRelative(p: String): String
    
    var children: js.Array[ReportNode]
    
    var fileCoverage: FileCoverage
    
    def getChildren(): js.Array[Node]
    
    def getCoverageSummary(filesOnly: Boolean): CoverageSummary
    
    def getFileCoverage(): FileCoverage
    
    def getParent(): Node
    
    def getQualifiedName(): String
    
    def getRelativeName(): String
    
    def isSummary(): Boolean
    
    var parent: ReportNode | Null
    
    var path: String
  }
  object ReportNode {
    
    inline def apply(
      addChild: ReportNode => Callback,
      asRelative: String => String,
      children: js.Array[ReportNode],
      fileCoverage: FileCoverage,
      getChildren: CallbackTo[js.Array[Node]],
      getCoverageSummary: Boolean => CoverageSummary,
      getFileCoverage: CallbackTo[FileCoverage],
      getParent: CallbackTo[Node],
      getQualifiedName: CallbackTo[String],
      getRelativeName: CallbackTo[String],
      isRoot: CallbackTo[Boolean],
      isSummary: CallbackTo[Boolean],
      path: String,
      visit: (Visitor[Node], Any) => Callback
    ): ReportNode = {
      val __obj = js.Dynamic.literal(addChild = js.Any.fromFunction1((t0: ReportNode) => addChild(t0).runNow()), asRelative = js.Any.fromFunction1(asRelative), children = children.asInstanceOf[js.Any], fileCoverage = fileCoverage.asInstanceOf[js.Any], getChildren = getChildren.toJsFn, getCoverageSummary = js.Any.fromFunction1(getCoverageSummary), getFileCoverage = getFileCoverage.toJsFn, getParent = getParent.toJsFn, getQualifiedName = getQualifiedName.toJsFn, getRelativeName = getRelativeName.toJsFn, isRoot = isRoot.toJsFn, isSummary = isSummary.toJsFn, path = path.asInstanceOf[js.Any], visit = js.Any.fromFunction2((t0: Visitor[Node], t1: Any) => (visit(t0, t1)).runNow()), parent = null)
      __obj.asInstanceOf[ReportNode]
    }
    
    extension [Self <: ReportNode](x: Self) {
      
      inline def setAddChild(value: ReportNode => Callback): Self = StObject.set(x, "addChild", js.Any.fromFunction1((t0: ReportNode) => value(t0).runNow()))
      
      inline def setAsRelative(value: String => String): Self = StObject.set(x, "asRelative", js.Any.fromFunction1(value))
      
      inline def setChildren(value: js.Array[ReportNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReportNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setFileCoverage(value: FileCoverage): Self = StObject.set(x, "fileCoverage", value.asInstanceOf[js.Any])
      
      inline def setGetChildren(value: CallbackTo[js.Array[Node]]): Self = StObject.set(x, "getChildren", value.toJsFn)
      
      inline def setGetCoverageSummary(value: Boolean => CoverageSummary): Self = StObject.set(x, "getCoverageSummary", js.Any.fromFunction1(value))
      
      inline def setGetFileCoverage(value: CallbackTo[FileCoverage]): Self = StObject.set(x, "getFileCoverage", value.toJsFn)
      
      inline def setGetParent(value: CallbackTo[Node]): Self = StObject.set(x, "getParent", value.toJsFn)
      
      inline def setGetQualifiedName(value: CallbackTo[String]): Self = StObject.set(x, "getQualifiedName", value.toJsFn)
      
      inline def setGetRelativeName(value: CallbackTo[String]): Self = StObject.set(x, "getRelativeName", value.toJsFn)
      
      inline def setIsSummary(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSummary", value.toJsFn)
      
      inline def setParent(value: ReportNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.flat
    - typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.nested
    - typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.pkg
    - typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer
  */
  trait Summarizers extends StObject
  object Summarizers {
    
    inline def defaultSummarizer: typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer = "defaultSummarizer".asInstanceOf[typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.defaultSummarizer]
    
    inline def flat: typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.flat = "flat".asInstanceOf[typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.flat]
    
    inline def nested: typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.nested = "nested".asInstanceOf[typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.nested]
    
    inline def pkg: typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.pkg = "pkg".asInstanceOf[typingsJapgolly.istanbulLibReport.istanbulLibReportStrings.pkg]
  }
  
  trait Tree[N /* <: Node */] extends StObject {
    
    def getRoot(): N
    
    def visit(visitor: Partial[Visitor[N]], state: Any): Unit
  }
  object Tree {
    
    inline def apply[N /* <: Node */](getRoot: CallbackTo[N], visit: (Partial[Visitor[N]], Any) => Callback): Tree[N] = {
      val __obj = js.Dynamic.literal(getRoot = getRoot.toJsFn, visit = js.Any.fromFunction2((t0: Partial[Visitor[N]], t1: Any) => (visit(t0, t1)).runNow()))
      __obj.asInstanceOf[Tree[N]]
    }
    
    extension [Self <: Tree[?], N /* <: Node */](x: Self & Tree[N]) {
      
      inline def setGetRoot(value: CallbackTo[N]): Self = StObject.set(x, "getRoot", value.toJsFn)
      
      inline def setVisit(value: (Partial[Visitor[N]], Any) => Callback): Self = StObject.set(x, "visit", js.Any.fromFunction2((t0: Partial[Visitor[N]], t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Visitor[N /* <: Node */] extends StObject {
    
    def onDetail(root: N, state: Any): Unit
    
    def onEnd(root: N, state: Any): Unit
    
    def onStart(root: N, state: Any): Unit
    
    def onSummary(root: N, state: Any): Unit
    
    def onSummaryEnd(root: N, state: Any): Unit
  }
  object Visitor {
    
    inline def apply[N /* <: Node */](
      onDetail: (N, Any) => Callback,
      onEnd: (N, Any) => Callback,
      onStart: (N, Any) => Callback,
      onSummary: (N, Any) => Callback,
      onSummaryEnd: (N, Any) => Callback
    ): Visitor[N] = {
      val __obj = js.Dynamic.literal(onDetail = js.Any.fromFunction2((t0: N, t1: Any) => (onDetail(t0, t1)).runNow()), onEnd = js.Any.fromFunction2((t0: N, t1: Any) => (onEnd(t0, t1)).runNow()), onStart = js.Any.fromFunction2((t0: N, t1: Any) => (onStart(t0, t1)).runNow()), onSummary = js.Any.fromFunction2((t0: N, t1: Any) => (onSummary(t0, t1)).runNow()), onSummaryEnd = js.Any.fromFunction2((t0: N, t1: Any) => (onSummaryEnd(t0, t1)).runNow()))
      __obj.asInstanceOf[Visitor[N]]
    }
    
    extension [Self <: Visitor[?], N /* <: Node */](x: Self & Visitor[N]) {
      
      inline def setOnDetail(value: (N, Any) => Callback): Self = StObject.set(x, "onDetail", js.Any.fromFunction2((t0: N, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnEnd(value: (N, Any) => Callback): Self = StObject.set(x, "onEnd", js.Any.fromFunction2((t0: N, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnStart(value: (N, Any) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: N, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnSummary(value: (N, Any) => Callback): Self = StObject.set(x, "onSummary", js.Any.fromFunction2((t0: N, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnSummaryEnd(value: (N, Any) => Callback): Self = StObject.set(x, "onSummaryEnd", js.Any.fromFunction2((t0: N, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  type Watermark = js.Tuple2[Double, Double]
  
  trait Watermarks extends StObject {
    
    var branches: Watermark
    
    var functions: Watermark
    
    var lines: Watermark
    
    var statements: Watermark
  }
  object Watermarks {
    
    inline def apply(branches: Watermark, functions: Watermark, lines: Watermark, statements: Watermark): Watermarks = {
      val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[Watermarks]
    }
    
    extension [Self <: Watermarks](x: Self) {
      
      inline def setBranches(value: Watermark): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      inline def setFunctions(value: Watermark): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Watermark): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: Watermark): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlWriter extends StObject {
    
    /**
      * closes all open tags and ends the document
      */
    def closeAll(): Unit = js.native
    
    /**
      * closes an open XML tag.
      */
    def closeTag(name: String): Unit = js.native
    
    def indent(str: String): String = js.native
    
    /**
      * writes a tag and its value opening and closing it at the same time
      */
    def inlineTag(name: String): Unit = js.native
    def inlineTag(name: String, attrs: Any): Unit = js.native
    def inlineTag(name: String, attrs: Any, content: String): Unit = js.native
    def inlineTag(name: String, attrs: Unit, content: String): Unit = js.native
    
    /**
      * writes the opening XML tag with the supplied attributes
      */
    def openTag(name: String): Unit = js.native
    def openTag(name: String, attrs: Any): Unit = js.native
  }
}
