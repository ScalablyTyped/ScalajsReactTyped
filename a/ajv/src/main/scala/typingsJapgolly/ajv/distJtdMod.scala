package typingsJapgolly.ajv

import typingsJapgolly.ajv.distCompileCodegenCodeMod.Code
import typingsJapgolly.ajv.distCompileCodegenCodeMod.CodeArg
import typingsJapgolly.ajv.distCompileCodegenCodeMod._Code
import typingsJapgolly.ajv.distCompileCodegenMod.CodeGenOptions
import typingsJapgolly.ajv.distCompileCodegenScopeMod.ValueScope
import typingsJapgolly.ajv.distCompileMod.SchemaObjCxt
import typingsJapgolly.ajv.distCoreMod.CurrentOptions
import typingsJapgolly.ajv.distTypesJtdSchemaMod.JTDSchemaType
import typingsJapgolly.ajv.distTypesMod.AddedKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.JTDParser
import typingsJapgolly.ajv.distTypesMod.SchemaObject
import typingsJapgolly.std.Record
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJtdMod {
  
  @JSImport("ajv/dist/jtd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/jtd", JSImport.Default)
  @js.native
  open class default () extends Ajv {
    def this(opts: JTDOptions) = this()
  }
  
  @JSImport("ajv/dist/jtd", "CodeGen")
  @js.native
  open class CodeGen protected ()
    extends typingsJapgolly.ajv.distCompileCodegenMod.CodeGen {
    def this(extScope: ValueScope) = this()
    def this(extScope: ValueScope, opts: CodeGenOptions) = this()
  }
  
  @JSImport("ajv/dist/jtd", "KeywordCxt")
  @js.native
  open class KeywordCxt protected ()
    extends typingsJapgolly.ajv.distCompileValidateMod.KeywordCxt {
    def this(it: SchemaObjCxt, `def`: AddedKeywordDefinition, keyword: String) = this()
  }
  
  @JSImport("ajv/dist/jtd", "Name")
  @js.native
  open class Name protected ()
    extends typingsJapgolly.ajv.distCompileCodegenCodeMod.Name {
    def this(s: String) = this()
  }
  
  inline def _underscore(strs: TemplateStringsArray, args: CodeArg*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("_")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  @JSImport("ajv/dist/jtd", "nil")
  @js.native
  val nil: _Code = js.native
  
  inline def str(strs: TemplateStringsArray, args: (CodeArg | js.Array[String])*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def stringify(x: Any): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(x.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  @js.native
  trait Ajv
    extends typingsJapgolly.ajv.distCoreMod.default {
    
    /* private */ var _compileParser: Any = js.native
    
    /* private */ var _compileSerializer: Any = js.native
    
    def compileParser[T](schema: JTDSchemaType[T, Record[String, scala.Nothing]]): JTDParser[T] = js.native
    def compileParser[T](schema: SchemaObject): JTDParser[T] = js.native
    
    def compileSerializer[T](schema: JTDSchemaType[T, Record[String, scala.Nothing]]): js.Function1[/* data */ T, String] = js.native
    def compileSerializer[T](schema: SchemaObject): js.Function1[/* data */ T, String] = js.native
  }
  
  trait JTDOptions
    extends StObject
       with CurrentOptions {
    
    @JSName("$comment")
    var $comment_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("$data")
    var $data_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("allowMatchingProperties")
    var allowMatchingProperties_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("allowUnionTypes")
    var allowUnionTypes_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("coerceTypes")
    var coerceTypes_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("defaultMeta")
    var defaultMeta_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("dynamicRef")
    var dynamicRef_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("formats")
    var formats_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("inlineRefs")
    var inlineRefs_JTDOptions: js.UndefOr[Boolean] = js.undefined
    
    @JSName("loadSchema")
    var loadSchema_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("loopRequired")
    var loopRequired_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("meta")
    var meta_JTDOptions: js.UndefOr[Boolean] = js.undefined
    
    @JSName("multipleOfPrecision")
    var multipleOfPrecision_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("next")
    var next_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("strict")
    var strict_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("unevaluated")
    var unevaluated_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("useDefaults")
    var useDefaults_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
    
    @JSName("validateFormats")
    var validateFormats_JTDOptions: js.UndefOr[scala.Nothing] = js.undefined
  }
  object JTDOptions {
    
    inline def apply(): JTDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JTDOptions]
    }
    
    extension [Self <: JTDOptions](x: Self) {
      
      inline def setInlineRefs(value: Boolean): Self = StObject.set(x, "inlineRefs", value.asInstanceOf[js.Any])
      
      inline def setInlineRefsUndefined: Self = StObject.set(x, "inlineRefs", js.undefined)
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
}
