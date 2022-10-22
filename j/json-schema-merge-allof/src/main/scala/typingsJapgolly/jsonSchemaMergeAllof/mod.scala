package typingsJapgolly.jsonSchemaMergeAllof

import typingsJapgolly.jsonSchema.mod.JSONSchema4
import typingsJapgolly.jsonSchema.mod.JSONSchema6
import typingsJapgolly.jsonSchema.mod.JSONSchema7
import typingsJapgolly.jsonSchemaMergeAllof.anon.AdditionalProperties
import typingsJapgolly.jsonSchemaMergeAllof.anon.DefaultResolver
import typingsJapgolly.jsonSchemaMergeAllof.anon.IgnoreAdditionalProperties
import typingsJapgolly.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.additionalProperties
import typingsJapgolly.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.patternProperties
import typingsJapgolly.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.properties
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(rootSchema: JSONSchema4): JSONSchema4 = ^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema4]
  inline def apply(rootSchema: JSONSchema4, options: Options_[JSONSchema4] & IgnoreAdditionalProperties): JSONSchema4 = (^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema4]
  inline def apply(rootSchema: JSONSchema4, options: Options_[JSONSchema4]): JSONSchema4 = (^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema4]
  inline def apply(rootSchema: JSONSchema6): JSONSchema6 = ^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema6]
  inline def apply(rootSchema: JSONSchema6, options: Options_[JSONSchema6] & IgnoreAdditionalProperties): JSONSchema6 = (^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def apply(rootSchema: JSONSchema6, options: Options_[JSONSchema6]): JSONSchema6 = (^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def apply(rootSchema: JSONSchema7): JSONSchema7 = ^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema7]
  inline def apply(rootSchema: JSONSchema7, options: Options_[JSONSchema7] & IgnoreAdditionalProperties): JSONSchema7 = (^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema7]
  inline def apply(rootSchema: JSONSchema7, options: Options_[JSONSchema7]): JSONSchema7 = (^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema7]
  inline def apply(rootSchema: JSONSchema46): JSONSchema46 = ^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema46]
  inline def apply(rootSchema: JSONSchema46, options: Options_[JSONSchema46]): JSONSchema46 = (^.asInstanceOf[js.Dynamic].apply(rootSchema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSONSchema46]
  
  @JSImport("json-schema-merge-allof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object options {
    
    @JSImport("json-schema-merge-allof", "options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("json-schema-merge-allof", "options.resolvers")
    @js.native
    def resolvers: Resolvers[JSONSchema] = js.native
    inline def resolvers_=(x: Resolvers[JSONSchema]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(x.asInstanceOf[js.Any])
  }
  
  type JSONSchema = JSONSchema4 | JSONSchema6 | JSONSchema7
  
  type JSONSchema46 = JSONSchema4 | JSONSchema6
  
  type MergeChildSchemas = js.Function2[/* schemas */ js.Array[JSONSchema], /* childSchemaName */ String, JSONSchema]
  
  type MergeSchemas = js.Function1[/* schemas */ js.Array[JSONSchema], JSONSchema]
  
  trait Options_[Schema /* <: JSONSchema */] extends StObject {
    
    /**
      * **ignoreAdditionalProperties** default **false**
      *
      * Allows you to combine schema properties even though some schemas have
      * `additionalProperties: false` This is the most common issue people
      * face when trying to expand schemas using allOf and a limitation of
      * the json schema spec. Be aware though that the schema produced will
      * allow more than the original schema. But this is useful if just want
      * to combine schemas using allOf as if additionalProperties wasn't
      * false during the merge process. The resulting schema will still get
      * additionalProperties set to false.
      */
    var ignoreAdditionalProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * **resolvers** Object
      *
      * Override any default resolver like this:
      *
      * ```js
      * mergeAllOf(schema, {
      *   resolvers: {
      *     title: function(values, path, mergeSchemas, options) {
      *       // choose what title you want to be used based on the conflicting values
      *       // resolvers MUST return a value other than undefined
      *     }
      *   }
      * })
      * ```
      *
      * The function is passed:
      *
      * - **values** an array of the conflicting values that need to be
      *   resolved
      * - **path** an array of strings containing the path to the position in
      *   the schema that caused the resolver to be called (useful if you use
      *   the same resolver for multiple keywords, or want to implement
      *   specific logic for custom paths)
      * - **mergeSchemas** a function you can call that merges an array of
      *   schemas
      * - **options** the options mergeAllOf was called with
      */
    var resolvers: js.UndefOr[Partial[Resolvers[Schema]] & DefaultResolver[Schema]] = js.undefined
  }
  object Options_ {
    
    inline def apply[Schema /* <: JSONSchema */](): Options_[Schema] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options_[Schema]]
    }
    
    extension [Self <: Options_[?], Schema /* <: JSONSchema */](x: Self & Options_[Schema]) {
      
      inline def setIgnoreAdditionalProperties(value: Boolean): Self = StObject.set(x, "ignoreAdditionalProperties", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAdditionalPropertiesUndefined: Self = StObject.set(x, "ignoreAdditionalProperties", js.undefined)
      
      inline def setResolvers(value: Partial[Resolvers[Schema]] & DefaultResolver[Schema]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
    }
  }
  
  trait Resolvers[Schema /* <: JSONSchema */] extends StObject {
    
    @JSName("$id")
    def $id_id(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
      ]
    
    @JSName("$ref")
    def $ref_ref(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
      ]
    
    @JSName("$schema")
    def $schema_schema(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
      ]
    
    @JSName("additionalItems")
    def additionalItems_additionalItems(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
      ]
    
    @JSName("additionalProperties")
    def additionalProperties_additionalProperties(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
      ]
    
    @JSName("anyOf")
    def anyOf_anyOf(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
      ]
    
    @JSName("contains")
    def contains_contains(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
      ]
    
    @JSName("default")
    def default_default(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
      ]
    
    @JSName("definitions")
    def definitions_definitions(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
      ]
    
    @JSName("dependencies")
    def dependencies_dependencies(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
      ]
    
    @JSName("description")
    def description_description(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
      ]
    
    @JSName("enum")
    def enum_enum(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
      ]
    
    @JSName("examples")
    def examples_examples(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
      ]
    
    @JSName("exclusiveMaximum")
    def exclusiveMaximum_exclusiveMaximum(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
      ]
    
    @JSName("exclusiveMinimum")
    def exclusiveMinimum_exclusiveMinimum(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
      ]
    
    @JSName("items")
    def items_items(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
      ]
    
    @JSName("maxItems")
    def maxItems_maxItems(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
      ]
    
    @JSName("maxLength")
    def maxLength_maxLength(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
      ]
    
    @JSName("maxProperties")
    def maxProperties_maxProperties(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
      ]
    
    @JSName("maximum")
    def maximum_maximum(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
      ]
    
    @JSName("minItems")
    def minItems_minItems(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
      ]
    
    @JSName("minLength")
    def minLength_minLength(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
      ]
    
    @JSName("minProperties")
    def minProperties_minProperties(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
      ]
    
    @JSName("minimum")
    def minimum_minimum(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
      ]
    
    @JSName("multipleOf")
    def multipleOf_multipleOf(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
      ]
    
    @JSName("not")
    def not_not(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
      ]
    
    @JSName("oneOf")
    def oneOf_oneOf(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
      ]
    
    @JSName("pattern")
    def pattern_pattern(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
      ]
    
    /**
      * ### Combined resolvers
      * No separate resolver is called for patternProperties and
      * additionalProperties, only the properties resolver is called. Same
      * for additionalItems, only items resolver is called. This is because
      * those keywords need to be resolved together as they affect each
      * other.
      *
      * Those two resolvers are expected to return an object containing the
      * resolved values of all the associated keywords. The keys must be the
      * name of the keywords. So the properties resolver need to return an
      * object like this containing the resolved values for each keyword:
      *
      * ```js
      * {
      *     properties: ...,
      *     patternProperties: ...,
      *     additionalProperties: ...,
      * }
      * ```
      *
      * Also the resolve function is not passed **mergeSchemas**, but an
      * object **mergers** that contains mergers for each of the related
      * keywords. So properties get passed an object like this:
      *
      * ```js
      * var mergers = {
      *     properties: function mergeSchemas(schemas, childSchemaName){...},
      *     patternProperties: function mergeSchemas(schemas, childSchemaName){...},
      *     additionalProperties: function mergeSchemas(schemas){...},
      * }
      * ```
      *
      * Some of the mergers requires you to supply a string of the name or
      * index of the subschema you are currently merging. This is to make
      * sure the path passed to child resolvers are correct.
      */
    def properties(
      values: js.Array[Schema],
      path: js.Array[String],
      mergers: AdditionalProperties,
      options: Options_[Schema]
    ): Pick[
        Schema, 
        typingsJapgolly.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.properties | patternProperties | additionalProperties
      ]
    
    @JSName("propertyNames")
    def propertyNames_propertyNames(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
      ]
    
    @JSName("required")
    def required_required(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
      ]
    
    @JSName("title")
    def title_title(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
      ]
    
    @JSName("type")
    def type_type(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
      ]
    
    @JSName("uniqueItems")
    def uniqueItems_uniqueItems(
      values: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
        ],
      path: js.Array[String],
      mergeSchemas: MergeSchemas,
      options: Options_[Schema]
    ): NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
      ]
  }
  object Resolvers {
    
    inline def apply[Schema /* <: JSONSchema */](
      $id: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
        ],
      $ref: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
        ],
      $schema: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
        ],
      additionalItems: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
        ],
      additionalProperties: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
        ],
      anyOf: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
        ],
      contains: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
        ],
      default: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
        ],
      definitions: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
        ],
      dependencies: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
        ],
      description: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
        ],
      `enum`: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
        ],
      examples: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
        ],
      exclusiveMaximum: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
        ],
      exclusiveMinimum: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
        ],
      items: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
        ],
      maxItems: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
        ],
      maxLength: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
        ],
      maxProperties: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
        ],
      maximum: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
        ],
      minItems: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
        ],
      minLength: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
        ],
      minProperties: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
        ],
      minimum: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
        ],
      multipleOf: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
        ],
      not: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
        ],
      oneOf: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
        ],
      pattern: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
        ],
      properties: (js.Array[Schema], js.Array[String], AdditionalProperties, Options_[Schema]) => Pick[Schema, properties | patternProperties | additionalProperties],
      propertyNames: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
        ],
      required: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
        ],
      title: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
        ],
      `type`: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
        ],
      uniqueItems: (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
        ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
        ]
    ): Resolvers[Schema] = {
      val __obj = js.Dynamic.literal($id = js.Any.fromFunction4($id), $ref = js.Any.fromFunction4($ref), $schema = js.Any.fromFunction4($schema), additionalItems = js.Any.fromFunction4(additionalItems), additionalProperties = js.Any.fromFunction4(additionalProperties), anyOf = js.Any.fromFunction4(anyOf), contains = js.Any.fromFunction4(contains), default = js.Any.fromFunction4(default), definitions = js.Any.fromFunction4(definitions), dependencies = js.Any.fromFunction4(dependencies), description = js.Any.fromFunction4(description), examples = js.Any.fromFunction4(examples), exclusiveMaximum = js.Any.fromFunction4(exclusiveMaximum), exclusiveMinimum = js.Any.fromFunction4(exclusiveMinimum), items = js.Any.fromFunction4(items), maxItems = js.Any.fromFunction4(maxItems), maxLength = js.Any.fromFunction4(maxLength), maxProperties = js.Any.fromFunction4(maxProperties), maximum = js.Any.fromFunction4(maximum), minItems = js.Any.fromFunction4(minItems), minLength = js.Any.fromFunction4(minLength), minProperties = js.Any.fromFunction4(minProperties), minimum = js.Any.fromFunction4(minimum), multipleOf = js.Any.fromFunction4(multipleOf), not = js.Any.fromFunction4(not), oneOf = js.Any.fromFunction4(oneOf), pattern = js.Any.fromFunction4(pattern), properties = js.Any.fromFunction4(properties), propertyNames = js.Any.fromFunction4(propertyNames), required = js.Any.fromFunction4(required), title = js.Any.fromFunction4(title), uniqueItems = js.Any.fromFunction4(uniqueItems))
      __obj.updateDynamic("enum")(js.Any.fromFunction4(`enum`))
      __obj.updateDynamic("type")(js.Any.fromFunction4(`type`))
      __obj.asInstanceOf[Resolvers[Schema]]
    }
    
    extension [Self <: Resolvers[?], Schema /* <: JSONSchema */](x: Self & Resolvers[Schema]) {
      
      inline def set$id(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Id>['$id'] */ js.Any
            ]
      ): Self = StObject.set(x, "$id", js.Any.fromFunction4(value))
      
      inline def set$ref(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
            ]
      ): Self = StObject.set(x, "$ref", js.Any.fromFunction4(value))
      
      inline def set$schema(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
            ]
      ): Self = StObject.set(x, "$schema", js.Any.fromFunction4(value))
      
      inline def setAdditionalItems(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
            ]
      ): Self = StObject.set(x, "additionalItems", js.Any.fromFunction4(value))
      
      inline def setAdditionalProperties(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
            ]
      ): Self = StObject.set(x, "additionalProperties", js.Any.fromFunction4(value))
      
      inline def setAnyOf(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
            ]
      ): Self = StObject.set(x, "anyOf", js.Any.fromFunction4(value))
      
      inline def setContains(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Contains>['contains'] */ js.Any
            ]
      ): Self = StObject.set(x, "contains", js.Any.fromFunction4(value))
      
      inline def setDefault(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
            ]
      ): Self = StObject.set(x, "default", js.Any.fromFunction4(value))
      
      inline def setDefinitions(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
            ]
      ): Self = StObject.set(x, "definitions", js.Any.fromFunction4(value))
      
      inline def setDependencies(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
            ]
      ): Self = StObject.set(x, "dependencies", js.Any.fromFunction4(value))
      
      inline def setDescription(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
            ]
      ): Self = StObject.set(x, "description", js.Any.fromFunction4(value))
      
      inline def setEnum(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
            ]
      ): Self = StObject.set(x, "enum", js.Any.fromFunction4(value))
      
      inline def setExamples(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.Examples>['examples'] */ js.Any
            ]
      ): Self = StObject.set(x, "examples", js.Any.fromFunction4(value))
      
      inline def setExclusiveMaximum(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
            ]
      ): Self = StObject.set(x, "exclusiveMaximum", js.Any.fromFunction4(value))
      
      inline def setExclusiveMinimum(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
            ]
      ): Self = StObject.set(x, "exclusiveMinimum", js.Any.fromFunction4(value))
      
      inline def setItems(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
            ]
      ): Self = StObject.set(x, "items", js.Any.fromFunction4(value))
      
      inline def setMaxItems(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
            ]
      ): Self = StObject.set(x, "maxItems", js.Any.fromFunction4(value))
      
      inline def setMaxLength(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
            ]
      ): Self = StObject.set(x, "maxLength", js.Any.fromFunction4(value))
      
      inline def setMaxProperties(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
            ]
      ): Self = StObject.set(x, "maxProperties", js.Any.fromFunction4(value))
      
      inline def setMaximum(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
            ]
      ): Self = StObject.set(x, "maximum", js.Any.fromFunction4(value))
      
      inline def setMinItems(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
            ]
      ): Self = StObject.set(x, "minItems", js.Any.fromFunction4(value))
      
      inline def setMinLength(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
            ]
      ): Self = StObject.set(x, "minLength", js.Any.fromFunction4(value))
      
      inline def setMinProperties(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
            ]
      ): Self = StObject.set(x, "minProperties", js.Any.fromFunction4(value))
      
      inline def setMinimum(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
            ]
      ): Self = StObject.set(x, "minimum", js.Any.fromFunction4(value))
      
      inline def setMultipleOf(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
            ]
      ): Self = StObject.set(x, "multipleOf", js.Any.fromFunction4(value))
      
      inline def setNot(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
            ]
      ): Self = StObject.set(x, "not", js.Any.fromFunction4(value))
      
      inline def setOneOf(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
            ]
      ): Self = StObject.set(x, "oneOf", js.Any.fromFunction4(value))
      
      inline def setPattern(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
            ]
      ): Self = StObject.set(x, "pattern", js.Any.fromFunction4(value))
      
      inline def setProperties(
        value: (js.Array[Schema], js.Array[String], AdditionalProperties, Options_[Schema]) => Pick[Schema, properties | patternProperties | additionalProperties]
      ): Self = StObject.set(x, "properties", js.Any.fromFunction4(value))
      
      inline def setPropertyNames(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.anon.PropertyNames>['propertyNames'] */ js.Any
            ]
      ): Self = StObject.set(x, "propertyNames", js.Any.fromFunction4(value))
      
      inline def setRequired(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
            ]
      ): Self = StObject.set(x, "required", js.Any.fromFunction4(value))
      
      inline def setTitle(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
            ]
      ): Self = StObject.set(x, "title", js.Any.fromFunction4(value))
      
      inline def setType(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
            ]
      ): Self = StObject.set(x, "type", js.Any.fromFunction4(value))
      
      inline def setUniqueItems(
        value: (js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
            ], js.Array[String], MergeSchemas, Options_[Schema]) => NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
            ]
      ): Self = StObject.set(x, "uniqueItems", js.Any.fromFunction4(value))
    }
  }
}
