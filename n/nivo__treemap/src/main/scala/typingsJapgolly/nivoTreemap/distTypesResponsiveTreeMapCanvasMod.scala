package typingsJapgolly.nivoTreemap

import typingsJapgolly.nivoTreemap.distTypesTypesMod.TreeMapCanvasProps
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.height
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveTreeMapCanvasMod {
  
  @JSImport("@nivo/treemap/dist/types/ResponsiveTreeMapCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveTreeMapCanvas[Datum /* <: js.Object */](props: Omit[TreeMapCanvasProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMapCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
