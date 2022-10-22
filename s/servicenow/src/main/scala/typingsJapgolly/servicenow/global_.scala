package typingsJapgolly.servicenow

import typingsJapgolly.servicenow.servicenow.GlideEmailOutbound
import typingsJapgolly.servicenow.servicenow.GlideScriptedProcessor
import typingsJapgolly.servicenow.servicenow.GlideServletRequest
import typingsJapgolly.servicenow.servicenow.GlideServletResponse
import typingsJapgolly.servicenow.servicenow.GlideSystem
import typingsJapgolly.servicenow.servicenow.RestHTTPMethods
import typingsJapgolly.servicenow.servicenow.SOAPResponseV2
import typingsJapgolly.servicenow.servicenow.XMLNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global_ {
  
  @JSGlobal("GlideDateTime")
  @js.native
  open class GlideDateTime ()
    extends StObject
       with typingsJapgolly.servicenow.GlideDateTime {
    def this(value: String) = this()
    def this(value: typingsJapgolly.servicenow.GlideDateTime) = this()
  }
  
  @JSGlobal("GlideDuration")
  @js.native
  open class GlideDuration ()
    extends StObject
       with typingsJapgolly.servicenow.GlideDuration {
    def this(value: String) = this()
    def this(value: Double) = this()
    def this(value: typingsJapgolly.servicenow.GlideDuration) = this()
    
    /* CompleteClass */
    override def add(value: typingsJapgolly.servicenow.GlideDuration): typingsJapgolly.servicenow.GlideDuration = js.native
    
    /* CompleteClass */
    override def getByFormat(format: String): String = js.native
    
    /* CompleteClass */
    override def getDayPart(): Double = js.native
    
    /* CompleteClass */
    override def getDisplayValue(): String = js.native
    
    /* CompleteClass */
    override def getDurationValue(): String = js.native
    
    /* CompleteClass */
    override def getNumericValue(): Double = js.native
    
    /* CompleteClass */
    override def getRoundedDayPart(): Double = js.native
    
    /* CompleteClass */
    override def getValue(): String = js.native
    
    /* CompleteClass */
    override def setDisplayValue(asDisplayed: String): Unit = js.native
    
    /* CompleteClass */
    override def setValue(o: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def subtract(value: typingsJapgolly.servicenow.GlideDuration): typingsJapgolly.servicenow.GlideDuration = js.native
  }
  
  @JSGlobal("GlideEvaluator")
  @js.native
  open class GlideEvaluator ()
    extends StObject
       with typingsJapgolly.servicenow.GlideEvaluator
  
  object GlideFilter {
    
    @JSGlobal("GlideFilter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkRecord(gr: typingsJapgolly.servicenow.servicenow.GlideRecord, filter: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkRecord")(gr.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def checkRecord(gr: typingsJapgolly.servicenow.servicenow.GlideRecord, filter: String, matchAll: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkRecord")(gr.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], matchAll.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object GlideGuid {
    
    @JSGlobal("GlideGuid")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  }
  
  @JSGlobal("GlideLocale")
  @js.native
  open class GlideLocale ()
    extends StObject
       with typingsJapgolly.servicenow.GlideLocale {
    
    /* CompleteClass */
    override def getDecimalSeparator(): String = js.native
    
    /* CompleteClass */
    override def getGroupingSeparator(): String = js.native
  }
  object GlideLocale {
    
    @JSGlobal("GlideLocale")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def get(): typingsJapgolly.servicenow.GlideLocale = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[typingsJapgolly.servicenow.GlideLocale]
  }
  
  object GlidePluginManager {
    
    @JSGlobal("GlidePluginManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isActive(pluginId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActive")(pluginId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecord")
  @js.native
  open class GlideRecord protected ()
    extends StObject
       with typingsJapgolly.servicenow.servicenow.GlideRecord {
    def this(`type`: String) = this()
  }
  @JSGlobal("GlideRecord")
  @js.native
  val GlideRecord: typingsJapgolly.servicenow.servicenow.GlideRecord = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("GlideRecordSecure")
  @js.native
  open class GlideRecordSecure protected ()
    extends StObject
       with typingsJapgolly.servicenow.servicenow.GlideRecord {
    def this(`type`: String) = this()
  }
  @JSGlobal("GlideRecordSecure")
  @js.native
  val GlideRecordSecure: typingsJapgolly.servicenow.servicenow.GlideRecord = js.native
  
  @JSGlobal("GlideSchedule")
  @js.native
  open class GlideSchedule ()
    extends StObject
       with typingsJapgolly.servicenow.GlideSchedule {
    def this(sysId: String, timeZone: String) = this()
    
    /* CompleteClass */
    override def add(
      startDate: typingsJapgolly.servicenow.GlideDateTime,
      offset: typingsJapgolly.servicenow.GlideDuration
    ): typingsJapgolly.servicenow.GlideDateTime = js.native
    
    /* CompleteClass */
    override def duration(
      startDate: typingsJapgolly.servicenow.GlideDateTime,
      endDate: typingsJapgolly.servicenow.GlideDateTime
    ): typingsJapgolly.servicenow.GlideDuration = js.native
    
    /* CompleteClass */
    override def getName(): String = js.native
    
    /* CompleteClass */
    override def isInSchedule(time: typingsJapgolly.servicenow.GlideDateTime): String = js.native
    
    /* CompleteClass */
    override def isValid(): Boolean = js.native
    
    /* CompleteClass */
    override def load(sysId: String, timeZone: String, excludeSpanId: String): Unit = js.native
    
    /* CompleteClass */
    override def setTimeZone(tz: String): Unit = js.native
    
    /* CompleteClass */
    override def whenNext(time: typingsJapgolly.servicenow.GlideDateTime, timeZone: String): Double = js.native
  }
  
  object GlideSecureRandomUtil {
    
    @JSGlobal("GlideSecureRandomUtil")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getSecureRandomInt(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomInt")().asInstanceOf[Double]
    
    inline def getSecureRandomIntBound(bound: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomIntBound")(bound.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getSecureRandomLong(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomLong")().asInstanceOf[Double]
    
    inline def getSecureRandomString(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecureRandomString")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSGlobal("GlideSysAttachment")
  @js.native
  open class GlideSysAttachment ()
    extends StObject
       with typingsJapgolly.servicenow.GlideSysAttachment {
    
    /* CompleteClass */
    override def copy(sourceTable: String, sourceSysId: String, destinationTable: String, destinationSysId: String): Unit = js.native
    
    /* CompleteClass */
    override def deleteAttachment(sysId: String): Unit = js.native
    
    /* CompleteClass */
    override def getContent(record: typingsJapgolly.servicenow.servicenow.GlideRecord): Any = js.native
    
    /* CompleteClass */
    override def getContentBase64(record: typingsJapgolly.servicenow.servicenow.GlideRecord): String = js.native
    
    /* CompleteClass */
    override def getContentStream(sysId: String): js.Object = js.native
    
    /* CompleteClass */
    override def write(
      record: typingsJapgolly.servicenow.servicenow.GlideRecord,
      fileName: String,
      contentType: String,
      data: Any
    ): String = js.native
    
    /* CompleteClass */
    override def writeBase64(
      record: typingsJapgolly.servicenow.servicenow.GlideRecord,
      fileName: String,
      contentType: String,
      base64Content: String
    ): String = js.native
    
    /* CompleteClass */
    override def writeContentStream(
      record: typingsJapgolly.servicenow.servicenow.GlideRecord,
      fileName: String,
      contentType: String,
      inputStream: js.Object
    ): String = js.native
  }
  
  @JSGlobal("GlideTime")
  @js.native
  open class GlideTime protected ()
    extends StObject
       with typingsJapgolly.servicenow.GlideTime {
    def this(milliseconds: Double) = this()
    
    /* CompleteClass */
    override def getByFormat(format: String): String = js.native
    
    /* CompleteClass */
    override def getDisplayValue(): String = js.native
    
    /* CompleteClass */
    override def getDisplayValueinternal(): String = js.native
    
    /* CompleteClass */
    override def getValue(): String = js.native
    
    /* CompleteClass */
    override def setDisplayValue(asDisplayed: String): Unit = js.native
    
    /* CompleteClass */
    override def setValue(o: String): Unit = js.native
    
    /* CompleteClass */
    override def subtract(start: typingsJapgolly.servicenow.GlideTime, end: typingsJapgolly.servicenow.GlideTime): typingsJapgolly.servicenow.GlideDuration = js.native
  }
  
  object RP {
    
    @JSGlobal("RP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getParameterValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getParameters(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameters")().asInstanceOf[js.Array[String]]
    
    inline def getReferringURL(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getReferringURL")().asInstanceOf[String]
    
    inline def getViewID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewID")().asInstanceOf[String]
    
    inline def isDialog(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDialog")().asInstanceOf[Boolean]
    
    inline def isHomePage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHomePage")().asInstanceOf[Boolean]
    
    inline def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]
    
    inline def isPrint(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrint")().asInstanceOf[Boolean]
  }
  
  @JSGlobal("XMLDocument2")
  @js.native
  open class XMLDocument2 ()
    extends StObject
       with typingsJapgolly.servicenow.XMLDocument2 {
    
    /* CompleteClass */
    override def createElement(name: String): XMLNode = js.native
    
    /* CompleteClass */
    override def createElementWithTextValue(name: String, value: String): XMLNode = js.native
    
    /* CompleteClass */
    override def getDocumentElement(): XMLNode = js.native
    
    /* CompleteClass */
    override def getFirstNode(xpath: String): XMLNode = js.native
    
    /* CompleteClass */
    override def getNextNode(prev: js.Object): XMLNode = js.native
    
    /* CompleteClass */
    override def getNode(xpath: String): XMLNode = js.native
    
    /* CompleteClass */
    override def getNodeText(xpath: String): String = js.native
    
    /* CompleteClass */
    override def parseXML(xmlDoc: String): Unit = js.native
    
    /* CompleteClass */
    override def setCurrentElement(element: XMLNode): Unit = js.native
  }
  
  @JSGlobal("email")
  @js.native
  val email: GlideEmailOutbound = js.native
  
  @JSGlobal("g_processor")
  @js.native
  val gProcessor: GlideScriptedProcessor = js.native
  
  @JSGlobal("g_request")
  @js.native
  val gRequest: GlideServletRequest = js.native
  
  @JSGlobal("g_response")
  @js.native
  val gResponse: GlideServletResponse = js.native
  
  object global {
    
    object Class {
      
      @JSGlobal("global.Class")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Any]
    }
    
    object GlideStringUtil {
      
      @JSGlobal("global.GlideStringUtil")
      @js.native
      val ^ : js.Any = js.native
      
      inline def base64Decode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def base64DecodeAsBytes(value: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("base64DecodeAsBytes")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def escapeHTML(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getStringFromStream(stream: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    @JSGlobal("global.Workflow")
    @js.native
    open class Workflow ()
      extends StObject
         with typingsJapgolly.servicenow.global.Workflow
  }
  
  @JSGlobal("gs")
  @js.native
  val gs: GlideSystem = js.native
  
  object snWs {
    
    @JSGlobal("sn_ws.RESTMessageV2")
    @js.native
    open class RESTMessageV2 ()
      extends StObject
         with typingsJapgolly.servicenow.snWs.RESTMessageV2 {
      def this(name: String, methodName: RestHTTPMethods) = this()
    }
    
    @JSGlobal("sn_ws.SOAPMessageV2")
    @js.native
    open class SOAPMessageV2 ()
      extends StObject
         with typingsJapgolly.servicenow.snWs.SOAPMessageV2 {
      def this(soapMessage: String, soapFunction: String) = this()
      
      /* CompleteClass */
      override def execute(): SOAPResponseV2 = js.native
      
      /* CompleteClass */
      override def executeAsync(): SOAPResponseV2 = js.native
      
      /* CompleteClass */
      override def getEndpoint(): String = js.native
      
      /* CompleteClass */
      override def getRequestBody(): String = js.native
      
      /* CompleteClass */
      override def getRequestHeader(headerName: String): String = js.native
      
      /* CompleteClass */
      override def getRequestHeaders(): js.Object = js.native
      
      /* CompleteClass */
      override def setBasicAuth(userName: String, userPass: String): Unit = js.native
      
      /* CompleteClass */
      override def setEccCorrelator(correlator: String): Unit = js.native
      
      /* CompleteClass */
      override def setEccParameter(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setEndpoint(endpoint: String): Unit = js.native
      
      /* CompleteClass */
      override def setHttpMethod(method: String): Unit = js.native
      
      /* CompleteClass */
      override def setHttpTimeout(timeoutMs: Double): Unit = js.native
      
      /* CompleteClass */
      override def setMIDServer(midServer: String): Unit = js.native
      
      /* CompleteClass */
      override def setMutualAuth(profileName: String): Unit = js.native
      
      /* CompleteClass */
      override def setRequestBody(body: String): Unit = js.native
      
      /* CompleteClass */
      override def setRequestHeader(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setStringParameter(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setStringParameterNoEscape(name: String, value: String): Unit = js.native
      
      /* CompleteClass */
      override def setWSSecurity(keystoreId: String, keystoreAlias: String, keystorePassword: String, certificateId: String): Unit = js.native
    }
  }
}
