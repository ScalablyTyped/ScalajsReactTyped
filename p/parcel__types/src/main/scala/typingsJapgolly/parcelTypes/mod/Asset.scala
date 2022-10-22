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

trait Asset
  extends StObject
     with BaseAsset {
  
  /** Statistics about the asset. */
  val stats: Stats
}
object Asset {
  
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
    stats: Stats,
    symbols: AssetSymbols,
    `type`: String
  ): Asset = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], getAST = getAST.toJsFn, getBuffer = getBuffer.toJsFn, getCode = getCode.toJsFn, getDependencies = getDependencies.toJsFn, getMap = getMap.toJsFn, getMapBuffer = getMapBuffer.toJsFn, getStream = getStream.toJsFn, id = id.asInstanceOf[js.Any], isBundleSplittable = isBundleSplittable.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
