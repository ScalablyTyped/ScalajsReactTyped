package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/issue-parser/
trait IssueParser extends StObject {
  
  def clear(): Unit
  
  val issues: js.Array[Issue]
  
  def pushLine(line: String): Unit
}
object IssueParser {
  
  inline def apply(clear: Callback, issues: js.Array[Issue], pushLine: String => Callback): IssueParser = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, issues = issues.asInstanceOf[js.Any], pushLine = js.Any.fromFunction1((t0: String) => pushLine(t0).runNow()))
    __obj.asInstanceOf[IssueParser]
  }
  
  extension [Self <: IssueParser](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setPushLine(value: String => Callback): Self = StObject.set(x, "pushLine", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
