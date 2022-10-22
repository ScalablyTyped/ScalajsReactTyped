package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelStrings.dispidMember
import typingsJapgolly.activexExcel.activexExcelStrings.lcid
import typingsJapgolly.activexExcel.activexExcelStrings.pdispparams
import typingsJapgolly.activexExcel.activexExcelStrings.pexcepinfo
import typingsJapgolly.activexExcel.activexExcelStrings.puArgErr
import typingsJapgolly.activexExcel.activexExcelStrings.pvarResult
import typingsJapgolly.activexExcel.activexExcelStrings.riid
import typingsJapgolly.activexExcel.activexExcelStrings.wFlags
import typingsJapgolly.activexStdole.stdole.DISPPARAMS
import typingsJapgolly.activexStdole.stdole.EXCEPINFO
import typingsJapgolly.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ApplicationInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait ApplicationInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object ApplicationInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): ApplicationInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationInvokeParameter]
    }
    
    extension [Self <: ApplicationInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type ChartInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait ChartInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object ChartInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): ChartInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartInvokeParameter]
    }
    
    extension [Self <: ChartInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type OLEObjectInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait OLEObjectInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object OLEObjectInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): OLEObjectInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[OLEObjectInvokeParameter]
    }
    
    extension [Self <: OLEObjectInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryTableInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait QueryTableInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object QueryTableInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): QueryTableInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryTableInvokeParameter]
    }
    
    extension [Self <: QueryTableInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type WorkbookInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait WorkbookInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object WorkbookInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): WorkbookInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkbookInvokeParameter]
    }
    
    extension [Self <: WorkbookInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type WorksheetInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait WorksheetInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object WorksheetInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): WorksheetInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorksheetInvokeParameter]
    }
    
    extension [Self <: WorksheetInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
}
