package typingsJapgolly.expressValidator

import typingsJapgolly.expressValidator.srcContextMod.Optional
import typingsJapgolly.expressValidator.srcMiddlewaresSchemaMod.SanitizerSchemaOptions
import typingsJapgolly.expressValidator.srcMiddlewaresSchemaMod.ValidatorSchemaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressValidatorBooleans {
  
  @js.native
  sealed trait `false`
    extends StObject
       with Optional
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with SanitizerSchemaOptions[Any]
       with ValidatorSchemaOptions[Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
