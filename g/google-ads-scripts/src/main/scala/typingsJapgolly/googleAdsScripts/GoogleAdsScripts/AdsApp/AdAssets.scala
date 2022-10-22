package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Root object for fetching and creating asset objects. An asset can be an image, text, or video.
  * Assets are deduplicated within a given customer account, so assets may be shared between different ads.
  */
trait AdAssets extends StObject {
  
  /** Returns a selector for all assets in the account. */
  def assets(): AssetSelector
  
  /** Returns a builder to upload an image asset. */
  def newImageAssetBuilder(): ImageAssetBuilder
  
  /** Returns a builder to upload a media bundle asset. */
  def newMediaBundleAssetBuilder(): MediaBundleAssetBuilder
  
  /** Returns a builder to upload a YouTube video asset. */
  def newYouTubeVideoAssetBuilder(): YouTubeVideoAssetBuilder
}
object AdAssets {
  
  inline def apply(
    assets: CallbackTo[AssetSelector],
    newImageAssetBuilder: CallbackTo[ImageAssetBuilder],
    newMediaBundleAssetBuilder: CallbackTo[MediaBundleAssetBuilder],
    newYouTubeVideoAssetBuilder: CallbackTo[YouTubeVideoAssetBuilder]
  ): AdAssets = {
    val __obj = js.Dynamic.literal(assets = assets.toJsFn, newImageAssetBuilder = newImageAssetBuilder.toJsFn, newMediaBundleAssetBuilder = newMediaBundleAssetBuilder.toJsFn, newYouTubeVideoAssetBuilder = newYouTubeVideoAssetBuilder.toJsFn)
    __obj.asInstanceOf[AdAssets]
  }
  
  extension [Self <: AdAssets](x: Self) {
    
    inline def setAssets(value: CallbackTo[AssetSelector]): Self = StObject.set(x, "assets", value.toJsFn)
    
    inline def setNewImageAssetBuilder(value: CallbackTo[ImageAssetBuilder]): Self = StObject.set(x, "newImageAssetBuilder", value.toJsFn)
    
    inline def setNewMediaBundleAssetBuilder(value: CallbackTo[MediaBundleAssetBuilder]): Self = StObject.set(x, "newMediaBundleAssetBuilder", value.toJsFn)
    
    inline def setNewYouTubeVideoAssetBuilder(value: CallbackTo[YouTubeVideoAssetBuilder]): Self = StObject.set(x, "newYouTubeVideoAssetBuilder", value.toJsFn)
  }
}
