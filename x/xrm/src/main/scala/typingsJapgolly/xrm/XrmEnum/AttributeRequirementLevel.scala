package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.none
import typingsJapgolly.xrm.xrmStrings.recommended
import typingsJapgolly.xrm.xrmStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Requirement Level for {@link Attributes.Attribute.getRequiredLevel Attributes.Attribute.getRequiredLevel()} and
  * {@link Attributes.Attribute.setRequiredLevel Attributes.Attribute.setRequiredLevel()}.
  * @see {@link Xrm.Attributes.RequirementLevel}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.none
  - typingsJapgolly.xrm.xrmStrings.recommended
  - typingsJapgolly.xrm.xrmStrings.required
*/
trait AttributeRequirementLevel extends StObject
object AttributeRequirementLevel {
  
  inline def None: none = "none".asInstanceOf[none]
  
  inline def Recommended: recommended = "recommended".asInstanceOf[recommended]
  
  inline def Required: required = "required".asInstanceOf[required]
}
