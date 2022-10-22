package typingsJapgolly.grayPercentage

import typingsJapgolly.grayPercentage.grayPercentageStrings.cool
import typingsJapgolly.grayPercentage.grayPercentageStrings.slate
import typingsJapgolly.grayPercentage.grayPercentageStrings.warm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(lightness: Double): String = ^.asInstanceOf[js.Dynamic].apply(lightness.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(lightness: Double, hue: cool | slate | warm): String = (^.asInstanceOf[js.Dynamic].apply(lightness.asInstanceOf[js.Any], hue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(lightness: Double, hue: cool | slate | warm, darkBackground: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(lightness.asInstanceOf[js.Any], hue.asInstanceOf[js.Any], darkBackground.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(lightness: Double, hue: Double): String = (^.asInstanceOf[js.Dynamic].apply(lightness.asInstanceOf[js.Any], hue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(lightness: Double, hue: Double, darkBackground: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(lightness.asInstanceOf[js.Any], hue.asInstanceOf[js.Any], darkBackground.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(lightness: Double, hue: Unit, darkBackground: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(lightness.asInstanceOf[js.Any], hue.asInstanceOf[js.Any], darkBackground.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("gray-percentage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
