package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Background
import typingsJapgolly.grommet.anon.ColorError
import typingsJapgolly.grommet.anon.Delay
import typingsJapgolly.grommet.anon.Duration
import typingsJapgolly.grommet.anon.Grow
import typingsJapgolly.grommet.anon.Horizontal
import typingsJapgolly.grommet.es6ComponentsAvatarMod.AvatarExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignContentType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.AlignType
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.es6UtilsMod.BasisType
import typingsJapgolly.grommet.es6UtilsMod.BorderType
import typingsJapgolly.grommet.es6UtilsMod.DirectionType
import typingsJapgolly.grommet.es6UtilsMod.ElevationType
import typingsJapgolly.grommet.es6UtilsMod.FillType
import typingsJapgolly.grommet.es6UtilsMod.GapType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.HeightType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.es6UtilsMod.RoundType
import typingsJapgolly.grommet.es6UtilsMod.WidthType
import typingsJapgolly.grommet.grommetStrings.around
import typingsJapgolly.grommet.grommetStrings.auto
import typingsJapgolly.grommet.grommetStrings.between
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.evenly
import typingsJapgolly.grommet.grommetStrings.fadeIn
import typingsJapgolly.grommet.grommetStrings.fadeOut
import typingsJapgolly.grommet.grommetStrings.grow
import typingsJapgolly.grommet.grommetStrings.hidden
import typingsJapgolly.grommet.grommetStrings.jiggle
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.pulse
import typingsJapgolly.grommet.grommetStrings.reverse
import typingsJapgolly.grommet.grommetStrings.rotateLeft
import typingsJapgolly.grommet.grommetStrings.rotateRight
import typingsJapgolly.grommet.grommetStrings.scroll
import typingsJapgolly.grommet.grommetStrings.shrink
import typingsJapgolly.grommet.grommetStrings.slideDown
import typingsJapgolly.grommet.grommetStrings.slideLeft
import typingsJapgolly.grommet.grommetStrings.slideRight
import typingsJapgolly.grommet.grommetStrings.slideUp
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.grommetStrings.stretch
import typingsJapgolly.grommet.grommetStrings.visible
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.zoomIn
import typingsJapgolly.grommet.grommetStrings.zoomOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Avatar {
  
  @JSImport("grommet/es6", "Avatar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def align(value: AlignType): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def alignContent(value: AlignContentType): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def animation(
      value: fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
          fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Duration
        ])
    ): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def animationVarargs(
      value: (fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Duration)*
    ): this.type = set("animation", js.Array(value*))
    
    inline def as(value: PolymorphicType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def background(value: BackgroundType): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def basis(value: BasisType): this.type = set("basis", value.asInstanceOf[js.Any])
    
    inline def border(value: BorderType): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderVarargs(value: ColorError*): this.type = set("border", js.Array(value*))
    
    inline def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def elevation(value: ElevationType): this.type = set("elevation", value.asInstanceOf[js.Any])
    
    inline def fill(value: FillType): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def flex(value: grow | shrink | Boolean | Grow): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
    
    inline def gap(value: GapType): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def height(value: HeightType): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hoverIndicator(value: Background | BackgroundType | Boolean): this.type = set("hoverIndicator", value.asInstanceOf[js.Any])
    
    inline def justify(value: around | between | center | end | evenly | start | stretch): this.type = set("justify", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* repeated */ Any => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def overflow(value: auto | hidden | scroll | visible | Horizontal | String): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    inline def pad(value: PadType): this.type = set("pad", value.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def round(value: RoundType): this.type = set("round", value.asInstanceOf[js.Any])
    
    inline def size(value: xsmall | small | medium | large | xlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def tag(value: PolymorphicType): this.type = set("tag", value.asInstanceOf[js.Any])
    
    inline def width(value: WidthType): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def wrap(value: Boolean | reverse): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Avatar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
