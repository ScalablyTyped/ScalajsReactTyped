package typingsJapgolly.camljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.camljs.anon.Count
  - typingsJapgolly.camljs.anon.Sum
  - typingsJapgolly.camljs.anon.Avg
  - typingsJapgolly.camljs.anon.Max
  - typingsJapgolly.camljs.anon.Min
  - typingsJapgolly.camljs.anon.Stdev
  - typingsJapgolly.camljs.anon.Var
*/
trait Aggregation extends StObject
object Aggregation {
  
  inline def Avg(avg: String): typingsJapgolly.camljs.anon.Avg = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.camljs.anon.Avg]
  }
  
  inline def Count(count: String): typingsJapgolly.camljs.anon.Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.camljs.anon.Count]
  }
  
  inline def Max(max: String): typingsJapgolly.camljs.anon.Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.camljs.anon.Max]
  }
  
  inline def Min(min: String): typingsJapgolly.camljs.anon.Min = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.camljs.anon.Min]
  }
  
  inline def Stdev(stdev: String): typingsJapgolly.camljs.anon.Stdev = {
    val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.camljs.anon.Stdev]
  }
  
  inline def Sum(sum: String): typingsJapgolly.camljs.anon.Sum = {
    val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.camljs.anon.Sum]
  }
  
  inline def Var(`var`: String): typingsJapgolly.camljs.anon.Var = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.camljs.anon.Var]
  }
}
