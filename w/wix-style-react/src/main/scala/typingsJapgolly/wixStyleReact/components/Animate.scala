package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixStyleReact.distTypesAnimateMod.AnimateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animate {
  
  @JSImport("wix-style-react/dist/types/Animate", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animateClasses(value: String): this.type = set("animateClasses", value.asInstanceOf[js.Any])
    
    inline def animateInlineStyle(value: CSSProperties): this.type = set("animateInlineStyle", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def delay(value: String | Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
    
    inline def onStart(value: Callback): this.type = set("onStart", value.toJsFn)
  }
  
  implicit def make(companion: Animate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnimateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
