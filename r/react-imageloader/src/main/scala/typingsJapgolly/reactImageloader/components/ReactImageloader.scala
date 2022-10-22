package typingsJapgolly.reactImageloader.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageloader.mod.ImageLoaderProps
import typingsJapgolly.reactImageloader.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImageloader {
  
  inline def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageLoaderProps]))
  }
  
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def imgProps(value: Any): this.type = set("imgProps", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* event */ Any => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def onLoad(value: /* event */ Any => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def preloader(value: /* params */ Any => Element): this.type = set("preloader", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def wrapper(value: /* props */ Any => Element): this.type = set("wrapper", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ImageLoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
