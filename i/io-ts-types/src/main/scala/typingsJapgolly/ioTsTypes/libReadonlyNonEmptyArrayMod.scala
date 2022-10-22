package typingsJapgolly.ioTsTypes

import typingsJapgolly.ioTs.mod.Mixed_
import typingsJapgolly.ioTs.mod.OutputOf
import typingsJapgolly.ioTs.mod.TypeOf
import typingsJapgolly.ioTs.mod.Type_
import typingsJapgolly.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReadonlyNonEmptyArrayMod {
  
  @JSImport("io-ts-types/lib/readonlyNonEmptyArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readonlyNonEmptyArray[C /* <: Mixed_ */](codec: C): ReadonlyNonEmptyArrayC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonlyNonEmptyArray")(codec.asInstanceOf[js.Any]).asInstanceOf[ReadonlyNonEmptyArrayC[C]]
  inline def readonlyNonEmptyArray[C /* <: Mixed_ */](codec: C, name: String): ReadonlyNonEmptyArrayC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("readonlyNonEmptyArray")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[ReadonlyNonEmptyArrayC[C]]
  
  type ReadonlyNonEmptyArrayC[C /* <: Mixed_ */] = Type_[ReadonlyNonEmptyArray_[TypeOf[C]], ReadonlyNonEmptyArray_[OutputOf[C]], Any]
  
  @js.native
  trait ReadonlyNonEmptyArray_[A]
    extends StObject
       with ReadonlyArray[A] {
    
    val `0`: A = js.native
  }
}
