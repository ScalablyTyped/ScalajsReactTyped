package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a collection of forms. */
trait XFormsSupplier
  extends StObject
     with XInterface {
  
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  val Forms: XNameContainer
  
  /**
    * accesses the forms.
    *
    * {{program example here, see documentation}}
    * @returns the container of all the top-level forms belonging to the component.
    */
  def getForms(): XNameContainer
}
object XFormsSupplier {
  
  inline def apply(
    Forms: XNameContainer,
    acquire: Callback,
    getForms: CallbackTo[XNameContainer],
    queryInterface: `type` => Any,
    release: Callback
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(Forms = Forms.asInstanceOf[js.Any], acquire = acquire.toJsFn, getForms = getForms.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFormsSupplier]
  }
  
  extension [Self <: XFormsSupplier](x: Self) {
    
    inline def setForms(value: XNameContainer): Self = StObject.set(x, "Forms", value.asInstanceOf[js.Any])
    
    inline def setGetForms(value: CallbackTo[XNameContainer]): Self = StObject.set(x, "getForms", value.toJsFn)
  }
}
