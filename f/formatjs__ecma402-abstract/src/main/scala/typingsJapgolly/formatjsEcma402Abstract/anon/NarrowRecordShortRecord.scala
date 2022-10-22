package typingsJapgolly.formatjsEcma402Abstract.anon

import typingsJapgolly.formatjsEcma402Abstract.typesDisplaynamesMod.CurrencyCode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NarrowRecordShortRecord extends StObject {
  
  var long: Record[CurrencyCode, String]
  
  var narrow: Record[CurrencyCode, String]
  
  var short: Record[CurrencyCode, String]
}
object NarrowRecordShortRecord {
  
  inline def apply(
    long: Record[CurrencyCode, String],
    narrow: Record[CurrencyCode, String],
    short: Record[CurrencyCode, String]
  ): NarrowRecordShortRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[NarrowRecordShortRecord]
  }
  
  extension [Self <: NarrowRecordShortRecord](x: Self) {
    
    inline def setLong(value: Record[CurrencyCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[CurrencyCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[CurrencyCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
