package typingsJapgolly.snyk.anon

import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.ResourceActions
import typingsJapgolly.snyk.snykStrings.`no-op`
import typingsJapgolly.snyk.snykStrings.create
import typingsJapgolly.snyk.snykStrings.delete
import typingsJapgolly.snyk.snykStrings.read
import typingsJapgolly.snyk.snykStrings.update
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var actions: ResourceActions
  
  var after: (Record[String, Any]) | Null
  
  var before: (Record[String, Any]) | Null
}
object Actions {
  
  inline def apply(actions: ResourceActions): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], after = null, before = null)
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(value: ResourceActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (`no-op` | create | read | update | delete)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAfter(value: Record[String, Any]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterNull: Self = StObject.set(x, "after", null)
    
    inline def setBefore(value: Record[String, Any]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeNull: Self = StObject.set(x, "before", null)
  }
}
