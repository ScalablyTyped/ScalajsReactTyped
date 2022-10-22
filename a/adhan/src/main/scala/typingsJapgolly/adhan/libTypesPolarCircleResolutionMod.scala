package typingsJapgolly.adhan

import typingsJapgolly.adhan.anon.AqrabBalad
import typingsJapgolly.adhan.anon.Coordinates
import typingsJapgolly.adhan.libTypesCoordinatesMod.default
import typingsJapgolly.adhan.libTypesTypeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPolarCircleResolutionMod {
  
  @JSImport("adhan/lib/types/PolarCircleResolution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PolarCircleResolution {
    
    @JSImport("adhan/lib/types/PolarCircleResolution", "PolarCircleResolution.AqrabBalad")
    @js.native
    val AqrabBalad: typingsJapgolly.adhan.adhanStrings.AqrabBalad = js.native
    
    @JSImport("adhan/lib/types/PolarCircleResolution", "PolarCircleResolution.AqrabYaum")
    @js.native
    val AqrabYaum: typingsJapgolly.adhan.adhanStrings.AqrabYaum = js.native
    
    @JSImport("adhan/lib/types/PolarCircleResolution", "PolarCircleResolution.Unresolved")
    @js.native
    val Unresolved: typingsJapgolly.adhan.adhanStrings.Unresolved = js.native
  }
  
  inline def polarCircleResolvedValues(resolver: ValueOf[AqrabBalad], date: js.Date, coordinates: default): Coordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("polarCircleResolvedValues")(resolver.asInstanceOf[js.Any], date.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[Coordinates]
}
