package typingsJapgolly.azureKustoData

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ColumnName extends StObject {
    
    var ColumnName: js.UndefOr[String] = js.undefined
    
    var ColumnType: js.UndefOr[String] = js.undefined
    
    var DateType: js.UndefOr[String] = js.undefined
  }
  object ColumnName {
    
    inline def apply(): ColumnName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnName]
    }
    
    extension [Self <: ColumnName](x: Self) {
      
      inline def setColumnName(value: String): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "ColumnName", js.undefined)
      
      inline def setColumnType(value: String): Self = StObject.set(x, "ColumnType", value.asInstanceOf[js.Any])
      
      inline def setColumnTypeUndefined: Self = StObject.set(x, "ColumnType", js.undefined)
      
      inline def setDateType(value: String): Self = StObject.set(x, "DateType", value.asInstanceOf[js.Any])
      
      inline def setDateTypeUndefined: Self = StObject.set(x, "DateType", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Array[Record[String, Any]]
    
    var name: String
  }
  object Data {
    
    inline def apply(data: js.Array[Record[String, Any]], name: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors extends StObject {
    
    var errors: Double
    
    var warnings: Double
  }
  object Errors {
    
    inline def apply(errors: Double, warnings: Double): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: Double): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasErrors extends StObject {
    
    var HasErrors: Boolean
    
    var OneApiErrors: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object HasErrors {
    
    inline def apply(HasErrors: Boolean): HasErrors = {
      val __obj = js.Dynamic.literal(HasErrors = HasErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasErrors]
    }
    
    extension [Self <: HasErrors](x: Self) {
      
      inline def setHasErrors(value: Boolean): Self = StObject.set(x, "HasErrors", value.asInstanceOf[js.Any])
      
      inline def setOneApiErrors(value: js.Array[Any]): Self = StObject.set(x, "OneApiErrors", value.asInstanceOf[js.Any])
      
      inline def setOneApiErrorsUndefined: Self = StObject.set(x, "OneApiErrors", js.undefined)
      
      inline def setOneApiErrorsVarargs(value: Any*): Self = StObject.set(x, "OneApiErrors", js.Array(value*))
    }
  }
  
  trait Name[T] extends StObject {
    
    var data: js.Array[T]
    
    var name: String
  }
  object Name {
    
    inline def apply[T](data: js.Array[T], name: String): Name[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    extension [Self <: Name[?], T](x: Self & Name[T]) {
      
      inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var Options: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var Parameters: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
      
      inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    }
  }
}
