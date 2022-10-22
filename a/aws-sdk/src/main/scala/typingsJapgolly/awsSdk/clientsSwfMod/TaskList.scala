package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskList extends StObject {
  
  /**
    * The name of the task list.
    */
  var name: Name
}
object TaskList {
  
  inline def apply(name: Name): TaskList = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskList]
  }
  
  extension [Self <: TaskList](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
