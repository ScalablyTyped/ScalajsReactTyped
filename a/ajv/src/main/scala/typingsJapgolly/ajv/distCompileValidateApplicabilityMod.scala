package typingsJapgolly.ajv

import typingsJapgolly.ajv.distCompileMod.SchemaObjCxt
import typingsJapgolly.ajv.distCompileRulesMod.JSONType
import typingsJapgolly.ajv.distCompileRulesMod.Rule
import typingsJapgolly.ajv.distCompileRulesMod.RuleGroup
import typingsJapgolly.ajv.distTypesMod.AnySchemaObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileValidateApplicabilityMod {
  
  @JSImport("ajv/dist/compile/validate/applicability", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def schemaHasRulesForType(hasSchemaSelf: SchemaObjCxt, `type`: JSONType): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("schemaHasRulesForType")(hasSchemaSelf.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def shouldUseGroup(schema: AnySchemaObject, group: RuleGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseGroup")(schema.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shouldUseRule(schema: AnySchemaObject, rule: Rule): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseRule")(schema.asInstanceOf[js.Any], rule.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
}
