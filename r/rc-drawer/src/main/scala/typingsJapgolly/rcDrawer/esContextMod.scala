package typingsJapgolly.rcDrawer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("rc-drawer/es/context", JSImport.Default)
  @js.native
  val default: Context[DrawerContextProps] = js.native
  
  trait DrawerContextProps extends StObject {
    
    var pull: VoidFunction
    
    var push: VoidFunction
    
    var pushDistance: js.UndefOr[Double | String] = js.undefined
  }
  object DrawerContextProps {
    
    inline def apply(pull: Callback, push: Callback): DrawerContextProps = {
      val __obj = js.Dynamic.literal(pull = pull.toJsFn, push = push.toJsFn)
      __obj.asInstanceOf[DrawerContextProps]
    }
    
    extension [Self <: DrawerContextProps](x: Self) {
      
      inline def setPull(value: Callback): Self = StObject.set(x, "pull", value.toJsFn)
      
      inline def setPush(value: Callback): Self = StObject.set(x, "push", value.toJsFn)
      
      inline def setPushDistance(value: Double | String): Self = StObject.set(x, "pushDistance", value.asInstanceOf[js.Any])
      
      inline def setPushDistanceUndefined: Self = StObject.set(x, "pushDistance", js.undefined)
    }
  }
  
  type _To = Context[DrawerContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[DrawerContextProps] = default
}
