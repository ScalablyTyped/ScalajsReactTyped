package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcMarkMod.Mark
import typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef
import typingsJapgolly.vegaLite.vegaLiteStrings.middle
import typingsJapgolly.vegaLite.vegaLiteStrings.radius
import typingsJapgolly.vegaLite.vegaLiteStrings.theta
import typingsJapgolly.vegaLite.vegaLiteStrings.top
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodePositionAlignMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/position-align", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def vgAlignedPositionChannel(channel: x | y | radius | theta, markDef: MarkDef[Mark, SignalRef], config: Config[SignalRef]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vgAlignedPositionChannel")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def vgAlignedPositionChannel(
    channel: x | y | radius | theta,
    markDef: MarkDef[Mark, SignalRef],
    config: Config[SignalRef],
    defaultAlign: top | middle
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vgAlignedPositionChannel")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaultAlign.asInstanceOf[js.Any])).asInstanceOf[Any]
}
