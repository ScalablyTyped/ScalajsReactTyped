package typingsJapgolly.reactNoSsr.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactNoSsr.anon.Children
import typingsJapgolly.reactNoSsr.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNoSsr {
  
  @JSImport("react-no-ssr", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onSSR(value: ReactChild): this.type = set("onSSR", value.asInstanceOf[js.Any])
    
    inline def onSSRVdomElement(value: VdomElement): this.type = set("onSSR", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNoSsr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
