package typingsJapgolly.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies what to do if a file or folder with the specified name already exists in the current folder when you create a new file or folder. */
@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Storage.CreationCollisionOption & Double] = js.native
  
  /* 2 */ val failIfExists: typingsJapgolly.winrtUwp.Windows.Storage.CreationCollisionOption.failIfExists & Double = js.native
  
  /* 0 */ val generateUniqueName: typingsJapgolly.winrtUwp.Windows.Storage.CreationCollisionOption.generateUniqueName & Double = js.native
  
  /* 3 */ val openIfExists: typingsJapgolly.winrtUwp.Windows.Storage.CreationCollisionOption.openIfExists & Double = js.native
  
  /* 1 */ val replaceExisting: typingsJapgolly.winrtUwp.Windows.Storage.CreationCollisionOption.replaceExisting & Double = js.native
}
