package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.color.mod.Color
import typingsJapgolly.color.mod.ColorParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillPreviewUtilsMod {
  
  @JSImport("wix-style-react/dist/types/FillPreview/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseColor(fill: Any): js.UndefOr[Color[ColorParam]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseColor")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Color[ColorParam]]]
  
  inline def parseElement(fill: Any): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseElement")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  
  inline def parseGradient(fill: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGradient")(fill.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def parseUrl(fill: Any): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(fill.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
