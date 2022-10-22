package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  def getAggregation(): FieldAggregationType
  
  /** Gets the data source to which this field belongs. */
  def getDataSource(): DataSource
  
  /** Gets the field name (i.e. caption). */
  def getName(): String
  
  /** One of the following values: DIMENSION, MEASURE, UKNOWN */
  def getRole(): FieldRoleType
}
object Field {
  
  inline def apply(
    getAggregation: CallbackTo[FieldAggregationType],
    getDataSource: CallbackTo[DataSource],
    getName: CallbackTo[String],
    getRole: CallbackTo[FieldRoleType]
  ): Field = {
    val __obj = js.Dynamic.literal(getAggregation = getAggregation.toJsFn, getDataSource = getDataSource.toJsFn, getName = getName.toJsFn, getRole = getRole.toJsFn)
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setGetAggregation(value: CallbackTo[FieldAggregationType]): Self = StObject.set(x, "getAggregation", value.toJsFn)
    
    inline def setGetDataSource(value: CallbackTo[DataSource]): Self = StObject.set(x, "getDataSource", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetRole(value: CallbackTo[FieldRoleType]): Self = StObject.set(x, "getRole", value.toJsFn)
  }
}
