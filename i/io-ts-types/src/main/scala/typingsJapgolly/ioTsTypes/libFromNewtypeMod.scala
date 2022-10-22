package typingsJapgolly.ioTsTypes

import typingsJapgolly.ioTs.mod.OutputOf
import typingsJapgolly.ioTs.mod.Type_
import typingsJapgolly.newtypeTs.mod.AnyNewtype
import typingsJapgolly.newtypeTs.mod.CarrierOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFromNewtypeMod {
  
  @JSImport("io-ts-types/lib/fromNewtype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromNewtype[N /* <: AnyNewtype */](codec: Type_[CarrierOf[N], OutputOf[CarrierOf[N]], Any]): Type_[N, CarrierOf[N], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNewtype")(codec.asInstanceOf[js.Any]).asInstanceOf[Type_[N, CarrierOf[N], Any]]
  inline def fromNewtype[N /* <: AnyNewtype */](codec: Type_[CarrierOf[N], OutputOf[CarrierOf[N]], Any], name: String): Type_[N, CarrierOf[N], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNewtype")(codec.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Type_[N, CarrierOf[N], Any]]
}
