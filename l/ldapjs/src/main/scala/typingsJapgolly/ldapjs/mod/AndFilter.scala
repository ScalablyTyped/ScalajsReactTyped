package typingsJapgolly.ldapjs.mod

import typingsJapgolly.ldapjs.anon.Filters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "AndFilter")
@js.native
open class AndFilter protected ()
  extends StObject
     with Filter {
  def this(options: Filters) = this()
  
  /* CompleteClass */
  override def matches(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
