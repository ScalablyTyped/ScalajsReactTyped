package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.anon.OmitActionSheetsetActions
import typingsJapgolly.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.ActionSheet")
@js.native
/**
  * A pop up dialog that offers a selection. Is automatically disposed when closed.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class ActionSheet ()
  extends typingsJapgolly.tabris.mod.ActionSheet {
  def this(properties: Properties[typingsJapgolly.tabris.mod.ActionSheet, OmitActionSheetsetActions]) = this()
}
/* static members */
object ActionSheet {
  
  @JSGlobal("tabris.ActionSheet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the given action sheet visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual ActionSheet.
    * @param actionSheet The action sheet to open
    */
  inline def open(actionSheet: typingsJapgolly.tabris.mod.ActionSheet): typingsJapgolly.tabris.mod.ActionSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(actionSheet.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tabris.mod.ActionSheet]
}
