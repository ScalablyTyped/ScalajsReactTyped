package typingsJapgolly.joi.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInternals extends StObject {
  
  /**
    * Adds a rule to current validation schema.
    */
  @JSName("$_addRule")
  def $_addRule(rule: String): Schema[Any] = js.native
  @JSName("$_addRule")
  def $_addRule(rule: AddRuleOptions): Schema[Any] = js.native
  
  /**
    * Internally compiles schema.
    */
  @JSName("$_compile")
  def $_compile(schema: SchemaLike): Schema[Any] = js.native
  @JSName("$_compile")
  def $_compile(schema: SchemaLike, options: CompileOptions): Schema[Any] = js.native
  
  /**
    * Creates a joi error object.
    */
  @JSName("$_createError")
  def $_createError(code: String, value: Any, context: Context, state: State, prefs: ValidationOptions): Err = js.native
  @JSName("$_createError")
  def $_createError(
    code: String,
    value: Any,
    context: Context,
    state: State,
    prefs: ValidationOptions,
    options: CreateErrorOptions
  ): Err = js.native
  
  /**
    * Get value from given flag.
    */
  @JSName("$_getFlag")
  def $_getFlag(name: String): Any = js.native
  
  /**
    * Retrieve some rule configuration.
    */
  @JSName("$_getRule")
  def $_getRule(name: String): js.UndefOr[GetRuleOptions] = js.native
  
  @JSName("$_mapLabels")
  def $_mapLabels(path: String): String = js.native
  @JSName("$_mapLabels")
  def $_mapLabels(path: js.Array[String]): String = js.native
  
  /**
    * Returns true if validations runs fine on given value.
    */
  @JSName("$_match")
  def $_match(value: Any, state: State, prefs: ValidationOptions): Boolean = js.native
  
  @JSName("$_modify")
  def $_modify(): Schema[Any] = js.native
  @JSName("$_modify")
  def $_modify(options: ModifyOptions): Schema[Any] = js.native
  
  /**
    * Resets current schema.
    */
  @JSName("$_mutateRebuild")
  def $_mutateRebuild(): this.type = js.native
  
  @JSName("$_mutateRegister")
  def $_mutateRegister(schema: Schema[Any]): Unit = js.native
  @JSName("$_mutateRegister")
  def $_mutateRegister(schema: Schema[Any], options: MutateRegisterOptions): Unit = js.native
  
  /**
    * Get value from given property.
    */
  @JSName("$_property")
  def $_property(name: String): Any = js.native
  
  /**
    * Get schema at given path.
    */
  @JSName("$_reach")
  def $_reach(path: js.Array[String]): Schema[Any] = js.native
  
  /**
    * Get current schema root references.
    */
  @JSName("$_rootReferences")
  def $_rootReferences(): Any = js.native
  
  /**
    * Set flag to given value.
    */
  @JSName("$_setFlag")
  def $_setFlag(flag: String, value: Any): Unit = js.native
  @JSName("$_setFlag")
  def $_setFlag(flag: String, value: Any, options: SetFlagOptions): Unit = js.native
  
  /**
    * Parent schema object.
    */
  @JSName("$_super")
  var $_super: Schema[Any] = js.native
  
  /**
    * Terms of current schema.
    */
  @JSName("$_terms")
  var $_terms: Record[String, Any] = js.native
  
  /**
    * Runs internal validations against given value.
    */
  @JSName("$_validate")
  def $_validate(value: Any, state: State, prefs: ValidationOptions): ValidationResult[Any] = js.native
}
