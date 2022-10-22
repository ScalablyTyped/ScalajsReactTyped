package typingsJapgolly.ioTsTypes

import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.ioTs.mod.Mixed_
import typingsJapgolly.ioTs.mod.OutputOf
import typingsJapgolly.ioTs.mod.TypeOf
import typingsJapgolly.ioTs.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionMod {
  
  @JSImport("io-ts-types/lib/option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def option[C /* <: Mixed_ */](codec: C): OptionC[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(codec.asInstanceOf[js.Any]).asInstanceOf[OptionC[C]]
  inline def option[C /* <: Mixed_ */](codec: C, name: String): OptionC[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[OptionC[C]]
  
  type OptionC[C /* <: Mixed_ */] = Type_[Option_[TypeOf[C]], Option_[OutputOf[C]], Any]
}
