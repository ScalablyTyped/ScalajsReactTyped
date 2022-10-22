package typingsJapgolly.mongodb.anon

import typingsJapgolly.mongodb.mod.ReadConcernLevel
import typingsJapgolly.mongodb.mod.ReadConcernLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var level: js.UndefOr[ReadConcernLevel] = js.undefined
  
  var readConcern: js.UndefOr[ReadConcernLike] = js.undefined
}
object Level {
  
  inline def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setLevel(value: ReadConcernLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setReadConcern(value: ReadConcernLike): Self = StObject.set(x, "readConcern", value.asInstanceOf[js.Any])
    
    inline def setReadConcernUndefined: Self = StObject.set(x, "readConcern", js.undefined)
  }
}
