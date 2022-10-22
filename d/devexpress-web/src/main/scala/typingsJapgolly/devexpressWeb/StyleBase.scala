package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for objects implementing different element styles.
  */
trait StyleBase extends StObject {
  
  /**
    * Gets whether the specified style is marked as deleted.
    */
  val isDeleted: Boolean
  
  /**
    * Gets or sets the name of the style.
    */
  val name: String
}
object StyleBase {
  
  inline def apply(isDeleted: Boolean, name: String): StyleBase = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleBase]
  }
  
  extension [Self <: StyleBase](x: Self) {
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
