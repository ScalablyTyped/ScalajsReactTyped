package typingsJapgolly.nodeHueApi.mod

import typingsJapgolly.nodeHueApi.anon.Alert
import typingsJapgolly.nodeHueApi.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILight extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var manufacturername: String
  
  var modelid: String
  
  var name: String
  
  var pointsymbol: js.UndefOr[`1`] = js.undefined
  
  var state: Alert
  
  var swversion: String
  
  var `type`: String
  
  var uniqueid: String
}
object ILight {
  
  inline def apply(
    manufacturername: String,
    modelid: String,
    name: String,
    state: Alert,
    swversion: String,
    `type`: String,
    uniqueid: String
  ): ILight = {
    val __obj = js.Dynamic.literal(manufacturername = manufacturername.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any], uniqueid = uniqueid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILight]
  }
  
  extension [Self <: ILight](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setManufacturername(value: String): Self = StObject.set(x, "manufacturername", value.asInstanceOf[js.Any])
    
    inline def setModelid(value: String): Self = StObject.set(x, "modelid", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPointsymbol(value: `1`): Self = StObject.set(x, "pointsymbol", value.asInstanceOf[js.Any])
    
    inline def setPointsymbolUndefined: Self = StObject.set(x, "pointsymbol", js.undefined)
    
    inline def setState(value: Alert): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSwversion(value: String): Self = StObject.set(x, "swversion", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueid(value: String): Self = StObject.set(x, "uniqueid", value.asInstanceOf[js.Any])
  }
}
