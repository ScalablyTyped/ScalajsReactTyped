package typingsJapgolly.vscode.mod

import typingsJapgolly.vscode.anon.ViewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressOptions extends StObject {
  
  /**
    * Controls if a cancel button should show to allow the user to
    * cancel the long running operation.  Note that currently only
    * `ProgressLocation.Notification` is supporting to show a cancel
    * button.
    */
  var cancellable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The location at which progress should show.
    */
  var location: ProgressLocation | ViewId
  
  /**
    * A human-readable string which will be used to describe the
    * operation.
    */
  var title: js.UndefOr[String] = js.undefined
}
object ProgressOptions {
  
  inline def apply(location: ProgressLocation | ViewId): ProgressOptions = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressOptions]
  }
  
  extension [Self <: ProgressOptions](x: Self) {
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
    
    inline def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
    
    inline def setLocation(value: ProgressLocation | ViewId): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
