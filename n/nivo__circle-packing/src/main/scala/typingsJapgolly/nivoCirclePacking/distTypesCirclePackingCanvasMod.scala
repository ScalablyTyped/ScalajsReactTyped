package typingsJapgolly.nivoCirclePacking

import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CirclePackingCanvasProps
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

object distTypesCirclePackingCanvasMod {
  
  @JSImport("@nivo/circle-packing/dist/types/CirclePackingCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CirclePackingCanvas[RawDatum](
    hasIsInteractiveThemeOtherProps: (Partial[Omit[CirclePackingCanvasProps[RawDatum], data | height | width]]) & (Pick[CirclePackingCanvasProps[RawDatum], data | height | width])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CirclePackingCanvas")(hasIsInteractiveThemeOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
