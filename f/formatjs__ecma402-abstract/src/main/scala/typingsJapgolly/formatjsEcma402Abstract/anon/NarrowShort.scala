package typingsJapgolly.formatjsEcma402Abstract.anon

import typingsJapgolly.formatjsEcma402Abstract.libTypesDisplaynamesMod.RegionCode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NarrowShort extends StObject {
  
  var long: Record[RegionCode, String]
  
  var narrow: Record[RegionCode, String]
  
  var short: Record[RegionCode, String]
}
object NarrowShort {
  
  inline def apply(
    long: Record[RegionCode, String],
    narrow: Record[RegionCode, String],
    short: Record[RegionCode, String]
  ): NarrowShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowShort]
  }
  
  extension [Self <: NarrowShort](x: Self) {
    
    inline def setLong(value: Record[RegionCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[RegionCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[RegionCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
