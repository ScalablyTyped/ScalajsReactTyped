package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.anon.OmitDateDialogsetCheckDisposed
import typingsJapgolly.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.DateDialog")
@js.native
/**
  * A `DateDialog` represents a native dialog pop-up allowing the user to pick a date. Properties can
  * only be set before open() is called. The dialog is automatically disposed when closed.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class DateDialog ()
  extends typingsJapgolly.tabris.mod.DateDialog {
  def this(properties: Properties[typingsJapgolly.tabris.mod.DateDialog, OmitDateDialogsetCheckDisposed]) = this()
}
/* static members */
object DateDialog {
  
  @JSGlobal("tabris.DateDialog")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and opens a date dialog.
    * @param date The date to be displayed in the dialog. The current date is used when no date is provided.
    */
  inline def open(): typingsJapgolly.tabris.mod.DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[typingsJapgolly.tabris.mod.DateDialog]
  /**
    * Makes the given date dialog visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual DateDialog.
    * @param dateDialog The date dialog to open
    */
  inline def open(dateDialog: typingsJapgolly.tabris.mod.DateDialog): typingsJapgolly.tabris.mod.DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(dateDialog.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.DateDialog]
  inline def open(date: js.Date): typingsJapgolly.tabris.mod.DateDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.DateDialog]
}
