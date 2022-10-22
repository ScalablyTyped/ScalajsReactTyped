package typingsJapgolly.parse.mod.global.Parse

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.parse.mod.global.Parse.Schema.AttrType
import typingsJapgolly.parse.mod.global.Parse.Schema.CLP
import typingsJapgolly.parse.mod.global.Parse.Schema.FieldOptions
import typingsJapgolly.parse.mod.global.Parse.Schema.Index
import typingsJapgolly.parse.mod.global.Parse.Schema.TYPE
import typingsJapgolly.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Parse.Schema object is for handling schema data from Parse.
  * All the schemas methods require MasterKey.
  *
  * @param className Parse Class string
  *
  * https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Schema.html
  *
  * ```
  * const schema = new Parse.Schema('MyClass');
  * schema.addString('field');
  * schema.addIndex('index_name', { field: 1 });
  * schema.save();
  * ```
  */
@JSGlobal("Parse.Schema")
@js.native
open class Schema[T /* <: Object[Attributes] */] protected () extends StObject {
  def this(className: String) = this()
  
  def addArray(key: AttrType[T, js.Array[Any]]): this.type = js.native
  def addArray(key: AttrType[T, js.Array[Any]], options: FieldOptions[js.Array[Any]]): this.type = js.native
  
  def addBoolean(key: AttrType[T, Boolean]): this.type = js.native
  def addBoolean(key: AttrType[T, Boolean], options: FieldOptions[Boolean]): this.type = js.native
  
  def addDate(key: AttrType[T, js.Date]): this.type = js.native
  def addDate(key: AttrType[T, js.Date], options: FieldOptions[js.Date]): this.type = js.native
  
  def addField[T /* <: TYPE */](name: String): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: T, options: FieldOptions[Any]): this.type = js.native
  def addField[T /* <: TYPE */](name: String, `type`: Unit, options: FieldOptions[Any]): this.type = js.native
  
  def addFile(key: AttrType[T, File]): this.type = js.native
  def addFile(key: AttrType[T, File], options: FieldOptions[File]): this.type = js.native
  
  def addGeoPoint(key: AttrType[T, GeoPoint]): this.type = js.native
  def addGeoPoint(key: AttrType[T, GeoPoint], options: FieldOptions[GeoPoint]): this.type = js.native
  
  /**
    * Adding an Index to Create / Update a Schema
    * @param name Name of the field that will be created on Parse
    * @param index `{ 'field': value }` where `field` should exist in the schema before using addIndex.
    * @return Returns the schema, so you can chain this call.
    * @example
    * ```
    * schema.addIndex('index_name', {'field': 1});
    * ```
    */
  def addIndex(name: String, index: Index): this.type = js.native
  
  def addNumber(key: AttrType[T, Double]): this.type = js.native
  def addNumber(key: AttrType[T, Double], options: FieldOptions[Double]): this.type = js.native
  
  def addObject(key: AttrType[T, js.Object]): this.type = js.native
  def addObject(key: AttrType[T, js.Object], options: FieldOptions[js.Object]): this.type = js.native
  
  /**
    * Adding Pointer Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addPointer(key: AttrType[T, Object[Attributes] | Pointer], targetClass: String): this.type = js.native
  def addPointer(
    key: AttrType[T, Object[Attributes] | Pointer],
    targetClass: String,
    options: FieldOptions[Pointer]
  ): this.type = js.native
  
  def addPolygon(key: AttrType[T, Polygon]): this.type = js.native
  def addPolygon(key: AttrType[T, Polygon], options: FieldOptions[Polygon]): this.type = js.native
  
  /**
    * Adding Relation Field
    * @param name Name of the field that will be created on Parse
    * @param targetClass  Name of the target Pointer Class
    * @return Returns the schema, so you can chain this call.
    */
  def addRelation(key: AttrType[T, Relation[Object[Attributes], Object[Attributes]]], targetClass: String): this.type = js.native
  def addRelation(
    key: AttrType[T, Relation[Object[Attributes], Object[Attributes]]],
    targetClass: String,
    options: FieldOptions[Relation[Object[Attributes], Object[Attributes]]]
  ): this.type = js.native
  
  def addString(key: AttrType[T, String]): this.type = js.native
  def addString(key: AttrType[T, String], options: FieldOptions[String]): this.type = js.native
  
  /**
    * Removing a Schema from Parse Can only be used on Schema without objects
    * @returns A promise that is resolved with the result when the query completes.
    */
  // @TODO Fix Promise<any>
  def delete(): js.Promise[Any] = js.native
  
  /**
    * Deleting a Field to Update on a Schema
    * @param name Name of the field
    * @return Returns the schema, so you can chain this call.
    */
  def deleteField(name: String): this.type = js.native
  
  /**
    * Deleting a Index Field to Update on a Schema
    * @param name Name of the index field
    * @return Returns the schema, so you can chain this call.
    */
  def deleteIndex(name: String): this.type = js.native
  
  /**
    * Get the Schema from Parse
    */
  def get(): js.Promise[RestSchema] = js.native
  
  /**
    * Removes all objects from a Schema (class) in  EXERCISE CAUTION, running this will delete all objects for this schema and cannot be reversed
    */
  // TODO Fix Promise<any>
  def purge(): js.Promise[Any] = js.native
  
  /**
    * Create a new Schema on Parse
    */
  def save(): js.Promise[Schema[Any]] = js.native
  
  /**
    * Sets Class Level Permissions when creating / updating a Schema.
    * EXERCISE CAUTION, running this may override CLP for this schema and cannot be reversed
    */
  def setCLP(clp: CLP): this.type = js.native
  
  /**
    * Update a Schema on Parse
    */
  def update(): js.Promise[Schema[Any]] = js.native
}
object Schema {
  
