package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationPrevMod.Prev
import typingsJapgolly.tsToolbelt.outListDropMod.DropBack
import typingsJapgolly.tsToolbelt.outListDropMod.DropForth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */] extends StObject {
  
  @JSName("->")
  var `-Greaterthansign`: DropForth[L, N]
  
  @JSName("<-")
  var `Lessthansign-`: DropBack[L, N, Prev[N], js.Array[Any]]
}
object _empty {
  
  inline def apply[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */](`-Greaterthansign`: DropForth[L, N], `Lessthansign-`: DropBack[L, N, Prev[N], js.Array[Any]]): _empty[L, N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("->")(`-Greaterthansign`.asInstanceOf[js.Any])
    __obj.updateDynamic("<-")(`Lessthansign-`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty[L, N]]
  }
  
  extension [Self <: _empty[?, ?], L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */](x: Self & (_empty[L, N])) {
    
    inline def `set-Greaterthansign`(value: DropForth[L, N]): Self = StObject.set(x, "->", value.asInstanceOf[js.Any])
    
    inline def `setLessthansign-`(value: DropBack[L, N, Prev[N], js.Array[Any]]): Self = StObject.set(x, "<-", value.asInstanceOf[js.Any])
  }
}
