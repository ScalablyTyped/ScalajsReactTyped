package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsDatetimeDatetimeInterfaceMod.DatetimePresentation
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonDatetimeButtonElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.date
import typingsJapgolly.ionicCore.ionicCoreStrings.time
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsDatetimeButtonDatetimeButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime-button/datetime-button", "DatetimeButton")
  @js.native
  open class DatetimeButton ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MDatetimeButton(): js.Promise[Unit] = js.native
    
    /* private */ var dateTargetEl: Any = js.native
    
    var dateText: js.UndefOr[String] = js.native
    
    /**
      * The ID of the `ion-datetime` instance
      * associated with the datetime button.
      */
    var datetime: js.UndefOr[String] = js.native
    
    var datetimeActive: Boolean = js.native
    
    /* private */ var datetimeEl: Any = js.native
    
    var datetimePresentation: js.UndefOr[DatetimePresentation] = js.native
    
    /**
      * If `true`, the user cannot interact with the button.
      */
    var disabled: Boolean = js.native
    
    var el: HTMLIonDatetimeButtonElement = js.native
    
    /**
      * Accepts one or more string values and converts
      * them to DatetimeParts. This is done so datetime-button
      * can work with an array internally and not need
      * to keep checking if the datetime value is `string` or `string[]`.
      */
    /* private */ var getParsedDateValues: Any = js.native
    
    /* private */ var handleDateClick: Any = js.native
    
    /* private */ var handleTimeClick: Any = js.native
    
    /* private */ var overlayEl: Any = js.native
    
    /**
      * If the datetime is presented in an
      * overlay, the datetime and overlay
      * should be appropriately sized.
      * These classes provide default sizing values
      * that developers can customize.
      * The goal is to provide an overlay that is
      * reasonably sized with a datetime that
      * fills the entire container.
      */
    /* private */ var presentOverlay: Any = js.native
    
    @JSName("render")
    def render_MDatetimeButton(): Any = js.native
    
    var selectedButton: js.UndefOr[date | time] = js.native
    
    /**
      * Check the value property on the linked
      * ion-datetime and then format it according
      * to the locale specified on ion-datetime.
      */
    /* private */ var setDateTimeText: Any = js.native
    
    /* private */ var timeTargetEl: Any = js.native
    
    var timeText: js.UndefOr[String] = js.native
    
    /**
      * Waits for the ion-datetime to re-render.
      * This is needed in order to correctly position
      * a popover relative to the trigger element.
      */
    /* private */ var waitForDatetimeChanges: Any = js.native
  }
}
