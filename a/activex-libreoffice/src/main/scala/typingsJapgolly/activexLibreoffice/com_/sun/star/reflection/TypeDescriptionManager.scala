package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XHierarchicalNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service manages type descriptions and acts as a central access point to every type description. It delegates calls for demanded types to
  * subsequent com::sun::star::reflection::TypeDescriptionProviders and may cache type descriptions. ;  Using cppuhelper's bootstrapping routines
  * bootstrapping an initial component context, there is a singleton accessible via key "/singletons/com.sun.star.reflection.theTypeDescriptionManager".
  * This singleton object is hooked into the C UNO runtime typelib and lives until the context is shut down. ;
  * @see com.sun.star.reflection.TypeDescriptionProvider
  * @see com.sun.star.reflection.XTypeDescription
  */
trait TypeDescriptionManager
  extends StObject
     with XHierarchicalNameAccess
     with XSet
     with XComponent
     with XTypeDescriptionEnumerationAccess
object TypeDescriptionManager {
  
  inline def apply(
    ElementType: `type`,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    createTypeDescriptionEnumeration: (String, SeqEquiv[TypeClass], TypeDescriptionSearchDepth) => XTypeDescriptionEnumeration,
    dispose: Callback,
    getByHierarchicalName: String => Any,
    getElementType: CallbackTo[`type`],
    has: Any => Boolean,
    hasByHierarchicalName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insert: Any => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    remove: Any => Callback,
    removeEventListener: XEventListener => Callback
  ): TypeDescriptionManager = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createEnumeration = createEnumeration.toJsFn, createTypeDescriptionEnumeration = js.Any.fromFunction3(createTypeDescriptionEnumeration), dispose = dispose.toJsFn, getByHierarchicalName = js.Any.fromFunction1(getByHierarchicalName), getElementType = getElementType.toJsFn, has = js.Any.fromFunction1(has), hasByHierarchicalName = js.Any.fromFunction1(hasByHierarchicalName), hasElements = hasElements.toJsFn, insert = js.Any.fromFunction1((t0: Any) => insert(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: Any) => remove(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[TypeDescriptionManager]
  }
}
