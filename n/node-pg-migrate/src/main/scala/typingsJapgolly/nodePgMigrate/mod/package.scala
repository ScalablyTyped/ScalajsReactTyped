package typingsJapgolly.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddOptions = typingsJapgolly.nodePgMigrate.mod.IfNotExistsOption
  type ColumnDefinitions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.nodePgMigrate.mod.ColumnDefinition | java.lang.String]
  type CreatePolicyOptions = typingsJapgolly.nodePgMigrate.mod.CreatePolicyOptionsEn with typingsJapgolly.nodePgMigrate.mod.PolicyOptions
  type DomainOptionsAlter = typingsJapgolly.nodePgMigrate.mod.DomainOptionsAlterEn with typingsJapgolly.nodePgMigrate.mod.DomainOptions
  type DomainOptionsCreate = typingsJapgolly.nodePgMigrate.mod.DomainOptionsCreateEn with typingsJapgolly.nodePgMigrate.mod.DomainOptions
  type DropIndexOptions = typingsJapgolly.nodePgMigrate.mod.DropIndexOptionsEn with typingsJapgolly.nodePgMigrate.mod.DropOptions
  type DropOptions = typingsJapgolly.nodePgMigrate.mod.IfExistsOption with typingsJapgolly.nodePgMigrate.mod.CascadeOption
  type FunctionParam = java.lang.String | typingsJapgolly.nodePgMigrate.mod.FunctionParamType
  type LiteralUnion[T /* <: U */, U] = T | (U with js.Object)
  type Name = java.lang.String | typingsJapgolly.nodePgMigrate.AnonName
  type RunnerOption = typingsJapgolly.nodePgMigrate.mod.RunnerOptionConfig with (typingsJapgolly.nodePgMigrate.mod.RunnerOptionClient | typingsJapgolly.nodePgMigrate.mod.RunnerOptionUrl)
  type SequenceOptionsAlter = typingsJapgolly.nodePgMigrate.mod.SequenceOptionsAlterEn with typingsJapgolly.nodePgMigrate.mod.SequenceOptions
  type SequenceOptionsCreate = typingsJapgolly.nodePgMigrate.mod.SequenceOptionsCreateEn with typingsJapgolly.nodePgMigrate.mod.SequenceOptions
  type Type = java.lang.String | typingsJapgolly.nodePgMigrate.AnonType
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typingsJapgolly.nodePgMigrate.mod.PgLiteral
    - typingsJapgolly.nodePgMigrate.mod.ValueArray
  */
  type Value = typingsJapgolly.nodePgMigrate.mod._Value | scala.Null | scala.Boolean | java.lang.String | scala.Double
}
