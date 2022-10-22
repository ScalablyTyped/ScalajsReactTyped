package typingsJapgolly.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options passed to a <code>FeatureStyleFunction</code>.
  */
trait FeatureStyleFunctionOptions extends StObject {
  
  /**
    * Available only in the v=beta channel: https://goo.gle/3oAthT3.
    * <code>Feature</code> passed into the <code>FeatureStyleFunction</code>
    * for styling.
    */
  var feature: Feature
}
object FeatureStyleFunctionOptions {
  
  inline def apply(feature: Feature): FeatureStyleFunctionOptions = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureStyleFunctionOptions]
  }
  
  extension [Self <: FeatureStyleFunctionOptions](x: Self) {
    
    inline def setFeature(value: Feature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
  }
}
