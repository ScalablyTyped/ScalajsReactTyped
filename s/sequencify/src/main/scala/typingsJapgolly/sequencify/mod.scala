package typingsJapgolly.sequencify

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: TaskMap */](tasks: T, names: js.Array[/* keyof T */ String], results: js.Array[/* keyof T */ String]): Unit = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], names.asInstanceOf[js.Any], results.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply[T /* <: TaskMap */](
    tasks: T,
    names: js.Array[/* keyof T */ String],
    results: js.Array[/* keyof T */ String],
    nest: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], names.asInstanceOf[js.Any], results.asInstanceOf[js.Any], nest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sequencify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Task extends StObject {
    
    var dep: js.Array[String]
    
    var name: String
  }
  object Task {
    
    inline def apply(dep: js.Array[String], name: String): Task = {
      val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setDep(value: js.Array[String]): Self = StObject.set(x, "dep", value.asInstanceOf[js.Any])
      
      inline def setDepVarargs(value: String*): Self = StObject.set(x, "dep", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type TaskMap = StringDictionary[Task]
}
