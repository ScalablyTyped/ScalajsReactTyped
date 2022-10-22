package typingsJapgolly.hapiJoi.mod

import typingsJapgolly.hapiJoi.hapiJoiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailOptions extends StObject {
  
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if `true`, ignore invalid email length errors.
    *
    * @default false
    */
  var ignoreLength: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of segments required for the domain. Be careful since some domains, such as `io`, directly allow email.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.undefined
  
  /**
    * if true, allows multiple email addresses in a single string, separated by , or the separator characters.
    *
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when multiple is true, overrides the default , separator. String can be a single character or multiple separator characters.
    *
    * @default ','
    */
  var separator: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.undefined
}
object EmailOptions {
  
  inline def apply(): EmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailOptions]
  }
  
  extension [Self <: EmailOptions](x: Self) {
    
    inline def setAllowUnicode(value: Boolean): Self = StObject.set(x, "allowUnicode", value.asInstanceOf[js.Any])
    
    inline def setAllowUnicodeUndefined: Self = StObject.set(x, "allowUnicode", js.undefined)
    
    inline def setIgnoreLength(value: Boolean): Self = StObject.set(x, "ignoreLength", value.asInstanceOf[js.Any])
    
    inline def setIgnoreLengthUndefined: Self = StObject.set(x, "ignoreLength", js.undefined)
    
    inline def setMinDomainSegments(value: Double): Self = StObject.set(x, "minDomainSegments", value.asInstanceOf[js.Any])
    
    inline def setMinDomainSegmentsUndefined: Self = StObject.set(x, "minDomainSegments", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setSeparator(value: String | js.Array[String]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setSeparatorVarargs(value: String*): Self = StObject.set(x, "separator", js.Array(value*))
    
    inline def setTlds(value: TopLevelDomainOptions | `false`): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
    
    inline def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
  }
}
