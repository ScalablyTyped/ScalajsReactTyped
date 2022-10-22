package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonPointer
import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonSchemaVisitor
import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.JsonVisitor
import typingsJapgolly.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typingsJapgolly.angularDevkitCore.srcJsonSchemaVisitorMod.ReferenceResolver
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofschema extends StObject {
  
  var CoreSchemaRegistry: TypeofCoreSchemaRegistry = js.native
  
  var SchemaValidationException: TypeofSchemaValidationExc = js.native
  
  def buildJsonPointer(fragments: js.Array[String]): JsonPointer = js.native
  
  def getTypesOfSchema(schema: JsonSchema): Set[String] = js.native
  
  def isJsonSchema(value: Any): /* is @angular-devkit/core.@angular-devkit/core/src/json/schema/schema.JsonSchema */ Boolean = js.native
  
  def joinJsonPointer(root: JsonPointer, others: String*): JsonPointer = js.native
  
  def mergeSchemas(schemas: js.UndefOr[JsonSchema]*): JsonSchema = js.native
  
  def parseJsonPointer(pointer: JsonPointer): js.Array[String] = js.native
  
  val transforms: Typeoftransforms = js.native
  
  def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor): Observable_[JsonValue] = js.native
  def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: Unit, refResolver: Unit, context: ContextT): Observable_[JsonValue] = js.native
  def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: Unit, refResolver: ReferenceResolver[ContextT]): Observable_[JsonValue] = js.native
  def visitJson[ContextT](
    json: JsonValue,
    visitor: JsonVisitor,
    schema: Unit,
    refResolver: ReferenceResolver[ContextT],
    context: ContextT
  ): Observable_[JsonValue] = js.native
  def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: JsonSchema): Observable_[JsonValue] = js.native
  def visitJson[ContextT](json: JsonValue, visitor: JsonVisitor, schema: JsonSchema, refResolver: Unit, context: ContextT): Observable_[JsonValue] = js.native
  def visitJson[ContextT](
    json: JsonValue,
    visitor: JsonVisitor,
    schema: JsonSchema,
    refResolver: ReferenceResolver[ContextT]
  ): Observable_[JsonValue] = js.native
  def visitJson[ContextT](
    json: JsonValue,
    visitor: JsonVisitor,
    schema: JsonSchema,
    refResolver: ReferenceResolver[ContextT],
    context: ContextT
  ): Observable_[JsonValue] = js.native
  
  def visitJsonSchema(schema: JsonSchema, visitor: JsonSchemaVisitor): Unit = js.native
}
