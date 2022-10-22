package typingsJapgolly.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExportDataSetExporterMod {
  
  inline def apply(dataSet: DataSet): Unit = ^.asInstanceOf[js.Dynamic].apply(dataSet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/export/DataSetExporter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataSetExporter {
    def this(dataSet: DataSet) = this()
    
    /* CompleteClass */
    var dataSet: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
  }
  @JSImport("@nginstack/web-framework/lib/export/DataSetExporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
  
  trait DataSetExporter extends StObject {
    
    var dataSet: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
  }
  object DataSetExporter {
    
    inline def apply(dataSet: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): DataSetExporter = {
      val __obj = js.Dynamic.literal(dataSet = dataSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetExporter]
    }
    
    extension [Self <: DataSetExporter](x: Self) {
      
      inline def setDataSet(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "dataSet", value.asInstanceOf[js.Any])
    }
  }
}
