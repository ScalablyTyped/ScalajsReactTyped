package typingsJapgolly.nivoSankey

import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeySvgProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyMod {
  
  @JSImport("@nivo/sankey/dist/types/Sankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Sankey[N /* <: DefaultNode */, L /* <: DefaultLink */](hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps: SankeySvgProps[N, L]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Sankey")(hasIsInteractiveAnimateMotionConfigThemeRenderWrapperOtherProps.asInstanceOf[js.Any]).asInstanceOf[Element]
}
