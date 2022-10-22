package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickThroughUrlSuffixProperties extends StObject {
  
  /** Click-through URL suffix to apply to all ads in this entity's scope. Must be less than 128 characters long. */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.undefined
  
  /** Whether this entity should override the inherited click-through URL suffix with its own defined value. */
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.undefined
}
object ClickThroughUrlSuffixProperties {
  
  inline def apply(): ClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickThroughUrlSuffixProperties]
  }
  
  extension [Self <: ClickThroughUrlSuffixProperties](x: Self) {
    
    inline def setClickThroughUrlSuffix(value: String): Self = StObject.set(x, "clickThroughUrlSuffix", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlSuffixUndefined: Self = StObject.set(x, "clickThroughUrlSuffix", js.undefined)
    
    inline def setOverrideInheritedSuffix(value: Boolean): Self = StObject.set(x, "overrideInheritedSuffix", value.asInstanceOf[js.Any])
    
    inline def setOverrideInheritedSuffixUndefined: Self = StObject.set(x, "overrideInheritedSuffix", js.undefined)
  }
}
