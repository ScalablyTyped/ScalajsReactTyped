package typingsJapgolly.bootstrap.mod

import typingsJapgolly.bootstrap.anon.PartialOptions
import typingsJapgolly.bootstrap.anon.PartialOptionsAnimation
import typingsJapgolly.bootstrap.anon.PartialOptionsAutoClose
import typingsJapgolly.bootstrap.anon.PartialOptionsBackdrop
import typingsJapgolly.bootstrap.anon.PartialOptionsMethod
import typingsJapgolly.bootstrap.anon.PartialOptionsParent
import typingsJapgolly.bootstrap.bootstrapStrings.close
import typingsJapgolly.bootstrap.bootstrapStrings.cycle
import typingsJapgolly.bootstrap.bootstrapStrings.dispose
import typingsJapgolly.bootstrap.bootstrapStrings.handleUpdate
import typingsJapgolly.bootstrap.bootstrapStrings.hiddenDotbsDotmodal
import typingsJapgolly.bootstrap.bootstrapStrings.hide
import typingsJapgolly.bootstrap.bootstrapStrings.hideDotbsDotmodal
import typingsJapgolly.bootstrap.bootstrapStrings.hidePreventedDotbsDotmodal
import typingsJapgolly.bootstrap.bootstrapStrings.next
import typingsJapgolly.bootstrap.bootstrapStrings.nextWhenVisible
import typingsJapgolly.bootstrap.bootstrapStrings.pause
import typingsJapgolly.bootstrap.bootstrapStrings.prev
import typingsJapgolly.bootstrap.bootstrapStrings.refresh
import typingsJapgolly.bootstrap.bootstrapStrings.show
import typingsJapgolly.bootstrap.bootstrapStrings.showDotbsDotmodal
import typingsJapgolly.bootstrap.bootstrapStrings.shownDotbsDotmodal
import typingsJapgolly.bootstrap.bootstrapStrings.slidDotbsDotcarousel
import typingsJapgolly.bootstrap.bootstrapStrings.slideDotbsDotcarousel
import typingsJapgolly.bootstrap.bootstrapStrings.to
import typingsJapgolly.bootstrap.bootstrapStrings.toggle
import typingsJapgolly.bootstrap.bootstrapStrings.update
import typingsJapgolly.bootstrap.jsDistAlertMod.Alert.jQueryInterface
import typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.Event
import typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.Events
import typingsJapgolly.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @js.native
  trait Element extends StObject {
    
    def addEventListener(
      `type`: hiddenDotbsDotmodal | hideDotbsDotmodal | hidePreventedDotbsDotmodal | showDotbsDotmodal | shownDotbsDotmodal | slidDotbsDotcarousel | slideDotbsDotcarousel,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          (/* ev */ Event) | (/* ev */ typingsJapgolly.bootstrap.jsDistModalMod.Modal.Event), 
          Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: hiddenDotbsDotmodal | hideDotbsDotmodal | hidePreventedDotbsDotmodal | showDotbsDotmodal | shownDotbsDotmodal | slidDotbsDotcarousel | slideDotbsDotcarousel,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          (/* ev */ Event) | (/* ev */ typingsJapgolly.bootstrap.jsDistModalMod.Modal.Event), 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: hiddenDotbsDotmodal | hideDotbsDotmodal | hidePreventedDotbsDotmodal | showDotbsDotmodal | shownDotbsDotmodal | slidDotbsDotcarousel | slideDotbsDotcarousel,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          (/* ev */ Event) | (/* ev */ typingsJapgolly.bootstrap.jsDistModalMod.Modal.Event), 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(`type`: Events, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
    def addEventListener(
      `type`: Events,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: Events,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
      options: AddEventListenerOptions
    ): Unit = js.native
    def addEventListener(
      `type`: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ typingsJapgolly.bootstrap.jsDistModalMod.Modal.Event, 
          Any
        ]
    ): Unit = js.native
    def addEventListener(
      `type`: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ typingsJapgolly.bootstrap.jsDistModalMod.Modal.Event, 
          Any
        ],
      options: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events,
      listener: js.ThisFunction1[
          /* this */ this.type, 
          /* ev */ typingsJapgolly.bootstrap.jsDistModalMod.Modal.Event, 
          Any
        ],
      options: AddEventListenerOptions
    ): Unit = js.native
  }
  
  @js.native
  trait JQuery extends StObject {
    
    def alert(): JQuery = js.native
    def alert(config: close | dispose): JQuery = js.native
    @JSName("alert")
    var alert_Original: jQueryInterface = js.native
    
    def button(): JQuery = js.native
    def button(config: toggle | dispose): JQuery = js.native
    @JSName("button")
    var button_Original: typingsJapgolly.bootstrap.jsDistButtonMod.Button.jQueryInterface = js.native
    
    def carousel(): JQuery = js.native
    def carousel(config: cycle | pause | prev | next | nextWhenVisible | to | dispose): JQuery = js.native
    def carousel(config: Double): JQuery = js.native
    def carousel(config: PartialOptions): JQuery = js.native
    @JSName("carousel")
    var carousel_Original: typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.jQueryInterface = js.native
    
    def collapse(): JQuery = js.native
    def collapse(config: show | hide | toggle | dispose): JQuery = js.native
    def collapse(config: PartialOptionsParent): JQuery = js.native
    @JSName("collapse")
    var collapse_Original: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface = js.native
    
    def dropdown(): JQuery = js.native
    def dropdown(config: toggle | show | hide | update | dispose): JQuery = js.native
    def dropdown(config: PartialOptionsAutoClose): JQuery = js.native
    @JSName("dropdown")
    var dropdown_Original: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface = js.native
    
    def modal(): JQuery = js.native
    def modal(config: toggle | show | hide | handleUpdate | dispose): JQuery = js.native
    def modal(config: PartialOptionsBackdrop): JQuery = js.native
    @JSName("modal")
    var modal_Original: typingsJapgolly.bootstrap.jsDistModalMod.Modal.jQueryInterface = js.native
    
    def offcanvas(): JQuery = js.native
    def offcanvas(config: toggle | show | hide): JQuery = js.native
    @JSName("offcanvas")
    var offcanvas_Original: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.jQueryInterface = js.native
    
    def scrollspy(): JQuery = js.native
    def scrollspy(config: refresh | dispose): JQuery = js.native
    def scrollspy(config: PartialOptionsMethod): JQuery = js.native
    @JSName("scrollspy")
    var scrollspy_Original: typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy.jQueryInterface = js.native
    
    def tab(): JQuery = js.native
    def tab(config: show | dispose): JQuery = js.native
    @JSName("tab")
    var tab_Original: typingsJapgolly.bootstrap.jsDistTabMod.Tab.jQueryInterface = js.native
    
    def toast(): JQuery = js.native
    def toast(config: show | hide | dispose): JQuery = js.native
    def toast(config: PartialOptionsAnimation): JQuery = js.native
    @JSName("toast")
    var toast_Original: typingsJapgolly.bootstrap.jsDistToastMod.Toast.jQueryInterface = js.native
  }
}
