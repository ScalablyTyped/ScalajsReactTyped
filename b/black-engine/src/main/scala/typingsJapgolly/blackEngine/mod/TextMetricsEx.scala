package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "TextMetricsEx")
@js.native
open class TextMetricsEx ()
  extends typingsJapgolly.blackEngine.displayTextTextMetricsMod.TextMetricsEx
/* static members */
object TextMetricsEx {
  
  @JSImport("black-engine", "TextMetricsEx")
  @js.native
  val ^ : js.Any = js.native
  
  inline def __measure(text: String, style: typingsJapgolly.blackEngine.displayTextTextStyleMod.TextStyle): typingsJapgolly.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle]
  inline def __measure(
    text: String,
    style: typingsJapgolly.blackEngine.displayTextTextStyleMod.TextStyle,
    outBounds: typingsJapgolly.blackEngine.geomRectangleMod.Rectangle
  ): typingsJapgolly.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle]
  
  inline def measure(
    text: String,
    lineHeight: Double,
    styles: typingsJapgolly.blackEngine.displayTextTextStyleMod.TextStyle*
  ): typingsJapgolly.blackEngine.displayTextTextMetricsMod.TextMetricsData = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")((scala.List(text.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).`++`(styles.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typingsJapgolly.blackEngine.displayTextTextMetricsMod.TextMetricsData]
  
  inline def measureBitmap(
    text: String,
    data: typingsJapgolly.blackEngine.assetsBitmapFontAssetMod.BitmapFontData,
    lineHeight: Double,
    outBounds: typingsJapgolly.blackEngine.geomRectangleMod.Rectangle
  ): typingsJapgolly.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("measureBitmap")(text.asInstanceOf[js.Any], data.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blackEngine.geomRectangleMod.Rectangle]
}
