package typingsJapgolly.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _OSqlExpression extends StObject
object _OSqlExpression {
  
  inline def ORawExpression(as: String => typingsJapgolly.orientjs.mod.ORawExpression, db: ODB, value: String): typingsJapgolly.orientjs.mod.ORawExpression = {
    val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), db = db.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.orientjs.mod.ORawExpression]
  }
  
  inline def OSqlFunction(abs: AbsSqlFunction, avg: AbsSqlFunction, db: ODB, sequence: SequenceSqlFunction): typingsJapgolly.orientjs.mod.OSqlFunction = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.orientjs.mod.OSqlFunction]
  }
}
