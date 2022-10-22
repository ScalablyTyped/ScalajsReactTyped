package typingsJapgolly.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("ldapjs", "Change")
@js.native
open class ChangeCls protected ()
  extends StObject
     with Change {
  def this(change: Change) = this()
  
  /* CompleteClass */
  var modification: StringDictionary[Any] = js.native
  
  /* CompleteClass */
  var operation: String = js.native
}
