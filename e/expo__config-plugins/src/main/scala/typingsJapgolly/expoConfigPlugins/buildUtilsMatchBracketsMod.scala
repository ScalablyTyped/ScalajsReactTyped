package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.Leftcurlybracket
import typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.Rightcurlybracket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMatchBracketsMod {
  
  @JSImport("@expo/config-plugins/build/utils/matchBrackets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findMatchingBracketPosition(contents: String, bracket: Bracket): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchingBracketPosition")(contents.asInstanceOf[js.Any], bracket.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def findMatchingBracketPosition(contents: String, bracket: Bracket, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findMatchingBracketPosition")(contents.asInstanceOf[js.Any], bracket.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type Bracket = LeftBracket | RightBracket
  
  type LeftBracket = (/* ( */ String) | Leftcurlybracket
  
  type RightBracket = (/* ) */ String) | Rightcurlybracket
}
