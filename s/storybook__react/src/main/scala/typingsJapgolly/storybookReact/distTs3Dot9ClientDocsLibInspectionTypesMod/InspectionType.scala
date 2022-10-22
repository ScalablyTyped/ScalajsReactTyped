package typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InspectionType extends StObject
@JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection/types", "InspectionType")
@js.native
object InspectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InspectionType & String] = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with InspectionType
  /* "Array" */ val ARRAY: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ARRAY & String = js.native
  
  @js.native
  sealed trait CLASS
    extends StObject
       with InspectionType
  /* "Class" */ val CLASS: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.CLASS & String = js.native
  
  @js.native
  sealed trait ELEMENT
    extends StObject
       with InspectionType
  /* "Element" */ val ELEMENT: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.ELEMENT & String = js.native
  
  @js.native
  sealed trait FUNCTION
    extends StObject
       with InspectionType
  /* "Function" */ val FUNCTION: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.FUNCTION & String = js.native
  
  @js.native
  sealed trait IDENTIFIER
    extends StObject
       with InspectionType
  /* "Identifier" */ val IDENTIFIER: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.IDENTIFIER & String = js.native
  
  @js.native
  sealed trait LITERAL
    extends StObject
       with InspectionType
  /* "Literal" */ val LITERAL: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.LITERAL & String = js.native
  
  @js.native
  sealed trait OBJECT
    extends StObject
       with InspectionType
  /* "Object" */ val OBJECT: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.OBJECT & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with InspectionType
  /* "Unknown" */ val UNKNOWN: typingsJapgolly.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionType.UNKNOWN & String = js.native
}
