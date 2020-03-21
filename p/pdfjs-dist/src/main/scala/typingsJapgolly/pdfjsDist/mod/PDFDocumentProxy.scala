package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pdfjsDist.AnonInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFDocumentProxy extends js.Object {
  /**
    * A unique ID to identify a PDF.  Not guaranteed to be unique.  [jbaldwin: haha what]
    **/
  var fingerprint: String
  /**
    * Total number of pages the PDF contains.
    **/
  var numPages: Double
  /**
    * TODO: return type of Promise<???>
    * A promise that is resolved when the document's data is loaded.
    **/
  def dataLoaded(): PDFPromise[js.Array[_]]
  /**
    *
    **/
  def destroy(): Unit
  /**
    * True if embedded document fonts are in use.  Will be set during rendering of the pages.
    **/
  def embeddedFontsUsed(): Boolean
  /**
    * A promise that is resolved with Uint8Array that has the raw PDF data.
    **/
  def getData(): PDFPromise[scala.scalajs.js.typedarray.Uint8Array]
  /**
    * TODO: return type of Promise<???>
    *  A promise that is resolved with a lookup table for mapping named destinations to reference numbers.
    **/
  def getDestinations(): PDFPromise[js.Array[_]]
  /**
    *  A promise that is resolved with an array of all the JavaScript strings in the name tree.
    **/
  def getJavaScript(): PDFPromise[js.Array[String]]
  /**
    * A promise that is resolved with the info and metadata of the PDF.
    **/
  def getMetadata(): PDFPromise[AnonInfo]
  /**
    *  A promise that is resolved with an array that is a tree outline (if it has one) of the PDF.  @see PDFTreeNode
    **/
  def getOutline(): PDFPromise[js.Array[PDFTreeNode]]
  /**
    * @param number The page number to get.  The first page is 1.
    * @return A promise that is resolved with a PDFPageProxy.
    **/
  def getPage(number: Double): PDFPromise[PDFPageProxy]
  /**
    * Is the PDF encrypted?
    **/
  def isEncrypted(): PDFPromise[Boolean]
}

object PDFDocumentProxy {
  @scala.inline
  def apply(
    dataLoaded: CallbackTo[PDFPromise[js.Array[js.Any]]],
    destroy: Callback,
    embeddedFontsUsed: CallbackTo[Boolean],
    fingerprint: String,
    getData: CallbackTo[PDFPromise[scala.scalajs.js.typedarray.Uint8Array]],
    getDestinations: CallbackTo[PDFPromise[js.Array[js.Any]]],
    getJavaScript: CallbackTo[PDFPromise[js.Array[String]]],
    getMetadata: CallbackTo[PDFPromise[AnonInfo]],
    getOutline: CallbackTo[PDFPromise[js.Array[PDFTreeNode]]],
    getPage: Double => CallbackTo[PDFPromise[PDFPageProxy]],
    isEncrypted: CallbackTo[PDFPromise[Boolean]],
    numPages: Double
  ): PDFDocumentProxy = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    __obj.updateDynamic("dataLoaded")(dataLoaded.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("embeddedFontsUsed")(embeddedFontsUsed.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getDestinations")(getDestinations.toJsFn)
    __obj.updateDynamic("getJavaScript")(getJavaScript.toJsFn)
    __obj.updateDynamic("getMetadata")(getMetadata.toJsFn)
    __obj.updateDynamic("getOutline")(getOutline.toJsFn)
    __obj.updateDynamic("getPage")(js.Any.fromFunction1((t0: scala.Double) => getPage(t0).runNow()))
    __obj.updateDynamic("isEncrypted")(isEncrypted.toJsFn)
    __obj.asInstanceOf[PDFDocumentProxy]
  }
}

