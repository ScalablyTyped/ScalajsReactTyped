package typingsJapgolly.reactMdUtils.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdUtils.typesSizingAppSizeListenerMod.AppSizeListenerProps
import typingsJapgolly.reactMdUtils.typesSizingConstantsMod.QuerySize
import typingsJapgolly.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppSizeListener {
  
  @JSImport("@react-md/utils", "AppSizeListener")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultSize(value: AppSize): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    
    inline def desktopLargeMinWidth(value: QuerySize): this.type = set("desktopLargeMinWidth", value.asInstanceOf[js.Any])
    
    inline def desktopMinWidth(value: QuerySize): this.type = set("desktopMinWidth", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* nextSize */ AppSize, /* lastSize */ AppSize) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* nextSize */ AppSize, t1: /* lastSize */ AppSize) => (value(t0, t1)).runNow()))
    
    inline def phoneMaxWidth(value: QuerySize): this.type = set("phoneMaxWidth", value.asInstanceOf[js.Any])
    
    inline def tabletMaxWidth(value: QuerySize): this.type = set("tabletMaxWidth", value.asInstanceOf[js.Any])
    
    inline def tabletMinWidth(value: QuerySize): this.type = set("tabletMinWidth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AppSizeListener.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppSizeListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
