package typingsJapgolly.ajv

import typingsJapgolly.ajv.distCompileCodegenMod.Name
import typingsJapgolly.ajv.distCompileMod.SchemaCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileValidateBoolSchemaMod {
  
  @JSImport("ajv/dist/compile/validate/boolSchema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def boolOrEmptySchema(it: SchemaCxt, valid: Name): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boolOrEmptySchema")(it.asInstanceOf[js.Any], valid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def topBoolOrEmptySchema(it: SchemaCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("topBoolOrEmptySchema")(it.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
