package typingsJapgolly.atlaskitTokens

import typingsJapgolly.atlaskitTokens.anon.A
import typingsJapgolly.atlaskitTokens.anon.G
import typingsJapgolly.atlaskitTokens.anon.HardcodedSurface
import typingsJapgolly.atlaskitTokens.anon.Opacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsColorDetectionMod {
  
  @JSImport("@atlaskit/tokens/dist/types/utils/color-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBorderForBackground(hex: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorderForBackground")(hex.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getBoxShadow(rawShadow: js.Array[Opacity]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoxShadow")(rawShadow.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLuminance(hasRGB: G): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(hasRGB.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTextColorForBackground(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextColorForBackground")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTextColorForBackground(hex: String, opts: HardcodedSurface): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextColorForBackground")(hex.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexToRGBA(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGBA")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToRGBAValues(hex: String): A = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGBAValues")(hex.asInstanceOf[js.Any]).asInstanceOf[A]
}
