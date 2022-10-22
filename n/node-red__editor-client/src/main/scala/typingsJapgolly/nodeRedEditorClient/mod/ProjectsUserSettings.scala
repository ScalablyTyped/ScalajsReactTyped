package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUserSettings extends StObject {
  
  def init(utils: js.Object): Unit
}
object ProjectsUserSettings {
  
  inline def apply(init: js.Object => Callback): ProjectsUserSettings = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: js.Object) => init(t0).runNow()))
    __obj.asInstanceOf[ProjectsUserSettings]
  }
  
  extension [Self <: ProjectsUserSettings](x: Self) {
    
    inline def setInit(value: js.Object => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
