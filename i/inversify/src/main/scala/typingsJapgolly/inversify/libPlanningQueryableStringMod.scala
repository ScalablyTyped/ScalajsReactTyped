package typingsJapgolly.inversify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningQueryableStringMod {
  
  @JSImport("inversify/lib/planning/queryable_string", "QueryableString")
  @js.native
  open class QueryableString protected ()
    extends StObject
       with typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.QueryableString {
    def this(str: String) = this()
    
    /* CompleteClass */
    override def contains(searchString: String): Boolean = js.native
    
    /* CompleteClass */
    override def endsWith(searchString: String): Boolean = js.native
    
    /* CompleteClass */
    override def equals(compareString: String): Boolean = js.native
    
    /* CompleteClass */
    override def startsWith(searchString: String): Boolean = js.native
    
    /* private */ var str: Any = js.native
    
    /* CompleteClass */
    override def value(): String = js.native
  }
}
