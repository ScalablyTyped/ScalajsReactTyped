package typingsJapgolly.ajvDraft04

import typingsJapgolly.ajv.distCompileCodegenCodeMod.Code
import typingsJapgolly.ajv.distCompileCodegenCodeMod.CodeArg
import typingsJapgolly.ajv.distCompileCodegenCodeMod._Code
import typingsJapgolly.ajv.distCompileCodegenMod.CodeGenOptions
import typingsJapgolly.ajv.distCompileCodegenScopeMod.ValueScope
import typingsJapgolly.ajv.distCompileMod.SchemaObjCxt
import typingsJapgolly.ajv.distCoreMod.Options
import typingsJapgolly.ajv.distTypesMod.AddedKeywordDefinition
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ajv-draft-04", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv-draft-04", JSImport.Default)
  @js.native
  open class default () extends Ajv {
    def this(opts: Options) = this()
  }
  
  @JSImport("ajv-draft-04", "CodeGen")
  @js.native
  open class CodeGen protected ()
    extends typingsJapgolly.ajv.distCoreMod.CodeGen {
    def this(extScope: ValueScope) = this()
    def this(extScope: ValueScope, opts: CodeGenOptions) = this()
  }
  
  @JSImport("ajv-draft-04", "KeywordCxt")
  @js.native
  open class KeywordCxt protected ()
    extends typingsJapgolly.ajv.distCoreMod.KeywordCxt {
    def this(it: SchemaObjCxt, `def`: AddedKeywordDefinition, keyword: String) = this()
  }
  
  @JSImport("ajv-draft-04", "Name")
  @js.native
  open class Name protected ()
    extends typingsJapgolly.ajv.distCoreMod.Name {
    def this(s: String) = this()
  }
  
  inline def _underscore(strs: TemplateStringsArray, args: CodeArg*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("_")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  @JSImport("ajv-draft-04", "nil")
  @js.native
  val nil: _Code = js.native
  
  inline def str(strs: TemplateStringsArray, args: (CodeArg | js.Array[String])*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def stringify(x: Any): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(x.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  @js.native
  trait Ajv
    extends typingsJapgolly.ajv.distCoreMod.default
}
