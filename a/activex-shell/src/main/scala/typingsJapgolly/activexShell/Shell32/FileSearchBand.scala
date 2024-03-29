package typingsJapgolly.activexShell.Shell32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FileSearchBand Class */
@js.native
trait FileSearchBand extends StObject {
  
  /** Retrieve the file from which the search was restored. */
  val QueryFile: Any = js.native
  
  /** Get the search scope */
  val Scope: Any = js.native
  
  /** Retrieve the guid of the currently active search. */
  val SearchID: String = js.native
  
  /** method SetFocus */
  def SetFocus(): Unit = js.native
  
  /** method SetSearchParameters */
  def SetSearchParameters(pbstrSearchID: String, bNavToResults: Boolean): Unit = js.native
  def SetSearchParameters(pbstrSearchID: String, bNavToResults: Boolean, pvarScope: Any): Unit = js.native
  def SetSearchParameters(pbstrSearchID: String, bNavToResults: Boolean, pvarScope: Any, pvarQueryFile: Any): Unit = js.native
  def SetSearchParameters(pbstrSearchID: String, bNavToResults: Boolean, pvarScope: Unit, pvarQueryFile: Any): Unit = js.native
  
  /* private */ @JSName("Shell32.FileSearchBand_typekey")
  var Shell32DotFileSearchBand_typekey: FileSearchBand = js.native
}
