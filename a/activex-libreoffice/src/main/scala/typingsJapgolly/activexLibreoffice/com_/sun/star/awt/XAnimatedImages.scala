package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows administrating a set of images, to be displayed as animated seres.
  *
  * Components implementing this interface maintain a variable number of image sets. Components displaying those images will choose the best-fitting image
  * set depending on the available space, and possibly other restrictions.
  * @since OOo 3.4
  */
trait XAnimatedImages
  extends StObject
     with XContainer {
  
  /**
    * specifies whether the animation should start over with the first image of the image series when the last image has been played.
    *
    * The default value for this attribute is `TRUE` .
    */
  var AutoRepeat: Boolean
  
  /** returns the number of images sets maintained by the component. */
  val ImageSetCount: Double
  
  /**
    * controls the way the images are scaled up or down, when the available space is larger or smaller than what is needed for them.
    *
    * Allowed values are those from the {@link ImageScaleMode} constants group.
    */
  var ScaleMode: Double
  
  /**
    * specifies the time in milliseconds between two animation steps.
    *
    * This is the minimum time, the actual value might be longer due to system load. The default value will be 100 ms.
    */
  var StepTime: Double
  
  /**
    * returns the URLs of the image set with the given index
    * @param iIndex the index of the set those image URLs are to be retrieved. Must be greater than or equal to `0` , and smaller than the value returned by {
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def getImageSet(iIndex: Double): SafeArray[String]
  
  /** returns the number of images sets maintained by the component. */
  def getImageSetCount(): Double
  
  /**
    * sets the URLs of the image set with the given index
    * @param iIndex the index at which a new image set should be inserted. Must be greater than or equal to `0` , and smaller than or equal to the value retur
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def insertImageSet(iIndex: Double, iImageURLs: SeqEquiv[String]): Unit
  
  /**
    * removes the image set with the given index
    * @param iIndex the index of the set to remove. Must be greater than or equal to `0` , and smaller than the value returned by {@link getImageSetCount()} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def removeImageSet(iIndex: Double): Unit
  
  /**
    * replaces the image set given by index with a new one
    * @param iIndex the index of the set those image URLs are to be replaced. Must be greater than or equal to `0` , and smaller than the value returned by {@
    * @param iImageURLs the URLs for the images for the given set. Will be resolved using a {@link com.sun.star.graphic.GraphicProvider} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the `iIndex` is not a valid index.
    */
  def replaceImageSet(iIndex: Double, iImageURLs: SeqEquiv[String]): Unit
}
object XAnimatedImages {
  
  inline def apply(
    AutoRepeat: Boolean,
    ImageSetCount: Double,
    ScaleMode: Double,
    StepTime: Double,
    acquire: Callback,
    addContainerListener: XContainerListener => Callback,
    getImageSet: Double => SafeArray[String],
    getImageSetCount: CallbackTo[Double],
    insertImageSet: (Double, SeqEquiv[String]) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeContainerListener: XContainerListener => Callback,
    removeImageSet: Double => Callback,
    replaceImageSet: (Double, SeqEquiv[String]) => Callback
  ): XAnimatedImages = {
    val __obj = js.Dynamic.literal(AutoRepeat = AutoRepeat.asInstanceOf[js.Any], ImageSetCount = ImageSetCount.asInstanceOf[js.Any], ScaleMode = ScaleMode.asInstanceOf[js.Any], StepTime = StepTime.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), getImageSet = js.Any.fromFunction1(getImageSet), getImageSetCount = getImageSetCount.toJsFn, insertImageSet = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[String]) => (insertImageSet(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeImageSet = js.Any.fromFunction1((t0: Double) => removeImageSet(t0).runNow()), replaceImageSet = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[String]) => (replaceImageSet(t0, t1)).runNow()))
    __obj.asInstanceOf[XAnimatedImages]
  }
  
  extension [Self <: XAnimatedImages](x: Self) {
    
    inline def setAutoRepeat(value: Boolean): Self = StObject.set(x, "AutoRepeat", value.asInstanceOf[js.Any])
    
    inline def setGetImageSet(value: Double => SafeArray[String]): Self = StObject.set(x, "getImageSet", js.Any.fromFunction1(value))
    
    inline def setGetImageSetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getImageSetCount", value.toJsFn)
    
    inline def setImageSetCount(value: Double): Self = StObject.set(x, "ImageSetCount", value.asInstanceOf[js.Any])
    
    inline def setInsertImageSet(value: (Double, SeqEquiv[String]) => Callback): Self = StObject.set(x, "insertImageSet", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[String]) => (value(t0, t1)).runNow()))
    
    inline def setRemoveImageSet(value: Double => Callback): Self = StObject.set(x, "removeImageSet", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setReplaceImageSet(value: (Double, SeqEquiv[String]) => Callback): Self = StObject.set(x, "replaceImageSet", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[String]) => (value(t0, t1)).runNow()))
    
    inline def setScaleMode(value: Double): Self = StObject.set(x, "ScaleMode", value.asInstanceOf[js.Any])
    
    inline def setStepTime(value: Double): Self = StObject.set(x, "StepTime", value.asInstanceOf[js.Any])
  }
}
