package typingsJapgolly.ajv.distTypesMod

import typingsJapgolly.ajv.ajvBooleans.`true`
import typingsJapgolly.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.ajv.distTypesMod.AnyValidateFunction because Already inherited */ @js.native
trait AsyncValidateFunction[T]
  extends StObject
     with ValidateFunction[T] {
  
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<ValidateFunction<T>> is not an array type */ args: Parameters[ValidateFunction[T]]
  ): js.Promise[T] = js.native
  
  @JSName("$async")
  var $async: `true` = js.native
}
