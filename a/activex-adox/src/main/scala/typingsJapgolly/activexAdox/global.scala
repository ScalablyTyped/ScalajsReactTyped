package typingsJapgolly.activexAdox

import typingsJapgolly.activexAdodb.ADODB.DataTypeEnum
import typingsJapgolly.activexAdodb.ADODB.Properties
import typingsJapgolly.activexAdodb.ADODB.Property
import typingsJapgolly.activexAdox.ADOX.AllowNullsEnum
import typingsJapgolly.activexAdox.ADOX.ColumnAttributesEnum
import typingsJapgolly.activexAdox.ADOX.Columns
import typingsJapgolly.activexAdox.ADOX.Indexes
import typingsJapgolly.activexAdox.ADOX.KeyTypeEnum
import typingsJapgolly.activexAdox.ADOX.Keys
import typingsJapgolly.activexAdox.ADOX.RuleEnum
import typingsJapgolly.activexAdox.ADOX.SortOrderEnum
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ADOX {
    
    @JSGlobal("ADOX.Catalog")
    @js.native
    /* private */ open class Catalog ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.Catalog
    
    @JSGlobal("ADOX.Column")
    @js.native
    /* private */ open class Column ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.Column {
      
      /* private */ /* CompleteClass */
      @JSName("ADOX.Column_typekey")
      var ADOXDotColumn_typekey: typingsJapgolly.activexAdox.ADOX.Column = js.native
      
      /* CompleteClass */
      var Attributes: ColumnAttributesEnum = js.native
      
      /* CompleteClass */
      var DefinedSize: Double = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var NumericScale: Double = js.native
      
      /* CompleteClass */
      var ParentCatalog: typingsJapgolly.activexAdox.ADOX.Catalog = js.native
      
      /* CompleteClass */
      var Precision: Double = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var RelatedColumn: String = js.native
      
      /* CompleteClass */
      var SortOrder: SortOrderEnum = js.native
      
      /* CompleteClass */
      var Type: DataTypeEnum = js.native
    }
    
    @JSGlobal("ADOX.Group")
    @js.native
    /* private */ open class Group ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.Group
    
    @JSGlobal("ADOX.Index")
    @js.native
    /* private */ open class Index ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.Index {
      
      /* private */ /* CompleteClass */
      @JSName("ADOX.Index_typekey")
      var ADOXDotIndex_typekey: typingsJapgolly.activexAdox.ADOX.Index = js.native
      
      /* CompleteClass */
      var Clustered: Boolean = js.native
      
      /* CompleteClass */
      override def Columns(Item: String): typingsJapgolly.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      override def Columns(Item: Double): typingsJapgolly.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      @JSName("Columns")
      override val Columns_Original: Columns = js.native
      
      /* CompleteClass */
      var IndexNulls: AllowNullsEnum = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var PrimaryKey: Boolean = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var Unique: Boolean = js.native
    }
    
    @JSGlobal("ADOX.Key")
    @js.native
    /* private */ open class Key ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.Key {
      
      /* private */ /* CompleteClass */
      @JSName("ADOX.Key_typekey")
      var ADOXDotKey_typekey: typingsJapgolly.activexAdox.ADOX.Key = js.native
      
      /* CompleteClass */
      override def Columns(Item: String): typingsJapgolly.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      override def Columns(Item: Double): typingsJapgolly.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      @JSName("Columns")
      override val Columns_Original: Columns = js.native
      
      /* CompleteClass */
      var DeleteRule: RuleEnum = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var RelatedTable: String = js.native
      
      /* CompleteClass */
      var Type: KeyTypeEnum = js.native
      
      /* CompleteClass */
      var UpdateRule: RuleEnum = js.native
    }
    
    @JSGlobal("ADOX.Procedure")
    @js.native
    /* private */ open class Procedure ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.Procedure {
      
      /* private */ /* CompleteClass */
      @JSName("ADOX.Procedure_typekey")
      var ADOXDotProcedure_typekey: typingsJapgolly.activexAdox.ADOX.Procedure = js.native
      
      /* CompleteClass */
      var Command: typingsJapgolly.activexAdodb.ADODB.Command = js.native
      
      /* CompleteClass */
      override val DateCreated: VarDate | Null = js.native
      
      /* CompleteClass */
      override val DateModified: VarDate | Null = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
    }
    
    @JSGlobal("ADOX.Table")
    @js.native
    /* private */ open class Table ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.Table {
      
      /* private */ /* CompleteClass */
      @JSName("ADOX.Table_typekey")
      var ADOXDotTable_typekey: typingsJapgolly.activexAdox.ADOX.Table = js.native
      
      /* CompleteClass */
      override def Columns(Item: String): typingsJapgolly.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      override def Columns(Item: Double): typingsJapgolly.activexAdox.ADOX.Column = js.native
      /* CompleteClass */
      @JSName("Columns")
      override val Columns_Original: Columns = js.native
      
      /* CompleteClass */
      override val DateCreated: VarDate = js.native
      
      /* CompleteClass */
      override val DateModified: VarDate = js.native
      
      /* CompleteClass */
      override def Indexes(Item: String): typingsJapgolly.activexAdox.ADOX.Index = js.native
      /* CompleteClass */
      override def Indexes(Item: Double): typingsJapgolly.activexAdox.ADOX.Index = js.native
      /* CompleteClass */
      @JSName("Indexes")
      override val Indexes_Original: Indexes = js.native
      
      /* CompleteClass */
      override def Keys(Item: String): typingsJapgolly.activexAdox.ADOX.Key = js.native
      /* CompleteClass */
      override def Keys(Item: Double): typingsJapgolly.activexAdox.ADOX.Key = js.native
      /* CompleteClass */
      @JSName("Keys")
      override val Keys_Original: Keys = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      var ParentCatalog: typingsJapgolly.activexAdox.ADOX.Catalog = js.native
      
      /* CompleteClass */
      override def Properties(Index: String): Property = js.native
      /* CompleteClass */
      override def Properties(Index: Double): Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      override val Type: String = js.native
    }
    
    @JSGlobal("ADOX.User")
    @js.native
    /* private */ open class User ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.User
    
    @JSGlobal("ADOX.View")
    @js.native
    /* private */ open class View ()
      extends StObject
         with typingsJapgolly.activexAdox.ADOX.View {
      
      /* private */ /* CompleteClass */
      @JSName("ADOX.View_typekey")
      var ADOXDotView_typekey: typingsJapgolly.activexAdox.ADOX.View = js.native
      
      /* CompleteClass */
      var Command: typingsJapgolly.activexAdodb.ADODB.Command = js.native
      
      /* CompleteClass */
      override val DateCreated: VarDate = js.native
      
      /* CompleteClass */
      override val DateModified: VarDate = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
    }
  }
}
