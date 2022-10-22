package typingsJapgolly.foundationSites.FoundationSites

import typingsJapgolly.foundationSites.JQuery
import typingsJapgolly.foundationSites.anon.Instantiable
import typingsJapgolly.foundationSites.anon.InstantiableAccordion
import typingsJapgolly.foundationSites.anon.InstantiableAccordionMenu
import typingsJapgolly.foundationSites.anon.InstantiableDrilldown
import typingsJapgolly.foundationSites.anon.InstantiableDropdown
import typingsJapgolly.foundationSites.anon.InstantiableDropdownMenu
import typingsJapgolly.foundationSites.anon.InstantiableEqualizer
import typingsJapgolly.foundationSites.anon.InstantiableInterchange
import typingsJapgolly.foundationSites.anon.InstantiableMagellan
import typingsJapgolly.foundationSites.anon.InstantiableOffCanvas
import typingsJapgolly.foundationSites.anon.InstantiableOrbit
import typingsJapgolly.foundationSites.anon.InstantiablePositionable
import typingsJapgolly.foundationSites.anon.InstantiableResponsiveAccordionTabs
import typingsJapgolly.foundationSites.anon.InstantiableResponsiveMenu
import typingsJapgolly.foundationSites.anon.InstantiableResponsiveToggle
import typingsJapgolly.foundationSites.anon.InstantiableReveal
import typingsJapgolly.foundationSites.anon.InstantiableSlider
import typingsJapgolly.foundationSites.anon.InstantiableSmoothScroll
import typingsJapgolly.foundationSites.anon.InstantiableSticky
import typingsJapgolly.foundationSites.anon.InstantiableTabs
import typingsJapgolly.foundationSites.anon.InstantiableToggler
import typingsJapgolly.foundationSites.anon.InstantiableTooltip
import typingsJapgolly.foundationSites.anon.Throttle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoundationSitesStatic extends StObject {
  
  var Abide: Instantiable = js.native
  
  var Accordion: InstantiableAccordion = js.native
  
  var AccordionMenu: InstantiableAccordionMenu = js.native
  
  // utils
  var Box: typingsJapgolly.foundationSites.FoundationSites.Box = js.native
  
  var Drilldown: InstantiableDrilldown = js.native
  
  var Dropdown: InstantiableDropdown = js.native
  
  var DropdownMenu: InstantiableDropdownMenu = js.native
  
  var Equalizer: InstantiableEqualizer = js.native
  
  def GetYoDigits(length: Double): String = js.native
  def GetYoDigits(length: Double, namespace: String): String = js.native
  
  var Interchange: InstantiableInterchange = js.native
  
  var Keyboard: typingsJapgolly.foundationSites.FoundationSites.Keyboard = js.native
  
  var Magellan: InstantiableMagellan = js.native
  
  var MediaQuery: typingsJapgolly.foundationSites.FoundationSites.MediaQuery = js.native
  
  var Motion: typingsJapgolly.foundationSites.FoundationSites.Motion = js.native
  
  var Move: typingsJapgolly.foundationSites.FoundationSites.Move = js.native
  
  var Nest: typingsJapgolly.foundationSites.FoundationSites.Nest = js.native
  
  var OffCanvas: InstantiableOffCanvas = js.native
  
  var Orbit: InstantiableOrbit = js.native
  
  var Positionable: InstantiablePositionable = js.native
  
  def RegExpEscape(str: String): String = js.native
  
  var ResponsiveAccordionTabs: InstantiableResponsiveAccordionTabs = js.native
  
  var ResponsiveMenu: InstantiableResponsiveMenu = js.native
  
  var ResponsiveToggle: InstantiableResponsiveToggle = js.native
  
  var Reveal: InstantiableReveal = js.native
  
  var Slider: InstantiableSlider = js.native
  
  var SmoothScroll: InstantiableSmoothScroll = js.native
  
  var Sticky: InstantiableSticky = js.native
  
  var Tabs: InstantiableTabs = js.native
  
  var Timer: typingsJapgolly.foundationSites.FoundationSites.Timer = js.native
  
  var Toggler: InstantiableToggler = js.native
  
  var Tooltip: InstantiableTooltip = js.native
  
  var Touch: typingsJapgolly.foundationSites.FoundationSites.Touch = js.native
  
  var Triggers: typingsJapgolly.foundationSites.FoundationSites.Triggers = js.native
  
  def getFnName(fn: String): String = js.native
  
  def onLoad(elem: Any, handler: Any): String = js.native
  
  def plugin(plugin: js.Object, name: String): Unit = js.native
  
  def reInit(plugins: js.Array[Any]): Unit = js.native
  
  def reflow(elem: js.Object): Unit = js.native
  def reflow(elem: js.Object, plugins: String): Unit = js.native
  def reflow(elem: js.Object, plugins: js.Array[String]): Unit = js.native
  
  def registerPlugin(plugin: js.Object): Unit = js.native
  
  def rtl(): Boolean = js.native
  
  def transitionend(element: JQuery): Any = js.native
  
  def unregisterPlugin(plugin: js.Object): Unit = js.native
  
  var util: Throttle = js.native
  
  var version: String = js.native
}
