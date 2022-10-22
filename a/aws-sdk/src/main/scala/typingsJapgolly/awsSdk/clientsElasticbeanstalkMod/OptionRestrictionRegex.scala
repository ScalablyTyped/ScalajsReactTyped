package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionRestrictionRegex extends StObject {
  
  /**
    * A unique name representing this regular expression.
    */
  var Label: js.UndefOr[RegexLabel] = js.undefined
  
  /**
    * The regular expression pattern that a string configuration option value with this restriction must match.
    */
  var Pattern: js.UndefOr[RegexPattern] = js.undefined
}
object OptionRestrictionRegex {
  
  inline def apply(): OptionRestrictionRegex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionRestrictionRegex]
  }
  
  extension [Self <: OptionRestrictionRegex](x: Self) {
    
    inline def setLabel(value: RegexLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setPattern(value: RegexPattern): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
  }
}
