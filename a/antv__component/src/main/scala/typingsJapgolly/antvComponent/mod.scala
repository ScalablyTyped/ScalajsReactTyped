package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libAbstractComponentMod.default
import typingsJapgolly.antvComponent.libTypesMod.AxisBaseCfg
import typingsJapgolly.antvComponent.libTypesMod.ComponentCfg
import typingsJapgolly.antvComponent.libTypesMod.CrosshairBaseCfg
import typingsJapgolly.antvComponent.libTypesMod.GroupComponentCfg
import typingsJapgolly.antvComponent.libTypesMod.HtmlCrossHairCfg
import typingsJapgolly.antvComponent.libTypesMod.LegendBaseCfg
import typingsJapgolly.antvComponent.libTypesMod.LooseObject
import typingsJapgolly.antvComponent.libTypesMod.TooltipCfg
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Annotation {
    
    @JSImport("@antv/component", "Annotation.Arc")
    @js.native
    open class Arc ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.Arc
    
    @JSImport("@antv/component", "Annotation.DataMarker")
    @js.native
    open class DataMarker ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.DataMarker
    
    @JSImport("@antv/component", "Annotation.DataRegion")
    @js.native
    open class DataRegion ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.DataRegion
    
    @JSImport("@antv/component", "Annotation.Html")
    @js.native
    open class Html ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.Html
    
    @JSImport("@antv/component", "Annotation.Image")
    @js.native
    open class Image ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.Image
    
    @JSImport("@antv/component", "Annotation.Line")
    @js.native
    open class Line ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.Line
    
    @JSImport("@antv/component", "Annotation.Region")
    @js.native
    open class Region ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.Region
    
    @JSImport("@antv/component", "Annotation.RegionFilter")
    @js.native
    open class RegionFilter ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.RegionFilter
    
    @JSImport("@antv/component", "Annotation.Shape")
    @js.native
    open class Shape ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.Shape
    
    @JSImport("@antv/component", "Annotation.Text")
    @js.native
    open class Text ()
      extends typingsJapgolly.antvComponent.libAnnotationMod.Text
  }
  
  object Axis {
    
    /* note: abstract class */ @JSImport("@antv/component", "Axis.Base")
    @js.native
    open class Base[T /* <: AxisBaseCfg */] ()
      extends typingsJapgolly.antvComponent.libAxisMod.Base[T]
    
    @JSImport("@antv/component", "Axis.Circle")
    @js.native
    open class Circle ()
      extends typingsJapgolly.antvComponent.libAxisMod.Circle
    
    @JSImport("@antv/component", "Axis.Line")
    @js.native
    open class Line ()
      extends typingsJapgolly.antvComponent.libAxisMod.Line
  }
  
  /* note: abstract class */ @JSImport("@antv/component", "Component")
  @js.native
  open class Component[T /* <: ComponentCfg */] protected () extends default[T] {
    def this(cfg: T) = this()
  }
  
  object Crosshair {
    
    /* note: abstract class */ @JSImport("@antv/component", "Crosshair.Base")
    @js.native
    open class Base[T /* <: CrosshairBaseCfg */] ()
      extends typingsJapgolly.antvComponent.libCrosshairMod.Base[T]
    
    @JSImport("@antv/component", "Crosshair.Circle")
    @js.native
    open class Circle ()
      extends typingsJapgolly.antvComponent.libCrosshairMod.Circle
    
    @JSImport("@antv/component", "Crosshair.Html")
    @js.native
    open class Html[T /* <: HtmlCrossHairCfg */] ()
      extends typingsJapgolly.antvComponent.libCrosshairMod.Html[T]
    
    @JSImport("@antv/component", "Crosshair.Line")
    @js.native
    open class Line ()
      extends typingsJapgolly.antvComponent.libCrosshairMod.Line
  }
  
  object Grid {
    
    /* note: abstract class */ @JSImport("@antv/component", "Grid.Base")
    @js.native
    open class Base[T /* <: GroupComponentCfg */] ()
      extends typingsJapgolly.antvComponent.libGridMod.Base[T]
    
    @JSImport("@antv/component", "Grid.Circle")
    @js.native
    open class Circle ()
      extends typingsJapgolly.antvComponent.libGridMod.Circle
    
    @JSImport("@antv/component", "Grid.Line")
    @js.native
    open class Line ()
      extends typingsJapgolly.antvComponent.libGridMod.Line
  }
  
  /* note: abstract class */ @JSImport("@antv/component", "GroupComponent")
  @js.native
  open class GroupComponent[T /* <: GroupComponentCfg */] ()
    extends typingsJapgolly.antvComponent.libAbstractGroupComponentMod.default[T]
  
  /* note: abstract class */ @JSImport("@antv/component", "HtmlComponent")
  @js.native
  open class HtmlComponent[T /* <: ComponentCfg */] ()
    extends typingsJapgolly.antvComponent.libAbstractHtmlComponentMod.default[T]
  
  object Legend {
    
    /* note: abstract class */ @JSImport("@antv/component", "Legend.Base")
    @js.native
    open class Base[T /* <: LegendBaseCfg */] ()
      extends typingsJapgolly.antvComponent.libLegendMod.Base[T]
    
    @JSImport("@antv/component", "Legend.Category")
    @js.native
    open class Category ()
      extends typingsJapgolly.antvComponent.libLegendMod.Category
    
    @JSImport("@antv/component", "Legend.Continuous")
    @js.native
    open class Continuous ()
      extends typingsJapgolly.antvComponent.libLegendMod.Continuous
  }
  
  @JSImport("@antv/component", "Scrollbar")
  @js.native
  open class Scrollbar ()
    extends typingsJapgolly.antvComponent.libScrollbarMod.Scrollbar
  
  @JSImport("@antv/component", "Slider")
  @js.native
  open class Slider ()
    extends typingsJapgolly.antvComponent.libSliderMod.Slider
  
  object TOOLTIP_CSS_CONST {
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.CONTAINER_CLASS")
    @js.native
    val CONTAINER_CLASS: /* "g2-tooltip" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.CROSSHAIR_X")
    @js.native
    val CROSSHAIR_X: /* "g2-tooltip-crosshair-x" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.CROSSHAIR_Y")
    @js.native
    val CROSSHAIR_Y: /* "g2-tooltip-crosshair-y" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.LIST_CLASS")
    @js.native
    val LIST_CLASS: /* "g2-tooltip-list" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.LIST_ITEM_CLASS")
    @js.native
    val LIST_ITEM_CLASS: /* "g2-tooltip-list-item" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.MARKER_CLASS")
    @js.native
    val MARKER_CLASS: /* "g2-tooltip-marker" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.NAME_CLASS")
    @js.native
    val NAME_CLASS: /* "g2-tooltip-name" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.TITLE_CLASS")
    @js.native
    val TITLE_CLASS: /* "g2-tooltip-title" */ String = js.native
    
    @JSImport("@antv/component", "TOOLTIP_CSS_CONST.VALUE_CLASS")
    @js.native
    val VALUE_CLASS: /* "g2-tooltip-value" */ String = js.native
  }
  
  object Tooltip {
    
    @JSImport("@antv/component", "Tooltip.Html")
    @js.native
    open class Html[T /* <: TooltipCfg */] ()
      extends typingsJapgolly.antvComponent.libTooltipMod.Html[T]
  }
  
  inline def propagationDelegate(group: IGroup, eventName: String, eventObject: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("propagationDelegate")(group.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
