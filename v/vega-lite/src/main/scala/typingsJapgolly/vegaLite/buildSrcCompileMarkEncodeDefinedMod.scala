package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChanneldefMod.Value
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeDefinedMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/defined", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defined(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("defined")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  
  inline def valueIfDefined(prop: String, value: Value[ExprRef | SignalRef]): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("valueIfDefined")(prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
