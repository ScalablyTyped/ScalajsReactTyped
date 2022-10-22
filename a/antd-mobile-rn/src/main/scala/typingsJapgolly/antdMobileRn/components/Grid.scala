package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libCarouselIndexDotnativeMod.CarouselProps
import typingsJapgolly.antdMobileRn.libGridIndexDotnativeMod.GridProps
import typingsJapgolly.antdMobileRn.libGridPropsTypeMod.DataItem
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("antd-mobile-rn", "Grid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.Grid] {
    
    inline def carouselMaxRow(value: Double): this.type = set("carouselMaxRow", value.asInstanceOf[js.Any])
    
    inline def carouselProps(value: CarouselProps): this.type = set("carouselProps", value.asInstanceOf[js.Any])
    
    inline def columnNum(value: Double): this.type = set("columnNum", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[js.UndefOr[DataItem]]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: js.UndefOr[DataItem]*): this.type = set("data", js.Array(value*))
    
    inline def hasLine(value: Boolean): this.type = set("hasLine", value.asInstanceOf[js.Any])
    
    inline def isCarousel(value: Boolean): this.type = set("isCarousel", value.asInstanceOf[js.Any])
    
    inline def itemStyle(value: StyleProp[ViewStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
    
    inline def itemStyleNull: this.type = set("itemStyle", null)
    
    inline def onClick(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[DataItem], t1: /* itemIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def renderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Element): this.type = set("renderItem", js.Any.fromFunction2(value))
    
    inline def styles(value: Any): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Grid.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
