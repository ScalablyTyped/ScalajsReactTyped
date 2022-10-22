package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertionPosition extends StObject {
  
  var baseVersion: Double | Null
  
  var graveyardPosition: ReturnType[js.Function0[Path]]
  
  var howMany: Double
  
  var insertionPosition: ReturnType[js.Function0[Path]]
  
  var splitPosition: ReturnType[js.Function0[Path]]
}
object InsertionPosition {
  
  inline def apply(
    graveyardPosition: ReturnType[js.Function0[Path]],
    howMany: Double,
    insertionPosition: ReturnType[js.Function0[Path]],
    splitPosition: ReturnType[js.Function0[Path]]
  ): InsertionPosition = {
    val __obj = js.Dynamic.literal(graveyardPosition = graveyardPosition.asInstanceOf[js.Any], howMany = howMany.asInstanceOf[js.Any], insertionPosition = insertionPosition.asInstanceOf[js.Any], splitPosition = splitPosition.asInstanceOf[js.Any], baseVersion = null)
    __obj.asInstanceOf[InsertionPosition]
  }
  
  extension [Self <: InsertionPosition](x: Self) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setGraveyardPosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "graveyardPosition", value.asInstanceOf[js.Any])
    
    inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    inline def setInsertionPosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "insertionPosition", value.asInstanceOf[js.Any])
    
    inline def setSplitPosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "splitPosition", value.asInstanceOf[js.Any])
  }
}
