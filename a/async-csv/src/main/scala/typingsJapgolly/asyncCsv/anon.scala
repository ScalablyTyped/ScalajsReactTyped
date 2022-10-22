package typingsJapgolly.asyncCsv

import typingsJapgolly.asyncCsv.mod.Cast
import typingsJapgolly.asyncCsv.mod.CastingContext
import typingsJapgolly.asyncCsv.mod._ColumnOption
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Boolean extends StObject {
    
    var boolean: js.UndefOr[Cast[scala.Boolean]] = js.undefined
    
    var date: js.UndefOr[Cast[js.Date]] = js.undefined
    
    var number: js.UndefOr[Cast[Double]] = js.undefined
    
    /**
      * Custom formatter for generic object values
      */
    var `object`: js.UndefOr[Cast[Record[String, Any]]] = js.undefined
    
    var string: js.UndefOr[Cast[String]] = js.undefined
  }
  object Boolean {
    
    inline def apply(): Boolean = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Boolean]
    }
    
    extension [Self <: Boolean](x: Self) {
      
      inline def setBoolean(value: (scala.Boolean, /* context */ CastingContext) => String): Self = StObject.set(x, "boolean", js.Any.fromFunction2(value))
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setDate(value: (js.Date, /* context */ CastingContext) => String): Self = StObject.set(x, "date", js.Any.fromFunction2(value))
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setNumber(value: (Double, /* context */ CastingContext) => String): Self = StObject.set(x, "number", js.Any.fromFunction2(value))
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setObject(value: (Record[String, Any], /* context */ CastingContext) => String): Self = StObject.set(x, "object", js.Any.fromFunction2(value))
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setString(value: (String, /* context */ CastingContext) => String): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  trait Name
    extends StObject
       with _ColumnOption {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
