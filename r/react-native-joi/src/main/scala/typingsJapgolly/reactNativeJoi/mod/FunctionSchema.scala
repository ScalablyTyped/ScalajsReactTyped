package typingsJapgolly.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.reactNativeJoi.mod._SchemaLike because Already inherited
- typingsJapgolly.reactNativeJoi.mod._Schema because Already inherited */ @js.native
trait FunctionSchema
  extends StObject
     with AnySchema {
  
  /**
    * Specifies the arity of the function where:
    * @param n - the arity expected.
    */
  def arity(n: Double): this.type = js.native
  
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def maxArity(n: Double): this.type = js.native
  
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def minArity(n: Double): this.type = js.native
  
  /**
    * Requires the function to be a Joi reference.
    */
  def ref(): this.type = js.native
}
