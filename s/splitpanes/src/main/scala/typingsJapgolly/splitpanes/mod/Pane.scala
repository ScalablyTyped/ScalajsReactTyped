package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Pane extends StObject {
  
  def beforeDestroy(): Unit
  
  def beforeUpdate(): Unit
  
  var computed: PaneComputed
  
  def data(): PaneData
  
  var methods: PaneMethods
  
  def mounted(): Unit
  
  var props: PaneProps
  
  def render(createEl: Any): Any
  
  var watch: PaneWatch
}
object Pane {
  
  @JSImport("splitpanes", "Pane")
  @js.native
  val ^ : Pane = js.native
  
  extension [Self <: Pane](x: Self) {
    
    inline def setBeforeDestroy(value: Callback): Self = StObject.set(x, "beforeDestroy", value.toJsFn)
    
    inline def setBeforeUpdate(value: Callback): Self = StObject.set(x, "beforeUpdate", value.toJsFn)
    
    inline def setComputed(value: PaneComputed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setData(value: CallbackTo[PaneData]): Self = StObject.set(x, "data", value.toJsFn)
    
    inline def setMethods(value: PaneMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMounted(value: Callback): Self = StObject.set(x, "mounted", value.toJsFn)
    
    inline def setProps(value: PaneProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Any => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setWatch(value: PaneWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
