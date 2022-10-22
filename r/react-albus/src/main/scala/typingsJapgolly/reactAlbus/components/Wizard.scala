package typingsJapgolly.reactAlbus.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.history.mod.History
import typingsJapgolly.reactAlbus.mod.WizardContext
import typingsJapgolly.reactAlbus.mod.WizardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wizard {
  
  @JSImport("react-albus", "Wizard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    inline def history(value: History): this.type = set("history", value.asInstanceOf[js.Any])
    
    inline def onNext(value: /* wizard */ WizardContext => Callback): this.type = set("onNext", js.Any.fromFunction1((t0: /* wizard */ WizardContext) => value(t0).runNow()))
    
    inline def render(value: /* wizard */ WizardContext => Node): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Wizard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WizardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
