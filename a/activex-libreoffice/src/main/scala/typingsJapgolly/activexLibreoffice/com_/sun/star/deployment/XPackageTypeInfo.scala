package typingsJapgolly.activexLibreoffice.com_.sun.star.deployment

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects of this interface provide information about a package's type.
  * @since OOo 2.0
  */
trait XPackageTypeInfo extends StObject {
  
  /**
    * returns a description string to describe a package type.
    * @returns description
    */
  val Description: String
  
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  val FileFilter: String
  
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  val MediaType: String
  
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  val ShortDescription: String
  
  /**
    * returns a description string to describe a package type.
    * @returns description
    */
  def getDescription(): String
  
  /**
    * returns a file filter string for the file picker user interface. Both, the short description string and file filter string will be passed to {@link
    * com.sun.star.ui.dialogs.XFilterManager.appendFilter()} .
    * @returns file filter string
    */
  def getFileFilter(): String
  
  /**
    * returns an icon for a package.
    * @param highContrast return high contrast icon
    * @param smallIcon return a small icon (e.g. 16x16 pixel), else return a big one (e.g. 26x26 pixel)
    * @returns currently an unsigned short (resource id for deploymentgui resource file), `VOID` any if none is available
    */
  def getIcon(highContrast: Boolean, smallIcon: Boolean): Any
  
  /**
    * returns the media type of a package, e.g. `application/vnd.sun.star.basic-script` .
    * @returns media type of package
    */
  def getMediaType(): String
  
  /**
    * returns a short description string to describe a package type (one line only).
    * @returns description
    */
  def getShortDescription(): String
}
object XPackageTypeInfo {
  
  inline def apply(
    Description: String,
    FileFilter: String,
    MediaType: String,
    ShortDescription: String,
    getDescription: CallbackTo[String],
    getFileFilter: CallbackTo[String],
    getIcon: (Boolean, Boolean) => Any,
    getMediaType: CallbackTo[String],
    getShortDescription: CallbackTo[String]
  ): XPackageTypeInfo = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], FileFilter = FileFilter.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], ShortDescription = ShortDescription.asInstanceOf[js.Any], getDescription = getDescription.toJsFn, getFileFilter = getFileFilter.toJsFn, getIcon = js.Any.fromFunction2(getIcon), getMediaType = getMediaType.toJsFn, getShortDescription = getShortDescription.toJsFn)
    __obj.asInstanceOf[XPackageTypeInfo]
  }
  
  extension [Self <: XPackageTypeInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFileFilter(value: String): Self = StObject.set(x, "FileFilter", value.asInstanceOf[js.Any])
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetFileFilter(value: CallbackTo[String]): Self = StObject.set(x, "getFileFilter", value.toJsFn)
    
    inline def setGetIcon(value: (Boolean, Boolean) => Any): Self = StObject.set(x, "getIcon", js.Any.fromFunction2(value))
    
    inline def setGetMediaType(value: CallbackTo[String]): Self = StObject.set(x, "getMediaType", value.toJsFn)
    
    inline def setGetShortDescription(value: CallbackTo[String]): Self = StObject.set(x, "getShortDescription", value.toJsFn)
    
    inline def setMediaType(value: String): Self = StObject.set(x, "MediaType", value.asInstanceOf[js.Any])
    
    inline def setShortDescription(value: String): Self = StObject.set(x, "ShortDescription", value.asInstanceOf[js.Any])
  }
}
