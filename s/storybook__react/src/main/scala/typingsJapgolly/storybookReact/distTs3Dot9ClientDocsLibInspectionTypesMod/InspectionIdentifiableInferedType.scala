package typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.CLASS
import typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ELEMENT
import typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.FUNCTION
import typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.IDENTIFIER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionIdentifier
  - typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionClass
  - typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionFunction
  - typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionElement
*/
trait InspectionIdentifiableInferedType extends StObject
object InspectionIdentifiableInferedType {
  
  inline def InspectionClass(identifier: String, `type`: CLASS): typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionClass = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionClass]
  }
  
  inline def InspectionElement(`type`: ELEMENT): typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionElement]
  }
  
  inline def InspectionFunction(hasParams: Boolean, params: js.Array[Any], `type`: FUNCTION): typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionFunction = {
    val __obj = js.Dynamic.literal(hasParams = hasParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionFunction]
  }
  
  inline def InspectionIdentifier(identifier: String, `type`: IDENTIFIER): typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionIdentifier = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionIdentifier]
  }
}
