package typingsJapgolly.openui5.sapUiCommonsLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PaginatorEvent extends StObject
@JSImport("sap/ui/commons/library", "PaginatorEvent")
@js.native
object PaginatorEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PaginatorEvent & String] = js.native
  
  /**
    * First page event
    */
  @js.native
  sealed trait First
    extends StObject
       with PaginatorEvent
  /* "First" */ val First: typingsJapgolly.openui5.sapUiCommonsLibraryMod.PaginatorEvent.First & String = js.native
  
  /**
    * Go to page event
    */
  @js.native
  sealed trait Goto
    extends StObject
       with PaginatorEvent
  /* "Goto" */ val Goto: typingsJapgolly.openui5.sapUiCommonsLibraryMod.PaginatorEvent.Goto & String = js.native
  
  /**
    * Last page event
    */
  @js.native
  sealed trait Last
    extends StObject
       with PaginatorEvent
  /* "Last" */ val Last: typingsJapgolly.openui5.sapUiCommonsLibraryMod.PaginatorEvent.Last & String = js.native
  
  /**
    * Next page event
    */
  @js.native
  sealed trait Next
    extends StObject
       with PaginatorEvent
  /* "Next" */ val Next: typingsJapgolly.openui5.sapUiCommonsLibraryMod.PaginatorEvent.Next & String = js.native
  
  /**
    * Previous page event
    */
  @js.native
  sealed trait Previous
    extends StObject
       with PaginatorEvent
  /* "Previous" */ val Previous: typingsJapgolly.openui5.sapUiCommonsLibraryMod.PaginatorEvent.Previous & String = js.native
}
