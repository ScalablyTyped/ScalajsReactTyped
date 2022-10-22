package typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.LITERAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectionLiteral
  extends StObject
     with InspectionInferedType {
  
  @JSName("type")
  var type_InspectionLiteral: LITERAL
}
object InspectionLiteral {
  
  inline def apply(`type`: LITERAL): InspectionLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectionLiteral]
  }
  
  extension [Self <: InspectionLiteral](x: Self) {
    
    inline def setType(value: LITERAL): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
