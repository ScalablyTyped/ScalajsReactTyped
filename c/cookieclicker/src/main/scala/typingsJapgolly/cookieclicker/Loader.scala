package typingsJapgolly.cookieclicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.cookieclicker.Game.PseudoBoolean
import typingsJapgolly.cookieclicker.Game.PseudoNull
import typingsJapgolly.cookieclicker.anon.HTMLCanvasElementwidth8he
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loader extends StObject {
  
  /**
    * Loads assets
    * @param assets The iterable of strings to get asset names from
    */
  def Load(assets: js.Array[String]): Unit
  
  /**
    * Replaces an asset if the original asset exists
    * @param old The name of the old asset
    * @param newer The name of the new asset, isn't prefixed by `this.prefix` if it has `http` in the name
    */
  def Replace(old: String, newer: String): Unit
  
  var assets: js.Array[Unit] & (Record[String, HTMLImageElement])
  
  /**
    * Names of the assets that have been loaded
    */
  var assetsLoaded: js.Array[String]
  
  /**
    * Names of the assets that are currently loading
    */
  var assetsLoading: js.Array[String]
  
  /**
    * Total amount of assets, both loading and loaded
    */
  var assetsN: Double
  
  /**
    * An empty 8x8 canvas element, used in the `Pic` constructor
    */
  var blank: HTMLCanvasElementwidth8he
  
  /**
    * The prefix to all assets
    */
  var domain: String
  
  /**
    * A pseudoboolean, is true when all assets are loaded for the first time
    */
  var doneLoading: PseudoBoolean
  
  /**
    * Returns the progress of loading all assets
    */
  def getProgress(): Double
  
  /**
    * A callback to when all assets is loaded
    */
  var loaded: PseudoNull | js.Function0[Unit]
  
  /**
    * The amount of loading assets
    */
  var loadingN: Double
  
  /**
    * An internal callback function
    */
  def onLoad(e: Event): Unit
  
  /**
    * Unused @deprecated
    */
  def onLoadReplace(): Unit
}
object Loader {
  
  inline def apply(
    Load: js.Array[String] => Callback,
    Replace: (String, String) => Callback,
    assets: js.Array[Unit] & (Record[String, HTMLImageElement]),
    assetsLoaded: js.Array[String],
    assetsLoading: js.Array[String],
    assetsN: Double,
    blank: HTMLCanvasElementwidth8he,
    domain: String,
    doneLoading: PseudoBoolean,
    getProgress: CallbackTo[Double],
    loaded: PseudoNull | js.Function0[Unit],
    loadingN: Double,
    onLoad: Event => Callback,
    onLoadReplace: Callback
  ): Loader = {
    val __obj = js.Dynamic.literal(Load = js.Any.fromFunction1((t0: js.Array[String]) => Load(t0).runNow()), Replace = js.Any.fromFunction2((t0: String, t1: String) => (Replace(t0, t1)).runNow()), assets = assets.asInstanceOf[js.Any], assetsLoaded = assetsLoaded.asInstanceOf[js.Any], assetsLoading = assetsLoading.asInstanceOf[js.Any], assetsN = assetsN.asInstanceOf[js.Any], blank = blank.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], doneLoading = doneLoading.asInstanceOf[js.Any], getProgress = getProgress.toJsFn, loaded = loaded.asInstanceOf[js.Any], loadingN = loadingN.asInstanceOf[js.Any], onLoad = js.Any.fromFunction1((t0: Event) => onLoad(t0).runNow()), onLoadReplace = onLoadReplace.toJsFn)
    __obj.asInstanceOf[Loader]
  }
  
  extension [Self <: Loader](x: Self) {
    
    inline def setAssets(value: js.Array[Unit] & (Record[String, HTMLImageElement])): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsLoaded(value: js.Array[String]): Self = StObject.set(x, "assetsLoaded", value.asInstanceOf[js.Any])
    
    inline def setAssetsLoadedVarargs(value: String*): Self = StObject.set(x, "assetsLoaded", js.Array(value*))
    
    inline def setAssetsLoading(value: js.Array[String]): Self = StObject.set(x, "assetsLoading", value.asInstanceOf[js.Any])
    
    inline def setAssetsLoadingVarargs(value: String*): Self = StObject.set(x, "assetsLoading", js.Array(value*))
    
    inline def setAssetsN(value: Double): Self = StObject.set(x, "assetsN", value.asInstanceOf[js.Any])
    
    inline def setBlank(value: HTMLCanvasElementwidth8he): Self = StObject.set(x, "blank", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDoneLoading(value: PseudoBoolean): Self = StObject.set(x, "doneLoading", value.asInstanceOf[js.Any])
    
    inline def setGetProgress(value: CallbackTo[Double]): Self = StObject.set(x, "getProgress", value.toJsFn)
    
    inline def setLoad(value: js.Array[String] => Callback): Self = StObject.set(x, "Load", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setLoaded(value: PseudoNull | js.Function0[Unit]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedCallback(value: Callback): Self = StObject.set(x, "loaded", value.toJsFn)
    
    inline def setLoadingN(value: Double): Self = StObject.set(x, "loadingN", value.asInstanceOf[js.Any])
    
    inline def setOnLoad(value: Event => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
    
    inline def setOnLoadReplace(value: Callback): Self = StObject.set(x, "onLoadReplace", value.toJsFn)
    
    inline def setReplace(value: (String, String) => Callback): Self = StObject.set(x, "Replace", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
