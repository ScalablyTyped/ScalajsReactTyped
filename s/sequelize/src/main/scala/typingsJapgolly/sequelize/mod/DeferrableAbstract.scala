package typingsJapgolly.sequelize.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Deferrable
// ~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/deferrable.js
//
/**
  * Abstract Deferrable interface. Use this if you want to create an interface that has a value any of the
  * Deferrables that Sequelize supports.
  */
trait DeferrableAbstract extends StObject {
  
  def toSql(): String
}
object DeferrableAbstract {
  
  inline def apply(toSql: CallbackTo[String]): DeferrableAbstract = {
    val __obj = js.Dynamic.literal(toSql = toSql.toJsFn)
    __obj.asInstanceOf[DeferrableAbstract]
  }
  
  extension [Self <: DeferrableAbstract](x: Self) {
    
    inline def setToSql(value: CallbackTo[String]): Self = StObject.set(x, "toSql", value.toJsFn)
  }
}
