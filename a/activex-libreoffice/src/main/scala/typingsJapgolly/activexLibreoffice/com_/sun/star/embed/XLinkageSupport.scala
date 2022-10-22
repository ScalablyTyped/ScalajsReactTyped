package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an additional implementation for linked embedded object support. */
trait XLinkageSupport
  extends StObject
     with XCommonEmbedPersist {
  
  /**
    * returns the URL of the link object.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or is not a link
    */
  val LinkURL: String
  
  /**
    * breaks the link and provides the object with a parent storage and a name for object's entry
    *
    * This method can be used only for links implementations that implement the whole set of embedded object interfaces. Usually the sets of interfaces are
    * the same for links and objects. An example of exception from this are OOo links that do not implement {@link XEmbedPersist} interface. For such cases
    * the method will throw an exception.
    *
    * The link will be broken and the linked object will become a normal embedded object.
    *
    * An entry with the specified name should be created or opened inside provided storage. This entry will be used for the object persistence. If the entry
    * exists already all its contents will be ignored.
    * @param xStorage a parent storage the entry should be created or opened in
    * @param sEntryName a name for the entry
    * @see also XEmbedPersist.setPersistentEntry
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or not a linked object
    * @throws com::sun::star::io::IOException in case object has not persistence or other io problems
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def breakLink(xStorage: XStorage, sEntryName: String): Unit
  
  /**
    * returns the URL of the link object.
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state or is not a link
    */
  def getLinkURL(): String
  
  /**
    * allows to detect whether the object is a linked one.
    *
    * Most of embedded objects will not support this interface, but some of them can do it, to allow conversion from link to object. After the conversion
    * the object does not change, so interface set stays the same, but the object is not a link any more.
    * @returns `TRUE` - the object is a linked one. `FALSE` - otherwise
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    */
  def isLink(): Boolean
}
object XLinkageSupport {
  
  inline def apply(
    LinkURL: String,
    acquire: Callback,
    breakLink: (XStorage, String) => Callback,
    getLinkURL: CallbackTo[String],
    isLink: CallbackTo[Boolean],
    isReadonly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    storeOwn: Callback
  ): XLinkageSupport = {
    val __obj = js.Dynamic.literal(LinkURL = LinkURL.asInstanceOf[js.Any], acquire = acquire.toJsFn, breakLink = js.Any.fromFunction2((t0: XStorage, t1: String) => (breakLink(t0, t1)).runNow()), getLinkURL = getLinkURL.toJsFn, isLink = isLink.toJsFn, isReadonly = isReadonly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = js.Any.fromFunction2((t0: SeqEquiv[PropertyValue], t1: SeqEquiv[PropertyValue]) => (reload(t0, t1)).runNow()), storeOwn = storeOwn.toJsFn)
    __obj.asInstanceOf[XLinkageSupport]
  }
  
  extension [Self <: XLinkageSupport](x: Self) {
    
    inline def setBreakLink(value: (XStorage, String) => Callback): Self = StObject.set(x, "breakLink", js.Any.fromFunction2((t0: XStorage, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setGetLinkURL(value: CallbackTo[String]): Self = StObject.set(x, "getLinkURL", value.toJsFn)
    
    inline def setIsLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLink", value.toJsFn)
    
    inline def setLinkURL(value: String): Self = StObject.set(x, "LinkURL", value.asInstanceOf[js.Any])
  }
}
