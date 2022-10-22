package typingsJapgolly.reactAlbus

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.history.mod.History
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-albus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-albus", "Step")
  @js.native
  val Step: ComponentType[StepProps] = js.native
  
  @JSImport("react-albus", "Steps")
  @js.native
  val Steps: ComponentType[StepsProps] = js.native
  
  @JSImport("react-albus", "WithWizard")
  @js.native
  val WithWizard_ : ComponentType[WizardContextRenderProps] = js.native
  
  @JSImport("react-albus", "Wizard")
  @js.native
  val Wizard: ComponentType[WizardProps] = js.native
  
  inline def withWizard[P](component: ComponentType[P & WizardComponentProps]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("withWizard")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  
  trait StepObject extends StObject {
    
    var id: String
  }
  object StepObject {
    
    inline def apply(id: String): StepObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepObject]
    }
    
    extension [Self <: StepObject](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type StepProps = StepObject & WizardContextRenderProps
  
  trait StepsProps extends StObject {
    
    var children: NonNullable[Node]
    
    var step: js.UndefOr[StepObject] = js.undefined
  }
  object StepsProps {
    
    inline def apply(children: NonNullable[Node]): StepsProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setChildren(value: NonNullable[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setStep(value: StepObject): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  trait WizardComponentProps extends StObject {
    
    var wizard: WizardContext
  }
  object WizardComponentProps {
    
    inline def apply(wizard: WizardContext): WizardComponentProps = {
      val __obj = js.Dynamic.literal(wizard = wizard.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardComponentProps]
    }
    
    extension [Self <: WizardComponentProps](x: Self) {
      
      inline def setWizard(value: WizardContext): Self = StObject.set(x, "wizard", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WizardContext extends StObject {
    
    def go(n: Double): Unit = js.native
    
    var history: History = js.native
    
    def next(): Unit = js.native
    
    def previous(): Unit = js.native
    
    def push(): Unit = js.native
    def push(id: String): Unit = js.native
    
    def replace(): Unit = js.native
    def replace(id: String): Unit = js.native
    
    var step: StepObject = js.native
    
    var steps: js.Array[StepObject] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactAlbus.anon.Render
    - typingsJapgolly.reactAlbus.anon.Children
  */
  trait WizardContextRenderProps extends StObject
  object WizardContextRenderProps {
    
    inline def Children(): typingsJapgolly.reactAlbus.anon.Children = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[typingsJapgolly.reactAlbus.anon.Children]
    }
    
    inline def Render(): typingsJapgolly.reactAlbus.anon.Render = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.reactAlbus.anon.Render]
    }
  }
  
  trait WizardProps extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var history: js.UndefOr[History] = js.undefined
    
    var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, Unit]] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, Node]] = js.undefined
  }
  object WizardProps {
    
    inline def apply(): WizardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardProps]
    }
    
    extension [Self <: WizardProps](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setOnNext(value: /* wizard */ WizardContext => Callback): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: /* wizard */ WizardContext) => value(t0).runNow()))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setRender(value: /* wizard */ WizardContext => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
