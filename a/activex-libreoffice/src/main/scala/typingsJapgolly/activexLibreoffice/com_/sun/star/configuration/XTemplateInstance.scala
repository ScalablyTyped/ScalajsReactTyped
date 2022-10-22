package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by objects that are instances of a named template to provide information about the template.
  *
  * Template names are similar to service names, but apply to structure and content, rather than to type.
  *
  * Often a template description can be retrieved from a repository and then be interpreted by a factory object. Templates provide a means to build new
  * kinds of objects dynamically.
  * @see XTemplateContainer
  */
trait XTemplateInstance
  extends StObject
     with XInterface {
  
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  val TemplateName: String
  
  /**
    * retrieves the name of the template
    * @returns the name of the template this object was built from or conforms to.
    */
  def getTemplateName(): String
}
object XTemplateInstance {
  
  inline def apply(
    TemplateName: String,
    acquire: Callback,
    getTemplateName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XTemplateInstance = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTemplateName = getTemplateName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTemplateInstance]
  }
  
  extension [Self <: XTemplateInstance](x: Self) {
    
    inline def setGetTemplateName(value: CallbackTo[String]): Self = StObject.set(x, "getTemplateName", value.toJsFn)
    
    inline def setTemplateName(value: String): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
