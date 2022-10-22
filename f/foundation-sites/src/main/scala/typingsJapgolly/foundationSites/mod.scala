package typingsJapgolly.foundationSites

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.foundationSites.FoundationSites.FoundationSitesStatic
import typingsJapgolly.foundationSites.FoundationSites.IAbideOptions
import typingsJapgolly.foundationSites.FoundationSites.IAccordionMenuOptions
import typingsJapgolly.foundationSites.FoundationSites.IAccordionOptions
import typingsJapgolly.foundationSites.FoundationSites.IDrilldownOptions
import typingsJapgolly.foundationSites.FoundationSites.IDropdownMenuOptions
import typingsJapgolly.foundationSites.FoundationSites.IDropdownOptions
import typingsJapgolly.foundationSites.FoundationSites.IEqualizerOptions
import typingsJapgolly.foundationSites.FoundationSites.IInterchangeOptions
import typingsJapgolly.foundationSites.FoundationSites.IMagellanOptions
import typingsJapgolly.foundationSites.FoundationSites.IOffCanvasOptions
import typingsJapgolly.foundationSites.FoundationSites.IOrbitOptions
import typingsJapgolly.foundationSites.FoundationSites.IPositionableOptions
import typingsJapgolly.foundationSites.FoundationSites.IResponsiveAccordionTabsOptions
import typingsJapgolly.foundationSites.FoundationSites.IResponsiveMenuOptions
import typingsJapgolly.foundationSites.FoundationSites.IResponsiveToggleOptions
import typingsJapgolly.foundationSites.FoundationSites.IRevealOptions
import typingsJapgolly.foundationSites.FoundationSites.ISliderOptions
import typingsJapgolly.foundationSites.FoundationSites.ISmoothScrollOptions
import typingsJapgolly.foundationSites.FoundationSites.IStickyOptions
import typingsJapgolly.foundationSites.FoundationSites.ITabsOptions
import typingsJapgolly.foundationSites.FoundationSites.ITogglerOptions
import typingsJapgolly.foundationSites.FoundationSites.ITooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("foundation-sites", JSImport.Namespace)
  @js.native
  val ^ : FoundationSitesStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Abide")
  @js.native
  open class Abide protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Abide {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAbideOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Accordion")
  @js.native
  open class Accordion protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Accordion {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAccordionOptions) = this()
    
    /* CompleteClass */
    override def down(target: JQuery, firstTime: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def toggle(target: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def up(target: JQuery): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "AccordionMenu")
  @js.native
  open class AccordionMenu protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.AccordionMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IAccordionMenuOptions) = this()
    
    /* CompleteClass */
    override def down(target: JQuery, firstTime: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def hideAll(): Unit = js.native
    
    /* CompleteClass */
    override def showAll(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(target: JQuery): Unit = js.native
    
    /* CompleteClass */
    override def up(target: JQuery): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Drilldown")
  @js.native
  open class Drilldown protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Drilldown {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDrilldownOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Dropdown")
  @js.native
  open class Dropdown protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Dropdown {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDropdownOptions) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "DropdownMenu")
  @js.native
  open class DropdownMenu protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.DropdownMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IDropdownMenuOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Equalizer")
  @js.native
  open class Equalizer protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Equalizer {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IEqualizerOptions) = this()
    
    /* CompleteClass */
    override def applyHeight(heights: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def applyHeightByRow(groups: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def getHeights(cb: js.Function): js.Array[Any] = js.native
    
    /* CompleteClass */
    override def getHeightsByRow(cb: js.Function): js.Array[Any] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Interchange")
  @js.native
  open class Interchange protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Interchange {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IInterchangeOptions) = this()
    
    /* CompleteClass */
    override def replace(path: String): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Magellan")
  @js.native
  open class Magellan protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Magellan {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IMagellanOptions) = this()
    
    /* CompleteClass */
    override def calcPoints(): Unit = js.native
    
    /* CompleteClass */
    override def reflow(): Unit = js.native
    
    /* CompleteClass */
    override def scrollToLoc(location: String): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "OffCanvas")
  @js.native
  open class OffCanvas protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.OffCanvas {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IOffCanvasOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Orbit")
  @js.native
  open class Orbit protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Orbit {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IOrbitOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Positionable")
  @js.native
  open class Positionable protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Positionable {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IPositionableOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "ResponsiveAccordionTabs")
  @js.native
  open class ResponsiveAccordionTabs protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.ResponsiveAccordionTabs {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IResponsiveAccordionTabsOptions) = this()
    
    /* CompleteClass */
    override def close(_target: Any, args: Any*): Any = js.native
    
    /* CompleteClass */
    override def open(_target: Any, args: Any*): Any = js.native
    
    /* CompleteClass */
    var storezfData: Any = js.native
    
    /* CompleteClass */
    override def toggle(_target: Any, args: Any*): Any = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "ResponsiveMenu")
  @js.native
  open class ResponsiveMenu protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.ResponsiveMenu {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IResponsiveMenuOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "ResponsiveToggle")
  @js.native
  open class ResponsiveToggle protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.ResponsiveToggle {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IResponsiveToggleOptions) = this()
    
    /* CompleteClass */
    override def toggleMenu(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Reveal")
  @js.native
  open class Reveal protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Reveal {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IRevealOptions) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Slider")
  @js.native
  open class Slider protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Slider {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ISliderOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "SmoothScroll")
  @js.native
  open class SmoothScroll protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.SmoothScroll {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ISmoothScrollOptions) = this()
    
    /* CompleteClass */
    override def scrollToLoc(loc: String, options: Any, callback: js.Function): Boolean = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Sticky")
  @js.native
  open class Sticky protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Sticky {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: IStickyOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Tabs")
  @js.native
  open class Tabs protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Tabs {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITabsOptions) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Toggler")
  @js.native
  open class Toggler protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Toggler {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITogglerOptions) = this()
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("foundation-sites", "Tooltip")
  @js.native
  open class Tooltip protected ()
    extends StObject
       with typingsJapgolly.foundationSites.FoundationSites.Tooltip {
    def this(element: JQuery) = this()
    def this(element: JQuery, options: ITooltipOptions) = this()
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  type _To = FoundationSitesStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FoundationSitesStatic = ^
}
