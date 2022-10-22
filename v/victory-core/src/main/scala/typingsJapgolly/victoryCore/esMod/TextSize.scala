package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.victoryCore.anon.Width
import typingsJapgolly.victoryCore.esVictoryUtilTextsizeMod.TextSizeStyleInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextSize {
  
  @JSImport("victory-core/es", "TextSize")
  @js.native
  val ^ : js.Any = js.native
  
  inline def approximateTextSize(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
  inline def approximateTextSize(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  inline def approximateTextSize(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
  inline def approximateTextSize(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("approximateTextSize")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  
  object approximateTextSizeInternal {
    
    @JSImport("victory-core/es", "TextSize._approximateTextSizeInternal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def impl(text: String): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def impl(text: String, style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
    inline def impl(text: js.Array[String]): Width = ^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any]).asInstanceOf[Width]
    inline def impl(text: js.Array[String], style: TextSizeStyleInterface): Width = (^.asInstanceOf[js.Dynamic].applyDynamic("impl")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Width]
  }
  
  inline def convertLengthToPixels(length: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def convertLengthToPixels(length: String, fontSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertLengthToPixels")(length.asInstanceOf[js.Any], fontSize.asInstanceOf[js.Any])).asInstanceOf[Double]
}
