package typingsJapgolly.vegaLite.buildSrcChanneldefMod

import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ChannelDef[F /* <: Field */] extends StObject
object _ChannelDef {
  
  inline def OrderFieldDef[F /* <: Field */](): typingsJapgolly.vegaLite.buildSrcChanneldefMod.OrderFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcChanneldefMod.OrderFieldDef[F]]
  }
  
  inline def OrderValueDef(value: Double | ExprRef | SignalRef): typingsJapgolly.vegaLite.buildSrcChanneldefMod.OrderValueDef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcChanneldefMod.OrderValueDef]
  }
}
