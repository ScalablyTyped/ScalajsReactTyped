package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.rootRefRootRefMod.RootRefProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RootRef {
  
  @JSImport("@material-ui/core", "RootRef")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def rootRef(value: (js.Function1[/* instance */ Any | Null, Unit]) | RefHandle[Any]): this.type = set("rootRef", value.asInstanceOf[js.Any])
    
    inline def rootRefFunction1(value: /* instance */ Any | Null => Callback): this.type = set("rootRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
  }
  
  implicit def make(companion: RootRef.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RootRefProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
