package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outNumberAddMod.AddNegative
import typingsJapgolly.tsToolbelt.outNumberAddMod.AddPositive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0AddPositive`[N1 /* <: Iteration */, N2 /* <: Iteration */] extends StObject {
  
  var `0`: AddPositive[N1, N2]
  
  var `1`: AddNegative[N1, N2]
}
object `0AddPositive` {
  
  inline def apply[N1 /* <: Iteration */, N2 /* <: Iteration */](`0`: AddPositive[N1, N2], `1`: AddNegative[N1, N2]): `0AddPositive`[N1, N2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0AddPositive`[N1, N2]]
  }
  
  extension [Self <: `0AddPositive`[?, ?], N1 /* <: Iteration */, N2 /* <: Iteration */](x: Self & (`0AddPositive`[N1, N2])) {
    
    inline def set0(value: AddPositive[N1, N2]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: AddNegative[N1, N2]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
