package typingsJapgolly.storybookAddonA11y

import japgolly.scalajs.react.Callback
import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsA11yContextMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/A11yContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/A11yContext", "A11yContext")
  @js.native
  val A11yContext: Context[A11yContextStore] = js.native
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/A11yContext", "A11yContextProvider")
  @js.native
  val A11yContextProvider: FC[A11yContextProviderProps] = js.native
  
  inline def useA11yContext(): A11yContextStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useA11yContext")().asInstanceOf[A11yContextStore]
  
  trait A11yContextProviderProps extends StObject {
    
    var active: Boolean
  }
  object A11yContextProviderProps {
    
    inline def apply(active: Boolean): A11yContextProviderProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[A11yContextProviderProps]
    }
    
    extension [Self <: A11yContextProviderProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  trait A11yContextStore extends StObject {
    
    def clearHighlights(): Unit
    
    var highlighted: js.Array[String]
    
    var results: Results
    
    def setResults(results: Results): Unit
    
    def setTab(index: Double): Unit
    
    var tab: Double
    
    def toggleHighlight(target: js.Array[String], highlight: Boolean): Unit
  }
  object A11yContextStore {
    
    inline def apply(
      clearHighlights: Callback,
      highlighted: js.Array[String],
      results: Results,
      setResults: Results => Callback,
      setTab: Double => Callback,
      tab: Double,
      toggleHighlight: (js.Array[String], Boolean) => Callback
    ): A11yContextStore = {
      val __obj = js.Dynamic.literal(clearHighlights = clearHighlights.toJsFn, highlighted = highlighted.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], setResults = js.Any.fromFunction1((t0: Results) => setResults(t0).runNow()), setTab = js.Any.fromFunction1((t0: Double) => setTab(t0).runNow()), tab = tab.asInstanceOf[js.Any], toggleHighlight = js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (toggleHighlight(t0, t1)).runNow()))
      __obj.asInstanceOf[A11yContextStore]
    }
    
    extension [Self <: A11yContextStore](x: Self) {
      
      inline def setClearHighlights(value: Callback): Self = StObject.set(x, "clearHighlights", value.toJsFn)
      
      inline def setHighlighted(value: js.Array[String]): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      inline def setHighlightedVarargs(value: String*): Self = StObject.set(x, "highlighted", js.Array(value*))
      
      inline def setResults(value: Results): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setSetResults(value: Results => Callback): Self = StObject.set(x, "setResults", js.Any.fromFunction1((t0: Results) => value(t0).runNow()))
      
      inline def setSetTab(value: Double => Callback): Self = StObject.set(x, "setTab", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTab(value: Double): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setToggleHighlight(value: (js.Array[String], Boolean) => Callback): Self = StObject.set(x, "toggleHighlight", js.Any.fromFunction2((t0: js.Array[String], t1: Boolean) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Results extends StObject {
    
    var incomplete: js.Array[Result]
    
    var passes: js.Array[Result]
    
    var violations: js.Array[Result]
  }
  object Results {
    
    inline def apply(incomplete: js.Array[Result], passes: js.Array[Result], violations: js.Array[Result]): Results = {
      val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setIncomplete(value: js.Array[Result]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      inline def setIncompleteVarargs(value: Result*): Self = StObject.set(x, "incomplete", js.Array(value*))
      
      inline def setPasses(value: js.Array[Result]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      inline def setPassesVarargs(value: Result*): Self = StObject.set(x, "passes", js.Array(value*))
      
      inline def setViolations(value: js.Array[Result]): Self = StObject.set(x, "violations", value.asInstanceOf[js.Any])
      
      inline def setViolationsVarargs(value: Result*): Self = StObject.set(x, "violations", js.Array(value*))
    }
  }
}
