package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to represent images and icons.
  *
  * This interface is used for a representation of images like icons of buttons. The corresponding interface of the Java Accessibility API is
  * AccessibleIcon. This interface lets you retrieve an image's size and description.
  * @since OOo 1.1.2
  */
trait XAccessibleImage
  extends StObject
     with XInterface {
  
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  val AccessibleImageDescription: String
  
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  val AccessibleImageHeight: Double
  
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  val AccessibleImageWidth: Double
  
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  def getAccessibleImageDescription(): String
  
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  def getAccessibleImageHeight(): Double
  
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  def getAccessibleImageWidth(): Double
}
object XAccessibleImage {
  
  inline def apply(
    AccessibleImageDescription: String,
    AccessibleImageHeight: Double,
    AccessibleImageWidth: Double,
    acquire: Callback,
    getAccessibleImageDescription: CallbackTo[String],
    getAccessibleImageHeight: CallbackTo[Double],
    getAccessibleImageWidth: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleImage = {
    val __obj = js.Dynamic.literal(AccessibleImageDescription = AccessibleImageDescription.asInstanceOf[js.Any], AccessibleImageHeight = AccessibleImageHeight.asInstanceOf[js.Any], AccessibleImageWidth = AccessibleImageWidth.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAccessibleImageDescription = getAccessibleImageDescription.toJsFn, getAccessibleImageHeight = getAccessibleImageHeight.toJsFn, getAccessibleImageWidth = getAccessibleImageWidth.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleImage]
  }
  
  extension [Self <: XAccessibleImage](x: Self) {
    
    inline def setAccessibleImageDescription(value: String): Self = StObject.set(x, "AccessibleImageDescription", value.asInstanceOf[js.Any])
    
    inline def setAccessibleImageHeight(value: Double): Self = StObject.set(x, "AccessibleImageHeight", value.asInstanceOf[js.Any])
    
    inline def setAccessibleImageWidth(value: Double): Self = StObject.set(x, "AccessibleImageWidth", value.asInstanceOf[js.Any])
    
    inline def setGetAccessibleImageDescription(value: CallbackTo[String]): Self = StObject.set(x, "getAccessibleImageDescription", value.toJsFn)
    
    inline def setGetAccessibleImageHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getAccessibleImageHeight", value.toJsFn)
    
    inline def setGetAccessibleImageWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getAccessibleImageWidth", value.toJsFn)
  }
}
