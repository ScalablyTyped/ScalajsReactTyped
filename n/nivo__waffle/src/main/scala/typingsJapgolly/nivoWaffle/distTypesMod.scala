package typingsJapgolly.nivoWaffle

import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfigFromContext
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfigScheme
import typingsJapgolly.nivoWaffle.distTypesTypesMod.CanvasProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Cell
import typingsJapgolly.nivoWaffle.distTypesTypesMod.Datum
import typingsJapgolly.nivoWaffle.distTypesTypesMod.FillDirection
import typingsJapgolly.nivoWaffle.distTypesTypesMod.HtmlProps
import typingsJapgolly.nivoWaffle.distTypesTypesMod.SvgProps
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.animate
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.borderColor
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.borderWidth
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.colors
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.columns
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.data
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.defs
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.emptyColor
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.emptyOpacity
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.fill
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.fillDirection
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.isInteractive
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.layers
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.legends
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.margin
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.motionConfig
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.onClick
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.onMouseEnter
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.onMouseLeave
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.onMouseMove
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.padding
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.pixelRatio
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.role
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.rows
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.theme
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.tooltip
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.total
import typingsJapgolly.nivoWaffle.nivoWaffleStrings.valueFormat
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("@nivo/waffle/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveWaffle[RawDatum /* <: Datum */](
    props: Pick[
      SvgProps[RawDatum], 
      legends | onMouseEnter | onMouseLeave | onClick | onMouseMove | data | animate | defs | valueFormat | fillDirection | padding | colors | emptyColor | borderColor | margin | theme | emptyOpacity | borderWidth | isInteractive | tooltip | role | total | rows | columns | fill | motionConfig | layers
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveWaffle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveWaffleCanvas[RawDatum /* <: Datum */](
    props: Pick[
      CanvasProps[RawDatum], 
      legends | onClick | onMouseMove | data | valueFormat | fillDirection | padding | colors | emptyColor | borderColor | margin | theme | emptyOpacity | borderWidth | isInteractive | tooltip | role | total | rows | columns | pixelRatio
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveWaffleCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ResponsiveWaffleHtml[RawDatum /* <: Datum */](
    props: Pick[
      HtmlProps[RawDatum], 
      onMouseEnter | onMouseLeave | onClick | onMouseMove | data | animate | valueFormat | fillDirection | padding | colors | emptyColor | borderColor | margin | theme | emptyOpacity | borderWidth | isInteractive | tooltip | role | total | rows | columns | motionConfig | layers
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveWaffleHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Waffle[RawDatum /* <: Datum */](props: SvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Waffle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def WaffleCanvas[RawDatum /* <: Datum */](props: CanvasProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("WaffleCanvas")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def WaffleHtml[RawDatum /* <: Datum */](props: HtmlProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("WaffleHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object defaultProps {
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.animate")
    @js.native
    def animate: Boolean = js.native
    inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.borderColor")
    @js.native
    def borderColor: InheritedColorConfigFromContext = js.native
    inline def borderColor_=(x: InheritedColorConfigFromContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.borderWidth")
    @js.native
    def borderWidth: Double = js.native
    inline def borderWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.colors")
    @js.native
    def colors: OrdinalColorScaleConfigScheme = js.native
    inline def colors_=(x: OrdinalColorScaleConfigScheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.defs")
    @js.native
    def defs: js.Array[scala.Nothing] = js.native
    inline def defs_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defs")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.emptyColor")
    @js.native
    def emptyColor: String = js.native
    inline def emptyColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.emptyOpacity")
    @js.native
    def emptyOpacity: Double = js.native
    inline def emptyOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.fill")
    @js.native
    def fill: js.Array[scala.Nothing] = js.native
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.fillDirection")
    @js.native
    def fillDirection: FillDirection = js.native
    inline def fillDirection_=(x: FillDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillDirection")(x.asInstanceOf[js.Any])
    
    inline def fill_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.isInteractive")
    @js.native
    def isInteractive: Boolean = js.native
    inline def isInteractive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInteractive")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.legends")
    @js.native
    def legends: js.Array[scala.Nothing] = js.native
    inline def legends_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legends")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.motionConfig")
    @js.native
    def motionConfig: String = js.native
    inline def motionConfig_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("motionConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.padding")
    @js.native
    def padding: Double = js.native
    inline def padding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/waffle/dist/types", "defaultProps.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  inline def isDataCell[RawDatum /* <: Datum */](cell: Cell[RawDatum]): /* is @nivo/waffle.@nivo/waffle/dist/types/types.DataCell<RawDatum> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataCell")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @nivo/waffle.@nivo/waffle/dist/types/types.DataCell<RawDatum> */ Boolean]
}
