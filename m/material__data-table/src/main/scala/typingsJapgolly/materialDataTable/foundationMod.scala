package typingsJapgolly.materialDataTable

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialDataTable.adapterMod.MDCDataTableAdapter
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/data-table/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCDataTableFoundation () extends MDCFoundation[MDCDataTableAdapter] {
    def this(adapter: PartialMDCDataTableAdapte) = this()
    // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /**
      * @return Returns array of row elements.
      */
    def getRows(): js.Array[Element] = js.native
    /**
      * @return Returns array of selected row ids.
      */
    def getSelectedRowIds(): js.Array[String | Null] = js.native
    /**
      * Handles header row checkbox change event.
      */
    def handleHeaderRowCheckboxChange(): Unit = js.native
    /**
      * Handles change event originated from row checkboxes.
      */
    def handleRowCheckboxChange(event: Event_): Unit = js.native
    // Subclasses should override this method to perform initialization routines (registering events, etc.)
    /* CompleteClass */
    override def init(): Unit = js.native
    /**
      * Re-initializes header row checkbox and row checkboxes when selectable rows are added or removed from table.
      * Use this if registering checkbox is synchronous.
      */
    def layout(): Unit = js.native
    /**
      * Re-initializes header row checkbox and row checkboxes when selectable rows are added or removed from table.
      * Use this if registering checkbox is asynchronous.
      */
    def layoutAsync(): js.Promise[Unit] = js.native
    /**
      * Sets selected row ids. Overwrites previously selected rows.
      * @param rowIds Array of row ids that needs to be selected.
      */
    def setSelectedRowIds(rowIds: js.Array[String]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCDataTableFoundation extends js.Object {
    val defaultAdapter: MDCDataTableAdapter = js.native
  }
  
}

