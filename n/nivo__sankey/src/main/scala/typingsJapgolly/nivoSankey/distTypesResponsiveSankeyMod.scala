package typingsJapgolly.nivoSankey

import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeySvgProps
import typingsJapgolly.nivoSankey.nivoSankeyStrings.height
import typingsJapgolly.nivoSankey.nivoSankeyStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveSankeyMod {
  
  @JSImport("@nivo/sankey/dist/types/ResponsiveSankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveSankey[N /* <: DefaultNode */, L /* <: DefaultLink */](props: Omit[SankeySvgProps[N, L], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveSankey")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
