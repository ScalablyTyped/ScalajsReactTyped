package typingsJapgolly.nodePostal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object expand {
    
    @JSImport("node-postal", "expand")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-postal", "expand.expand_address")
    @js.native
    def expandAddress: js.Function1[/* address */ String, js.Array[String]] = js.native
    
    inline def expandAddress(address: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("expand_address")(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def expandAddress_=(x: js.Function1[/* address */ String, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand_address")(x.asInstanceOf[js.Any])
  }
  
  object parser {
    
    @JSImport("node-postal", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-postal", "parser.parse_address")
    @js.native
    def parseAddress: js.Function1[/* address */ String, js.Array[PostalResult]] = js.native
    
    inline def parseAddress(address: String): js.Array[PostalResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_address")(address.asInstanceOf[js.Any]).asInstanceOf[js.Array[PostalResult]]
    inline def parseAddress_=(x: js.Function1[/* address */ String, js.Array[PostalResult]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse_address")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodePostal.nodePostalStrings.category
    - typingsJapgolly.nodePostal.nodePostalStrings.city_district
    - typingsJapgolly.nodePostal.nodePostalStrings.city
    - typingsJapgolly.nodePostal.nodePostalStrings.country_region
    - typingsJapgolly.nodePostal.nodePostalStrings.country
    - typingsJapgolly.nodePostal.nodePostalStrings.entrance
    - typingsJapgolly.nodePostal.nodePostalStrings.house_number
    - typingsJapgolly.nodePostal.nodePostalStrings.house
    - typingsJapgolly.nodePostal.nodePostalStrings.island
    - typingsJapgolly.nodePostal.nodePostalStrings.level
    - typingsJapgolly.nodePostal.nodePostalStrings.near
    - typingsJapgolly.nodePostal.nodePostalStrings.po_box
    - typingsJapgolly.nodePostal.nodePostalStrings.postcode
    - typingsJapgolly.nodePostal.nodePostalStrings.road
    - typingsJapgolly.nodePostal.nodePostalStrings.staircase
    - typingsJapgolly.nodePostal.nodePostalStrings.state_district
    - typingsJapgolly.nodePostal.nodePostalStrings.state
    - typingsJapgolly.nodePostal.nodePostalStrings.suburb
    - typingsJapgolly.nodePostal.nodePostalStrings.unit
    - typingsJapgolly.nodePostal.nodePostalStrings.world_region
  */
  trait PostalLabels extends StObject
  object PostalLabels {
    
    inline def category: typingsJapgolly.nodePostal.nodePostalStrings.category = "category".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.category]
    
    inline def city: typingsJapgolly.nodePostal.nodePostalStrings.city = "city".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.city]
    
    inline def city_district: typingsJapgolly.nodePostal.nodePostalStrings.city_district = "city_district".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.city_district]
    
    inline def country: typingsJapgolly.nodePostal.nodePostalStrings.country = "country".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.country]
    
    inline def country_region: typingsJapgolly.nodePostal.nodePostalStrings.country_region = "country_region".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.country_region]
    
    inline def entrance: typingsJapgolly.nodePostal.nodePostalStrings.entrance = "entrance".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.entrance]
    
    inline def house: typingsJapgolly.nodePostal.nodePostalStrings.house = "house".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.house]
    
    inline def house_number: typingsJapgolly.nodePostal.nodePostalStrings.house_number = "house_number".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.house_number]
    
    inline def island: typingsJapgolly.nodePostal.nodePostalStrings.island = "island".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.island]
    
    inline def level: typingsJapgolly.nodePostal.nodePostalStrings.level = "level".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.level]
    
    inline def near: typingsJapgolly.nodePostal.nodePostalStrings.near = "near".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.near]
    
    inline def po_box: typingsJapgolly.nodePostal.nodePostalStrings.po_box = "po_box".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.po_box]
    
    inline def postcode: typingsJapgolly.nodePostal.nodePostalStrings.postcode = "postcode".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.postcode]
    
    inline def road: typingsJapgolly.nodePostal.nodePostalStrings.road = "road".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.road]
    
    inline def staircase: typingsJapgolly.nodePostal.nodePostalStrings.staircase = "staircase".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.staircase]
    
    inline def state: typingsJapgolly.nodePostal.nodePostalStrings.state = "state".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.state]
    
    inline def state_district: typingsJapgolly.nodePostal.nodePostalStrings.state_district = "state_district".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.state_district]
    
    inline def suburb: typingsJapgolly.nodePostal.nodePostalStrings.suburb = "suburb".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.suburb]
    
    inline def unit: typingsJapgolly.nodePostal.nodePostalStrings.unit = "unit".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.unit]
    
    inline def world_region: typingsJapgolly.nodePostal.nodePostalStrings.world_region = "world_region".asInstanceOf[typingsJapgolly.nodePostal.nodePostalStrings.world_region]
  }
  
  trait PostalResult extends StObject {
    
    var component: PostalLabels
    
    var value: String
  }
  object PostalResult {
    
    inline def apply(component: PostalLabels, value: String): PostalResult = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostalResult]
    }
    
    extension [Self <: PostalResult](x: Self) {
      
      inline def setComponent(value: PostalLabels): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
