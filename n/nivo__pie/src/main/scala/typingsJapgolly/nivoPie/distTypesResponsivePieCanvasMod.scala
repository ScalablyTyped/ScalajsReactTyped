package typingsJapgolly.nivoPie

import typingsJapgolly.nivoPie.distTypesTypesMod.PieCanvasProps
import typingsJapgolly.nivoPie.nivoPieStrings.height
import typingsJapgolly.nivoPie.nivoPieStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsivePieCanvasMod {
  
  @JSImport("@nivo/pie/dist/types/ResponsivePieCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsivePieCanvas[RawDatum](props: Omit[PieCanvasProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsivePieCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
