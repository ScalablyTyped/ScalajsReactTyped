package typingsJapgolly.nivoTreemap

import typingsJapgolly.nivoTreemap.distTypesTypesMod.TreeMapHtmlProps
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.height
import typingsJapgolly.nivoTreemap.nivoTreemapStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveTreeMapHtmlMod {
  
  @JSImport("@nivo/treemap/dist/types/ResponsiveTreeMapHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveTreeMapHtml[Datum /* <: js.Object */](props: Omit[TreeMapHtmlProps[Datum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveTreeMapHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
