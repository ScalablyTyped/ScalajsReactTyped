package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.storefrontUiVue.anon.Disabled
import typingsJapgolly.storefrontUiVue.anon.Stepsprogressactivestep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSteps extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSteps")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var parsedSteps: js.Array[Any]
    
    var progress: Stepsprogressactivestep
  }
  object Computed {
    
    inline def apply(parsedSteps: js.Array[Any], progress: Stepsprogressactivestep): Computed = {
      val __obj = js.Dynamic.literal(parsedSteps = parsedSteps.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setParsedSteps(value: js.Array[Any]): Self = StObject.set(x, "parsedSteps", value.asInstanceOf[js.Any])
      
      inline def setParsedStepsVarargs(value: Any*): Self = StObject.set(x, "parsedSteps", js.Array(value*))
      
      inline def setProgress(value: Stepsprogressactivestep): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: CallbackTo[Data], methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = data.toJsFn, methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var steps: js.Array[Any]
  }
  object Data {
    
    inline def apply(steps: js.Array[Any]): Data = {
      val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setSteps(value: js.Array[Any]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Any*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def stepClick(props: Disabled): Unit
    
    def updateSteps(step: Any): Unit
  }
  object Methods {
    
    inline def apply(stepClick: Disabled => Callback, updateSteps: Any => Callback): Methods = {
      val __obj = js.Dynamic.literal(stepClick = js.Any.fromFunction1((t0: Disabled) => stepClick(t0).runNow()), updateSteps = js.Any.fromFunction1((t0: Any) => updateSteps(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setStepClick(value: Disabled => Callback): Self = StObject.set(x, "stepClick", js.Any.fromFunction1((t0: Disabled) => value(t0).runNow()))
      
      inline def setUpdateSteps(value: Any => Callback): Self = StObject.set(x, "updateSteps", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var active: Double
    
    var canGoBack: Boolean
  }
  object Props {
    
    inline def apply(active: Double, canGoBack: Boolean): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], canGoBack = canGoBack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCanGoBack(value: Boolean): Self = StObject.set(x, "canGoBack", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSteps.foo` */
  override def _to: Constructor = ^
}
