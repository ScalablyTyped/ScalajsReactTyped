package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import typingsJapgolly.webpack.webpackStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watcher extends StObject {
  
  /**
  	 * closes the watcher and all underlying file watchers
  	 */
  def close(): Unit
  
  /**
  	 * get current aggregated changes that have not yet send to callback
  	 */
  var getAggregatedChanges: js.UndefOr[js.Function0[Set[String]]] = js.undefined
  
  /**
  	 * get current aggregated removals that have not yet send to callback
  	 */
  var getAggregatedRemovals: js.UndefOr[js.Function0[Set[String]]] = js.undefined
  
  /**
  	 * get info about directories
  	 */
  def getContextTimeInfoEntries(): Map[String, FileSystemInfoEntry | ignore]
  
  /**
  	 * get info about files
  	 */
  def getFileTimeInfoEntries(): Map[String, FileSystemInfoEntry | ignore]
  
  /**
  	 * get info about timestamps and changes
  	 */
  var getInfo: js.UndefOr[js.Function0[WatcherInfo]] = js.undefined
  
  /**
  	 * closes the watcher, but keeps underlying file watchers alive until the next watch call
  	 */
  def pause(): Unit
}
object Watcher {
  
  inline def apply(
    close: Callback,
    getContextTimeInfoEntries: CallbackTo[Map[String, FileSystemInfoEntry | ignore]],
    getFileTimeInfoEntries: CallbackTo[Map[String, FileSystemInfoEntry | ignore]],
    pause: Callback
  ): Watcher = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, getContextTimeInfoEntries = getContextTimeInfoEntries.toJsFn, getFileTimeInfoEntries = getFileTimeInfoEntries.toJsFn, pause = pause.toJsFn)
    __obj.asInstanceOf[Watcher]
  }
  
  extension [Self <: Watcher](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setGetAggregatedChanges(value: CallbackTo[Set[String]]): Self = StObject.set(x, "getAggregatedChanges", value.toJsFn)
    
    inline def setGetAggregatedChangesUndefined: Self = StObject.set(x, "getAggregatedChanges", js.undefined)
    
    inline def setGetAggregatedRemovals(value: CallbackTo[Set[String]]): Self = StObject.set(x, "getAggregatedRemovals", value.toJsFn)
    
    inline def setGetAggregatedRemovalsUndefined: Self = StObject.set(x, "getAggregatedRemovals", js.undefined)
    
    inline def setGetContextTimeInfoEntries(value: CallbackTo[Map[String, FileSystemInfoEntry | ignore]]): Self = StObject.set(x, "getContextTimeInfoEntries", value.toJsFn)
    
    inline def setGetFileTimeInfoEntries(value: CallbackTo[Map[String, FileSystemInfoEntry | ignore]]): Self = StObject.set(x, "getFileTimeInfoEntries", value.toJsFn)
    
    inline def setGetInfo(value: CallbackTo[WatcherInfo]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setGetInfoUndefined: Self = StObject.set(x, "getInfo", js.undefined)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
  }
}
