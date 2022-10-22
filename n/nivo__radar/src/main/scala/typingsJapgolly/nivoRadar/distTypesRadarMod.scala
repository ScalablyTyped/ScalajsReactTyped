package typingsJapgolly.nivoRadar

import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSvgProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadarMod {
  
  @JSImport("@nivo/radar/dist/types/Radar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Radar[D /* <: Record[String, Any] */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: RadarSvgProps[D]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Radar")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
