package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a user interface element factory that can create and initialize user interface elements.
  *
  * User interface element factories must be registered at a {@link UIElementFactoryManager} service to provide access to itself.
  *
  * Currently the following user interface element types are defined: **menubar** A configurable user interface element.**popupmenu** A configurable user
  * interface element.**toolbar** A configurable user interface element.**statusbar** A configurable user interface element.**floater** A basic user
  * interface element.
  * @since OOo 2.0
  */
trait XUIElementFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a new instances of a specific user interface element.
    * @param ResourceURL specifies which unique user interface element should be created by the factory. A resource URL must meet the following syntax: "priva
    * @param Args The following arguments are supported: **Frame**;  specifies the {@link com.sun.star.frame.XFrame} instance to which the user interface elem
    * @see ConfigurableUIElement
    * @see UIElement
    */
  def createUIElement(ResourceURL: String, Args: SeqEquiv[PropertyValue]): XUIElement
}
object XUIElementFactory {
  
  inline def apply(
    acquire: Callback,
    createUIElement: (String, SeqEquiv[PropertyValue]) => XUIElement,
    queryInterface: `type` => Any,
    release: Callback
  ): XUIElementFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createUIElement = js.Any.fromFunction2(createUIElement), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XUIElementFactory]
  }
  
  extension [Self <: XUIElementFactory](x: Self) {
    
    inline def setCreateUIElement(value: (String, SeqEquiv[PropertyValue]) => XUIElement): Self = StObject.set(x, "createUIElement", js.Any.fromFunction2(value))
  }
}
