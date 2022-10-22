package typingsJapgolly.tengitsui.mod

import typingsJapgolly.tengitsui.tengitsuiInts.`0`
import typingsJapgolly.tengitsui.tengitsuiInts.`1`
import typingsJapgolly.tengitsui.tengitsuiInts.`2`
import typingsJapgolly.tengitsui.tengitsuiInts.`3`
import typingsJapgolly.tengitsui.tengitsuiStrings.biz_area
import typingsJapgolly.tengitsui.tengitsuiStrings.city
import typingsJapgolly.tengitsui.tengitsuiStrings.country
import typingsJapgolly.tengitsui.tengitsuiStrings.district
import typingsJapgolly.tengitsui.tengitsuiStrings.province
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AMapDistrictSearchProps extends StObject {
  
  var level: js.UndefOr[country | province | city | district | biz_area] = js.undefined
  
  var name: String
  
  var subdistrict: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
}
object AMapDistrictSearchProps {
  
  inline def apply(name: String): AMapDistrictSearchProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AMapDistrictSearchProps]
  }
  
  extension [Self <: AMapDistrictSearchProps](x: Self) {
    
    inline def setLevel(value: country | province | city | district | biz_area): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubdistrict(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "subdistrict", value.asInstanceOf[js.Any])
    
    inline def setSubdistrictUndefined: Self = StObject.set(x, "subdistrict", js.undefined)
  }
}
