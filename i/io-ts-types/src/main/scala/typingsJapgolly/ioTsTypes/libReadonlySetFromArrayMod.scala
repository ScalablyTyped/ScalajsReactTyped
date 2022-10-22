package typingsJapgolly.ioTsTypes

import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.ioTs.mod.Mixed_
import typingsJapgolly.ioTs.mod.OutputOf
import typingsJapgolly.ioTs.mod.TypeOf
import typingsJapgolly.ioTs.mod.Type_
import typingsJapgolly.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReadonlySetFromArrayMod {
  
  @JSImport("io-ts-types/lib/readonlySetFromArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readonlySetFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]]): ReadonlySetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlySetFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any])).asInstanceOf[ReadonlySetFromArrayC[C]]
  inline def readonlySetFromArray[C /* <: Mixed_ */](codec: C, O: Ord_[TypeOf[C]], name: String): ReadonlySetFromArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlySetFromArray")(codec.asInstanceOf[js.Any], O.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReadonlySetFromArrayC[C]]
  
  type ReadonlySetFromArrayC[C /* <: Mixed_ */] = Type_[ReadonlySet[TypeOf[C]], js.Array[OutputOf[C]], Any]
}
