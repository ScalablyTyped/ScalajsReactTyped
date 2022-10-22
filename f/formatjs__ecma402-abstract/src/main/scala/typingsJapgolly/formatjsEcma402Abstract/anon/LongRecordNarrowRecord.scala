package typingsJapgolly.formatjsEcma402Abstract.anon

import typingsJapgolly.formatjsEcma402Abstract.typesDisplaynamesMod.ScriptCode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRecordNarrowRecord extends StObject {
  
  var long: Record[ScriptCode, String]
  
  var narrow: Record[ScriptCode, String]
  
  var short: Record[ScriptCode, String]
}
object LongRecordNarrowRecord {
  
  inline def apply(
    long: Record[ScriptCode, String],
    narrow: Record[ScriptCode, String],
    short: Record[ScriptCode, String]
  ): LongRecordNarrowRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRecordNarrowRecord]
  }
  
  extension [Self <: LongRecordNarrowRecord](x: Self) {
    
    inline def setLong(value: Record[ScriptCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: Record[ScriptCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setShort(value: Record[ScriptCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
