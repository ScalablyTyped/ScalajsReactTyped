package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexCreationQuery
  extends StObject
     with Executable {
  
  def fulltext(): IndexCreationQuery
  
  def on(columns: ((Column[Any, Any]) | OrderByValueNode)*): IndexCreationQuery
  
  def spatial(): IndexCreationQuery
  
  def unique(): IndexCreationQuery
  
  def `using`(name: String): IndexCreationQuery
  
  def withParser(parserName: String): IndexCreationQuery
}
object IndexCreationQuery {
  
  inline def apply(
    fulltext: CallbackTo[IndexCreationQuery],
    on: /* repeated */ (Column[Any, Any]) | OrderByValueNode => IndexCreationQuery,
    spatial: CallbackTo[IndexCreationQuery],
    toQuery: CallbackTo[QueryLike],
    unique: CallbackTo[IndexCreationQuery],
    `using`: String => IndexCreationQuery,
    withParser: String => IndexCreationQuery
  ): IndexCreationQuery = {
    val __obj = js.Dynamic.literal(fulltext = fulltext.toJsFn, on = js.Any.fromFunction1(on), spatial = spatial.toJsFn, toQuery = toQuery.toJsFn, unique = unique.toJsFn, withParser = js.Any.fromFunction1(withParser))
    __obj.updateDynamic("using")(js.Any.fromFunction1(`using`))
    __obj.asInstanceOf[IndexCreationQuery]
  }
  
  extension [Self <: IndexCreationQuery](x: Self) {
    
    inline def setFulltext(value: CallbackTo[IndexCreationQuery]): Self = StObject.set(x, "fulltext", value.toJsFn)
    
    inline def setOn(value: /* repeated */ (Column[Any, Any]) | OrderByValueNode => IndexCreationQuery): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setSpatial(value: CallbackTo[IndexCreationQuery]): Self = StObject.set(x, "spatial", value.toJsFn)
    
    inline def setUnique(value: CallbackTo[IndexCreationQuery]): Self = StObject.set(x, "unique", value.toJsFn)
    
    inline def setUsing(value: String => IndexCreationQuery): Self = StObject.set(x, "using", js.Any.fromFunction1(value))
    
    inline def setWithParser(value: String => IndexCreationQuery): Self = StObject.set(x, "withParser", js.Any.fromFunction1(value))
  }
}
