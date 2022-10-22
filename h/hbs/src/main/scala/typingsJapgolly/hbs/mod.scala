package typingsJapgolly.hbs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.handlebars.CompileOptions
import typingsJapgolly.handlebars.Handlebars.HelperDeclareSpec
import typingsJapgolly.handlebars.Handlebars.HelperDelegate
import typingsJapgolly.handlebars.Handlebars.ParseOptions
import typingsJapgolly.handlebars.Handlebars.Template
import typingsJapgolly.handlebars.HandlebarsTemplateDelegate
import typingsJapgolly.handlebars.HandlebarsTemplates
import typingsJapgolly.handlebars.Logger
import typingsJapgolly.handlebars.PrecompileOptions
import typingsJapgolly.handlebars.TemplateSpecification
import typingsJapgolly.handlebars.anon.TypeofHandlebars
import typingsJapgolly.handlebars.hbs.AST.Program
import typingsJapgolly.hbs.anon.TypeofAST
import typingsJapgolly.hbs.anon.TypeofUtils
import typingsJapgolly.hbs.anon.TypeofVM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hbs", JSImport.Namespace)
  @js.native
  val ^ : hbsModuleWithCreate = js.native
  
  type _To = hbsModuleWithCreate
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: hbsModuleWithCreate = ^
  
  @js.native
  trait handlebarsModule extends StObject {
    
    val AST: TypeofAST = js.native
    
    var Exception: Instantiable1[/* message */ String, typingsJapgolly.handlebars.mod.Exception] = js.native
    
    def K(): Unit = js.native
    
    var SafeString: Instantiable1[/* str */ String, typingsJapgolly.handlebars.mod.SafeString] = js.native
    
    val Utils: TypeofUtils = js.native
    
    val VERSION: String = js.native
    
    val VM: TypeofVM = js.native
    
    var Visitor: Instantiable0[typingsJapgolly.handlebars.mod.Visitor] = js.native
    
    def blockParams(obj: js.Array[Any], ids: js.Array[Any]): js.Array[Any] = js.native
    
    def compile[T](input: Any): HandlebarsTemplateDelegate[T] = js.native
    def compile[T](input: Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
    
    def create(): TypeofHandlebars = js.native
    
    def createFrame(`object`: Any): Any = js.native
    
    val decorators: Any = js.native
    
    def escapeExpression(str: String): String = js.native
    
    val helpers: Any = js.native
    
    def log(level: Double, obj: Any): Unit = js.native
    
    val logger: Logger = js.native
    
    def noConflict(): TypeofHandlebars = js.native
    
    def parse(input: String): Program = js.native
    def parse(input: String, options: ParseOptions): Program = js.native
    
    def parseWithoutProcessing(input: String): Program = js.native
    def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
    
    val partials: Any = js.native
    
    def precompile(input: Any): TemplateSpecification = js.native
    def precompile(input: Any, options: PrecompileOptions): TemplateSpecification = js.native
    
    def registerDecorator(name: String, fn: js.Function): Unit = js.native
    
    def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
    def registerHelper(name: HelperDeclareSpec): Unit = js.native
    
    def registerPartial(name: String, fn: Template[Any]): Unit = js.native
    def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[Any]]): Unit = js.native
    
    def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
    
    val templates: HandlebarsTemplates = js.native
    
    def unregisterDecorator(name: String): Unit = js.native
    
    def unregisterHelper(name: String): Unit = js.native
    
    def unregisterPartial(name: String): Unit = js.native
  }
  
  @js.native
  trait hbsModule extends StObject {
    
    def __express(filename: String, options: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    val handlebars: handlebarsModule = js.native
    
    def localsAsTemplateData(app: Any): Unit = js.native
    
    def registerHelper(helperName: String, helperFunction: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    def registerPartial(partialName: String, partialValue: String): Unit = js.native
    
    def registerPartials(directoryName: String): Unit = js.native
    def registerPartials(directoryName: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait hbsModuleWithCreate
    extends StObject
       with hbsModule {
    
    def create(): hbsModule = js.native
    def create(handlebars: handlebarsModule): hbsModule = js.native
  }
}
