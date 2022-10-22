package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outIterationIterationOfMod.IterationOf
import typingsJapgolly.tsToolbelt.outObjectPRecordMod.RecordRR
import typingsJapgolly.tsToolbelt.outObjectPRecordMod.RecordRW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R[Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, A] extends StObject {
  
  var R: RecordRR[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
  
  var W: RecordRW[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
}
object R {
  
  inline def apply[Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, A](
    R: RecordRR[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]],
    W: RecordRW[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
  ): R[Path, A] = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any])
    __obj.asInstanceOf[R[Path, A]]
  }
  
  extension [Self <: R[?, ?], Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, A](x: Self & (R[Path, A])) {
    
    inline def setR(value: RecordRR[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    
    inline def setW(value: RecordRW[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
  }
}
