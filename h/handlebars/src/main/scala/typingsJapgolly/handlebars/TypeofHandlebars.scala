package typingsJapgolly.handlebars

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.handlebars.Handlebars.HelperDeclareSpec
import typingsJapgolly.handlebars.Handlebars.HelperDelegate
import typingsJapgolly.handlebars.Handlebars.ParseOptions
import typingsJapgolly.handlebars.Handlebars.Template_
import typingsJapgolly.handlebars.hbs.AST.Node
import typingsJapgolly.handlebars.hbs.AST.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHandlebars extends js.Object {
  val AST: TypeofAST = js.native
  var Exception: Instantiable2[
    /* message */ String, 
    js.UndefOr[/* node */ Node], 
    typingsJapgolly.handlebars.Handlebars.Exception
  ] = js.native
  var SafeString: Instantiable1[/* str */ String, typingsJapgolly.handlebars.Handlebars.SafeString] = js.native
  val Utils: TypeofUtils = js.native
  val VERSION: String = js.native
  val VM: TypeofVM = js.native
  var Visitor: Instantiable0[typingsJapgolly.handlebars.Handlebars.Visitor] = js.native
  val decorators: StringDictionary[js.Function] = js.native
  val helpers: StringDictionary[HelperDelegate] = js.native
  val logger: Logger = js.native
  val partials: StringDictionary[js.Any] = js.native
  val templates: HandlebarsTemplates = js.native
  def K(): Unit = js.native
  def blockParams(obj: js.Array[_], ids: js.Array[_]): js.Array[_] = js.native
  def compile[T](input: js.Any): HandlebarsTemplateDelegate[T] = js.native
  def compile[T](input: js.Any, options: CompileOptions): HandlebarsTemplateDelegate[T] = js.native
  def create(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Handlebars */ js.Any = js.native
  def createFrame(`object`: js.Any): js.Any = js.native
  def log(level: Double, obj: js.Any): Unit = js.native
  def noConflict(): /* import warning: importer.ImportType#apply Failed type conversion: typeof Handlebars */ js.Any = js.native
  def parse(input: String): Program = js.native
  def parse(input: String, options: ParseOptions): Program = js.native
  def parseWithoutProcessing(input: String): Program = js.native
  def parseWithoutProcessing(input: String, options: ParseOptions): Program = js.native
  def precompile(input: js.Any): TemplateSpecification = js.native
  def precompile(input: js.Any, options: PrecompileOptions): TemplateSpecification = js.native
  def registerDecorator(name: String, fn: js.Function): Unit = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
  def registerPartial(name: String, fn: Template_[_]): Unit = js.native
  def registerPartial(spec: StringDictionary[HandlebarsTemplateDelegate[_]]): Unit = js.native
  def template[T](precompilation: TemplateSpecification): HandlebarsTemplateDelegate[T] = js.native
  def unregisterDecorator(name: String): Unit = js.native
  def unregisterHelper(name: String): Unit = js.native
  def unregisterPartial(name: String): Unit = js.native
}

