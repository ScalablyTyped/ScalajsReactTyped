package typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageItem
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.destroyed
import typingsJapgolly.winrtUwp.winrtUwpStrings.operationcompleted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the data that a user wants to exchange with another app. */
@js.native
trait DataPackage extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_destroyed(`type`: destroyed, listener: TypedEventHandler[DataPackage, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_operationcompleted(`type`: operationcompleted, listener: TypedEventHandler[DataPackage, OperationCompletedEventArgs]): Unit = js.native
  
  /**
    * Returns a DataPackageView object. This object is a read-only copy of the DataPackage object.
    * @return The object that is a read-only copy of the DataPackage object.
    */
  def getView(): DataPackageView = js.native
  
  /** Occurs when the DataPackage is destroyed. */
  def ondestroyed(ev: Any & WinRTEvent[DataPackage]): Unit = js.native
  /** Occurs when the DataPackage is destroyed. */
  @JSName("ondestroyed")
  var ondestroyed_Original: TypedEventHandler[DataPackage, Any] = js.native
  
  /** Occurs when a paste operation is completed. */
  def onoperationcompleted(ev: OperationCompletedEventArgs & WinRTEvent[DataPackage]): Unit = js.native
  /** Occurs when a paste operation is completed. */
  @JSName("onoperationcompleted")
  var onoperationcompleted_Original: TypedEventHandler[DataPackage, OperationCompletedEventArgs] = js.native
  
  /** Allows you to get and set properties like the title of the content being shared. */
  var properties: DataPackagePropertySet = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_destroyed(`type`: destroyed, listener: TypedEventHandler[DataPackage, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_operationcompleted(`type`: operationcompleted, listener: TypedEventHandler[DataPackage, OperationCompletedEventArgs]): Unit = js.native
  
  /** Specifies the DataPackageOperation (none, move, copy, or link) for the operation. */
  var requestedOperation: DataPackageOperation = js.native
  
  /** Maps a URI to a file. Used to ensure that referenced content (such as an image) in HTML content is added to the DataPackage . */
  var resourceMap: IMap[String, RandomAccessStreamReference] = js.native
  
  /**
    * Sets the application link that a DataPackage contains.
    * @param value A URI with a scheme that isn't http or https that's handled by the source app.
    */
  def setApplicationLink(value: Uri): Unit = js.native
  
  /**
    * Sets the bitmap image contained in the DataPackage .
    * @param value A stream that contains the bitmap image.
    */
  def setBitmap(value: RandomAccessStreamReference): Unit = js.native
  
  /**
    * Sets the data contained in the DataPackage in a RandomAccessStream format.
    * @param formatId Specifies the format of the data. We recommend that you set this value by using the StandardDataFormats class.
    * @param value Specifies the content that the DataPackage contains.
    */
  def setData(formatId: String, value: Any): Unit = js.native
  
  /**
    * Sets a delegate to handle requests from the target app.
    * @param formatId Specifies the format of the data. We recommend that you set this value by using the StandardDataFormats class.
    * @param delayRenderer A delegate that is responsible for processing requests from a target app.
    */
  def setDataProvider(formatId: String, delayRenderer: DataProviderHandler): Unit = js.native
  
  /**
    * Adds HTML content to the DataPackage .
    * @param value The HTML content.
    */
  def setHtmlFormat(value: String): Unit = js.native
  
  /**
    * Sets the Rich Text Format (RTF) content that is contained in a DataPackage .
    * @param value Specifies the RTF content for the DataPackage .
    */
  def setRtf(value: String): Unit = js.native
  
  /**
    * Sets the files and folders contained in a DataPackage .
    * @param value The files and folders to be added to the DataPackage .
    */
  def setStorageItems(value: IIterable[IStorageItem]): Unit = js.native
  /**
    * Adds files and folders to a DataPackage .
    * @param value The files and folders to be added to the DataPackage .
    * @param readOnly Specify true if the files are read-only; false otherwise.
    */
  def setStorageItems(value: IIterable[IStorageItem], readOnly: Boolean): Unit = js.native
  
  /**
    * Sets the text that a DataPackage contains.
    * @param value The text.
    */
  def setText(value: String): Unit = js.native
  
  /**
    * Sets the Uniform Resource Identifier (URI) that is contained in the DataPackage .
    * @param value The URI that is contained in the DataPackage .
    */
  def setUri(value: Uri): Unit = js.native
  
  /**
    * Sets the web link that a DataPackage contains.
    * @param value A URI with an http or https scheme that corresponds to the content being displayed to the user.
    */
  def setWebLink(value: Uri): Unit = js.native
}
