package typingsJapgolly.splitpanes.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Splitpanes extends StObject {
  
  def beforeDestroy(): Unit
  
  def beforeUpdate(): Unit
  
  var computed: SplitpaneComputed
  
  def data(): SplitpaneData
  
  var methods: SplitPaneMethods
  
  def mounted(): Unit
  
  var props: SplitpaneProps
  
  def render(createEl: Any): Any
  
  var watch: SplitpaneWatch
}
object Splitpanes {
  
  @JSImport("splitpanes", "Splitpanes")
  @js.native
  val ^ : Splitpanes = js.native
  
  extension [Self <: Splitpanes](x: Self) {
    
    inline def setBeforeDestroy(value: Callback): Self = StObject.set(x, "beforeDestroy", value.toJsFn)
    
    inline def setBeforeUpdate(value: Callback): Self = StObject.set(x, "beforeUpdate", value.toJsFn)
    
    inline def setComputed(value: SplitpaneComputed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setData(value: CallbackTo[SplitpaneData]): Self = StObject.set(x, "data", value.toJsFn)
    
    inline def setMethods(value: SplitPaneMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMounted(value: Callback): Self = StObject.set(x, "mounted", value.toJsFn)
    
    inline def setProps(value: SplitpaneProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Any => Any): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setWatch(value: SplitpaneWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
