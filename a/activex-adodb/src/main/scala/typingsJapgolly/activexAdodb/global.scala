package typingsJapgolly.activexAdodb

import typingsJapgolly.activexAdodb.ADODB.DataTypeEnum
import typingsJapgolly.activexAdodb.ADODB.FieldAttributeEnum
import typingsJapgolly.activexAdodb.ADODB.ParameterAttributesEnum
import typingsJapgolly.activexAdodb.ADODB.ParameterDirectionEnum
import typingsJapgolly.activexAdodb.ADODB.Properties
import typingsJapgolly.activexAdodb.ADODB.PropertyAttributesEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ADODB {
    
    @JSGlobal("ADODB.Bookmark")
    @js.native
    /* private */ open class Bookmark ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Bookmark {
      
      /* private */ /* CompleteClass */
      @JSName("ADODB.Bookmark_typekey")
      var ADODBDotBookmark_typekey: typingsJapgolly.activexAdodb.ADODB.Bookmark = js.native
    }
    
    @JSGlobal("ADODB.Command")
    @js.native
    /* private */ open class Command ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Command
    
    @JSGlobal("ADODB.Connection")
    @js.native
    /* private */ open class Connection ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Connection
    
    @JSGlobal("ADODB.Error")
    @js.native
    /* private */ open class Error ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Error {
      
      /* private */ /* CompleteClass */
      @JSName("ADODB.Error_typekey")
      var ADODBDotError_typekey: typingsJapgolly.activexAdodb.ADODB.Error = js.native
      
      /* CompleteClass */
      override val Description: String = js.native
      
      /* CompleteClass */
      override val HelpContext: Double = js.native
      
      /* CompleteClass */
      override val HelpFile: String = js.native
      
      /* CompleteClass */
      override val NativeError: Double = js.native
      
      /* CompleteClass */
      override val Number: Double = js.native
      
      /* CompleteClass */
      override val SQLState: String = js.native
      
      /* CompleteClass */
      override val Source: String = js.native
    }
    
    @JSGlobal("ADODB.Field")
    @js.native
    /* private */ open class Field ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Field {
      
      /* private */ /* CompleteClass */
      @JSName("ADODB.Field_typekey")
      var ADODBDotField_typekey: typingsJapgolly.activexAdodb.ADODB.Field = js.native
      
      /* CompleteClass */
      override val ActualSize: Double = js.native
      
      /* CompleteClass */
      override def AppendChunk(Data: Any): Unit = js.native
      
      /** Sum of one or more of the values in the **FieldAttributeEnum** enum */
      /* CompleteClass */
      var Attributes: FieldAttributeEnum = js.native
      
      /* CompleteClass */
      var DataFormat: Any = js.native
      
      /* CompleteClass */
      var DefinedSize: Double = js.native
      
      /* CompleteClass */
      override def GetChunk(Length: Double): Any = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      var NumericScale: Double = js.native
      
      /* CompleteClass */
      override val OriginalValue: Any = js.native
      
      /* CompleteClass */
      var Precision: Double = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): typingsJapgolly.activexAdodb.ADODB.Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): typingsJapgolly.activexAdodb.ADODB.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      override val Status: Double = js.native
      
      /* CompleteClass */
      var Type: DataTypeEnum = js.native
      
      /* CompleteClass */
      override val UnderlyingValue: Any = js.native
      
      /* CompleteClass */
      var Value: Any = js.native
    }
    
    @JSGlobal("ADODB.Parameter")
    @js.native
    /* private */ open class Parameter ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Parameter {
      
      /* private */ /* CompleteClass */
      @JSName("ADODB.Parameter_typekey")
      var ADODBDotParameter_typekey: typingsJapgolly.activexAdodb.ADODB.Parameter = js.native
      
      /* CompleteClass */
      override def AppendChunk(Val: Any): Unit = js.native
      
      /** Sum of one or more of the values in the **ParameterAttributesEnum** enum */
      /* CompleteClass */
      var Attributes: ParameterAttributesEnum = js.native
      
      /* CompleteClass */
      var Direction: ParameterDirectionEnum = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var NumericScale: Double = js.native
      
      /* CompleteClass */
      var Precision: Double = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): typingsJapgolly.activexAdodb.ADODB.Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): typingsJapgolly.activexAdodb.ADODB.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var Size: Double = js.native
      
      /* CompleteClass */
      var Type: DataTypeEnum = js.native
      
      /* CompleteClass */
      var Value: Any = js.native
    }
    
    @JSGlobal("ADODB.Property")
    @js.native
    /* private */ open class Property ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Property {
      
      /* private */ /* CompleteClass */
      @JSName("ADODB.Property_typekey")
      var ADODBDotProperty_typekey: typingsJapgolly.activexAdodb.ADODB.Property = js.native
      
      /** Sum of one or more of the values in the **PropertyAttributesEnum** enum */
      /* CompleteClass */
      var Attributes: PropertyAttributesEnum = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      override val Type: DataTypeEnum = js.native
      
      /* CompleteClass */
      var Value: Any = js.native
    }
    
    @JSGlobal("ADODB.Record")
    @js.native
    /* private */ open class Record ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Record
    
    @JSGlobal("ADODB.Stream")
    @js.native
    /* private */ open class Stream ()
      extends StObject
         with typingsJapgolly.activexAdodb.ADODB.Stream
  }
}
