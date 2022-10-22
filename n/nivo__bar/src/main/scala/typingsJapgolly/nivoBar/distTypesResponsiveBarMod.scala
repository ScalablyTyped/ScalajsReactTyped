package typingsJapgolly.nivoBar

import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarSvgProps
import typingsJapgolly.nivoBar.nivoBarStrings.height
import typingsJapgolly.nivoBar.nivoBarStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveBarMod {
  
  @JSImport("@nivo/bar/dist/types/ResponsiveBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveBar[RawDatum /* <: BarDatum */](props: Omit[BarSvgProps[RawDatum], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveBar")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
