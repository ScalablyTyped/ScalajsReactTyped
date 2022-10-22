package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a default implementation of an {@link ObjectInspectorModel}
  *
  * This service simplifies usage of an {@link ObjectInspector} .
  *
  * The {@link XObjectInspectorModel} implemented by this service will not provide any property categories, nor apply any particular order to the
  * properties provided by its handler(s).
  * @see ObjectInspector
  * @see XObjectInspectorModel
  * @see XObjectInspectorModel.describeCategories
  * @see XObjectInspectorModel.getPropertyOrderIndex
  * @since OOo 2.0.3
  */
trait ObjectInspectorModel
  extends StObject
     with XObjectInspectorModel {
  
  /** creates a default {@link ObjectInspectorModel} , whose one and only handler factory creates a {@link GenericPropertyHandler} . */
  def createDefault(): Unit
  
  /**
    * creates a default {@link ObjectInspectorModel} , using an externally provided sequence of property handler factories.
    * @param handlerFactories a sequence of handler factories, as to be provided in the {@link XObjectInspectorModel.HandlerFactories} method.
    * @see XObjectInspectorModel.HandlerFactories
    * @throws com::sun::star::lang::IllegalArgumentException if the given sequence is empty.
    */
  def createWithHandlerFactories(handlerFactories: SeqEquiv[Any]): Unit
  
  /**
    * creates a default {@link ObjectInspectorModel} , using an externally provided sequence of property handler factories, and describing an {@link
    * ObjectInspector} which has a help section.
    * @param handlerFactories a sequence of handler factories, as to be provided in the {@link XObjectInspectorModel.HandlerFactories} method.
    * @param minHelpTextLines denotes the minimum number of lines of text to be reserved for the help section.
    * @param maxHelpTextLines denotes the maximum number of lines of text to be reserved for the help section.
    * @see XObjectInspectorModel.HandlerFactories
    * @see XObjectInspectorModel.HasHelpSection
    * @see XObjectInspectorModel.MinHelpTextLines
    * @see XObjectInspectorModel.MaxHelpTextLines
    * @since OOo 2.2
    * @throws com::sun::star::lang::IllegalArgumentException if handlerFactories is empty.
    * @throws com::sun::star::lang::IllegalArgumentException if minHelpTextLines or maxHelpTextLines are negative, or if minHelpTextLines is greater than maxHe
    */
  def createWithHandlerFactoriesAndHelpSection(handlerFactories: SeqEquiv[Any], minHelpTextLines: Double, maxHelpTextLines: Double): Unit
}
object ObjectInspectorModel {
  
  inline def apply(
    HandlerFactories: SafeArray[Any],
    HasHelpSection: Boolean,
    IsReadOnly: Boolean,
    MaxHelpTextLines: Double,
    MinHelpTextLines: Double,
    createDefault: Callback,
    createWithHandlerFactories: SeqEquiv[Any] => Callback,
    createWithHandlerFactoriesAndHelpSection: (SeqEquiv[Any], Double, Double) => Callback,
    describeCategories: CallbackTo[SafeArray[PropertyCategoryDescriptor]],
    getPropertyOrderIndex: String => Double
  ): ObjectInspectorModel = {
    val __obj = js.Dynamic.literal(HandlerFactories = HandlerFactories.asInstanceOf[js.Any], HasHelpSection = HasHelpSection.asInstanceOf[js.Any], IsReadOnly = IsReadOnly.asInstanceOf[js.Any], MaxHelpTextLines = MaxHelpTextLines.asInstanceOf[js.Any], MinHelpTextLines = MinHelpTextLines.asInstanceOf[js.Any], createDefault = createDefault.toJsFn, createWithHandlerFactories = js.Any.fromFunction1((t0: SeqEquiv[Any]) => createWithHandlerFactories(t0).runNow()), createWithHandlerFactoriesAndHelpSection = js.Any.fromFunction3((t0: SeqEquiv[Any], t1: Double, t2: Double) => (createWithHandlerFactoriesAndHelpSection(t0, t1, t2)).runNow()), describeCategories = describeCategories.toJsFn, getPropertyOrderIndex = js.Any.fromFunction1(getPropertyOrderIndex))
    __obj.asInstanceOf[ObjectInspectorModel]
  }
  
  extension [Self <: ObjectInspectorModel](x: Self) {
    
    inline def setCreateDefault(value: Callback): Self = StObject.set(x, "createDefault", value.toJsFn)
    
    inline def setCreateWithHandlerFactories(value: SeqEquiv[Any] => Callback): Self = StObject.set(x, "createWithHandlerFactories", js.Any.fromFunction1((t0: SeqEquiv[Any]) => value(t0).runNow()))
    
    inline def setCreateWithHandlerFactoriesAndHelpSection(value: (SeqEquiv[Any], Double, Double) => Callback): Self = StObject.set(x, "createWithHandlerFactoriesAndHelpSection", js.Any.fromFunction3((t0: SeqEquiv[Any], t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
