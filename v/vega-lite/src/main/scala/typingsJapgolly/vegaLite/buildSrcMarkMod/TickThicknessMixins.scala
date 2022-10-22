package typingsJapgolly.vegaLite.buildSrcMarkMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickThicknessMixins extends StObject {
  
  /**
    * Thickness of the tick mark.
    *
    * __Default value:__  `1`
    *
    * @minimum 0
    */
  var thickness: js.UndefOr[Double | SignalRef] = js.undefined
}
object TickThicknessMixins {
  
  inline def apply(): TickThicknessMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickThicknessMixins]
  }
  
  extension [Self <: TickThicknessMixins](x: Self) {
    
    inline def setThickness(value: Double | SignalRef): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
