package typingsJapgolly.parcelTypes.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.parcelSourceMap.mod.default
import typingsJapgolly.std.FileSystem
import typingsJapgolly.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAsset extends StObject {
  
  /** The type of the AST. */
  val astGenerator: js.UndefOr[ASTGenerator | Null] = js.undefined
  
  /**
    * Controls which bundle the asset is placed into.
    *   - inline: The asset will be placed into a new inline bundle. Inline bundles are not written
    *       to a separate file, but embedded into the parent bundle.
    *   - isolated: The asset will be isolated from its parents in a separate bundle. Shared assets
    *       will be duplicated.
    */
  val bundleBehavior: js.UndefOr[BundleBehavior | Null] = js.undefined
  
  /** The environment of the asset. */
  val env: Environment
  
  /** The file path of the asset. */
  val filePath: FilePath
  
  /** The file system where the source is located. */
  val fs: FileSystem
  
  /** Returns the current AST. */
  def getAST(): js.Promise[js.UndefOr[AST | Null]]
  
  /** Returns the asset contents as a buffer. */
  def getBuffer(): js.Promise[Buffer]
  
  /** Returns the asset contents as a string. */
  def getCode(): js.Promise[String]
  
  /** Returns a list of dependencies for the asset. */
  def getDependencies(): js.Array[Dependency]
  
  /** Returns the source map for the asset, if available. */
  def getMap(): js.Promise[js.UndefOr[default | Null]]
  
  /** Returns a buffer representation of the source map, if available. */
  def getMapBuffer(): js.Promise[js.UndefOr[Buffer | Null]]
  
  /** Returns the asset contents as a stream. */
  def getStream(): Readable
  
  /** The id of the asset. */
  val id: String
  
  /**
    * If the asset is used as a bundle entry, this controls whether that bundle can be split
    * into multiple, or whether all of the dependencies must be placed in a single bundle.
    */
  val isBundleSplittable: Boolean
  
  /**
    * Whether this asset is part of the project, and not an external dependency (e.g. in node_modules).
    * This indicates that transformation using the project's configuration should be applied.
    */
  val isSource: Boolean
  
  /** Plugin-specific metadata for the asset. */
  val meta: Meta
  
  /** The pipeline defined in .parcelrc that the asset should be processed with. */
  val pipeline: js.UndefOr[String | Null] = js.undefined
  
  /** The transformer options for the asset from the dependency query string. */
  val query: URLSearchParams
  
  /**
    * Whether this asset can be omitted if none of its exports are being used.
    * This is initially set by the resolver, but can be overridden by transformers.
    */
  val sideEffects: Boolean
  
  /** The symbols that the asset exports. */
  val symbols: AssetSymbols
  
  /**
    * The asset's type. This initially corresponds to the source file extension,
    * but it may be changed during transformation.
    */
  val `type`: String
  
  /**
    * When a transformer returns multiple assets, it can give them unique keys to identify them.
    * This can be used to find assets during packaging, or to create dependencies between multiple
    * assets returned by a transformer by using the unique key as the dependency specifier.
    */
  val uniqueKey: js.UndefOr[String | Null] = js.undefined
}
object BaseAsset {
  
  inline def apply(
    env: Environment,
    filePath: FilePath,
    fs: FileSystem,
    getAST: CallbackTo[js.Promise[js.UndefOr[AST | Null]]],
    getBuffer: CallbackTo[js.Promise[Buffer]],
    getCode: CallbackTo[js.Promise[String]],
    getDependencies: CallbackTo[js.Array[Dependency]],
    getMap: CallbackTo[js.Promise[js.UndefOr[default | Null]]],
    getMapBuffer: CallbackTo[js.Promise[js.UndefOr[Buffer | Null]]],
    getStream: CallbackTo[Readable],
    id: String,
    isBundleSplittable: Boolean,
    isSource: Boolean,
    meta: Meta,
    query: URLSearchParams,
    sideEffects: Boolean,
    symbols: AssetSymbols,
    `type`: String
  ): BaseAsset = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], getAST = getAST.toJsFn, getBuffer = getBuffer.toJsFn, getCode = getCode.toJsFn, getDependencies = getDependencies.toJsFn, getMap = getMap.toJsFn, getMapBuffer = getMapBuffer.toJsFn, getStream = getStream.toJsFn, id = id.asInstanceOf[js.Any], isBundleSplittable = isBundleSplittable.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAsset]
  }
  
  extension [Self <: BaseAsset](x: Self) {
    
    inline def setAstGenerator(value: ASTGenerator): Self = StObject.set(x, "astGenerator", value.asInstanceOf[js.Any])
    
    inline def setAstGeneratorNull: Self = StObject.set(x, "astGenerator", null)
    
    inline def setAstGeneratorUndefined: Self = StObject.set(x, "astGenerator", js.undefined)
    
    inline def setBundleBehavior(value: BundleBehavior): Self = StObject.set(x, "bundleBehavior", value.asInstanceOf[js.Any])
    
    inline def setBundleBehaviorNull: Self = StObject.set(x, "bundleBehavior", null)
    
    inline def setBundleBehaviorUndefined: Self = StObject.set(x, "bundleBehavior", js.undefined)
    
    inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFs(value: FileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setGetAST(value: CallbackTo[js.Promise[js.UndefOr[AST | Null]]]): Self = StObject.set(x, "getAST", value.toJsFn)
    
    inline def setGetBuffer(value: CallbackTo[js.Promise[Buffer]]): Self = StObject.set(x, "getBuffer", value.toJsFn)
    
    inline def setGetCode(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCode", value.toJsFn)
    
    inline def setGetDependencies(value: CallbackTo[js.Array[Dependency]]): Self = StObject.set(x, "getDependencies", value.toJsFn)
    
    inline def setGetMap(value: CallbackTo[js.Promise[js.UndefOr[default | Null]]]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setGetMapBuffer(value: CallbackTo[js.Promise[js.UndefOr[Buffer | Null]]]): Self = StObject.set(x, "getMapBuffer", value.toJsFn)
    
    inline def setGetStream(value: CallbackTo[Readable]): Self = StObject.set(x, "getStream", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsBundleSplittable(value: Boolean): Self = StObject.set(x, "isBundleSplittable", value.asInstanceOf[js.Any])
    
    inline def setIsSource(value: Boolean): Self = StObject.set(x, "isSource", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setQuery(value: URLSearchParams): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: AssetSymbols): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueKey(value: String): Self = StObject.set(x, "uniqueKey", value.asInstanceOf[js.Any])
    
    inline def setUniqueKeyNull: Self = StObject.set(x, "uniqueKey", null)
    
    inline def setUniqueKeyUndefined: Self = StObject.set(x, "uniqueKey", js.undefined)
  }
}
