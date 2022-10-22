package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the fully qualified name of the object within a hierarchy.
  *
  * The name is generally globally unique in the hierarchy.
  * @see com.sun.star.container.XHierarchicalNameAccess
  * @see com.sun.star.container.XNamed
  */
trait XHierarchicalName
  extends StObject
     with XInterface {
  
  /** @returns the fully qualified hierarchical name of the object. */
  val HierarchicalName: String
  
  /**
    * builds the hierarchical name of an object, given a relative name
    *
    * Can be used to find the name of a descendant object in the hierarchy without actually accessing it.
    * @see XHierarchicalNameAccess.hasByHierarchicalName
    */
  def composeHierarchicalName(aRelativeName: String): String
  
  /** @returns the fully qualified hierarchical name of the object. */
  def getHierarchicalName(): String
}
object XHierarchicalName {
  
  inline def apply(
    HierarchicalName: String,
    acquire: Callback,
    composeHierarchicalName: String => String,
    getHierarchicalName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XHierarchicalName = {
    val __obj = js.Dynamic.literal(HierarchicalName = HierarchicalName.asInstanceOf[js.Any], acquire = acquire.toJsFn, composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), getHierarchicalName = getHierarchicalName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHierarchicalName]
  }
  
  extension [Self <: XHierarchicalName](x: Self) {
    
    inline def setComposeHierarchicalName(value: String => String): Self = StObject.set(x, "composeHierarchicalName", js.Any.fromFunction1(value))
    
    inline def setGetHierarchicalName(value: CallbackTo[String]): Self = StObject.set(x, "getHierarchicalName", value.toJsFn)
    
    inline def setHierarchicalName(value: String): Self = StObject.set(x, "HierarchicalName", value.asInstanceOf[js.Any])
  }
}
