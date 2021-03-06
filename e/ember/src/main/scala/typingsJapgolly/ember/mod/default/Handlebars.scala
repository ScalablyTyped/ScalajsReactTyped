package typingsJapgolly.ember.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Handlebars")
@js.native
object Handlebars extends js.Object {
  @js.native
  class Compiler ()
    extends typingsJapgolly.ember.mod.Ember.Handlebars.Compiler
  
  @js.native
  class JavaScriptCompiler ()
    extends typingsJapgolly.ember.mod.Ember.Handlebars.JavaScriptCompiler
  
  @js.native
  class SafeString ()
    extends typingsJapgolly.emberTemplate.handlebarsMod.SafeString
  
  def Exception(message: java.lang.String): Unit = js.native
  def K(): js.Any = js.native
  def compile(environment: js.Any): js.Any = js.native
  def compile(environment: js.Any, options: js.Any): js.Any = js.native
  def compile(environment: js.Any, options: js.Any, context: js.Any): js.Any = js.native
  def compile(environment: js.Any, options: js.Any, context: js.Any, asObject: js.Any): js.Any = js.native
  def compile(string: java.lang.String): js.Function1[/* repeated */ js.Any, _] = js.native
  def createFrame(objec: js.Any): js.Any = js.native
  def log(level: java.lang.String, str: java.lang.String): Unit = js.native
  def parse(string: java.lang.String): js.Any = js.native
  def precompile(string: java.lang.String, options: js.Any): Unit = js.native
  def print(ast: js.Any): Unit = js.native
  def registerHelper(name: java.lang.String, helper: js.Any): Unit = js.native
  def registerPartial(name: java.lang.String, str: js.Any): Unit = js.native
  @js.native
  object logger extends js.Object {
    /**
      * If the value passed into `Ember.Logger.assert` is not truthy it will throw an error with a stack trace.
      */
    def assert(test: Boolean): Unit = js.native
    def assert(test: Boolean, message: java.lang.String): Unit = js.native
    /**
      * Logs the arguments to the console in blue text.
      */
    def debug(args: js.Any*): Unit = js.native
    /**
      * Prints the arguments to the console with an error icon, red text and a stack trace.
      */
    def error(args: js.Any*): Unit = js.native
    /**
      * Logs the arguments to the console.
      */
    def info(args: js.Any*): Unit = js.native
    /**
      * Logs the arguments to the console.
      */
    def log(args: js.Any*): Unit = js.native
    /**
      * Prints the arguments to the console with a warning icon.
      */
    def warn(args: js.Any*): Unit = js.native
  }
  
}

