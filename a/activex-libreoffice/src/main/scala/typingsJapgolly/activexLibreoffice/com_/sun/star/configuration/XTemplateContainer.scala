package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by objects that contain instances of a named template to provide information about the template.
  *
  * An implementation will also implement {@link com.sun.star.lang.XSingleServiceFactory} , in which case that interface creates instances of the
  * specified template.
  *
  * If multiple templates are supported, the supported factory interface may be {@link com.sun.star.lang.XMultiServiceFactory} , in which case the
  * `string` returned from {@link XTemplateContainer.getElementTemplateName()} can be used as the service name argument.
  * @see XTemplateInstance
  */
trait XTemplateContainer
  extends StObject
     with XInterface {
  
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  val ElementTemplateName: String
  
  /**
    * retrieves the name of the template
    *
    * If instances of multiple templates are accepted by the container, this is the name of the basic or primary template.
    *
    * Instances of the template must be created using an appropriate factory.
    * @returns the name of the (default) template for elements.
    */
  def getElementTemplateName(): String
}
object XTemplateContainer {
  
  inline def apply(
    ElementTemplateName: String,
    acquire: Callback,
    getElementTemplateName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XTemplateContainer = {
    val __obj = js.Dynamic.literal(ElementTemplateName = ElementTemplateName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getElementTemplateName = getElementTemplateName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTemplateContainer]
  }
  
  extension [Self <: XTemplateContainer](x: Self) {
    
    inline def setElementTemplateName(value: String): Self = StObject.set(x, "ElementTemplateName", value.asInstanceOf[js.Any])
    
    inline def setGetElementTemplateName(value: CallbackTo[String]): Self = StObject.set(x, "getElementTemplateName", value.toJsFn)
  }
}
