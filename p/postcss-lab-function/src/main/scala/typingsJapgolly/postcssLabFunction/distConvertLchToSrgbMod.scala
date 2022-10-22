package typingsJapgolly.postcssLabFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertLchToSrgbMod {
  
  @JSImport("postcss-lab-function/dist/convert-lch-to-srgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lchToSRgb(lchRaw: color): color = ^.asInstanceOf[js.Dynamic].applyDynamic("lchToSRgb")(lchRaw.asInstanceOf[js.Any]).asInstanceOf[color]
  
  type color = js.Tuple3[Double, Double, Double]
}
