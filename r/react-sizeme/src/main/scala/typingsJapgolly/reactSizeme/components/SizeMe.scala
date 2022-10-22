package typingsJapgolly.reactSizeme.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSizeme.mod.SizeMeProps
import typingsJapgolly.reactSizeme.mod.SizeMeRenderProps
import typingsJapgolly.reactSizeme.reactSizemeStrings.`object`
import typingsJapgolly.reactSizeme.reactSizemeStrings.debounce
import typingsJapgolly.reactSizeme.reactSizemeStrings.scroll
import typingsJapgolly.reactSizeme.reactSizemeStrings.throttle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SizeMe {
  
  inline def apply(children: SizeMeProps => Element): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[SizeMeRenderProps]))
  }
  
  @JSImport("react-sizeme", "SizeMe")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSizeme.mod.SizeMe] {
    
    inline def monitorHeight(value: Boolean): this.type = set("monitorHeight", value.asInstanceOf[js.Any])
    
    inline def monitorWidth(value: Boolean): this.type = set("monitorWidth", value.asInstanceOf[js.Any])
    
    inline def noPlaceholder(value: Boolean): this.type = set("noPlaceholder", value.asInstanceOf[js.Any])
    
    inline def refreshMode(value: throttle | debounce): this.type = set("refreshMode", value.asInstanceOf[js.Any])
    
    inline def refreshRate(value: Double): this.type = set("refreshRate", value.asInstanceOf[js.Any])
    
    inline def resizeDetectorStrategy(value: scroll | `object`): this.type = set("resizeDetectorStrategy", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SizeMeRenderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
