package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.IColumnDef
import typingsJapgolly.ngTable.srcBrowserPublicInterfacesMod.IDynamicTableColDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableColumnMod {
  
  @JSImport("ng-table/src/browser/ngTableColumn", "NgTableColumn")
  @js.native
  open class NgTableColumn[TCol /* <: IColumnDef | IDynamicTableColDef */] () extends StObject {
    
    /**
      * Creates a $column for use within a header template
      *
      * @param column the initial definition for $column to build
      * @param defaultScope the $scope to supply to the $column getter methods when not supplied by caller
      * @param columns a reference to the $columns array to make available on the context supplied to the
      * $column getter methods
      */
    def buildColumn(column: TCol, defaultScope: IScope, columns: js.Array[IColumnDef]): IColumnDef = js.native
    
    /* private */ def createDefaults(): Any = js.native
    
    /* private */ def createGetterSetter(initialValue: Any): Any = js.native
  }
  /* static members */
  object NgTableColumn {
    
    @JSImport("ng-table/src/browser/ngTableColumn", "NgTableColumn")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ng-table/src/browser/ngTableColumn", "NgTableColumn.$inject")
    @js.native
    def $inject: js.Array[String] = js.native
    inline def $inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
}
