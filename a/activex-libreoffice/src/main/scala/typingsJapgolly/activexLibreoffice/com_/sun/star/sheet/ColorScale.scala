package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorScale
  extends StObject
     with XConditionEntry {
  
  var ColorScaleEntries: SafeArray[XColorScaleEntry]
}
object ColorScale {
  
  inline def apply(
    ColorScaleEntries: SafeArray[XColorScaleEntry],
    Type: Double,
    acquire: Callback,
    getType: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): ColorScale = {
    val __obj = js.Dynamic.literal(ColorScaleEntries = ColorScaleEntries.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[ColorScale]
  }
  
  extension [Self <: ColorScale](x: Self) {
    
    inline def setColorScaleEntries(value: SafeArray[XColorScaleEntry]): Self = StObject.set(x, "ColorScaleEntries", value.asInstanceOf[js.Any])
  }
}
