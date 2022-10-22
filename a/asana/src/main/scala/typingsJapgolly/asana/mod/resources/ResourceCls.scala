package typingsJapgolly.asana.mod.resources

import typingsJapgolly.asana.mod.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("asana", "resources.Resource")
@js.native
open class ResourceCls protected ()
  extends StObject
     with Resource {
  /**
    * @param dispatcher
    */
  def this(dispatcher: Dispatcher) = this()
  
  /* CompleteClass */
  var gid: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var resource_type: String = js.native
}
