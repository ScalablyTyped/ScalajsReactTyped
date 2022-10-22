package typingsJapgolly.storybookReact

import typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientDocsLibInspectionMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection", "InspectionType")
  @js.native
  object InspectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType & String
      ] = js.native
    
    /* "Array" */ val ARRAY: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ARRAY & String = js.native
    
    /* "Class" */ val CLASS: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.CLASS & String = js.native
    
    /* "Element" */ val ELEMENT: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ELEMENT & String = js.native
    
    /* "Function" */ val FUNCTION: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.FUNCTION & String = js.native
    
    /* "Identifier" */ val IDENTIFIER: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.IDENTIFIER & String = js.native
    
    /* "Literal" */ val LITERAL: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.LITERAL & String = js.native
    
    /* "Object" */ val OBJECT: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.OBJECT & String = js.native
    
    /* "Unknown" */ val UNKNOWN: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.UNKNOWN & String = js.native
  }
  
  inline def inspectValue(value: String): InspectionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectValue")(value.asInstanceOf[js.Any]).asInstanceOf[InspectionResult]
}
