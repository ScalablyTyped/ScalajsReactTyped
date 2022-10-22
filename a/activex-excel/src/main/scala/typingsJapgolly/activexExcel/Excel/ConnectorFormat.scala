package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexOffice.Office.MsoConnectorType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorFormat extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  def BeginConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  
  val BeginConnected: MsoTriState
  
  val BeginConnectedShape: Shape
  
  val BeginConnectionSite: Double
  
  def BeginDisconnect(): Unit
  
  val Creator: XlCreator
  
  def EndConnect(ConnectedShape: Shape, ConnectionSite: Double): Unit
  
  val EndConnected: MsoTriState
  
  val EndConnectedShape: Shape
  
  val EndConnectionSite: Double
  
  def EndDisconnect(): Unit
  
  /* private */ @JSName("Excel.ConnectorFormat_typekey")
  var ExcelDotConnectorFormat_typekey: ConnectorFormat
  
  val Parent: Any
  
  var Type: MsoConnectorType
}
object ConnectorFormat {
  
  inline def apply(
    Application: Application,
    BeginConnect: (Shape, Double) => Callback,
    BeginConnected: MsoTriState,
    BeginConnectedShape: Shape,
    BeginConnectionSite: Double,
    BeginDisconnect: Callback,
    Creator: XlCreator,
    EndConnect: (Shape, Double) => Callback,
    EndConnected: MsoTriState,
    EndConnectedShape: Shape,
    EndConnectionSite: Double,
    EndDisconnect: Callback,
    ExcelDotConnectorFormat_typekey: ConnectorFormat,
    Parent: Any,
    Type: MsoConnectorType
  ): ConnectorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BeginConnect = js.Any.fromFunction2((t0: Shape, t1: Double) => (BeginConnect(t0, t1)).runNow()), BeginConnected = BeginConnected.asInstanceOf[js.Any], BeginConnectedShape = BeginConnectedShape.asInstanceOf[js.Any], BeginConnectionSite = BeginConnectionSite.asInstanceOf[js.Any], BeginDisconnect = BeginDisconnect.toJsFn, Creator = Creator.asInstanceOf[js.Any], EndConnect = js.Any.fromFunction2((t0: Shape, t1: Double) => (EndConnect(t0, t1)).runNow()), EndConnected = EndConnected.asInstanceOf[js.Any], EndConnectedShape = EndConnectedShape.asInstanceOf[js.Any], EndConnectionSite = EndConnectionSite.asInstanceOf[js.Any], EndDisconnect = EndDisconnect.toJsFn, Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ConnectorFormat_typekey")(ExcelDotConnectorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorFormat]
  }
  
  extension [Self <: ConnectorFormat](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBeginConnect(value: (Shape, Double) => Callback): Self = StObject.set(x, "BeginConnect", js.Any.fromFunction2((t0: Shape, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setBeginConnected(value: MsoTriState): Self = StObject.set(x, "BeginConnected", value.asInstanceOf[js.Any])
    
    inline def setBeginConnectedShape(value: Shape): Self = StObject.set(x, "BeginConnectedShape", value.asInstanceOf[js.Any])
    
    inline def setBeginConnectionSite(value: Double): Self = StObject.set(x, "BeginConnectionSite", value.asInstanceOf[js.Any])
    
    inline def setBeginDisconnect(value: Callback): Self = StObject.set(x, "BeginDisconnect", value.toJsFn)
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEndConnect(value: (Shape, Double) => Callback): Self = StObject.set(x, "EndConnect", js.Any.fromFunction2((t0: Shape, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setEndConnected(value: MsoTriState): Self = StObject.set(x, "EndConnected", value.asInstanceOf[js.Any])
    
    inline def setEndConnectedShape(value: Shape): Self = StObject.set(x, "EndConnectedShape", value.asInstanceOf[js.Any])
    
    inline def setEndConnectionSite(value: Double): Self = StObject.set(x, "EndConnectionSite", value.asInstanceOf[js.Any])
    
    inline def setEndDisconnect(value: Callback): Self = StObject.set(x, "EndDisconnect", value.toJsFn)
    
    inline def setExcelDotConnectorFormat_typekey(value: ConnectorFormat): Self = StObject.set(x, "Excel.ConnectorFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoConnectorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
