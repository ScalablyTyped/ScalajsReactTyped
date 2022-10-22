package typingsJapgolly.c3.mod

import typingsJapgolly.c3.anon.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineOptions extends StObject {
  
  /**
    * Set if null data point will be connected or not.
    * If `true` set, the region of null data will be connected without any data point.
    * If `false` set, the region of null data will not be connected and get empty.
    */
  var connectNull: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[`4`] = js.undefined
}
object LineOptions {
  
  inline def apply(): LineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOptions]
  }
  
  extension [Self <: LineOptions](x: Self) {
    
    inline def setConnectNull(value: Boolean): Self = StObject.set(x, "connectNull", value.asInstanceOf[js.Any])
    
    inline def setConnectNullUndefined: Self = StObject.set(x, "connectNull", js.undefined)
    
    inline def setStep(value: `4`): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
