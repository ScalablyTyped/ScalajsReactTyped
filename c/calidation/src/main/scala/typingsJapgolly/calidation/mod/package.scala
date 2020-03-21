package typingsJapgolly.calidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlacklistValidator = typingsJapgolly.calidation.mod.BlacklistValidatorConfig | (js.Function1[
    /* context */ typingsJapgolly.calidation.mod.ValidatorContext, 
    typingsJapgolly.calidation.mod.BlacklistValidatorConfig
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Dirty = typingsJapgolly.calidation.mod.Dictionary[scala.Boolean]
  type Errors = typingsJapgolly.calidation.mod.Dictionary[java.lang.String | scala.Null]
  type Fields = typingsJapgolly.calidation.mod.Dictionary[js.Any]
  type FieldsConfig = typingsJapgolly.calidation.mod.Dictionary[typingsJapgolly.calidation.mod.FieldConfig]
  type LengthValidator = typingsJapgolly.calidation.mod.LengthValidatorConfig | (js.Function1[
    /* context */ typingsJapgolly.calidation.mod.ValidatorContext, 
    typingsJapgolly.calidation.mod.LengthValidatorConfig
  ])
  type RegexValidator = typingsJapgolly.calidation.mod.RegexValidatorConfig | (js.Function1[
    /* context */ typingsJapgolly.calidation.mod.ValidatorContext, 
    typingsJapgolly.calidation.mod.RegexValidatorConfig
  ])
  type SimpleValidator = java.lang.String | typingsJapgolly.calidation.mod.SimpleValidatorConfig | (js.Function1[
    /* context */ typingsJapgolly.calidation.mod.ValidatorContext, 
    typingsJapgolly.calidation.mod.SimpleValidatorConfig
  ])
  type Transforms = typingsJapgolly.calidation.mod.Dictionary[js.Function1[/* value */ js.Any, js.Any]]
  type Validator = typingsJapgolly.calidation.mod.SimpleValidator | typingsJapgolly.calidation.mod.BlacklistValidator | typingsJapgolly.calidation.mod.ValueValidator[js.Any] | typingsJapgolly.calidation.mod.RegexValidator | typingsJapgolly.calidation.mod.WhitelistValidator | typingsJapgolly.calidation.mod.LengthValidator
  type ValueValidator[T] = typingsJapgolly.calidation.mod.ValueValidatorConfig[T] | (js.Function1[
    /* context */ typingsJapgolly.calidation.mod.ValidatorContext, 
    typingsJapgolly.calidation.mod.ValueValidatorConfig[T]
  ])
  type WhitelistValidator = typingsJapgolly.calidation.mod.WhitelistValidatorConfig | (js.Function1[
    /* context */ typingsJapgolly.calidation.mod.ValidatorContext, 
    typingsJapgolly.calidation.mod.RegexValidatorConfig
  ])
}
