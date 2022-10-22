package typingsJapgolly.rethinkdb.mod

import typingsJapgolly.rethinkdb.rethinkdbStrings.WGS84
import typingsJapgolly.rethinkdb.rethinkdbStrings.ft
import typingsJapgolly.rethinkdb.rethinkdbStrings.km
import typingsJapgolly.rethinkdb.rethinkdbStrings.m
import typingsJapgolly.rethinkdb.rethinkdbStrings.mi
import typingsJapgolly.rethinkdb.rethinkdbStrings.nm
import typingsJapgolly.rethinkdb.rethinkdbStrings.unit_sphere
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceOptions extends StObject {
  
  /**
    * The reference ellipsoid to use for geographic coordinates. Possible values are `WGS84` (the default), a common standard for Earth’s geometry, or `unit_sphere`, a perfect sphere of 1 meter radius.
    */
  var geoSystem: js.UndefOr[WGS84 | unit_sphere] = js.undefined
  
  /**
    * Unit for the distance. Possible values are `m` (meter, the default), `km` (kilometer), `mi` (international mile), `nm` (nautical mile), `ft` (international foot).
    */
  var unit: js.UndefOr[m | km | mi | nm | ft] = js.undefined
}
object DistanceOptions {
  
  inline def apply(): DistanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceOptions]
  }
  
  extension [Self <: DistanceOptions](x: Self) {
    
    inline def setGeoSystem(value: WGS84 | unit_sphere): Self = StObject.set(x, "geoSystem", value.asInstanceOf[js.Any])
    
    inline def setGeoSystemUndefined: Self = StObject.set(x, "geoSystem", js.undefined)
    
    inline def setUnit(value: m | km | mi | nm | ft): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
