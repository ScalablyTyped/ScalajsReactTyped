package typingsJapgolly.nivoBar

import typingsJapgolly.nivoBar.distTypesTypesMod.BarDatum
import typingsJapgolly.nivoBar.distTypesTypesMod.BarSvgProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarMod {
  
  @JSImport("@nivo/bar/dist/types/Bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Bar[RawDatum /* <: BarDatum */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: BarSvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Bar")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
