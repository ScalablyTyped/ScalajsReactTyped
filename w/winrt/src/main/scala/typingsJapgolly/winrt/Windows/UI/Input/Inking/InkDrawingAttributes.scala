package typingsJapgolly.winrt.Windows.UI.Input.Inking

import typingsJapgolly.winrt.Windows.Foundation.Size
import typingsJapgolly.winrt.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkDrawingAttributes
  extends StObject
     with IInkDrawingAttributes
object InkDrawingAttributes {
  
  inline def apply(color: Color, fitToCurve: Boolean, ignorePressure: Boolean, penTip: PenTipShape, size: Size): InkDrawingAttributes = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fitToCurve = fitToCurve.asInstanceOf[js.Any], ignorePressure = ignorePressure.asInstanceOf[js.Any], penTip = penTip.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkDrawingAttributes]
  }
}
