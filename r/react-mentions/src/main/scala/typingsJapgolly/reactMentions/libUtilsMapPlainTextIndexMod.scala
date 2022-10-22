package typingsJapgolly.reactMentions

import typingsJapgolly.reactMentions.reactMentionsStrings.END
import typingsJapgolly.reactMentions.reactMentionsStrings.NULL
import typingsJapgolly.reactMentions.reactMentionsStrings.START
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMapPlainTextIndexMod {
  
  @JSImport("react-mentions/lib/utils/mapPlainTextIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapPlainTextIndex(value: String, markup: String, indexInPlainText: Double, inMarkupCorrection: START | END | NULL): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mapPlainTextIndex")(value.asInstanceOf[js.Any], markup.asInstanceOf[js.Any], indexInPlainText.asInstanceOf[js.Any], inMarkupCorrection.asInstanceOf[js.Any])).asInstanceOf[Double]
}
