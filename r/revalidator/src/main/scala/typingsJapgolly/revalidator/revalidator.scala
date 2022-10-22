package typingsJapgolly.revalidator

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.revalidator.revalidatorStrings.`object`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Revalidator {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.revalidator.revalidatorStrings.url
    - typingsJapgolly.revalidator.revalidatorStrings.email
    - typingsJapgolly.revalidator.revalidatorStrings.`ip-address`
    - typingsJapgolly.revalidator.revalidatorStrings.ipv6
    - typingsJapgolly.revalidator.revalidatorStrings.`date-time`
    - typingsJapgolly.revalidator.revalidatorStrings.date
    - typingsJapgolly.revalidator.revalidatorStrings.time
    - typingsJapgolly.revalidator.revalidatorStrings.color
    - typingsJapgolly.revalidator.revalidatorStrings.`host-name`
    - typingsJapgolly.revalidator.revalidatorStrings.`utc-millisec`
    - typingsJapgolly.revalidator.revalidatorStrings.regex
  */
  trait Formats extends StObject
  object Formats {
    
    inline def color: typingsJapgolly.revalidator.revalidatorStrings.color = "color".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.color]
    
    inline def date: typingsJapgolly.revalidator.revalidatorStrings.date = "date".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.date]
    
    inline def `date-time`: typingsJapgolly.revalidator.revalidatorStrings.`date-time` = "date-time".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.`date-time`]
    
    inline def email: typingsJapgolly.revalidator.revalidatorStrings.email = "email".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.email]
    
    inline def `host-name`: typingsJapgolly.revalidator.revalidatorStrings.`host-name` = "host-name".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.`host-name`]
    
    inline def `ip-address`: typingsJapgolly.revalidator.revalidatorStrings.`ip-address` = "ip-address".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.`ip-address`]
    
    inline def ipv6: typingsJapgolly.revalidator.revalidatorStrings.ipv6 = "ipv6".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.ipv6]
    
    inline def regex: typingsJapgolly.revalidator.revalidatorStrings.regex = "regex".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.regex]
    
    inline def time: typingsJapgolly.revalidator.revalidatorStrings.time = "time".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.time]
    
    inline def url: typingsJapgolly.revalidator.revalidatorStrings.url = "url".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.url]
    
    inline def `utc-millisec`: typingsJapgolly.revalidator.revalidatorStrings.`utc-millisec` = "utc-millisec".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.`utc-millisec`]
  }
  
  trait IErrrorProperty extends StObject {
    
    var message: String
    
    var property: String
  }
  object IErrrorProperty {
    
    inline def apply(message: String, property: String): IErrrorProperty = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[IErrrorProperty]
    }
    
    extension [Self <: IErrrorProperty](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOptions extends StObject {
    
    /** When additionalProperties is true allow additional unvisited properties on the object. (default true) */
    var additionalProperties: js.UndefOr[Boolean] = js.undefined
    
    /** Enforce casting of some types (for integers/numbers are only supported) when it's possible, e.g. "42" => 42, but "forty2" => "forty2" for the integer type. */
    var cast: js.UndefOr[Boolean] = js.undefined
    
    /** When validateFormats is true also validate formats defined in validate.formatExtensions (default true) */
    var validateFormatExtensions: js.UndefOr[Boolean] = js.undefined
    
    /** Enforce format constraints (default true) */
    var validateFormats: js.UndefOr[Boolean] = js.undefined
    
    /** When validateFormats is true treat unrecognized formats as validation errors (default false) */
    var validateFormatsStrict: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setCast(value: Boolean): Self = StObject.set(x, "cast", value.asInstanceOf[js.Any])
      
      inline def setCastUndefined: Self = StObject.set(x, "cast", js.undefined)
      
      inline def setValidateFormatExtensions(value: Boolean): Self = StObject.set(x, "validateFormatExtensions", value.asInstanceOf[js.Any])
      
      inline def setValidateFormatExtensionsUndefined: Self = StObject.set(x, "validateFormatExtensions", js.undefined)
      
      inline def setValidateFormats(value: Boolean): Self = StObject.set(x, "validateFormats", value.asInstanceOf[js.Any])
      
      inline def setValidateFormatsStrict(value: Boolean): Self = StObject.set(x, "validateFormatsStrict", value.asInstanceOf[js.Any])
      
      inline def setValidateFormatsStrictUndefined: Self = StObject.set(x, "validateFormatsStrict", js.undefined)
      
      inline def setValidateFormatsUndefined: Self = StObject.set(x, "validateFormats", js.undefined)
    }
  }
  
  trait IReturnMessage extends StObject {
    
    var errors: js.Array[IErrrorProperty]
    
    var valid: Boolean
  }
  object IReturnMessage {
    
    inline def apply(errors: js.Array[IErrrorProperty], valid: Boolean): IReturnMessage = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IReturnMessage]
    }
    
    extension [Self <: IReturnMessage](x: Self) {
      
      inline def setErrors(value: js.Array[IErrrorProperty]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: IErrrorProperty*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISchema[T] extends StObject {
    
    /**Default value */
    var default: js.UndefOr[Any] = js.undefined
    
    /**If false, the value must not be an empty string */
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**Value must conform to constraint denoted by expected value */
    var conform: js.UndefOr[js.Function2[/* value */ Any, /* data */ js.UndefOr[T], Boolean]] = js.undefined
    
    /**Value is valid only if the dependent value is valid */
    var dependencies: js.UndefOr[String] = js.undefined
    
    /**Description for this object */
    var description: js.UndefOr[String] = js.undefined
    
    /**Value must be divisible by expected value */
    var divisibleBy: js.UndefOr[Double] = js.undefined
    
    /**Value must be present in the array of expected values */
    var `enum`: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**Value must be lesser than expected value */
    var exclusiveMaximum: js.UndefOr[Double] = js.undefined
    
    /**Value must be greater than expected value */
    var exclusiveMinimum: js.UndefOr[Double] = js.undefined
    
    /**Value must be a valid format */
    var format: js.UndefOr[Formats] = js.undefined
    
    /**Property to describe items for type: 'array' */
    var items: js.UndefOr[ISchema[T] | JSONSchema[T]] = js.undefined
    
    /**Value must contain fewer than expected number of items */
    var maxItems: js.UndefOr[Double] = js.undefined
    
    /**The length of value must be greater than or equal to expected value */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**Value must be lesser than or equal to the expected value */
    var maximum: js.UndefOr[Double] = js.undefined
    
    /**Custom messages for different constraints */
    var message: js.UndefOr[String] = js.undefined
    
    /**Custom messages for different constraints */
    var messages: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**Value must contain more than expected number of items */
    var minItems: js.UndefOr[Double] = js.undefined
    
    /**The length of value must be lesser than or equal to expected value */
    var minLength: js.UndefOr[Double] = js.undefined
    
    /**Value must be greater than or equal to the expected value */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /**The expected value regex needs to be satisfied by the value */
    var pattern: js.UndefOr[js.RegExp | String] = js.undefined
    
    /**If true, the value should not be undefined */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**The type of value should be equal to the expected value */
    var `type`: Types | js.Array[Types]
    
    /**Value must hold a unique set of values */
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
  }
  object ISchema {
    
    inline def apply[T](`type`: Types | js.Array[Types]): ISchema[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISchema[T]]
    }
    
    extension [Self <: ISchema[?], T](x: Self & ISchema[T]) {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setConform(value: (/* value */ Any, /* data */ js.UndefOr[T]) => Boolean): Self = StObject.set(x, "conform", js.Any.fromFunction2(value))
      
      inline def setConformUndefined: Self = StObject.set(x, "conform", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDivisibleBy(value: Double): Self = StObject.set(x, "divisibleBy", value.asInstanceOf[js.Any])
      
      inline def setDivisibleByUndefined: Self = StObject.set(x, "divisibleBy", js.undefined)
      
      inline def setEnum(value: js.Array[Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: Any*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setFormat(value: Formats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setItems(value: ISchema[T] | JSONSchema[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setPattern(value: js.RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: Types | js.Array[Types]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: Types*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  type ISchemas[T] = StringDictionary[ISchema[T] | JSONSchema[T]]
  
  trait JSONSchema[T] extends StObject {
    
    var patternProperties: js.UndefOr[ISchemas[T]] = js.undefined
    
    var properties: js.UndefOr[ISchemas[T]] = js.undefined
    
    var `type`: js.UndefOr[`object`] = js.undefined
  }
  object JSONSchema {
    
    inline def apply[T](): JSONSchema[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema[T]]
    }
    
    extension [Self <: JSONSchema[?], T](x: Self & JSONSchema[T]) {
      
      inline def setPatternProperties(value: ISchemas[T]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      inline def setProperties(value: ISchemas[T]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setType(value: `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RevalidatorStatic extends StObject {
    
    def validate[T](`object`: T, schema: JSONSchema[T]): IReturnMessage = js.native
    def validate[T](`object`: T, schema: JSONSchema[T], options: IOptions): IReturnMessage = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.revalidator.revalidatorStrings.string
    - typingsJapgolly.revalidator.revalidatorStrings.number
    - typingsJapgolly.revalidator.revalidatorStrings.integer
    - typingsJapgolly.revalidator.revalidatorStrings.array
    - typingsJapgolly.revalidator.revalidatorStrings.boolean
    - typingsJapgolly.revalidator.revalidatorStrings.`object`
    - typingsJapgolly.revalidator.revalidatorStrings.`null`
    - typingsJapgolly.revalidator.revalidatorStrings.any
  */
  trait Types extends StObject
  object Types {
    
    inline def any: typingsJapgolly.revalidator.revalidatorStrings.any = "any".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.any]
    
    inline def array: typingsJapgolly.revalidator.revalidatorStrings.array = "array".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.array]
    
    inline def boolean: typingsJapgolly.revalidator.revalidatorStrings.boolean = "boolean".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.boolean]
    
    inline def integer: typingsJapgolly.revalidator.revalidatorStrings.integer = "integer".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.integer]
    
    inline def `null`: typingsJapgolly.revalidator.revalidatorStrings.`null` = "null".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.`null`]
    
    inline def number: typingsJapgolly.revalidator.revalidatorStrings.number = "number".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.number]
    
    inline def `object`: typingsJapgolly.revalidator.revalidatorStrings.`object` = "object".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.`object`]
    
    inline def string: typingsJapgolly.revalidator.revalidatorStrings.string = "string".asInstanceOf[typingsJapgolly.revalidator.revalidatorStrings.string]
  }
}
