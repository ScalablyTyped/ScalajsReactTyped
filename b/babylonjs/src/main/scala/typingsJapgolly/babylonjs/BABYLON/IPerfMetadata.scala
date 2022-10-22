package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPerfMetadata extends StObject {
  
  /**
    * Specifies the category of the data
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the line to be drawn.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if data should be hidden, falsey by default.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object IPerfMetadata {
  
  inline def apply(): IPerfMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPerfMetadata]
  }
  
  extension [Self <: IPerfMetadata](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
