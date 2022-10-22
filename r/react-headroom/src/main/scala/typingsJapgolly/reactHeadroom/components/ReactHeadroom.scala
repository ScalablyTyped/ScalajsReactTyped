package typingsJapgolly.reactHeadroom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactHeadroom.mod.ReactHeadroomProps
import typingsJapgolly.reactHeadroom.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHeadroom {
  
  @JSImport("react-headroom", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def calcHeightOnResize(value: Boolean): this.type = set("calcHeightOnResize", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    inline def disableInlineStyles(value: Boolean): this.type = set("disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def downTolerance(value: Double): this.type = set("downTolerance", value.asInstanceOf[js.Any])
    
    inline def onPin(value: Callback): this.type = set("onPin", value.toJsFn)
    
    inline def onUnfix(value: Callback): this.type = set("onUnfix", value.toJsFn)
    
    inline def onUnpin(value: Callback): this.type = set("onUnpin", value.toJsFn)
    
    inline def parent(value: CallbackTo[Any]): this.type = set("parent", value.toJsFn)
    
    inline def pinStart(value: Double): this.type = set("pinStart", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def upTolerance(value: Double): this.type = set("upTolerance", value.asInstanceOf[js.Any])
    
    inline def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactHeadroom.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactHeadroomProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
