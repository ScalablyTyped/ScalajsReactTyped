package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.FieldDef
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaLite.vegaLiteStrings.radius
import typingsJapgolly.vegaLite.vegaLiteStrings.theta
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodePositionRectMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rectBinRef(hasFieldDefScaleNameBandPositionOffset: FieldDef): VgValueRef = ^.asInstanceOf[js.Dynamic].applyDynamic("rectBinRef")(hasFieldDefScaleNameBandPositionOffset.asInstanceOf[js.Any]).asInstanceOf[VgValueRef]
  
  inline def rectPosition(model: UnitModel, channel: x | y | theta | radius): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
}
