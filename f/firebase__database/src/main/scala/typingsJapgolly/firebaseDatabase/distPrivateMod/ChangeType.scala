package typingsJapgolly.firebaseDatabase.distPrivateMod

import typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_added
import typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_changed
import typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_moved
import typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_removed
import typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_added
  - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_removed
  - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_changed
  - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_moved
  - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.value
*/
trait ChangeType extends StObject
object ChangeType {
  
  /** Event type for a child added */
  inline def CHILD_ADDED: child_added = "child_added".asInstanceOf[child_added]
  
  /** Event type for a child changed */
  inline def CHILD_CHANGED: child_changed = "child_changed".asInstanceOf[child_changed]
  
  /** Event type for a child moved */
  inline def CHILD_MOVED: child_moved = "child_moved".asInstanceOf[child_moved]
  
  /** Event type for a child removed */
  inline def CHILD_REMOVED: child_removed = "child_removed".asInstanceOf[child_removed]
  
  /** Event type for a value change */
  inline def VALUE: value = "value".asInstanceOf[value]
}
