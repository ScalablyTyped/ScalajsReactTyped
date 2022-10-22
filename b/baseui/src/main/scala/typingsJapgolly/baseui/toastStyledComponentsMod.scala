package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.sizenumberstringcolorstri
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.svg
import typingsJapgolly.baseui.toastTypesMod.PlacementType
import typingsJapgolly.baseui.toastTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.toastTypesMod.ToasterSharedStylePropsArg
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastStyledComponentsMod {
  
  @JSImport("baseui/toast/styled-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("baseui/toast/styled-components", "Body")
  @js.native
  val Body: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/toast/styled-components", "CloseIconSvg")
  @js.native
  val CloseIconSvg: StyletronComponent[svg, sizenumberstringcolorstri] = js.native
  
  @JSImport("baseui/toast/styled-components", "InnerContainer")
  @js.native
  val InnerContainer: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/toast/styled-components", "Root")
  @js.native
  val Root: StyletronComponent[div, ToasterSharedStylePropsArg] = js.native
  
  inline def getPlacement(placement: PlacementType): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
}
