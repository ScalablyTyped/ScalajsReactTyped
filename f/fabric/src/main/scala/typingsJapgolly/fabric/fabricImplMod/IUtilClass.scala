package typingsJapgolly.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUtilClass extends StObject {
  
  /**
    * Helper for creation of "classes".
    * @param [properties] Properties shared by all instances of this class
    *                  (be careful modifying objects defined here as this would affect all instances)
    */
  def createClass(): Any = js.native
  /**
    * Helper for creation of "classes".
    * @param [parent] optional "Class" to inherit from
    * @param [properties] Properties shared by all instances of this class
    *                  (be careful modifying objects defined here as this would affect all instances)
    */
  def createClass(parent: js.Function): Any = js.native
  def createClass(parent: js.Function, properties: Any): Any = js.native
  def createClass(properties: Any): Any = js.native
}
