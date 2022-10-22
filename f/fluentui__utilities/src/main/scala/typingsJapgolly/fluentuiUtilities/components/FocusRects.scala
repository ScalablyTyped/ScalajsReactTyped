package typingsJapgolly.fluentuiUtilities.components

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiUtilities.anon.RootRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FocusRects {
  
  @JSImport("@fluentui/utilities", "FocusRects")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def rootRef(value: RefHandle[HTMLElement]): this.type = set("rootRef", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FocusRects.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RootRef): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
