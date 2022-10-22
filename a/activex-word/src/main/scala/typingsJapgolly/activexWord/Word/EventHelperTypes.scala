package typingsJapgolly.activexWord.Word

import typingsJapgolly.activexStdole.stdole.DISPPARAMS
import typingsJapgolly.activexStdole.stdole.EXCEPINFO
import typingsJapgolly.activexStdole.stdole.GUID
import typingsJapgolly.activexWord.activexWordStrings.Doc
import typingsJapgolly.activexWord.activexWordStrings.bstrPaperFeed
import typingsJapgolly.activexWord.activexWordStrings.bstrPrinterName
import typingsJapgolly.activexWord.activexWordStrings.cpDeliveryAddrEnd
import typingsJapgolly.activexWord.activexWordStrings.cpDeliveryAddrStart
import typingsJapgolly.activexWord.activexWordStrings.cpReturnAddrEnd
import typingsJapgolly.activexWord.activexWordStrings.cpReturnAddrStart
import typingsJapgolly.activexWord.activexWordStrings.dispidMember
import typingsJapgolly.activexWord.activexWordStrings.fCancel
import typingsJapgolly.activexWord.activexWordStrings.fPrint
import typingsJapgolly.activexWord.activexWordStrings.lcid
import typingsJapgolly.activexWord.activexWordStrings.pdispparams
import typingsJapgolly.activexWord.activexWordStrings.pexcepinfo
import typingsJapgolly.activexWord.activexWordStrings.puArgErr
import typingsJapgolly.activexWord.activexWordStrings.pvarResult
import typingsJapgolly.activexWord.activexWordStrings.riid
import typingsJapgolly.activexWord.activexWordStrings.wFlags
import typingsJapgolly.activexWord.activexWordStrings.xaWidth
import typingsJapgolly.activexWord.activexWordStrings.yaHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type ApplicationEPostageInsertExArgNames = js.Tuple11[
    Doc, 
    cpDeliveryAddrStart, 
    cpDeliveryAddrEnd, 
    cpReturnAddrStart, 
    cpReturnAddrEnd, 
    xaWidth, 
    yaHeight, 
    bstrPrinterName, 
    bstrPaperFeed, 
    fPrint, 
    fCancel
  ]
  
  trait ApplicationEPostageInsertExParameter extends StObject {
    
    val Doc: Document
    
    val bstrPaperFeed: String
    
    val bstrPrinterName: String
    
    val cpDeliveryAddrEnd: Double
    
    val cpDeliveryAddrStart: Double
    
    val cpReturnAddrEnd: Double
    
    val cpReturnAddrStart: Double
    
    var fCancel: Boolean
    
    val fPrint: Boolean
    
    val xaWidth: Double
    
    val yaHeight: Double
  }
  object ApplicationEPostageInsertExParameter {
    
    inline def apply(
      Doc: Document,
      bstrPaperFeed: String,
      bstrPrinterName: String,
      cpDeliveryAddrEnd: Double,
      cpDeliveryAddrStart: Double,
      cpReturnAddrEnd: Double,
      cpReturnAddrStart: Double,
      fCancel: Boolean,
      fPrint: Boolean,
      xaWidth: Double,
      yaHeight: Double
    ): ApplicationEPostageInsertExParameter = {
      val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], bstrPaperFeed = bstrPaperFeed.asInstanceOf[js.Any], bstrPrinterName = bstrPrinterName.asInstanceOf[js.Any], cpDeliveryAddrEnd = cpDeliveryAddrEnd.asInstanceOf[js.Any], cpDeliveryAddrStart = cpDeliveryAddrStart.asInstanceOf[js.Any], cpReturnAddrEnd = cpReturnAddrEnd.asInstanceOf[js.Any], cpReturnAddrStart = cpReturnAddrStart.asInstanceOf[js.Any], fCancel = fCancel.asInstanceOf[js.Any], fPrint = fPrint.asInstanceOf[js.Any], xaWidth = xaWidth.asInstanceOf[js.Any], yaHeight = yaHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplicationEPostageInsertExParameter]
    }
    
    extension [Self <: ApplicationEPostageInsertExParameter](x: Self) {
      
      inline def setBstrPaperFeed(value: String): Self = StObject.set(x, "bstrPaperFeed", value.asInstanceOf[js.Any])
      
      inline def setBstrPrinterName(value: String): Self = StObject.set(x, "bstrPrinterName", value.asInstanceOf[js.Any])
      
      inline def setCpDeliveryAddrEnd(value: Double): Self = StObject.set(x, "cpDeliveryAddrEnd", value.asInstanceOf[js.Any])
      
      inline def setCpDeliveryAddrStart(value: Double): Self = StObject.set(x, "cpDeliveryAddrStart", value.asInstanceOf[js.Any])
      
      inline def setCpReturnAddrEnd(value: Double): Self = StObject.set(x, "cpReturnAddrEnd", value.asInstanceOf[js.Any])
      
      inline def setCpReturnAddrStart(value: Double): Self = StObject.set(x, "cpReturnAddrStart", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: Document): Self = StObject.set(x, "Doc", value.asInstanceOf[js.Any])
      
      inline def setFCancel(value: Boolean): Self = StObject.set(x, "fCancel", value.asInstanceOf[js.Any])
      
      inline def setFPrint(value: Boolean): Self = StObject.set(x, "fPrint", value.asInstanceOf[js.Any])
      
      inline def setXaWidth(value: Double): Self = StObject.set(x, "xaWidth", value.asInstanceOf[js.Any])
      
      inline def setYaHeight(value: Double): Self = StObject.set(x, "yaHeight", value.asInstanceOf[js.Any])
    }
  }
  
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
}
