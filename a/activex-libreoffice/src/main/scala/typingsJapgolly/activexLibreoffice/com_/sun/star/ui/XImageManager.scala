package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies access functions to an images manager interface to add, replace and remove images associations to command URLs.
  *
  * An image manager controls a number of image sets which are specified by a {@link ImageType} .
  */
trait XImageManager
  extends StObject
     with XUIConfigurationPersistence
     with XUIConfiguration
     with XComponent
     with XInitialization {
  
  /**
    * retrieves the list of command URLs which have images associated.
    * @param nImageType specifies the image type for this operation.
    * @returns all command URLs within the images manager that have an image associated.
    */
  def getAllImageNames(nImageType: Double): SafeArray[String]
  
  /**
    * retrieves the associated images of command URLs.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs for which the images are requested.
    * @returns a sequence of graphics object which are associated with the provided command URLs. If an unknown command URL is provided or a command URL has no
    */
  def getImages(nImageType: Double, aCommandURLSequence: SeqEquiv[String]): SafeArray[XGraphic]
  
  /**
    * determines if a command URL has an associated image.
    * @param nImageType specifies the image type for this operation.
    * @param CommandURL a command URL that should be checked for an associated image.
    * @returns `TRUE` if an image is associated, otherwise `FALSE` .
    */
  def hasImage(nImageType: Double, CommandURL: String): Boolean
  
  /**
    * inserts new image/command associations to a image manager.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs which specify which commands get an new image.
    * @param aGraphicSequence a sequence of graphic objects which should be associated with the provided command URLs.  If an association is already present i
    */
  def insertImages(nImageType: Double, aCommandURLSequence: SeqEquiv[String], aGraphicSequence: SeqEquiv[XGraphic]): Unit
  
  /**
    * removes associated images to a command URL.
    * @param nImageType specifies the image type for this association operation.
    * @param CommandURLs a sequence of command URLs for which the images should be removed.  If the **aCommandURLSequence** contains an invalid command URL a
    */
  def removeImages(nImageType: Double, CommandURLs: SeqEquiv[String]): Unit
  
  /**
    * replaces the associated images of command URLs.
    * @param nImageType specifies the image type for this association operation.
    * @param aCommandURLSequence a sequence of command URLs for which images should be replaced.
    * @param aGraphicsSequence a sequence of graphic objects which should replace the old images of the provided command URLs.  If a command URL cannot be fou
    */
  def replaceImages(nImageType: Double, aCommandURLSequence: SeqEquiv[String], aGraphicsSequence: SeqEquiv[XGraphic]): Unit
  
  /**
    * resets the image manager to default data.
    *
    * This means that all user images of the instance will be removed.
    */
  def reset(): Unit
}
object XImageManager {
  
  inline def apply(
    acquire: Callback,
    addConfigurationListener: XUIConfigurationListener => Callback,
    addEventListener: XEventListener => Callback,
    dispose: Callback,
    getAllImageNames: Double => SafeArray[String],
    getImages: (Double, SeqEquiv[String]) => SafeArray[XGraphic],
    hasImage: (Double, String) => Boolean,
    initialize: SeqEquiv[Any] => Callback,
    insertImages: (Double, SeqEquiv[String], SeqEquiv[XGraphic]) => Callback,
    isModified: CallbackTo[Boolean],
    isReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: Callback,
    removeConfigurationListener: XUIConfigurationListener => Callback,
    removeEventListener: XEventListener => Callback,
    removeImages: (Double, SeqEquiv[String]) => Callback,
    replaceImages: (Double, SeqEquiv[String], SeqEquiv[XGraphic]) => Callback,
    reset: Callback,
    store: Callback,
    storeToStorage: XStorage => Callback
  ): XImageManager = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => addConfigurationListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), dispose = dispose.toJsFn, getAllImageNames = js.Any.fromFunction1(getAllImageNames), getImages = js.Any.fromFunction2(getImages), hasImage = js.Any.fromFunction2(hasImage), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), insertImages = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: SeqEquiv[XGraphic]) => (insertImages(t0, t1, t2)).runNow()), isModified = isModified.toJsFn, isReadOnly = isReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = reload.toJsFn, removeConfigurationListener = js.Any.fromFunction1((t0: XUIConfigurationListener) => removeConfigurationListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeImages = js.Any.fromFunction2((t0: Double, t1: SeqEquiv[String]) => (removeImages(t0, t1)).runNow()), replaceImages = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: SeqEquiv[XGraphic]) => (replaceImages(t0, t1, t2)).runNow()), reset = reset.toJsFn, store = store.toJsFn, storeToStorage = js.Any.fromFunction1((t0: XStorage) => storeToStorage(t0).runNow()))
    __obj.asInstanceOf[XImageManager]
  }
  
  extension [Self <: XImageManager](x: Self) {
    
    inline def setGetAllImageNames(value: Double => SafeArray[String]): Self = StObject.set(x, "getAllImageNames", js.Any.fromFunction1(value))
    
    inline def setGetImages(value: (Double, SeqEquiv[String]) => SafeArray[XGraphic]): Self = StObject.set(x, "getImages", js.Any.fromFunction2(value))
    
    inline def setHasImage(value: (Double, String) => Boolean): Self = StObject.set(x, "hasImage", js.Any.fromFunction2(value))
    
    inline def setInsertImages(value: (Double, SeqEquiv[String], SeqEquiv[XGraphic]) => Callback): Self = StObject.set(x, "insertImages", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: SeqEquiv[XGraphic]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveImages(value: (Double, SeqEquiv[String]) => Callback): Self = StObject.set(x, "removeImages", js.Any.fromFunction2((t0: Double, t1: SeqEquiv[String]) => (value(t0, t1)).runNow()))
    
    inline def setReplaceImages(value: (Double, SeqEquiv[String], SeqEquiv[XGraphic]) => Callback): Self = StObject.set(x, "replaceImages", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[String], t2: SeqEquiv[XGraphic]) => (value(t0, t1, t2)).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
