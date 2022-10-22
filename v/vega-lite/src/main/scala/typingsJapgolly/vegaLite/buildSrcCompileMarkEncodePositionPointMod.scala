package typingsJapgolly.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vegaLite.anon.DefaultPosVgChannel
import typingsJapgolly.vegaLite.anon.MidPointParamschannelxyra
import typingsJapgolly.vegaLite.anon.Model
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaLite.vegaLiteStrings.radius
import typingsJapgolly.vegaLite.vegaLiteStrings.theta
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodePositionPointMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointPosition(channel: x | y | theta | radius, model: UnitModel, hasDefaultPosVgChannel: DefaultPosVgChannel): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannel.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def pointPositionDefaultRef(hasModelDefaultPosChannelScaleNameScale: Model): js.Function0[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointPositionDefaultRef")(hasModelDefaultPosChannelScaleNameScale.asInstanceOf[js.Any]).asInstanceOf[js.Function0[VgValueRef]]
  
  inline def positionRef(params: MidPointParamschannelxyra): VgValueRef | js.Array[VgValueRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("positionRef")(params.asInstanceOf[js.Any]).asInstanceOf[VgValueRef | js.Array[VgValueRef]]
}
