package typingsJapgolly.nivoBar

import typingsJapgolly.nivoBar.distTypesTypesMod.BarTooltipProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarTooltipMod {
  
  @JSImport("@nivo/bar/dist/types/BarTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BarTooltip[RawDatum](hasColorLabelData: BarTooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BarTooltip")(hasColorLabelData.asInstanceOf[js.Any]).asInstanceOf[Element]
}
