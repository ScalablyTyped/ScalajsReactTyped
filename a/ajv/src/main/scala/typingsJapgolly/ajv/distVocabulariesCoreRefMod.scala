package typingsJapgolly.ajv

import typingsJapgolly.ajv.distCompileCodegenCodeMod.Code
import typingsJapgolly.ajv.distCompileMod.SchemaEnv
import typingsJapgolly.ajv.distCompileValidateMod.KeywordCxt
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesCoreRefMod {
  
  @JSImport("ajv/dist/vocabularies/core/ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/core/ref", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def callRef(cxt: KeywordCxt, v: Code): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callRef")(cxt.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def callRef(cxt: KeywordCxt, v: Code, sch: Unit, $async: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callRef")(cxt.asInstanceOf[js.Any], v.asInstanceOf[js.Any], sch.asInstanceOf[js.Any], $async.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def callRef(cxt: KeywordCxt, v: Code, sch: SchemaEnv): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callRef")(cxt.asInstanceOf[js.Any], v.asInstanceOf[js.Any], sch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def callRef(cxt: KeywordCxt, v: Code, sch: SchemaEnv, $async: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callRef")(cxt.asInstanceOf[js.Any], v.asInstanceOf[js.Any], sch.asInstanceOf[js.Any], $async.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getValidate(cxt: KeywordCxt, sch: SchemaEnv): Code = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidate")(cxt.asInstanceOf[js.Any], sch.asInstanceOf[js.Any])).asInstanceOf[Code]
}
