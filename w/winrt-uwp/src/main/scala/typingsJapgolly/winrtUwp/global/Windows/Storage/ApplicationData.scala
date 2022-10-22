package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.System.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the application data store. Application data consists of files and settings that are either local, roaming, or temporary. */
/* note: abstract class */ @JSGlobal("Windows.Storage.ApplicationData")
@js.native
open class ApplicationData ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Storage.ApplicationData
object ApplicationData {
  
  @JSGlobal("Windows.Storage.ApplicationData")
  @js.native
  val ^ : js.Any = js.native
  
  /** Provides access to the app data store associated with the app's app package. */
  /* static member */
  @JSGlobal("Windows.Storage.ApplicationData.current")
  @js.native
  def current: typingsJapgolly.winrtUwp.Windows.Storage.ApplicationData = js.native
  inline def current_=(x: typingsJapgolly.winrtUwp.Windows.Storage.ApplicationData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
  
  /**
    * Static method that returns the ApplicationData for a User .
    * @param user The User for which the ApplicationData is returned.
    * @return When this method completes, it returns the requested ApplicationData object.
    */
  /* static member */
  inline def getForUserAsync(user: User): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.ApplicationData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getForUserAsync")(user.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Storage.ApplicationData]]
}
