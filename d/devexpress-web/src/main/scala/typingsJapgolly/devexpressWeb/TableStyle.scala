package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the table style settings.
  */
trait TableStyle
  extends StObject
     with StyleBase {
  
  /**
    * Gets or sets the style from which the current style inherits.
    */
  val parent: TableStyle
}
object TableStyle {
  
  inline def apply(isDeleted: Boolean, name: String, parent: TableStyle): TableStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
  
  extension [Self <: TableStyle](x: Self) {
    
    inline def setParent(value: TableStyle): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
