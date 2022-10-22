package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldListMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FieldList
  @JSImport("@nginstack/engine/lib/classdef/FieldList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FieldList extends StObject {
    
    /* private */ var _fieldIdxByFieldName: Any = js.native
    
    /* private */ var _fieldsByFieldName: Any = js.native
    
    /* private */ var _properties: Any = js.native
    
    def add(field: typingsJapgolly.nginstackEngine.libClassdefFieldMod.^): Unit = js.native
    
    /* private */ var addObject: Any = js.native
    
    def assign(fieldList: FieldList): Unit = js.native
    
    def clear(): Unit = js.native
    
    var count: Double = js.native
    
    def field(nameOrIndex: String): typingsJapgolly.nginstackEngine.libClassdefFieldMod.^ = js.native
    def field(nameOrIndex: Double): typingsJapgolly.nginstackEngine.libClassdefFieldMod.^ = js.native
    
    /* private */ var fieldNameMapper_ : Any = js.native
    
    /* private */ var fields_ : Any = js.native
    
    /* private */ var find: Any = js.native
    
    /* private */ var findObjectsByString: Any = js.native
    
    /* private */ var getAllObjects: Any = js.native
    
    def getFieldNames(): js.Array[String] = js.native
    def getFieldNames(opt_fieldsNames: js.Array[Any]): js.Array[String] = js.native
    
    def getFieldsByProperty(args: Any*): FieldList = js.native
    
    /* private */ var getText: Any = js.native
    
    def indexOf(nameOrField: String): Any = js.native
    
    /* private */ var init_ : Any = js.native
    
    def map(func: js.Function2[/* arg0 */ String, /* repeated */ Any, Any], args: Any*): js.Array[Any] = js.native
    
    /* private */ var nameAliases_ : Any = js.native
    
    /* private */ var objects: Any = js.native
    
    def remove(nameOrIndexOrField: String): typingsJapgolly.nginstackEngine.libClassdefFieldMod.^ = js.native
    def remove(nameOrIndexOrField: Double): typingsJapgolly.nginstackEngine.libClassdefFieldMod.^ = js.native
    def remove(nameOrIndexOrField: typingsJapgolly.nginstackEngine.libClassdefFieldMod.^): typingsJapgolly.nginstackEngine.libClassdefFieldMod.^ = js.native
    
    def setFieldsProperties(fieldNames: String, propertyNames: String, args: Any*): Unit = js.native
    def setFieldsProperties(fieldNames: String, propertyNames: js.Array[String], args: Any*): Unit = js.native
    def setFieldsProperties(
      fieldNames: String,
      propertyNames: js.Function1[/* arg0 */ typingsJapgolly.nginstackEngine.libClassdefFieldMod.^, Unit],
      args: Any*
    ): Unit = js.native
    def setFieldsProperties(
      fieldNames: js.Array[typingsJapgolly.nginstackEngine.libClassdefFieldMod.^],
      propertyNames: String,
      args: Any*
    ): Unit = js.native
    def setFieldsProperties(
      fieldNames: js.Array[typingsJapgolly.nginstackEngine.libClassdefFieldMod.^],
      propertyNames: js.Array[String],
      args: Any*
    ): Unit = js.native
    def setFieldsProperties(
      fieldNames: js.Array[typingsJapgolly.nginstackEngine.libClassdefFieldMod.^],
      propertyNames: js.Function1[/* arg0 */ typingsJapgolly.nginstackEngine.libClassdefFieldMod.^, Unit],
      args: Any*
    ): Unit = js.native
    
    /* private */ var strings: Any = js.native
    
    /* private */ var toArray: Any = js.native
  }
}
