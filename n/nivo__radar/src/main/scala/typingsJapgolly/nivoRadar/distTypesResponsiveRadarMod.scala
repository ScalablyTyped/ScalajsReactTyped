package typingsJapgolly.nivoRadar

import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSvgProps
import typingsJapgolly.nivoRadar.nivoRadarStrings.height
import typingsJapgolly.nivoRadar.nivoRadarStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveRadarMod {
  
  @JSImport("@nivo/radar/dist/types/ResponsiveRadar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveRadar[D /* <: Record[String, Any] */](props: Omit[RadarSvgProps[D], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveRadar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
