package typingsJapgolly.nivoPie

import typingsJapgolly.nivoPie.distTypesTypesMod.PieSvgProps
import typingsJapgolly.nivoPie.nivoPieStrings.height
import typingsJapgolly.nivoPie.nivoPieStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsivePieMod {
  
  @JSImport("@nivo/pie/dist/types/ResponsivePie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsivePie[RawDatum](props: Omit[PieSvgProps[RawDatum], width | height]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsivePie")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