  @JSGlobal("Parse.Schema")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static method to get all schemas
    *
    * @return A promise that is resolved with the result when
    * the query completes.
    */
  /* static member */
  inline def all(): js.Promise[js.Array[RestSchema]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[RestSchema]]]
  
  type AttrType[T /* <: Object[Attributes] */, V] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T['attributes'] ]: T['attributes'][K] extends V? K : never}[keyof T['attributes']] */ js.Any, 
    String
  ]
  
  trait CLP extends StObject {
    
    var addField: js.UndefOr[CLPField] = js.undefined
    
    var count: js.UndefOr[CLPField] = js.undefined
    
    var create: js.UndefOr[CLPField] = js.undefined
    
    var delete: js.UndefOr[CLPField] = js.undefined
    
    var find: js.UndefOr[CLPField] = js.undefined
    
    var get: js.UndefOr[CLPField] = js.undefined
    
    var protectedFields: js.UndefOr[
        /** '*', user id, or role: followed by a list of fields. */
    StringDictionary[js.Array[String]]
      ] = js.undefined
    
    /** Array of fields that point to a `_User` object's ID or a `Role` object's name */
    var readUserFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var update: js.UndefOr[CLPField] = js.undefined
    
    /** Array of fields that point to a `_User` object's ID or a `Role` object's name */
    var writeUserFields: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CLP {
    
    inline def apply(): CLP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CLP]
    }
    
    extension [Self <: CLP](x: Self) {
      
      inline def setAddField(value: CLPField): Self = StObject.set(x, "addField", value.asInstanceOf[js.Any])
      
      inline def setAddFieldUndefined: Self = StObject.set(x, "addField", js.undefined)
      
      inline def setCount(value: CLPField): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setCreate(value: CLPField): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDelete(value: CLPField): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setFind(value: CLPField): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setGet(value: CLPField): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setProtectedFields(
        value: /** '*', user id, or role: followed by a list of fields. */
      StringDictionary[js.Array[String]]
      ): Self = StObject.set(x, "protectedFields", value.asInstanceOf[js.Any])
      
      inline def setProtectedFieldsUndefined: Self = StObject.set(x, "protectedFields", js.undefined)
      
      inline def setReadUserFields(value: js.Array[String]): Self = StObject.set(x, "readUserFields", value.asInstanceOf[js.Any])
      
      inline def setReadUserFieldsUndefined: Self = StObject.set(x, "readUserFields", js.undefined)
      
      inline def setReadUserFieldsVarargs(value: String*): Self = StObject.set(x, "readUserFields", js.Array(value*))
      
      inline def setUpdate(value: CLPField): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWriteUserFields(value: js.Array[String]): Self = StObject.set(x, "writeUserFields", value.asInstanceOf[js.Any])
      
      inline def setWriteUserFieldsUndefined: Self = StObject.set(x, "writeUserFields", js.undefined)
      
      inline def setWriteUserFieldsVarargs(value: String*): Self = StObject.set(x, "writeUserFields", js.Array(value*))
    }
  }
  
  /**
    * The id of a `_User` object or a role name prefixed by `'role:'`.
    * @example
    *  '*': false, // public
    *  requiresAuthentication: false,
    * 'role:Admin': true,
    *  'idOfASpecificUser': true
    */
  trait CLPField
    extends StObject
       with /** `role:Admin` */
  /* userIdOrRoleName */ StringDictionary[js.UndefOr[Boolean]] {
    
    @JSName("*")
    var Asterisk: js.UndefOr[Boolean] = js.undefined
    
    var requiresAuthentication: js.UndefOr[Boolean] = js.undefined
  }
  object CLPField {
    
    inline def apply(): CLPField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CLPField]
    }
    
    extension [Self <: CLPField](x: Self) {
      
      inline def setAsterisk(value: Boolean): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
      
      inline def setAsteriskUndefined: Self = StObject.set(x, "*", js.undefined)
      
      inline def setRequiresAuthentication(value: Boolean): Self = StObject.set(x, "requiresAuthentication", value.asInstanceOf[js.Any])
      
      inline def setRequiresAuthenticationUndefined: Self = StObject.set(x, "requiresAuthentication", js.undefined)
    }
  }
  
  trait FieldOptions[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[Any] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */] extends StObject {
    
    var defaultValue: js.UndefOr[T] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object FieldOptions {
    
    inline def apply[T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[Any] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */](): FieldOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldOptions[T]]
    }
    
    extension [Self <: FieldOptions[?], T /* <: String | Double | Boolean | js.Date | File | GeoPoint | Polygon | js.Array[Any] | js.Object | Pointer | (Relation[Object[Attributes], Object[Attributes]]) */](x: Self & FieldOptions[T]) {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Date
    - typingsJapgolly.parse.mod.global.Parse.File
    - typingsJapgolly.parse.mod.global.Parse.GeoPoint
    - typingsJapgolly.parse.mod.global.Parse.Polygon
    - js.Array[scala.Any]
    - js.Object
    - typingsJapgolly.parse.mod.global.Parse.Pointer
    - typingsJapgolly.parse.mod.global.Parse.Relation[
  typingsJapgolly.parse.mod.global.Parse.Object[typingsJapgolly.parse.mod.global.Parse.Attributes], 
  typingsJapgolly.parse.mod.global.Parse.Object[typingsJapgolly.parse.mod.global.Parse.Attributes]]
  */
  type FieldType = _FieldType | js.Array[Any] | (Relation[Object[Attributes], Object[Attributes]]) | String | Double | Boolean | js.Date | js.Object
  
  type Index = StringDictionary[Double | String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.parse.parseStrings.String
    - typingsJapgolly.parse.parseStrings.Number
    - typingsJapgolly.parse.parseStrings.Boolean
    - typingsJapgolly.parse.parseStrings.Date
    - typingsJapgolly.parse.parseStrings.File
    - typingsJapgolly.parse.parseStrings.GeoPoint
    - typingsJapgolly.parse.parseStrings.Polygon
    - typingsJapgolly.parse.parseStrings.Array
    - typingsJapgolly.parse.parseStrings.Object
    - typingsJapgolly.parse.parseStrings.Pointer
    - typingsJapgolly.parse.parseStrings.Relation
  */
  trait TYPE extends StObject
  object TYPE {
    
    inline def Array: typingsJapgolly.parse.parseStrings.Array = "Array".asInstanceOf[typingsJapgolly.parse.parseStrings.Array]
    
    inline def Boolean: typingsJapgolly.parse.parseStrings.Boolean = "Boolean".asInstanceOf[typingsJapgolly.parse.parseStrings.Boolean]
    
    inline def Date: typingsJapgolly.parse.parseStrings.Date = "Date".asInstanceOf[typingsJapgolly.parse.parseStrings.Date]
    
    inline def File: typingsJapgolly.parse.parseStrings.File = "File".asInstanceOf[typingsJapgolly.parse.parseStrings.File]
    
    inline def GeoPoint: typingsJapgolly.parse.parseStrings.GeoPoint = "GeoPoint".asInstanceOf[typingsJapgolly.parse.parseStrings.GeoPoint]
    
    inline def Number: typingsJapgolly.parse.parseStrings.Number = "Number".asInstanceOf[typingsJapgolly.parse.parseStrings.Number]
    
    inline def Object: typingsJapgolly.parse.parseStrings.Object = "Object".asInstanceOf[typingsJapgolly.parse.parseStrings.Object]
    
    inline def Pointer: typingsJapgolly.parse.parseStrings.Pointer = "Pointer".asInstanceOf[typingsJapgolly.parse.parseStrings.Pointer]
    
    inline def Polygon: typingsJapgolly.parse.parseStrings.Polygon = "Polygon".asInstanceOf[typingsJapgolly.parse.parseStrings.Polygon]
    
    inline def Relation: typingsJapgolly.parse.parseStrings.Relation = "Relation".asInstanceOf[typingsJapgolly.parse.parseStrings.Relation]
    
    inline def String: typingsJapgolly.parse.parseStrings.String = "String".asInstanceOf[typingsJapgolly.parse.parseStrings.String]
  }
  
  trait _FieldType extends StObject
}
