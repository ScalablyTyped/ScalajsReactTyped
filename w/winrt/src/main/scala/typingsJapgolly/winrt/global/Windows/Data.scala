package typingsJapgolly.winrt.global.Windows

import typingsJapgolly.winrt.Windows.Data.Json.IJsonValue
import typingsJapgolly.winrt.Windows.Data.Json.JsonErrorStatus
import typingsJapgolly.winrt.Windows.Data.Json.JsonValueType
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlText
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.anon.Result
import typingsJapgolly.winrt.anon.ResultSucceeded
import typingsJapgolly.winrt.anon.Succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  object Html {
    
    @JSGlobal("Windows.Data.Html.HtmlUtilities")
    @js.native
    open class HtmlUtilities ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Data.Html.HtmlUtilities
    /* static members */
    object HtmlUtilities {
      
      @JSGlobal("Windows.Data.Html.HtmlUtilities")
      @js.native
      val ^ : js.Any = js.native
      
      inline def convertToText(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToText")(html.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
  
  object Json {
    
    @JSGlobal("Windows.Data.Json.JsonArray")
    @js.native
    open class JsonArray ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Data.Json.JsonArray {
      
      /* CompleteClass */
      override def first(): IIterator[IJsonValue] = js.native
      
      /* CompleteClass */
      override def getArray(): typingsJapgolly.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getArrayAt(index: Double): typingsJapgolly.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getBoolean(): Boolean = js.native
      
      /* CompleteClass */
      override def getBooleanAt(index: Double): Boolean = js.native
      
      /* CompleteClass */
      override def getNumber(): Double = js.native
      
      /* CompleteClass */
      override def getNumberAt(index: Double): Double = js.native
      
      /* CompleteClass */
      override def getObject(): typingsJapgolly.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getObjectAt(index: Double): typingsJapgolly.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getString(): String = js.native
      
      /* CompleteClass */
      override def getStringAt(index: Double): String = js.native
      
      /* CompleteClass */
      override def stringify(): String = js.native
      
      /* CompleteClass */
      var valueType: JsonValueType = js.native
    }
    /* static members */
    object JsonArray {
      
      @JSGlobal("Windows.Data.Json.JsonArray")
      @js.native
      val ^ : js.Any = js.native
      
      inline def parse(input: String): typingsJapgolly.winrt.Windows.Data.Json.JsonArray = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Data.Json.JsonArray]
      
      inline def tryParse(input: String): ResultSucceeded = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ResultSucceeded]
    }
    
    @JSGlobal("Windows.Data.Json.JsonError")
    @js.native
    open class JsonError ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Data.Json.JsonError
    /* static members */
    object JsonError {
      
      @JSGlobal("Windows.Data.Json.JsonError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getStatus(hresult: Double): JsonErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[JsonErrorStatus]
    }
    
    @JSGlobal("Windows.Data.Json.JsonErrorStatus")
    @js.native
    object JsonErrorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Data.Json.JsonErrorStatus & Double] = js.native
      
      /* 4 */ val implementationLimit: typingsJapgolly.winrt.Windows.Data.Json.JsonErrorStatus.implementationLimit & Double = js.native
      
      /* 2 */ val invalidJsonNumber: typingsJapgolly.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonNumber & Double = js.native
      
      /* 1 */ val invalidJsonString: typingsJapgolly.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonString & Double = js.native
      
      /* 3 */ val jsonValueNotFound: typingsJapgolly.winrt.Windows.Data.Json.JsonErrorStatus.jsonValueNotFound & Double = js.native
      
      /* 0 */ val unknown: typingsJapgolly.winrt.Windows.Data.Json.JsonErrorStatus.unknown & Double = js.native
    }
    
    @JSGlobal("Windows.Data.Json.JsonObject")
    @js.native
    open class JsonObject ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Data.Json.JsonObject {
      
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[String, IJsonValue]] = js.native
      
      /* CompleteClass */
      override def getArray(): typingsJapgolly.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getBoolean(): Boolean = js.native
      
      /* CompleteClass */
      override def getNamedArray(name: String): typingsJapgolly.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getNamedBoolean(name: String): Boolean = js.native
      
      /* CompleteClass */
      override def getNamedNumber(name: String): Double = js.native
      
      /* CompleteClass */
      override def getNamedObject(name: String): typingsJapgolly.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getNamedString(name: String): String = js.native
      
      /* CompleteClass */
      override def getNamedValue(name: String): typingsJapgolly.winrt.Windows.Data.Json.JsonValue = js.native
      
      /* CompleteClass */
      override def getNumber(): Double = js.native
      
      /* CompleteClass */
      override def getObject(): typingsJapgolly.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getString(): String = js.native
      
      /* CompleteClass */
      override def getView(): IMapView[String, IJsonValue] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def insert(key: String, value: IJsonValue): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): IJsonValue = js.native
      
      /* CompleteClass */
      override def remove(key: String): Unit = js.native
      
      /* CompleteClass */
      override def setNamedValue(name: String, value: IJsonValue): Unit = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def stringify(): String = js.native
      
      /* CompleteClass */
      var valueType: JsonValueType = js.native
    }
    /* static members */
    object JsonObject {
      
      @JSGlobal("Windows.Data.Json.JsonObject")
      @js.native
      val ^ : js.Any = js.native
      
      inline def parse(input: String): typingsJapgolly.winrt.Windows.Data.Json.JsonObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Data.Json.JsonObject]
      
      inline def tryParse(input: String): Succeeded = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[Succeeded]
    }
    
    @JSGlobal("Windows.Data.Json.JsonValue")
    @js.native
    open class JsonValue ()
      extends StObject
         with typingsJapgolly.winrt.Windows.Data.Json.JsonValue {
      
      /* CompleteClass */
      override def getArray(): typingsJapgolly.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getBoolean(): Boolean = js.native
      
      /* CompleteClass */
      override def getNumber(): Double = js.native
      
      /* CompleteClass */
      override def getObject(): typingsJapgolly.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getString(): String = js.native
      
      /* CompleteClass */
      override def stringify(): String = js.native
      
      /* CompleteClass */
      var valueType: JsonValueType = js.native
    }
    /* static members */
    object JsonValue {
      
      @JSGlobal("Windows.Data.Json.JsonValue")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createBooleanValue(input: Boolean): typingsJapgolly.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createBooleanValue")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Data.Json.JsonValue]
      
      inline def createNumberValue(input: Double): typingsJapgolly.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberValue")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Data.Json.JsonValue]
      
      inline def createStringValue(input: String): typingsJapgolly.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringValue")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Data.Json.JsonValue]
      
      inline def parse(input: String): typingsJapgolly.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Data.Json.JsonValue]
      
      inline def tryParse(input: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[Result]
    }
    
    @JSGlobal("Windows.Data.Json.JsonValueType")
    @js.native
    object JsonValueType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Data.Json.JsonValueType & Double] = js.native
      
      /* 4 */ val array: typingsJapgolly.winrt.Windows.Data.Json.JsonValueType.array & Double = js.native
      
      /* 1 */ val boolean: typingsJapgolly.winrt.Windows.Data.Json.JsonValueType.boolean & Double = js.native
      
      /* 0 */ val null_ : typingsJapgolly.winrt.Windows.Data.Json.JsonValueType.null_ & Double = js.native
      
      /* 2 */ val number: typingsJapgolly.winrt.Windows.Data.Json.JsonValueType.number & Double = js.native
      
      /* 5 */ val `object`: typingsJapgolly.winrt.Windows.Data.Json.JsonValueType.`object` & Double = js.native
      
      /* 3 */ val string: typingsJapgolly.winrt.Windows.Data.Json.JsonValueType.string & Double = js.native
    }
  }
  
  object Xml {
    
    object Dom {
      
      @JSGlobal("Windows.Data.Xml.Dom.DtdEntity")
      @js.native
      open class DtdEntity ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.DtdEntity {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var notationName: Any = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var publicId: Any = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        var systemId: Any = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.DtdNotation")
      @js.native
      open class DtdNotation ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.DtdNotation {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var publicId: Any = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        var systemId: Any = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.NodeType")
      @js.native
      object NodeType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType & Double] = js.native
        
        /* 2 */ val attributeNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.attributeNode & Double = js.native
        
        /* 8 */ val commentNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.commentNode & Double = js.native
        
        /* 4 */ val dataSectionNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.dataSectionNode & Double = js.native
        
        /* 11 */ val documentFragmentNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.documentFragmentNode & Double = js.native
        
        /* 9 */ val documentNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.documentNode & Double = js.native
        
        /* 10 */ val documentTypeNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.documentTypeNode & Double = js.native
        
        /* 1 */ val elementNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.elementNode & Double = js.native
        
        /* 6 */ val entityNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.entityNode & Double = js.native
        
        /* 5 */ val entityReferenceNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.entityReferenceNode & Double = js.native
        
        /* 0 */ val invalid: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.invalid & Double = js.native
        
        /* 12 */ val notationNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.notationNode & Double = js.native
        
        /* 7 */ val processingInstructionNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.processingInstructionNode & Double = js.native
        
        /* 3 */ val textNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.NodeType.textNode & Double = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlAttribute")
      @js.native
      open class XmlAttribute ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var name: String = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        var specified: Boolean = js.native
        
        /* CompleteClass */
        var value: String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlCDataSection")
      @js.native
      open class XmlCDataSection ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlCDataSection {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def appendData(data: String): Unit = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        override def deleteData(offset: Double, count: Double): Unit = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def insertData(offset: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var length: Double = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def splitText(offset: Double): IXmlText = js.native
        
        /* CompleteClass */
        override def substringData(offset: Double, count: Double): String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlComment")
      @js.native
      open class XmlComment ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlComment {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def appendData(data: String): Unit = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        override def deleteData(offset: Double, count: Double): Unit = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def insertData(offset: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var length: Double = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def substringData(offset: Double, count: Double): String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
      @js.native
      open class XmlDocument ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        override def createAttribute(name: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def createAttributeNS(namespaceUri: Any, qualifiedName: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def createCDataSection(data: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlCDataSection = js.native
        
        /* CompleteClass */
        override def createComment(data: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlComment = js.native
        
        /* CompleteClass */
        override def createDocumentFragment(): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment = js.native
        
        /* CompleteClass */
        override def createElement(tagName: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        override def createElementNS(namespaceUri: Any, qualifiedName: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        override def createEntityReference(name: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlEntityReference = js.native
        
        /* CompleteClass */
        override def createProcessingInstruction(target: String, data: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction = js.native
        
        /* CompleteClass */
        override def createTextNode(data: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlText = js.native
        
        /* CompleteClass */
        var doctype: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocumentType = js.native
        
        /* CompleteClass */
        var documentElement: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        var documentUri: String = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getElementById(elementId: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        override def getElementsByTagName(tagName: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var implementation: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDomImplementation = js.native
        
        /* CompleteClass */
        override def importNode(node: IXmlNode, deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
      }
      /* static members */
      object XmlDocument {
        
        @JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
        @js.native
        val ^ : js.Any = js.native
        
        inline def loadFromFileAsync(file: IStorageFile): IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument]]
        inline def loadFromFileAsync(file: IStorageFile, loadSettings: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromFileAsync")(file.asInstanceOf[js.Any], loadSettings.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument]]
        
        inline def loadFromUriAsync(uri: Uri): IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromUriAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument]]
        inline def loadFromUriAsync(uri: Uri, loadSettings: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromUriAsync")(uri.asInstanceOf[js.Any], loadSettings.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument]]
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocumentFragment")
      @js.native
      open class XmlDocumentFragment ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocumentType")
      @js.native
      open class XmlDocumentType ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocumentType {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var entities: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var name: String = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var notations: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDomImplementation")
      @js.native
      open class XmlDomImplementation ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDomImplementation {
        
        /* CompleteClass */
        override def hasFeature(feature: String, version: Any): Boolean = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlElement")
      @js.native
      open class XmlElement ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlElement {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getAttribute(attributeName: String): String = js.native
        
        /* CompleteClass */
        override def getAttributeNS(namespaceUri: Any, localName: String): String = js.native
        
        /* CompleteClass */
        override def getAttributeNode(attributeName: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def getAttributeNodeNS(namespaceUri: Any, localName: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def getElementsByTagName(tagName: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeAttribute(attributeName: String): Unit = js.native
        
        /* CompleteClass */
        override def removeAttributeNS(namespaceUri: Any, localName: String): Unit = js.native
        
        /* CompleteClass */
        override def removeAttributeNode(attributeNode: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def setAttribute(attributeName: String, attributeValue: String): Unit = js.native
        
        /* CompleteClass */
        override def setAttributeNS(namespaceUri: Any, qualifiedName: String, value: String): Unit = js.native
        
        /* CompleteClass */
        override def setAttributeNode(newAttribute: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def setAttributeNodeNS(newAttribute: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        var tagName: String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlEntityReference")
      @js.native
      open class XmlEntityReference ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlEntityReference {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlLoadSettings")
      @js.native
      open class XmlLoadSettings ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlLoadSettings {
        
        /* CompleteClass */
        var elementContentWhiteSpace: Boolean = js.native
        
        /* CompleteClass */
        var maxElementDepth: Double = js.native
        
        /* CompleteClass */
        var prohibitDtd: Boolean = js.native
        
        /* CompleteClass */
        var resolveExternals: Boolean = js.native
        
        /* CompleteClass */
        var validateOnParse: Boolean = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlNamedNodeMap")
      @js.native
      open class XmlNamedNodeMap ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap {
        
        /* CompleteClass */
        override def first(): IIterator[IXmlNode] = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlNodeList")
      @js.native
      open class XmlNodeList ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList {
        
        /* CompleteClass */
        override def first(): IIterator[IXmlNode] = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlProcessingInstruction")
      @js.native
      open class XmlProcessingInstruction ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        var target: String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlText")
      @js.native
      open class XmlText ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlText {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def appendData(data: String): Unit = js.native
        
        /* CompleteClass */
        var attributes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        override def deleteData(offset: Double, count: Double): Unit = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def insertData(offset: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var length: Double = js.native
        
        /* CompleteClass */
        var localName: Any = js.native
        
        /* CompleteClass */
        var namespaceUri: Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: Any): typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def splitText(offset: Double): IXmlText = js.native
        
        /* CompleteClass */
        override def substringData(offset: Double, count: Double): String = js.native
      }
    }
    
    object Xsl {
      
      @JSGlobal("Windows.Data.Xml.Xsl.XsltProcessor")
      @js.native
      open class XsltProcessor protected ()
        extends StObject
           with typingsJapgolly.winrt.Windows.Data.Xml.Xsl.XsltProcessor {
        def this(document: XmlDocument) = this()
        
        /* CompleteClass */
        override def transformToString(inputNode: IXmlNode): String = js.native
      }
    }
  }
}
