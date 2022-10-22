package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientQueryBuilder.SaveCommandExecuted event.
  */
trait MVCxClientQueryBuilderSaveCommandExecutedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the Save command execution result.
    */
  var Result: String
}
object MVCxClientQueryBuilderSaveCommandExecutedEventArgs {
  
  inline def apply(Result: String): MVCxClientQueryBuilderSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientQueryBuilderSaveCommandExecutedEventArgs]
  }
  
  extension [Self <: MVCxClientQueryBuilderSaveCommandExecutedEventArgs](x: Self) {
    
    inline def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
