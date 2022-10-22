package typingsJapgolly.node.inspectorMod.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a type collected during runtime.
  * @experimental
  */
trait TypeObject extends StObject {
  
  /**
    * Name of a type collected with type profiling.
    */
  var name: String
}
object TypeObject {
  
  inline def apply(name: String): TypeObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeObject]
  }
  
  extension [Self <: TypeObject](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
