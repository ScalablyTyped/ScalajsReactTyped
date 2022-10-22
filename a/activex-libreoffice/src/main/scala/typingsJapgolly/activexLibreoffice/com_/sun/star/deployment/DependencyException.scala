package typingsJapgolly.activexLibreoffice.com_.sun.star.deployment

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.XElement
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes unsatisfied dependencies a deployment unit has on its target environment.
  *
  * This exception is intended to be used with an {@link com.sun.star.task.XInteractionHandler} .
  * @since OOo 2.0.4
  */
trait DependencyException
  extends StObject
     with Exception {
  
  /**
    * a sequence of dependencies represented by XML elements.
    *
    * The exact nature of those XML elements is deliberately left open, so that new kinds of dependencies can be defined in the future. OOo   2.0.4 does not
    * define any kinds of dependencies. Each such XML element should have an attribute whose global name consists of the namespace name
    * `http://openoffice.org/extensions/description/2006` and the local part `name` and whose value is a human-readable (English) description of the
    * dependency. If an instance of OOo does not know more about a specific kind of dependency, it should display the value of that attribute to the user.
    *
    * The sequence must not be empty, and none of the elements may be `NULL` .
    */
  var UnsatisfiedDependencies: SafeArray[XElement]
}
object DependencyException {
  
  inline def apply(Context: XInterface, Message: String, UnsatisfiedDependencies: SafeArray[XElement]): DependencyException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], UnsatisfiedDependencies = UnsatisfiedDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyException]
  }
  
  extension [Self <: DependencyException](x: Self) {
    
    inline def setUnsatisfiedDependencies(value: SafeArray[XElement]): Self = StObject.set(x, "UnsatisfiedDependencies", value.asInstanceOf[js.Any])
  }
}
