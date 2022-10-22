package typingsJapgolly.nivoTreemap

import typingsJapgolly.nivoTreemap.distTypesTypesMod.TreeMapSvgProps
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.height
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveTreeMapMod {
  
  @JSImport("@nivo/treemap/dist/types/ResponsiveTreeMap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveTreeMap[Datum /* <: js.Object */](props: Omit[TreeMapSvgProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMap")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
