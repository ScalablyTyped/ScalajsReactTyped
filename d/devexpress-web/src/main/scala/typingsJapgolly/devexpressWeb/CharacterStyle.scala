package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains characteristics of a character style in a document.
  */
trait CharacterStyle
  extends StObject
     with StyleBase {
  
  /**
    * Gets or sets the linked style for the current style.
    */
  val linkedStyle: ParagraphStyle
  
  /**
    * Gets the style form which the current style inherits.
    */
  val parent: CharacterStyle
}
object CharacterStyle {
  
  inline def apply(isDeleted: Boolean, linkedStyle: ParagraphStyle, name: String, parent: CharacterStyle): CharacterStyle = {
    val __obj = js.Dynamic.literal(isDeleted = isDeleted.asInstanceOf[js.Any], linkedStyle = linkedStyle.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterStyle]
  }
  
  extension [Self <: CharacterStyle](x: Self) {
    
    inline def setLinkedStyle(value: ParagraphStyle): Self = StObject.set(x, "linkedStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: CharacterStyle): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
