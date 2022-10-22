package typingsJapgolly.ioTsTypes

import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.ioTs.mod.Mixed_
import typingsJapgolly.ioTs.mod.OutputOf
import typingsJapgolly.ioTs.mod.TypeOf
import typingsJapgolly.ioTs.mod.Type_
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSetFromArrayMod {
  
  @JSImport("io-ts-types/lib/setFromArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]]): SetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("setFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[SetFromArrayC[C]]
  inline def setFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]], name: String): SetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("setFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[SetFromArrayC[C]]
  
  type SetFromArrayC[C /* <: Mixed_ */] = Type_[Set[TypeOf[C]], js.Array[OutputOf[C]], Any]
}
