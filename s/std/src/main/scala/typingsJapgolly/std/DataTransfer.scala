package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.all
import typingsJapgolly.std.stdStrings.copy
import typingsJapgolly.std.stdStrings.copyLink
import typingsJapgolly.std.stdStrings.copyMove
import typingsJapgolly.std.stdStrings.link
import typingsJapgolly.std.stdStrings.linkMove
import typingsJapgolly.std.stdStrings.move
import typingsJapgolly.std.stdStrings.none
import typingsJapgolly.std.stdStrings.uninitialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to hold the data that is being dragged during a drag and drop operation. It may hold one or more data items, each of one or more data types. For more information about drag and drop, see HTML Drag and Drop API. */
@js.native
trait DataTransfer extends StObject {
  
  /** Removes the data of the specified formats. Removes all data if the argument is omitted. */
  /* standard dom */
  def clearData(): Unit = js.native
  def clearData(format: java.lang.String): Unit = js.native
  
  /**
    * Returns the kind of operation that is currently selected. If the kind of operation isn't one of those that is allowed by the effectAllowed attribute, then the operation will fail.
    *
    * Can be set, to change the selected operation.
    *
    * The possible values are "none", "copy", "link", and "move".
    */
  /* standard dom */
  var dropEffect: none | copy | link | move = js.native
  
  /**
    * Returns the kinds of operations that are to be allowed.
    *
    * Can be set (during the dragstart event), to change the allowed operations.
    *
    * The possible values are "none", "copy", "copyLink", "copyMove", "link", "linkMove", "move", "all", and "uninitialized",
    */
  /* standard dom */
  var effectAllowed: none | copy | copyLink | copyMove | link | linkMove | move | all | uninitialized = js.native
  
  /** Returns a FileList of the files being dragged, if any. */
  /* standard dom */
  val files: org.scalajs.dom.FileList = js.native
  
  /** Returns the specified data. If there is no such data, returns the empty string. */
  /* standard dom */
  def getData(format: java.lang.String): java.lang.String = js.native
  
  /** Returns a DataTransferItemList object, with the drag data. */
  /* standard dom */
  val items: DataTransferItemList = js.native
  
  /** Adds the specified data. */
  /* standard dom */
  def setData(format: java.lang.String, data: java.lang.String): Unit = js.native
  
  /** Uses the given element to update the drag feedback, replacing any previously specified feedback. */
  /* standard dom */
  def setDragImage(image: org.scalajs.dom.Element, x: Double, y: Double): Unit = js.native
  
  /** Returns a frozen array listing the formats that were set in the dragstart event. In addition, if any files are being dragged, then one of the types will be the string "Files". */
  /* standard dom */
  val types: js.Array[java.lang.String] = js.native
}
