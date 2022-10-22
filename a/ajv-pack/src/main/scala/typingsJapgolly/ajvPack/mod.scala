package typingsJapgolly.ajvPack

import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.KeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ValidateFunction
import typingsJapgolly.ajv.mod.Ajv
import typingsJapgolly.ajvPack.ajvPackStrings.log
import typingsJapgolly.ajvPack.anon.FnCall
import typingsJapgolly.ajvPack.anon.FnCallKwdOrDefDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ajv: Ajv, validate: ValidateFunction[Any]): String = (^.asInstanceOf[js.Dynamic].apply(ajv.asInstanceOf[js.Any], validate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ajv-pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instance(ajv: Ajv): AjvPack = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(ajv.asInstanceOf[js.Any]).asInstanceOf[AjvPack]
  
  trait AjvPack extends StObject {
    
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: String): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: String, `def`: KeywordDefinition): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: KeywordDefinition): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: KeywordDefinition, `def`: KeywordDefinition): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    @JSName("addKeyword")
    var addKeyword_Original: FnCallKwdOrDefDef
    
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Array[AnySchema]): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Array[AnySchema], // If array is passed, `key` will be ignored
    key: String): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: AnySchema): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: AnySchema, // If array is passed, `key` will be ignored
    key: String): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    var addSchema_Original: FnCall
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typingsJapgolly.ajv.distCoreMod.Ajv
    
    /**
      * compile the schema and require the module
      * @param  schema JSON-schema
      * @return validation function
      */
    def compile(schema: js.Object): ValidateFunction[Any]
    
    /**
      * validate data against the schema
      * @param schema JSON-schema
      * @param data data to validate
      * @return validation result
      */
    def validate(schema: js.Object, data: Any): Boolean
  }
  object AjvPack {
    
    inline def apply(
      addKeyword: FnCallKwdOrDefDef,
      addSchema: FnCall,
      compile: js.Object => ValidateFunction[Any],
      validate: (js.Object, Any) => Boolean
    ): AjvPack = {
      val __obj = js.Dynamic.literal(addKeyword = addKeyword.asInstanceOf[js.Any], addSchema = addSchema.asInstanceOf[js.Any], compile = js.Any.fromFunction1(compile), validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[AjvPack]
    }
    
    extension [Self <: AjvPack](x: Self) {
      
      inline def setAddKeyword(value: FnCallKwdOrDefDef): Self = StObject.set(x, "addKeyword", value.asInstanceOf[js.Any])
      
      inline def setAddSchema(value: FnCall): Self = StObject.set(x, "addSchema", value.asInstanceOf[js.Any])
      
      inline def setCompile(value: js.Object => ValidateFunction[Any]): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
      
      inline def setValidate(value: (js.Object, Any) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
}
