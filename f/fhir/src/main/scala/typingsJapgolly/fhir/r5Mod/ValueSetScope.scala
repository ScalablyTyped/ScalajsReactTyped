package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetScope
  extends StObject
     with BackboneElement {
  
  var _exclusionCriteria: js.UndefOr[Element] = js.undefined
  
  var _focus: js.UndefOr[Element] = js.undefined
  
  var _inclusionCriteria: js.UndefOr[Element] = js.undefined
  
  /**
    * Criteria describing which concepts or codes should be excluded and why.
    */
  var exclusionCriteria: js.UndefOr[String] = js.undefined
  
  /**
    * The general focus of the Value Set as it relates to the intended semantic space. This can be the information about clinical relevancy or the statement about the general focus of the Value Set, such as a description of types of messages, payment options, geographic locations, etc.
    */
  var focus: js.UndefOr[String] = js.undefined
  
  /**
    * Criteria describing which concepts or codes should be included and why.
    */
  var inclusionCriteria: js.UndefOr[String] = js.undefined
}
object ValueSetScope {
  
  inline def apply(): ValueSetScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueSetScope]
  }
  
  extension [Self <: ValueSetScope](x: Self) {
    
    inline def setExclusionCriteria(value: String): Self = StObject.set(x, "exclusionCriteria", value.asInstanceOf[js.Any])
    
    inline def setExclusionCriteriaUndefined: Self = StObject.set(x, "exclusionCriteria", js.undefined)
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setInclusionCriteria(value: String): Self = StObject.set(x, "inclusionCriteria", value.asInstanceOf[js.Any])
    
    inline def setInclusionCriteriaUndefined: Self = StObject.set(x, "inclusionCriteria", js.undefined)
    
    inline def set_exclusionCriteria(value: Element): Self = StObject.set(x, "_exclusionCriteria", value.asInstanceOf[js.Any])
    
    inline def set_exclusionCriteriaUndefined: Self = StObject.set(x, "_exclusionCriteria", js.undefined)
    
    inline def set_focus(value: Element): Self = StObject.set(x, "_focus", value.asInstanceOf[js.Any])
    
    inline def set_focusUndefined: Self = StObject.set(x, "_focus", js.undefined)
    
    inline def set_inclusionCriteria(value: Element): Self = StObject.set(x, "_inclusionCriteria", value.asInstanceOf[js.Any])
    
    inline def set_inclusionCriteriaUndefined: Self = StObject.set(x, "_inclusionCriteria", js.undefined)
  }
}
