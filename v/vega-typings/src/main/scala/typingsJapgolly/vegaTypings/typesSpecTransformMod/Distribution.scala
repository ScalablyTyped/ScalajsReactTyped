package typingsJapgolly.vegaTypings.typesSpecTransformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionNormal
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionLogNormal
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionUniform
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionKDE
  - typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionMixture
*/
trait Distribution extends StObject
object Distribution {
  
  inline def DistributionKDE(field: String | TransformField): typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionKDE = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "kde")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionKDE]
  }
  
  inline def DistributionLogNormal(): typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionLogNormal = {
    val __obj = js.Dynamic.literal(function = "lognormal")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionLogNormal]
  }
  
  inline def DistributionMixture(field: String | TransformField): typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "mixture")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionMixture]
  }
  
  inline def DistributionNormal(): typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionNormal = {
    val __obj = js.Dynamic.literal(function = "normal")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionNormal]
  }
  
  inline def DistributionUniform(): typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionUniform = {
    val __obj = js.Dynamic.literal(function = "uniform")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecTransformMod.DistributionUniform]
  }
}
