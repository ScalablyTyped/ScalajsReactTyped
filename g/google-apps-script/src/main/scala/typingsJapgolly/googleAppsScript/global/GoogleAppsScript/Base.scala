package typingsJapgolly.googleAppsScript.global.GoogleAppsScript

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.DateConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Base {
  
  /**
    * An enum representing predetermined, localized dialog buttons returned by an alert or PromptResponse.getSelectedButton() to indicate
    * which button in a dialog the user clicked. These values cannot be set; to add buttons to an
    * alert or prompt, use ButtonSet instead.
    *
    *     // Display a dialog box with a message and "Yes" and "No" buttons.
    *     var ui = DocumentApp.getUi();
    *     var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
    *
    *     // Process the user's response.
    *     if (response == ui.Button.YES) {
    *       Logger.log('The user clicked "Yes."');
    *     } else {
    *       Logger.log('The user clicked "No" or the dialog\'s close button.');
    *     }
    */
  @JSGlobal("GoogleAppsScript.Base.Button")
  @js.native
  object Button extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Button & Double] = js.native
    
    /* 2 */ val CANCEL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Button.CANCEL & Double = js.native
    
    /* 0 */ val CLOSE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Button.CLOSE & Double = js.native
    
    /* 4 */ val NO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Button.NO & Double = js.native
    
    /* 1 */ val OK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Button.OK & Double = js.native
    
    /* 3 */ val YES: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Button.YES & Double = js.native
  }
  
  /**
    * An enum representing predetermined, localized sets of one or more dialog buttons that can be
    * added to an alert or a prompt. To determine which button the user clicked,
    * use Button.
    *
    *     // Display a dialog box with a message and "Yes" and "No" buttons.
    *     var ui = DocumentApp.getUi();
    *     var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
    *
    *     // Process the user's response.
    *     if (response == ui.Button.YES) {
    *       Logger.log('The user clicked "Yes."');
    *     } else {
    *       Logger.log('The user clicked "No" or the dialog\'s close button.');
    *     }
    */
  @JSGlobal("GoogleAppsScript.Base.ButtonSet")
  @js.native
  object ButtonSet extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ButtonSet & Double] = js.native
    
    /* 0 */ val OK: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK & Double = js.native
    
    /* 1 */ val OK_CANCEL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK_CANCEL & Double = js.native
    
    /* 2 */ val YES_NO: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO & Double = js.native
    
    /* 3 */ val YES_NO_CANCEL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO_CANCEL & Double = js.native
  }
  
  /**
    * The types of Colors
    */
  @JSGlobal("GoogleAppsScript.Base.ColorType")
  @js.native
  object ColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType & Double] = js.native
    
    /* 1 */ val RGB: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType.RGB & Double = js.native
    
    /* 2 */ val THEME: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType.THEME & Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.ColorType.UNSUPPORTED & Double = js.native
  }
  
  @JSGlobal("GoogleAppsScript.Base.Date")
  @js.native
  val Date: DateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("GoogleAppsScript.Base.Date")
  @js.native
  open class DateCls ()
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date {
    def this(value: String) = this()
    def this(value: Double) = this()
    def this(year: Double, month: Double) = this()
    def this(year: Double, month: Double, date: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: Double,
      seconds: Unit,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: Unit,
      seconds: Double,
      ms: Double
    ) = this()
    def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Unit,
      minutes: Double,
      seconds: Double,
      ms: Double
    ) = this()
    def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
    def this(
      year: Double,
      month: Double,
      date: Unit,
      hours: Double,
      minutes: Double,
      seconds: Double,
      ms: Double
    ) = this()
    def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Unit, ms: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double, ms: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double, ms: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
    def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
  }
  
  /**
    * An enum representing the months of the year.
    */
  @JSGlobal("GoogleAppsScript.Base.Month")
  @js.native
  object Month extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month & Double] = js.native
    
    /* 3 */ val APRIL: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.APRIL & Double = js.native
    
    /* 7 */ val AUGUST: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.AUGUST & Double = js.native
    
    /* 11 */ val DECEMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.DECEMBER & Double = js.native
    
    /* 1 */ val FEBRUARY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.FEBRUARY & Double = js.native
    
    /* 0 */ val JANUARY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.JANUARY & Double = js.native
    
    /* 6 */ val JULY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.JULY & Double = js.native
    
    /* 5 */ val JUNE: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.JUNE & Double = js.native
    
    /* 2 */ val MARCH: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.MARCH & Double = js.native
    
    /* 4 */ val MAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.MAY & Double = js.native
    
    /* 10 */ val NOVEMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.NOVEMBER & Double = js.native
    
    /* 9 */ val OCTOBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.OCTOBER & Double = js.native
    
    /* 8 */ val SEPTEMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Month.SEPTEMBER & Double = js.native
  }
  
  /**
    * An enum representing the days of the week.
    */
  @JSGlobal("GoogleAppsScript.Base.Weekday")
  @js.native
  object Weekday extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday & Double] = js.native
    
    /* 5 */ val FRIDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday.FRIDAY & Double = js.native
    
    /* 1 */ val MONDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday.MONDAY & Double = js.native
    
    /* 6 */ val SATURDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday.SATURDAY & Double = js.native
    
    /* 0 */ val SUNDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday.SUNDAY & Double = js.native
    
    /* 4 */ val THURSDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday.THURSDAY & Double = js.native
    
    /* 2 */ val TUESDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday.TUESDAY & Double = js.native
    
    /* 3 */ val WEDNESDAY: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Weekday.WEDNESDAY & Double = js.native
  }
}
