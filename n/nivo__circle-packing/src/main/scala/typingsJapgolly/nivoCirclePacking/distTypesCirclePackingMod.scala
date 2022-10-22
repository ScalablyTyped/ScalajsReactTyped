package typingsJapgolly.nivoCirclePacking

import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CirclePackingSvgProps
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.data
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.height
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCirclePackingMod {
  
  @JSImport("@nivo/circle-packing/dist/types/CirclePacking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CirclePacking[RawDatum](
    hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps: (Partial[Omit[CirclePackingSvgProps[RawDatum], data | height | width]]) & (Pick[CirclePackingSvgProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePacking")(hasThemeIsInteractiveAnimateMotionConfigRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
