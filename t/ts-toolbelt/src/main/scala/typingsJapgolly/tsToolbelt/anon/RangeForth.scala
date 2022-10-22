package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outIterationPrevMod.Prev
import typingsJapgolly.tsToolbelt.outNumberRangeMod.RangeBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeForth[To /* <: Iteration */, From /* <: Iteration */] extends StObject {
  
  @JSName("->")
  var `-Greaterthansign`: typingsJapgolly.tsToolbelt.outNumberRangeMod.RangeForth[To, Prev[From], js.Array[Any]]
  
  @JSName("<-")
  var `Lessthansign-`: RangeBack[From, Next[To], js.Array[Any]]
}
object RangeForth {
  
  inline def apply[To /* <: Iteration */, From /* <: Iteration */](
    `-Greaterthansign`: typingsJapgolly.tsToolbelt.outNumberRangeMod.RangeForth[To, Prev[From], js.Array[Any]],
    `Lessthansign-`: RangeBack[From, Next[To], js.Array[Any]]
  ): RangeForth[To, From] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("->")(`-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-")(`Lessthansign-`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeForth[To, From]]
  }
  
  extension [Self <: RangeForth[?, ?], To /* <: Iteration */, From /* <: Iteration */](x: Self & (RangeForth[To, From])) {
    
    inline def `set-Greaterthansign`(value: typingsJapgolly.tsToolbelt.outNumberRangeMod.RangeForth[To, Prev[From], js.Array[Any]]): Self = StObject.set(x, "->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-`(value: RangeBack[From, Next[To], js.Array[Any]]): Self = StObject.set(x, "<-", value.asInstanceOf[js.Any])
  }
}
