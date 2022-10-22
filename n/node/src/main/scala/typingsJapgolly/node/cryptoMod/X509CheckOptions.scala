package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.nodeStrings.always
import typingsJapgolly.node.nodeStrings.never
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CheckOptions extends StObject {
  
  /**
    * @default false
    */
  var multiLabelWildcards: Boolean
  
  /**
    * @default true
    */
  var partialWildcards: Boolean
  
  /**
    * @default false
    */
  var singleLabelSubdomains: Boolean
  
  /**
    * @default 'always'
    */
  var subject: always | never
  
  /**
    * @default true
    */
  var wildcards: Boolean
}
object X509CheckOptions {
  
  inline def apply(
    multiLabelWildcards: Boolean,
    partialWildcards: Boolean,
    singleLabelSubdomains: Boolean,
    subject: always | never,
    wildcards: Boolean
  ): X509CheckOptions = {
    val __obj = js.Dynamic.literal(multiLabelWildcards = multiLabelWildcards.asInstanceOf[js.Any], partialWildcards = partialWildcards.asInstanceOf[js.Any], singleLabelSubdomains = singleLabelSubdomains.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], wildcards = wildcards.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509CheckOptions]
  }
  
  extension [Self <: X509CheckOptions](x: Self) {
    
    inline def setMultiLabelWildcards(value: Boolean): Self = StObject.set(x, "multiLabelWildcards", value.asInstanceOf[js.Any])
    
    inline def setPartialWildcards(value: Boolean): Self = StObject.set(x, "partialWildcards", value.asInstanceOf[js.Any])
    
    inline def setSingleLabelSubdomains(value: Boolean): Self = StObject.set(x, "singleLabelSubdomains", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: always | never): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setWildcards(value: Boolean): Self = StObject.set(x, "wildcards", value.asInstanceOf[js.Any])
  }
}
