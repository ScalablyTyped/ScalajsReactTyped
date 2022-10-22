package typingsJapgolly.ajv

import typingsJapgolly.ajv.distCompileCodegenCodeMod.Code
import typingsJapgolly.ajv.distCompileCodegenMod.CodeGen
import typingsJapgolly.ajv.distCompileCodegenMod.Name
import typingsJapgolly.ajv.distTypesMod.KeywordErrorCxt
import typingsJapgolly.ajv.distTypesMod.KeywordErrorDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileErrorsMod {
  
  @JSImport("ajv/dist/compile/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendErrors(hasGenKeywordSchemaValueDataErrsCountIt: KeywordErrorCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendErrors")(hasGenKeywordSchemaValueDataErrsCountIt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("ajv/dist/compile/errors", "keyword$DataError")
  @js.native
  val keywordDataError: KeywordErrorDefinition = js.native
  
  @JSImport("ajv/dist/compile/errors", "keywordError")
  @js.native
  val keywordError: KeywordErrorDefinition = js.native
  
  inline def reportError(cxt: KeywordErrorCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reportError(cxt: KeywordErrorCxt, error: Unit, errorPaths: Unit, overrideAllErrors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any], overrideAllErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportError(cxt: KeywordErrorCxt, error: Unit, errorPaths: ErrorPaths): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportError(cxt: KeywordErrorCxt, error: Unit, errorPaths: ErrorPaths, overrideAllErrors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any], overrideAllErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportError(cxt: KeywordErrorCxt, error: KeywordErrorDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportError(cxt: KeywordErrorCxt, error: KeywordErrorDefinition, errorPaths: Unit, overrideAllErrors: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any], overrideAllErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportError(cxt: KeywordErrorCxt, error: KeywordErrorDefinition, errorPaths: ErrorPaths): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportError(
    cxt: KeywordErrorCxt,
    error: KeywordErrorDefinition,
    errorPaths: ErrorPaths,
    overrideAllErrors: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any], overrideAllErrors.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reportExtraError(cxt: KeywordErrorCxt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportExtraError")(cxt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def reportExtraError(cxt: KeywordErrorCxt, error: Unit, errorPaths: ErrorPaths): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportExtraError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportExtraError(cxt: KeywordErrorCxt, error: KeywordErrorDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportExtraError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def reportExtraError(cxt: KeywordErrorCxt, error: KeywordErrorDefinition, errorPaths: ErrorPaths): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportExtraError")(cxt.asInstanceOf[js.Any], error.asInstanceOf[js.Any], errorPaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetErrorsCount(gen: CodeGen, errsCount: Name): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetErrorsCount")(gen.asInstanceOf[js.Any], errsCount.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ErrorPaths extends StObject {
    
    var instancePath: js.UndefOr[Code] = js.undefined
    
    var parentSchema: js.UndefOr[Boolean] = js.undefined
    
    var schemaPath: js.UndefOr[String] = js.undefined
  }
  object ErrorPaths {
    
    inline def apply(): ErrorPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorPaths]
    }
    
    extension [Self <: ErrorPaths](x: Self) {
      
      inline def setInstancePath(value: Code): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
      
      inline def setInstancePathUndefined: Self = StObject.set(x, "instancePath", js.undefined)
      
      inline def setParentSchema(value: Boolean): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
      
      inline def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
      
      inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
    }
  }
}
