package typingsJapgolly.xmlCore

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.std.BufferSource
import typingsJapgolly.xmlCore.distTypesErrorMod.XE
import typingsJapgolly.xmlCore.distTypesTypesMod.AssocArray
import typingsJapgolly.xmlCore.distTypesTypesMod.IConverter
import typingsJapgolly.xmlCore.distTypesTypesMod.XmlAttributeType
import typingsJapgolly.xmlCore.distTypesTypesMod.XmlBufferEncoding
import typingsJapgolly.xmlCore.distTypesTypesMod.XmlChildElementType
import typingsJapgolly.xmlCore.distTypesTypesMod.XmlContentType
import typingsJapgolly.xmlCore.distTypesTypesMod.XmlElementType
import typingsJapgolly.xmlCore.distTypesTypesMod.XmlNamespace
import typingsJapgolly.xmlCore.distTypesUtilsMod.SelectNodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xml-core", "APPLICATION_XML")
  @js.native
  val APPLICATION_XML: /* "application/xml" */ String = js.native
  
  @JSImport("xml-core", "Collection")
  @js.native
  open class Collection[I] ()
    extends typingsJapgolly.xmlCore.distTypesCollectionMod.Collection[I] {
    def this(items: js.Array[I]) = this()
  }
  
  @JSImport("xml-core", "Convert")
  @js.native
  open class Convert ()
    extends typingsJapgolly.xmlCore.distTypesConvertMod.Convert
  /* static members */
  object Convert {
    
    @JSImport("xml-core", "Convert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Base64Padding(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64Padding")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FromBase64(base64Text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64")(base64Text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def FromBase64Url(base64url: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64Url")(base64url.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def FromBinary(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBinary")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Converts Date to string
      *
      * @static
      * @param {Date} dateTime
      * @returns {string}
      *
      * @memberOf Convert
      */
    inline def FromDateTime(dateTime: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FromDateTime")(dateTime.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} hexString
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    inline def FromHex(hexString: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def FromString(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def FromString(str: String, enc: XmlBufferEncoding): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def FromUtf8String(text: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf8String")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def ToBase64(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ToBase64Url(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ToBinary(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBinary")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts string to Date
      *
      * @static
      * @param {string} dateTime
      * @returns {Date}
      *
      * @memberOf Convert
      */
    inline def ToDateTime(dateTime: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("ToDateTime")(dateTime.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    inline def ToHex(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHex")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ToString(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def ToUtf8String(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf8String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("xml-core", "DEFAULT_NAMESPACE_URI")
  @js.native
  val DEFAULT_NAMESPACE_URI: /* "" */ String = js.native
  
  @JSImport("xml-core", "DEFAULT_PREFIX")
  @js.native
  val DEFAULT_PREFIX: /* "" */ String = js.native
  
  @JSImport("xml-core", "NamespaceManager")
  @js.native
  open class NamespaceManager ()
    extends typingsJapgolly.xmlCore.distTypesNamespaceManagerMod.NamespaceManager {
    def this(items: js.Array[XmlNamespace]) = this()
  }
  
  inline def Parse(xmlString: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(xmlString.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  @JSImport("xml-core", "Select")
  @js.native
  val Select: SelectNodes = js.native
  
  inline def SelectNamespaces(node: Element): AssocArray[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectNamespaces")(node.asInstanceOf[js.Any]).asInstanceOf[AssocArray[String]]
  
  inline def SelectSingleNode(node: Node, path: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleNode")(node.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
  
  inline def Stringify(target: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Stringify")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("xml-core", "XE")
  @js.native
  object XE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.xmlCore.distTypesErrorMod.XE & Double] = js.native
    
    /* 16 */ val ALGORITHM_NOT_SUPPORTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ALGORITHM_NOT_SUPPORTED & Double = js.native
    
    /* 17 */ val ALGORITHM_WRONG_NAME: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ALGORITHM_WRONG_NAME & Double = js.native
    
    /* 11 */ val ATTRIBUTE_MISSING: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ATTRIBUTE_MISSING & Double = js.native
    
    /* 4 */ val COLLECTION_LIMIT: typingsJapgolly.xmlCore.distTypesErrorMod.XE.COLLECTION_LIMIT & Double = js.native
    
    /* 12 */ val CONTENT_MISSING: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CONTENT_MISSING & Double = js.native
    
    /* 8 */ val CONVERTER_UNSUPPORTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CONVERTER_UNSUPPORTED & Double = js.native
    
    /* 13 */ val CRYPTOGRAPHIC: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CRYPTOGRAPHIC & Double = js.native
    
    /* 14 */ val CRYPTOGRAPHIC_NO_MODULE: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CRYPTOGRAPHIC_NO_MODULE & Double = js.native
    
    /* 15 */ val CRYPTOGRAPHIC_UNKNOWN_TRANSFORM: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CRYPTOGRAPHIC_UNKNOWN_TRANSFORM & Double = js.native
    
    /* 3 */ val DECORATOR_NULL_PARAM: typingsJapgolly.xmlCore.distTypesErrorMod.XE.DECORATOR_NULL_PARAM & Double = js.native
    
    /* 9 */ val ELEMENT_MALFORMED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ELEMENT_MALFORMED & Double = js.native
    
    /* 10 */ val ELEMENT_MISSING: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ELEMENT_MISSING & Double = js.native
    
    /* 5 */ val METHOD_NOT_IMPLEMENTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.METHOD_NOT_IMPLEMENTED & Double = js.native
    
    /* 6 */ val METHOD_NOT_SUPPORTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.METHOD_NOT_SUPPORTED & Double = js.native
    
    /* 0 */ val NONE: typingsJapgolly.xmlCore.distTypesErrorMod.XE.NONE & Double = js.native
    
    /* 2 */ val NULL_PARAM: typingsJapgolly.xmlCore.distTypesErrorMod.XE.NULL_PARAM & Double = js.native
    
    /* 1 */ val NULL_REFERENCE: typingsJapgolly.xmlCore.distTypesErrorMod.XE.NULL_REFERENCE & Double = js.native
    
    /* 7 */ val PARAM_REQUIRED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.PARAM_REQUIRED & Double = js.native
    
    /* 18 */ val XML_EXCEPTION: typingsJapgolly.xmlCore.distTypesErrorMod.XE.XML_EXCEPTION & Double = js.native
  }
  
  inline def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlAttribute")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlAttribute")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @JSImport("xml-core", "XmlBase64Converter")
  @js.native
  val XmlBase64Converter: IConverter[js.typedarray.Uint8Array] = js.native
  
  @JSImport("xml-core", "XmlBooleanConverter")
  @js.native
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  
  inline def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlChildElement")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit]]
  inline def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlChildElement")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit]]
  
  @JSImport("xml-core", "XmlCollection")
  @js.native
  open class XmlCollection[I /* <: typingsJapgolly.xmlCore.distTypesXmlObjectMod.XmlObject */] ()
    extends typingsJapgolly.xmlCore.distTypesXmlCollectionMod.XmlCollection[I] {
    def this(properties: js.Object) = this()
  }
  /* static members */
  object XmlCollection {
    
    @JSImport("xml-core", "XmlCollection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xml-core", "XmlCollection.parser")
    @js.native
    def parser: Any = js.native
    inline def parser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parser")(x.asInstanceOf[js.Any])
  }
  
  inline def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlContent")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlContent")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("XmlElement")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  @JSImport("xml-core", "XmlError")
  @js.native
  open class XmlError protected ()
    extends typingsJapgolly.xmlCore.distTypesErrorMod.XmlError {
    def this(code: XE, args: Any*) = this()
  }
  
  @JSImport("xml-core", "XmlNodeType")
  @js.native
  object XmlNodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType & Double] = js.native
    
    /* 2 */ val Attribute: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Attribute & Double = js.native
    
    /* 4 */ val CDATA: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.CDATA & Double = js.native
    
    /* 8 */ val Comment: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Comment & Double = js.native
    
    /* 9 */ val Document: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Document & Double = js.native
    
    /* 11 */ val DocumentFragment: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.DocumentFragment & Double = js.native
    
    /* 10 */ val DocumentType: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.DocumentType & Double = js.native
    
    /* 1 */ val Element: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Element & Double = js.native
    
    /* 15 */ val EndElement: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.EndElement & Double = js.native
    
    /* 16 */ val EndEntity: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.EndEntity & Double = js.native
    
    /* 6 */ val Entity: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Entity & Double = js.native
    
    /* 5 */ val EntityReference: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.EntityReference & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.None & Double = js.native
    
    /* 12 */ val Notation: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Notation & Double = js.native
    
    /* 7 */ val ProcessingInstruction: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.ProcessingInstruction & Double = js.native
    
    /* 14 */ val SignificantWhitespace: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.SignificantWhitespace & Double = js.native
    
    /* 3 */ val Text: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Text & Double = js.native
    
    /* 13 */ val Whitespace: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Whitespace & Double = js.native
    
    /* 17 */ val XmlDeclaration: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.XmlDeclaration & Double = js.native
  }
  
  @JSImport("xml-core", "XmlNumberConverter")
  @js.native
  val XmlNumberConverter: IConverter[Double] = js.native
  
  @JSImport("xml-core", "XmlObject")
  @js.native
  open class XmlObject ()
    extends typingsJapgolly.xmlCore.distTypesXmlObjectMod.XmlObject {
    def this(properties: js.Object) = this()
  }
  /* static members */
  object XmlObject {
    
    @JSImport("xml-core", "XmlObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates new instance of XmlDocument with given name of root element
      * @param  {string} root Name of root element
      * @param  {string} namespaceUri
      * @param  {string} prefix
      * @returns Document
      */
    inline def CreateDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")().asInstanceOf[Document]
    inline def CreateDocument(root: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any]).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: String, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: Unit, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: String, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: Null, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: Unit, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    
    inline def GetAttribute(element: Element, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    inline def GetAttribute(element: Element, attrName: String, defaultValue: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    inline def GetAttribute(element: Element, attrName: String, defaultValue: String, required: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    inline def GetAttribute(element: Element, attrName: String, defaultValue: Null, required: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def GetChild(node: Element, localName: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetChild(node: Element, localName: String, nameSpace: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetChild(node: Element, localName: String, nameSpace: String, required: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetChild(node: Element, localName: String, nameSpace: Unit, required: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def GetChildren(node: Node, localName: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChildren")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def GetChildren(node: Node, localName: String, nameSpace: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChildren")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def GetElement(element: Element, name: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def GetElement(element: Element, name: String, required: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    inline def GetElementById(element: Document, idValue: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElementById")(element.asInstanceOf[js.Any], idValue.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetElementById(element: Element, idValue: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElementById")(element.asInstanceOf[js.Any], idValue.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def GetFirstChild(node: Node, localName: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def LoadXml[T /* <: typingsJapgolly.xmlCore.distTypesXmlObjectMod.XmlObject */](param: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadXml")(param.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def LoadXml[T /* <: typingsJapgolly.xmlCore.distTypesXmlObjectMod.XmlObject */](param: Element): T = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadXml")(param.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @JSImport("xml-core", "XmlObject.attributes")
    @js.native
    def attributes: AssocArray[XmlAttributeType[Any]] = js.native
    inline def attributes_=(x: AssocArray[XmlAttributeType[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.elements")
    @js.native
    def elements: AssocArray[XmlChildElementType[Any]] = js.native
    inline def elements_=(x: AssocArray[XmlChildElementType[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.localName")
    @js.native
    def localName: String = js.native
    inline def localName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localName")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.namespaceURI")
    @js.native
    def namespaceURI: String | Null = js.native
    inline def namespaceURI_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.prefix")
    @js.native
    def prefix: String | Null = js.native
    inline def prefix_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
  }
  
  inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def isDocument(obj: Any): /* is std.Document */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDocument")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Document */ Boolean]
  
  inline def isElement(obj: Any): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
}
