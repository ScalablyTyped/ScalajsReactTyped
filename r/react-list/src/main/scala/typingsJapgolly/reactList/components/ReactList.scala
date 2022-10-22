package typingsJapgolly.reactList.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactList.mod.ReactListProps
import typingsJapgolly.reactList.mod.^
import typingsJapgolly.reactList.reactListStrings.x
import typingsJapgolly.reactList.reactListStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactList {
  
  @JSImport("react-list", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def axis(value: x | y): this.type = set("axis", value.asInstanceOf[js.Any])
    
    inline def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    
    inline def itemRenderer(value: (/* index */ Double, /* key */ Double | String) => Element): this.type = set("itemRenderer", js.Any.fromFunction2(value))
    
    inline def itemSizeEstimator(value: (/* index */ Double, /* cache */ js.Object) => Double): this.type = set("itemSizeEstimator", js.Any.fromFunction2(value))
    
    inline def itemSizeGetter(value: /* index */ Double => Double): this.type = set("itemSizeGetter", js.Any.fromFunction1(value))
    
    inline def itemsRenderer(value: (/* items */ js.Array[Element], /* ref */ String) => Element): this.type = set("itemsRenderer", js.Any.fromFunction2(value))
    
    inline def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
    
    inline def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    inline def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    
    inline def scrollParentGetter(value: CallbackTo[Element]): this.type = set("scrollParentGetter", value.toJsFn)
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def useStaticSize(value: Boolean): this.type = set("useStaticSize", value.asInstanceOf[js.Any])
    
    inline def useTranslate3d(value: Boolean): this.type = set("useTranslate3d", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
