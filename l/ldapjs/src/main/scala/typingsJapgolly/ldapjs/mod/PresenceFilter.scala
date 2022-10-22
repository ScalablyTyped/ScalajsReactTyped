package typingsJapgolly.ldapjs.mod

import typingsJapgolly.ldapjs.anon.AttributeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "PresenceFilter")
@js.native
open class PresenceFilter protected ()
  extends StObject
     with Filter {
  def this(options: AttributeString) = this()
  
  /* CompleteClass */
  override def matches(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
