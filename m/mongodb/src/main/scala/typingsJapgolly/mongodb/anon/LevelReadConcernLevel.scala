package typingsJapgolly.mongodb.anon

import typingsJapgolly.mongodb.mod.ReadConcernLevel
import typingsJapgolly.mongodb.mod.ReadConcernLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelReadConcernLevel
  extends StObject
     with ReadConcernLike {
  
  var level: ReadConcernLevel
}
object LevelReadConcernLevel {
  
  inline def apply(level: ReadConcernLevel): LevelReadConcernLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelReadConcernLevel]
  }
  
  extension [Self <: LevelReadConcernLevel](x: Self) {
    
    inline def setLevel(value: ReadConcernLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
