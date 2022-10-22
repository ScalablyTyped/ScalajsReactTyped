package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables a sheet to refer to another sheet in a different document.
  *
  * To insert a sheet link, the sheet used as linked sheet has to exist already. The method {@link XSheetLinkable.link()} creates a {@link SheetLink}
  * object in the document's {@link SheetLinks} collection and links the sheet to the specified external sheet.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.SheetLinks
  * @see com.sun.star.sheet.SheetLink
  */
trait XSheetLinkable
  extends StObject
     with XInterface {
  
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  var LinkMode: SheetLinkMode
  
  /** returns the sheet name of the sheet in the source document. */
  var LinkSheetName: String
  
  /** returns the target URL of the link. */
  var LinkUrl: String
  
  /**
    * returns the link mode of the spreadsheet.
    *
    * If the returned value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMode::VALUE, only results of formulas are used.
    */
  def getLinkMode(): SheetLinkMode
  
  /** returns the sheet name of the sheet in the source document. */
  def getLinkSheetName(): String
  
  /** returns the target URL of the link. */
  def getLinkUrl(): String
  
  /**
    * links the sheet to another sheet in another document.
    *
    * A {@link SheetLink} object is created if it does not exist, and the link mode, the URL of the linked document and the linked sheet name are set.
    */
  def link(
    aUrl: String,
    aSheetName: String,
    aFilterName: String,
    aFilterOptions: String,
    nMode: SheetLinkMode
  ): Unit
  
  /**
    * enables the linking of the sheet and controls whether formulas are copied.
    * @param nLinkMode the value specifying the link mode for this spreadsheet.  If the value is SheetLinkMode::NORMAL, formulas are copied. With SheetLinkMod
    */
  def setLinkMode(nLinkMode: SheetLinkMode): Unit
  
  /**
    * sets the name of the linked sheet in the source document.
    *
    * This method sets the sheet name in the {@link SheetLink} object, it does not modify the sheet name in the source document.
    */
  def setLinkSheetName(aLinkSheetName: String): Unit
  
  /**
    * sets the target URL of the link.
    *
    * A {@link SheetLink} object with the same file name must exist already or the link will not work.
    */
  def setLinkUrl(aLinkUrl: String): Unit
}
object XSheetLinkable {
  
  inline def apply(
    LinkMode: SheetLinkMode,
    LinkSheetName: String,
    LinkUrl: String,
    acquire: Callback,
    getLinkMode: CallbackTo[SheetLinkMode],
    getLinkSheetName: CallbackTo[String],
    getLinkUrl: CallbackTo[String],
    link: (String, String, String, String, SheetLinkMode) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setLinkMode: SheetLinkMode => Callback,
    setLinkSheetName: String => Callback,
    setLinkUrl: String => Callback
  ): XSheetLinkable = {
    val __obj = js.Dynamic.literal(LinkMode = LinkMode.asInstanceOf[js.Any], LinkSheetName = LinkSheetName.asInstanceOf[js.Any], LinkUrl = LinkUrl.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLinkMode = getLinkMode.toJsFn, getLinkSheetName = getLinkSheetName.toJsFn, getLinkUrl = getLinkUrl.toJsFn, link = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: SheetLinkMode) => (link(t0, t1, t2, t3, t4)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setLinkMode = js.Any.fromFunction1((t0: SheetLinkMode) => setLinkMode(t0).runNow()), setLinkSheetName = js.Any.fromFunction1((t0: String) => setLinkSheetName(t0).runNow()), setLinkUrl = js.Any.fromFunction1((t0: String) => setLinkUrl(t0).runNow()))
    __obj.asInstanceOf[XSheetLinkable]
  }
  
  extension [Self <: XSheetLinkable](x: Self) {
    
    inline def setGetLinkMode(value: CallbackTo[SheetLinkMode]): Self = StObject.set(x, "getLinkMode", value.toJsFn)
    
    inline def setGetLinkSheetName(value: CallbackTo[String]): Self = StObject.set(x, "getLinkSheetName", value.toJsFn)
    
    inline def setGetLinkUrl(value: CallbackTo[String]): Self = StObject.set(x, "getLinkUrl", value.toJsFn)
    
    inline def setLink(value: (String, String, String, String, SheetLinkMode) => Callback): Self = StObject.set(x, "link", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: SheetLinkMode) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setLinkMode(value: SheetLinkMode): Self = StObject.set(x, "LinkMode", value.asInstanceOf[js.Any])
    
    inline def setLinkSheetName(value: String): Self = StObject.set(x, "LinkSheetName", value.asInstanceOf[js.Any])
    
    inline def setLinkUrl(value: String): Self = StObject.set(x, "LinkUrl", value.asInstanceOf[js.Any])
    
    inline def setSetLinkMode(value: SheetLinkMode => Callback): Self = StObject.set(x, "setLinkMode", js.Any.fromFunction1((t0: SheetLinkMode) => value(t0).runNow()))
    
    inline def setSetLinkSheetName(value: String => Callback): Self = StObject.set(x, "setLinkSheetName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetLinkUrl(value: String => Callback): Self = StObject.set(x, "setLinkUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
