package typingsJapgolly.vueRuntimeDom

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueRuntimeDom.mod.AssignerFn
import typingsJapgolly.vueRuntimeDom.mod.TransitionGroupProps
import typingsJapgolly.vueRuntimeDom.vueRuntimeDomBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Assign extends StObject {
    
    def _assign(value: Any): Unit
    @JSName("_assign")
    var _assign_Original: AssignerFn
  }
  object Assign {
    
    inline def apply(_assign: /* value */ Any => Callback): Assign = {
      val __obj = js.Dynamic.literal(_assign = js.Any.fromFunction1((t0: /* value */ Any) => _assign(t0).runNow()))
      __obj.asInstanceOf[Assign]
    }
    
    extension [Self <: Assign](x: Self) {
      
      inline def set_assign(value: /* value */ Any => Callback): Self = StObject.set(x, "_assign", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    }
  }
  
  trait Enter extends StObject {
    
    var enter: Double
    
    var leave: Double
  }
  object Enter {
    
    inline def apply(enter: Double, leave: Double): Enter = {
      val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enter]
    }
    
    extension [Self <: Enter](x: Self) {
      
      inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setLeave(value: Double): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[
          /* args (repeated) */ Any, 
          ComponentPublicInstance[
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            js.Object, 
            `false`, 
            ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
          ]
        ]
  
  trait Props extends StObject {
    
    @JSName("$props")
    var $props: TransitionGroupProps
  }
  object Props {
    
    inline def apply($props: TransitionGroupProps): Props = {
      val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def set$props(value: TransitionGroupProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Styles extends StObject {
    
    var styles: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
}
