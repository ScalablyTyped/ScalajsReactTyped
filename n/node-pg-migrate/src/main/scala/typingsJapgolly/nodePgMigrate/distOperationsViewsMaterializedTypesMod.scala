package typingsJapgolly.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.DropOptions
import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.IfNotExistsOption
import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typingsJapgolly.nodePgMigrate.nodePgMigrateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsViewsMaterializedTypesMod {
  
  type AlterMaterializedView = js.Function2[
    /* viewName */ Name, 
    /* options */ AlterMaterializedViewOptions, 
    String | js.Array[String]
  ]
  
  trait AlterMaterializedViewOptions extends StObject {
    
    var cluster: js.UndefOr[Null | `false` | String] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var storageParameters: js.UndefOr[js.Object] = js.undefined
  }
  object AlterMaterializedViewOptions {
    
    inline def apply(): AlterMaterializedViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterMaterializedViewOptions]
    }
    
    extension [Self <: AlterMaterializedViewOptions](x: Self) {
      
      inline def setCluster(value: `false` | String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setClusterNull: Self = StObject.set(x, "cluster", null)
      
      inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setStorageParameters(value: js.Object): Self = StObject.set(x, "storageParameters", value.asInstanceOf[js.Any])
      
      inline def setStorageParametersUndefined: Self = StObject.set(x, "storageParameters", js.undefined)
    }
  }
  
  @js.native
  trait CreateMaterializedView extends CreateMaterializedViewFn {
    
    def reverse(viewName: Name, options: CreateMaterializedViewOptions & DropOptions, definition: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateMaterializedViewFn = js.native
  }
  
  type CreateMaterializedViewFn = js.Function3[
    /* viewName */ Name, 
    /* options */ CreateMaterializedViewOptions & DropOptions, 
    /* definition */ String, 
    String | js.Array[String]
  ]
  
  trait CreateMaterializedViewOptions
    extends StObject
       with IfNotExistsOption {
    
    var columns: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var data: js.UndefOr[Boolean] = js.undefined
    
    var storageParameters: js.UndefOr[StorageParameters] = js.undefined
    
    var tablespace: js.UndefOr[String] = js.undefined
  }
  object CreateMaterializedViewOptions {
    
    inline def apply(): CreateMaterializedViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMaterializedViewOptions]
    }
    
    extension [Self <: CreateMaterializedViewOptions](x: Self) {
      
      inline def setColumns(value: String | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setStorageParameters(value: StorageParameters): Self = StObject.set(x, "storageParameters", value.asInstanceOf[js.Any])
      
      inline def setStorageParametersUndefined: Self = StObject.set(x, "storageParameters", js.undefined)
      
      inline def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
      
      inline def setTablespaceUndefined: Self = StObject.set(x, "tablespace", js.undefined)
    }
  }
  
  type DropMaterializedView = js.Function2[
    /* viewName */ Name, 
    /* options */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RefreshMaterializedView extends RefreshMaterializedViewFn {
    
    def reverse(viewName: Name): String | js.Array[String] = js.native
    def reverse(viewName: Name, options: RefreshMaterializedViewOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RefreshMaterializedViewFn = js.native
  }
  
  type RefreshMaterializedViewFn = js.Function2[
    /* viewName */ Name, 
    /* options */ js.UndefOr[RefreshMaterializedViewOptions], 
    String | js.Array[String]
  ]
  
  trait RefreshMaterializedViewOptions extends StObject {
    
    var concurrently: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Boolean] = js.undefined
  }
  object RefreshMaterializedViewOptions {
    
    inline def apply(): RefreshMaterializedViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshMaterializedViewOptions]
    }
    
    extension [Self <: RefreshMaterializedViewOptions](x: Self) {
      
      inline def setConcurrently(value: Boolean): Self = StObject.set(x, "concurrently", value.asInstanceOf[js.Any])
      
      inline def setConcurrentlyUndefined: Self = StObject.set(x, "concurrently", js.undefined)
      
      inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  @js.native
  trait RenameMaterializedView extends RenameMaterializedViewFn {
    
    def reverse(viewName: Name, newViewName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameMaterializedViewFn = js.native
  }
  
  @js.native
  trait RenameMaterializedViewColumn extends RenameMaterializedViewColumnFn {
    
    def reverse(viewName: Name, columnName: String, newColumnName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameMaterializedViewColumnFn = js.native
  }
  
  type RenameMaterializedViewColumnFn = js.Function3[
    /* viewName */ Name, 
    /* columnName */ String, 
    /* newColumnName */ String, 
    String | js.Array[String]
  ]
  
  type RenameMaterializedViewFn = js.Function2[/* viewName */ Name, /* newViewName */ Name, String | js.Array[String]]
  
  type StorageParameters = StringDictionary[Boolean | Double]
}
