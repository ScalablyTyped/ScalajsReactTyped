package typingsJapgolly.officeJs.global.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This enum sets where the cursor (insertion point) in the document is after a selection.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Word.SelectionMode & String] = js.native
  
  /* "End" */ val end: typingsJapgolly.officeJs.Word.SelectionMode.end & String = js.native
  
  /* "Select" */ val select: typingsJapgolly.officeJs.Word.SelectionMode.select & String = js.native
  
  /* "Start" */ val start: typingsJapgolly.officeJs.Word.SelectionMode.start & String = js.native
}
