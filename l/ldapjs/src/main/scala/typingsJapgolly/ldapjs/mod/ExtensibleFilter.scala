package typingsJapgolly.ldapjs.mod

import typingsJapgolly.ldapjs.anon.DnAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "ExtensibleFilter")
@js.native
open class ExtensibleFilter protected ()
  extends StObject
     with Filter {
  def this(options: DnAttributes) = this()
  
  /* CompleteClass */
  override def matches(obj: Any): Boolean = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
}
