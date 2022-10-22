package typingsJapgolly.antvG2

import typingsJapgolly.antvAdjust.anon.AdjustCfgdimValuesMapDimV
import typingsJapgolly.antvAdjust.libAdjustsAdjustMod.AdjustConstructor
import typingsJapgolly.antvAttr.libInterfaceMod.AttributeCfg
import typingsJapgolly.antvComponent.libTypesMod.ComponentCfg
import typingsJapgolly.antvComponent.libTypesMod.CrosshairBaseCfg
import typingsJapgolly.antvComponent.libTypesMod.GroupComponentCfg
import typingsJapgolly.antvComponent.libTypesMod.HtmlCrossHairCfg
import typingsJapgolly.antvComponent.libTypesMod.TooltipCfg
import typingsJapgolly.antvComponent.mod.Axis.Line
import typingsJapgolly.antvComponent.mod.Legend.Category
import typingsJapgolly.antvComponent.mod.Tooltip.Html
import typingsJapgolly.antvCoord.anon.PartialOptions
import typingsJapgolly.antvGBase.libTypesMod.ShapeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDependentsMod {
  
  @JSImport("@antv/g2/lib/dependents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "AbstractGroup")
  @js.native
  open class AbstractGroup ()
    extends typingsJapgolly.antvGBase.mod.AbstractGroup
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "AbstractShape")
  @js.native
  open class AbstractShape protected ()
    extends typingsJapgolly.antvGBase.mod.AbstractShape {
    def this(cfg: ShapeCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "Adjust")
  @js.native
  open class Adjust protected ()
    extends typingsJapgolly.antvAdjust.mod.Adjust {
    def this(cfg: AdjustCfgdimValuesMapDimV) = this()
  }
  
  object Annotation {
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Arc")
    @js.native
    open class Arc ()
      extends typingsJapgolly.antvComponent.mod.Annotation.Arc
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.DataMarker")
    @js.native
    open class DataMarker ()
      extends typingsJapgolly.antvComponent.mod.Annotation.DataMarker
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.DataRegion")
    @js.native
    open class DataRegion ()
      extends typingsJapgolly.antvComponent.mod.Annotation.DataRegion
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Html")
    @js.native
    open class Html ()
      extends typingsJapgolly.antvComponent.mod.Annotation.Html
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Image")
    @js.native
    open class Image ()
      extends typingsJapgolly.antvComponent.mod.Annotation.Image
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Line")
    @js.native
    open class Line ()
      extends typingsJapgolly.antvComponent.mod.Annotation.Line
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Region")
    @js.native
    open class Region ()
      extends typingsJapgolly.antvComponent.mod.Annotation.Region
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.RegionFilter")
    @js.native
    open class RegionFilter ()
      extends typingsJapgolly.antvComponent.mod.Annotation.RegionFilter
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Shape")
    @js.native
    open class Shape ()
      extends typingsJapgolly.antvComponent.mod.Annotation.Shape
    
    @JSImport("@antv/g2/lib/dependents", "Annotation.Text")
    @js.native
    open class Text ()
      extends typingsJapgolly.antvComponent.mod.Annotation.Text
  }
  
  @JSImport("@antv/g2/lib/dependents", "Attribute")
  @js.native
  open class Attribute protected ()
    extends typingsJapgolly.antvAttr.mod.Attribute {
    def this(cfg: AttributeCfg) = this()
  }
  
  /* was `typeof Legend.Category` */
  @JSImport("@antv/g2/lib/dependents", "CategoryLegend")
  @js.native
  open class CategoryLegend () extends Category
  
  @JSImport("@antv/g2/lib/dependents", "Color")
  @js.native
  open class Color protected ()
    extends typingsJapgolly.antvAttr.mod.Color {
    def this(cfg: AttributeCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "Component")
  @js.native
  open class Component[T /* <: ComponentCfg */] protected ()
    extends typingsJapgolly.antvComponent.mod.Component[T] {
    def this(cfg: T) = this()
  }
  
  @JSImport("@antv/g2/lib/dependents", "Coordinate")
  @js.native
  /**
    * Create a new Coordinate Object.
    * @param options Custom options
    */
  open class Coordinate ()
    extends typingsJapgolly.antvCoord.mod.Coordinate {
    def this(options: PartialOptions) = this()
  }
  
  object Crosshair {
    
    /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "Crosshair.Base")
    @js.native
    open class Base[T /* <: CrosshairBaseCfg */] ()
      extends typingsJapgolly.antvComponent.mod.Crosshair.Base[T]
    
    @JSImport("@antv/g2/lib/dependents", "Crosshair.Circle")
    @js.native
    open class Circle ()
      extends typingsJapgolly.antvComponent.mod.Crosshair.Circle
    
    @JSImport("@antv/g2/lib/dependents", "Crosshair.Html")
    @js.native
    open class Html[T /* <: HtmlCrossHairCfg */] ()
      extends typingsJapgolly.antvComponent.mod.Crosshair.Html[T]
    
    @JSImport("@antv/g2/lib/dependents", "Crosshair.Line")
    @js.native
    open class Line ()
      extends typingsJapgolly.antvComponent.mod.Crosshair.Line
  }
  
  @JSImport("@antv/g2/lib/dependents", "Event")
  @js.native
  open class Event protected ()
    extends typingsJapgolly.antvGBase.mod.Event {
    def this(`type`: Any, event: Any) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "GroupComponent")
  @js.native
  open class GroupComponent[T /* <: GroupComponentCfg */] ()
    extends typingsJapgolly.antvComponent.mod.GroupComponent[T]
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/dependents", "HtmlComponent")
  @js.native
  open class HtmlComponent[T /* <: ComponentCfg */] ()
    extends typingsJapgolly.antvComponent.mod.HtmlComponent[T]
  
  /* was `typeof Tooltip.Html` */
  @JSImport("@antv/g2/lib/dependents", "HtmlTooltip")
  @js.native
  open class HtmlTooltip[T /* <: TooltipCfg */] () extends Html[T]
  
  /* was `typeof Axis.Line` */
  @JSImport("@antv/g2/lib/dependents", "LineAxis")
  @js.native
  open class LineAxis () extends Line
  
  /* was `typeof Grid.Line` */
  @JSImport("@antv/g2/lib/dependents", "LineGrid")
  @js.native
  open class LineGrid ()
    extends typingsJapgolly.antvComponent.mod.Grid.Line
  
  @JSImport("@antv/g2/lib/dependents", "Scrollbar")
  @js.native
  open class Scrollbar ()
    extends typingsJapgolly.antvComponent.mod.Scrollbar
  
  @JSImport("@antv/g2/lib/dependents", "Slider")
  @js.native
  open class Slider ()
    extends typingsJapgolly.antvComponent.mod.Slider
  
  /**
    * 根据类型获取 Adjust 类
    * @param type
    */
  inline def getAdjust(`type`: String): AdjustConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdjust")(`type`.asInstanceOf[js.Any]).asInstanceOf[AdjustConstructor]
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  inline def getAttribute(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * 注册自定义 Adjust
    * @param type
    * @param ctor
    */
  inline def registerAdjust(`type`: String, ctor: AdjustConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdjust")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type IG = Any
}
