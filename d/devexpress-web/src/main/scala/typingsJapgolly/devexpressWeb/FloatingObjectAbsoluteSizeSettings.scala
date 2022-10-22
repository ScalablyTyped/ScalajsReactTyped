package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains absolute size settings for floating objects.
  */
trait FloatingObjectAbsoluteSizeSettings extends StObject {
  
  /**
    * Gets or sets a floating object's absolute height.
    */
  var absoluteHeight: Double
  
  /**
    * Gets or sets a floating object's absolute width.
    */
  var absoluteWidth: Double
}
object FloatingObjectAbsoluteSizeSettings {
  
  inline def apply(absoluteHeight: Double, absoluteWidth: Double): FloatingObjectAbsoluteSizeSettings = {
    val __obj = js.Dynamic.literal(absoluteHeight = absoluteHeight.asInstanceOf[js.Any], absoluteWidth = absoluteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloatingObjectAbsoluteSizeSettings]
  }
  
  extension [Self <: FloatingObjectAbsoluteSizeSettings](x: Self) {
    
    inline def setAbsoluteHeight(value: Double): Self = StObject.set(x, "absoluteHeight", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteWidth(value: Double): Self = StObject.set(x, "absoluteWidth", value.asInstanceOf[js.Any])
  }
}
