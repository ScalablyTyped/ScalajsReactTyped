package typingsJapgolly.reactAlbus.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAlbus.mod.WizardContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WithWizard {
  
  object Children {
    
    @JSImport("react-albus", "WithWizard_")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def children(value: (js.Function1[/* wizard */ WizardContext, Node]) | Node): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenFunction1(value: /* wizard */ WizardContext => Node): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Children.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.reactAlbus.anon.Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Render {
    
    @JSImport("react-albus", "WithWizard_")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def render(value: /* wizard */ WizardContext => Node): this.type = set("render", js.Any.fromFunction1(value))
    }
    
    implicit def make(companion: Render.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.reactAlbus.anon.Render): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
