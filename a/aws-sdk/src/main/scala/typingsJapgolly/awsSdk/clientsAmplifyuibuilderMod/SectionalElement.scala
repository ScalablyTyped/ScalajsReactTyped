package typingsJapgolly.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionalElement extends StObject {
  
  /**
    * Specifies the size of the font for a Heading sectional element. Valid values are 1 | 2 | 3 | 4 | 5 | 6.
    */
  var level: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the orientation for a Divider sectional element. Valid values are horizontal or vertical.
    */
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the position of the text in a field for a Text sectional element.
    */
  var position: js.UndefOr[FieldPosition] = js.undefined
  
  /**
    * The text for a Text sectional element.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The type of sectional element. Valid values are Heading, Text, and Divider.
    */
  var `type`: String
}
object SectionalElement {
  
  inline def apply(`type`: String): SectionalElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionalElement]
  }
  
  extension [Self <: SectionalElement](x: Self) {
    
    inline def setLevel(value: Integer): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPosition(value: FieldPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
