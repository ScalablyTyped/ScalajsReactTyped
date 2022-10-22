package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundTaskRegistration
  extends StObject
     with IBackgroundTaskRegistration
object BackgroundTaskRegistration {
  
  inline def apply(name: String, oncompleted: Any, onprogress: Any, taskId: String, unregister: Boolean => Callback): BackgroundTaskRegistration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oncompleted = oncompleted.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any], unregister = js.Any.fromFunction1((t0: Boolean) => unregister(t0).runNow()))
    __obj.asInstanceOf[BackgroundTaskRegistration]
  }
}
