package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XBitmap
import typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XCanvas
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A cache of preview bitmaps for the slides of one Impress or Draw document in one size. There may be more than one cache for one document. These are
  * internally connected and for missing previews one cache may take it from another cache and scale it to the desired size. When a preview is not present
  * then it is created asynchronously. On creation all registered listeners are notified.
  *
  * Slides are referenced via their index in an XIndexAccess container in order to allow multiple references to a single slide (custom presentations).
  */
trait XSlidePreviewCache extends StObject {
  
  /** Register a listener that is called when a preview has been created asynchronously. */
  def addPreviewCreationNotifyListener(xListener: XSlidePreviewCacheListener): Unit
  
  /**
    * Return a preview for the given slide index. The returned bitmap may be the requested preview, a preview of the preview, i.e. a scaled up or down
    * version, or an empty reference when the preview is not yet present.
    *
    * This call may lead to the asynchronous creation of the requested preview. In that case all registered listeners are notified when the preview has been
    * created.
    */
  def getSlidePreview(nSlideIndex: Double, xCanvas: XCanvas): XBitmap
  
  /** Stop the asynchronous creation of previews temporarily. Call {@link resume()} to restart it. */
  def pause(): Unit
  
  /** Remove a previously registered listener for preview creations. */
  def removePreviewCreationNotifyListener(xListener: XSlidePreviewCacheListener): Unit
  
  /** Resume the asynchronous creation of slide previews. */
  def resume(): Unit
  
  /**
    * Set the set of slides for which the cache will provide the previews. All slides in the given XIndexAccess are required to come from the given model.
    * @param xSlides The set of slides for which the called cache will provide the previews. This container defines the indices that are used to look up slides.
    * @param xDocument The model that contains the slides reference by the xSlides argument.
    */
  def setDocumentSlides(xSlides: XIndexAccess, xDocument: XInterface): Unit
  
  /** Define the size of the previews that are managed by the called cache. */
  def setPreviewSize(aSize: IntegerSize2D): Unit
  
  /**
    * Define which slides are currently visible on the screen and which are not. This information is used for give preview creation for visible slides a
    * higher priority than for those slides that are not visible.
    */
  def setVisibleRange(nFirstVisibleSlideIndex: Double, nLastVisibleSlideIndex: Double): Unit
}
object XSlidePreviewCache {
  
  inline def apply(
    addPreviewCreationNotifyListener: XSlidePreviewCacheListener => Callback,
    getSlidePreview: (Double, XCanvas) => XBitmap,
    pause: Callback,
    removePreviewCreationNotifyListener: XSlidePreviewCacheListener => Callback,
    resume: Callback,
    setDocumentSlides: (XIndexAccess, XInterface) => Callback,
    setPreviewSize: IntegerSize2D => Callback,
    setVisibleRange: (Double, Double) => Callback
  ): XSlidePreviewCache = {
    val __obj = js.Dynamic.literal(addPreviewCreationNotifyListener = js.Any.fromFunction1((t0: XSlidePreviewCacheListener) => addPreviewCreationNotifyListener(t0).runNow()), getSlidePreview = js.Any.fromFunction2(getSlidePreview), pause = pause.toJsFn, removePreviewCreationNotifyListener = js.Any.fromFunction1((t0: XSlidePreviewCacheListener) => removePreviewCreationNotifyListener(t0).runNow()), resume = resume.toJsFn, setDocumentSlides = js.Any.fromFunction2((t0: XIndexAccess, t1: XInterface) => (setDocumentSlides(t0, t1)).runNow()), setPreviewSize = js.Any.fromFunction1((t0: IntegerSize2D) => setPreviewSize(t0).runNow()), setVisibleRange = js.Any.fromFunction2((t0: Double, t1: Double) => (setVisibleRange(t0, t1)).runNow()))
    __obj.asInstanceOf[XSlidePreviewCache]
  }
  
  extension [Self <: XSlidePreviewCache](x: Self) {
    
    inline def setAddPreviewCreationNotifyListener(value: XSlidePreviewCacheListener => Callback): Self = StObject.set(x, "addPreviewCreationNotifyListener", js.Any.fromFunction1((t0: XSlidePreviewCacheListener) => value(t0).runNow()))
    
    inline def setGetSlidePreview(value: (Double, XCanvas) => XBitmap): Self = StObject.set(x, "getSlidePreview", js.Any.fromFunction2(value))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setRemovePreviewCreationNotifyListener(value: XSlidePreviewCacheListener => Callback): Self = StObject.set(x, "removePreviewCreationNotifyListener", js.Any.fromFunction1((t0: XSlidePreviewCacheListener) => value(t0).runNow()))
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSetDocumentSlides(value: (XIndexAccess, XInterface) => Callback): Self = StObject.set(x, "setDocumentSlides", js.Any.fromFunction2((t0: XIndexAccess, t1: XInterface) => (value(t0, t1)).runNow()))
    
    inline def setSetPreviewSize(value: IntegerSize2D => Callback): Self = StObject.set(x, "setPreviewSize", js.Any.fromFunction1((t0: IntegerSize2D) => value(t0).runNow()))
    
    inline def setSetVisibleRange(value: (Double, Double) => Callback): Self = StObject.set(x, "setVisibleRange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
