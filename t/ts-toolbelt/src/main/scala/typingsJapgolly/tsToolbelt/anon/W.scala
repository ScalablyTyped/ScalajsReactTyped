package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outIterationIterationOfMod.IterationOf
import typingsJapgolly.tsToolbelt.outObjectPRecordMod.RecordOR
import typingsJapgolly.tsToolbelt.outObjectPRecordMod.RecordOW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait W[Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, A] extends StObject {
  
  var R: RecordOR[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
  
  var W: RecordOW[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
}
object W {
  
  inline def apply[Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, A](
    R: RecordOR[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]],
    W: RecordOW[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
  ): W[Path, A] = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any])
    __obj.asInstanceOf[W[Path, A]]
  }
  
  extension [Self <: W[?, ?], Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, A](x: Self & (W[Path, A])) {
    
    inline def setR(value: RecordOR[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    
    inline def setW(value: RecordOW[Path, A, IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
  }
}
