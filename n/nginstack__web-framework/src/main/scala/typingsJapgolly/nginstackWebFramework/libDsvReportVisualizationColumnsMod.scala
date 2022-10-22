package typingsJapgolly.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvReportVisualizationColumnsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumns", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ReportVisualizationColumns
  @JSImport("@nginstack/web-framework/lib/dsv/ReportVisualizationColumns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromArray(arr: js.Array[typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^]): ReportVisualizationColumns = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReportVisualizationColumns]
  
  @js.native
  trait ReportVisualizationColumns extends StObject {
    
    def add(column: typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^): Unit = js.native
    
    def find(
      f: js.Function1[
          /* arg0 */ typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^, 
          Unit
        ]
    ): typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^ = js.native
    def find(
      f: js.Function1[
          /* arg0 */ typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^, 
          Unit
        ],
      opt_obj: Any
    ): typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^ = js.native
    
    def forEach(
      f: js.Function1[
          /* arg0 */ typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^, 
          Unit
        ]
    ): Unit = js.native
    def forEach(
      f: js.Function1[
          /* arg0 */ typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^, 
          Unit
        ],
      opt_obj: Any
    ): Unit = js.native
    
    def getColumn(name: String): typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^ = js.native
    
    def getColumnOrder(column: String): Double = js.native
    def getColumnOrder(column: typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^): Double = js.native
    
    /* private */ var items_ : Any = js.native
    
    /* private */ var orderedNames_ : Any = js.native
    
    def toArray(): js.Array[typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^] = js.native
    
    def tryGetColumn(name: String): typingsJapgolly.nginstackWebFramework.libDsvReportVisualizationColumnMod.^ = js.native
  }
}
