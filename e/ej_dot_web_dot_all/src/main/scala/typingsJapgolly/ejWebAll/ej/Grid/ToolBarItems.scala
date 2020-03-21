package typingsJapgolly.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolBarItems extends js.Object

@JSGlobal("ej.Grid.ToolBarItems")
@js.native
object ToolBarItems extends js.Object {
  ///Toolbar item is add.
  @js.native
  sealed trait Add extends ToolBarItems
  
  ///Toolbar item is cancel.
  @js.native
  sealed trait Cancel extends ToolBarItems
  
  ///Toolbar item is delete.
  @js.native
  sealed trait Delete extends ToolBarItems
  
  ///Toolbar item is edit.
  @js.native
  sealed trait Edit extends ToolBarItems
  
  ///Toolbar item is pdfExport.
  @js.native
  sealed trait PdfExport extends ToolBarItems
  
  ///Toolbar item is printGrid.
  @js.native
  sealed trait PrintGrid extends ToolBarItems
  
  ///Toolbar item is search.
  @js.native
  sealed trait Search extends ToolBarItems
  
  ///Toolbar item is update.
  @js.native
  sealed trait Update extends ToolBarItems
  
  ///Toolbar item is wordExport.
  @js.native
  sealed trait WordExport extends ToolBarItems
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolBarItems with Double] = js.native
  /* 0 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 4 */ @js.native
  object Cancel extends TopLevel[Cancel with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
  /* 6 */ @js.native
  object PdfExport extends TopLevel[PdfExport with Double]
  
  /* 7 */ @js.native
  object PrintGrid extends TopLevel[PrintGrid with Double]
  
  /* 5 */ @js.native
  object Search extends TopLevel[Search with Double]
  
  /* 3 */ @js.native
  object Update extends TopLevel[Update with Double]
  
  /* 8 */ @js.native
  object WordExport extends TopLevel[WordExport with Double]
  
}

