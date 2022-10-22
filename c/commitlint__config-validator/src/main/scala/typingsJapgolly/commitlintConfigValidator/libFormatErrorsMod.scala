package typingsJapgolly.commitlintConfigValidator

import typingsJapgolly.ajv.distTypesMod.ErrorObject
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatErrorsMod {
  
  @JSImport("@commitlint/config-validator/lib/formatErrors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatErrors(errors: js.Array[ErrorObject[String, Record[String, Any], Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatErrors")(errors.asInstanceOf[js.Any]).asInstanceOf[String]
}
