package typingsJapgolly.reactHotLoader.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactHotLoader.mod.AppChildren
import typingsJapgolly.reactHotLoader.mod.AppContainerProps
import typingsJapgolly.reactHotLoader.mod.ErrorReporterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppContainer {
  
  @JSImport("react-hot-loader", "AppContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactHotLoader.mod.AppContainer] {
    
    inline def errorBoundary(value: Boolean): this.type = set("errorBoundary", value.asInstanceOf[js.Any])
    
    inline def errorReporter(value: ComponentType[ErrorReporterProps]): this.type = set("errorReporter", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AppContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppContainerProps & AppChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
