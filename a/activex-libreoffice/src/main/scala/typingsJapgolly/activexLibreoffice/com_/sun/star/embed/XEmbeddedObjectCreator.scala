package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XEmbeddedObjectCreator
  extends StObject
     with XEmbedObjectCreator
     with XEmbedObjectFactory
     with XLinkCreator
     with XLinkFactory
object XEmbeddedObjectCreator {
  
  inline def apply(
    acquire: Callback,
    createInstanceInitFromEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceInitFromMediaDescriptor: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceInitNew: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue]) => XInterface,
    createInstanceLink: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceLinkUserInit: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceUserInit: (SeqEquiv[Double], String, XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XEmbeddedObjectCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInstanceInitFromEntry = js.Any.fromFunction4(createInstanceInitFromEntry), createInstanceInitFromMediaDescriptor = js.Any.fromFunction4(createInstanceInitFromMediaDescriptor), createInstanceInitNew = js.Any.fromFunction5(createInstanceInitNew), createInstanceLink = js.Any.fromFunction4(createInstanceLink), createInstanceLinkUserInit = js.Any.fromFunction6(createInstanceLinkUserInit), createInstanceUserInit = js.Any.fromFunction7(createInstanceUserInit), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEmbeddedObjectCreator]
  }
}
