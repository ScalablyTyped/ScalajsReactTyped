package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.noticeMod.Notice.Action
import typingsJapgolly.wordpressComponents.snackbarMod.Snackbar.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Snackbar {
  
  @JSImport("@wordpress/components", "Snackbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def actions(value: js.Array[Action]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    inline def actionsVarargs(value: Action*): this.type = set("actions", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onRemove(value: Callback): this.type = set("onRemove", value.toJsFn)
  }
  
  implicit def make(companion: Snackbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
