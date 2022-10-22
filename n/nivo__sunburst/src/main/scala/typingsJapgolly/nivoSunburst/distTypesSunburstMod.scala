package typingsJapgolly.nivoSunburst

import typingsJapgolly.nivoSunburst.distTypesTypesMod.SunburstSvgProps
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.data
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.height
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSunburstMod {
  
  @JSImport("@nivo/sunburst/dist/types/Sunburst", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Sunburst[RawDatum](
    hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: (Partial[Omit[SunburstSvgProps[RawDatum], data | height | width]]) & (Pick[SunburstSvgProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Sunburst")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
