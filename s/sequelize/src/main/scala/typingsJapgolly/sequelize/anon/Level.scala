package typingsJapgolly.sequelize.anon

import typingsJapgolly.sequelize.mod.Model
import typingsJapgolly.sequelize.mod.TransactionLockLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var level: TransactionLockLevel
  
  var of: Model[Any, Any, Any]
}
object Level {
  
  inline def apply(level: TransactionLockLevel, of: Model[Any, Any, Any]): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  extension [Self <: Level](x: Self) {
    
    inline def setLevel(value: TransactionLockLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOf(value: Model[Any, Any, Any]): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
  }
}
