package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listener for asynchronous preview creations. Called when a slide preview has been created that was previously requested via a call to {@link
  * XSlidePreviewCache.getSlidePreview()} . The implementor may then call getSlidePreview() a second time to get the up-to-date version of the preview.
  */
trait XSlidePreviewCacheListener extends StObject {
  
  /**
    * Called by a {@link XSlidePreviewCache} object when a preview has been created for the slide with the given index.
    * @param nSlideIndex The index of the slide for which a new preview has been created.
    */
  def notifyPreviewCreation(nSlideIndex: Double): Unit
}
object XSlidePreviewCacheListener {
  
  inline def apply(notifyPreviewCreation: Double => Callback): XSlidePreviewCacheListener = {
    val __obj = js.Dynamic.literal(notifyPreviewCreation = js.Any.fromFunction1((t0: Double) => notifyPreviewCreation(t0).runNow()))
    __obj.asInstanceOf[XSlidePreviewCacheListener]
  }
  
  extension [Self <: XSlidePreviewCacheListener](x: Self) {
    
    inline def setNotifyPreviewCreation(value: Double => Callback): Self = StObject.set(x, "notifyPreviewCreation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
