package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is implemented by objects that also are a property of some other object.
  *
  * Provides access to traits of this object that would otherwise only be available from a containing {@link XPropertySet} via its {@link
  * XPropertySetInfo} .
  */
trait XProperty
  extends StObject
     with XInterface {
  
  /** @returns the specification of this object as {@link Property} . */
  val AsProperty: Property
  
  /** @returns the specification of this object as {@link Property} . */
  def getAsProperty(): Property
}
object XProperty {
  
  inline def apply(
    AsProperty: Property,
    acquire: Callback,
    getAsProperty: CallbackTo[Property],
    queryInterface: `type` => Any,
    release: Callback
  ): XProperty = {
    val __obj = js.Dynamic.literal(AsProperty = AsProperty.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAsProperty = getAsProperty.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XProperty]
  }
  
  extension [Self <: XProperty](x: Self) {
    
    inline def setAsProperty(value: Property): Self = StObject.set(x, "AsProperty", value.asInstanceOf[js.Any])
    
    inline def setGetAsProperty(value: CallbackTo[Property]): Self = StObject.set(x, "getAsProperty", value.toJsFn)
  }
}
