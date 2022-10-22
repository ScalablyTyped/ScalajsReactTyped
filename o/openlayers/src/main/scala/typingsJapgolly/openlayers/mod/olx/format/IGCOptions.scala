package typingsJapgolly.openlayers.mod.olx.format

import typingsJapgolly.openlayers.mod.format.IGCZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable-next-line:interface-name */
trait IGCOptions extends StObject {
  
  var altitudeMode: js.UndefOr[IGCZ] = js.undefined
}
object IGCOptions {
  
  inline def apply(): IGCOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGCOptions]
  }
  
  extension [Self <: IGCOptions](x: Self) {
    
    inline def setAltitudeMode(value: IGCZ): Self = StObject.set(x, "altitudeMode", value.asInstanceOf[js.Any])
    
    inline def setAltitudeModeUndefined: Self = StObject.set(x, "altitudeMode", js.undefined)
  }
}
