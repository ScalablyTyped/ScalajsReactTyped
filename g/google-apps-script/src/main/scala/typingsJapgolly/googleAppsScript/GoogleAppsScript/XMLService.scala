package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XMLService {
  
  @js.native
  sealed trait ContentType extends StObject
  /**
    * An enumeration representing the types of XML content nodes.
    */
  @JSGlobal("GoogleAppsScript.XML_Service.ContentType")
  @js.native
  object ContentType extends StObject {
    
    @js.native
    sealed trait CDATA
      extends StObject
         with ContentType
    
    @js.native
    sealed trait COMMENT
      extends StObject
         with ContentType
    
    @js.native
    sealed trait DOCTYPE
      extends StObject
         with ContentType
    
    @js.native
    sealed trait ELEMENT
      extends StObject
         with ContentType
    
    @js.native
    sealed trait ENTITYREF
      extends StObject
         with ContentType
    
    @js.native
    sealed trait PROCESSINGINSTRUCTION
      extends StObject
         with ContentType
    
    @js.native
    sealed trait TEXT
      extends StObject
         with ContentType
  }
  
  /**
    * A representation of an XML attribute.
    *
    *     // Reads the first and last name of each person and adds a new attribute with the full name.
    *     var xml = '<roster>'
    *         + '<person first="John" last="Doe"/>'
    *         + '<person first="Mary" last="Smith"/>'
    *         + '</roster>';
    *     var document = XmlService.parse(xml);
    *     var people = document.getRootElement().getChildren('person');
    *     for (var i = 0; i < people.length; i++) {
    *       var person = people[i];
    *       var firstName = person.getAttribute('first').getValue();
    *       var lastName = person.getAttribute('last').getValue();
    *       person.setAttribute('full', firstName + ' ' + lastName);
    *     }
    *     xml = XmlService.getPrettyFormat().format(document);
    *     Logger.log(xml);
    */
  trait Attribute extends StObject {
    
    def getName(): String
    
    def getNamespace(): Namespace
    
    def getValue(): String
    
    def setName(name: String): Attribute
    
    def setNamespace(namespace: Namespace): Attribute
    
    def setValue(value: String): Attribute
  }
  object Attribute {
    
    inline def apply(
      getName: CallbackTo[String],
      getNamespace: CallbackTo[Namespace],
      getValue: CallbackTo[String],
      setName: String => Attribute,
      setNamespace: Namespace => Attribute,
      setValue: String => Attribute
    ): Attribute = {
      val __obj = js.Dynamic.literal(getName = getName.toJsFn, getNamespace = getNamespace.toJsFn, getValue = getValue.toJsFn, setName = js.Any.fromFunction1(setName), setNamespace = js.Any.fromFunction1(setNamespace), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetNamespace(value: CallbackTo[Namespace]): Self = StObject.set(x, "getNamespace", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setSetName(value: String => Attribute): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetNamespace(value: Namespace => Attribute): Self = StObject.set(x, "setNamespace", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: String => Attribute): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of an XML CDATASection node.
    *
    *     // Create and log an XML document that shows how special characters like '<', '>', and '&' are
    *     // stored in a CDATASection node as compared to in a Text node.
    *     var illegalCharacters = '<em>The Amazing Adventures of Kavalier & Clay</em>';
    *     var cdata = XmlService.createCdata(illegalCharacters);
    *     var text = XmlService.createText(illegalCharacters);
    *     var root = XmlService.createElement('root').addContent(cdata).addContent(text);
    *     var document = XmlService.createDocument(root);
    *     var xml = XmlService.getPrettyFormat().format(document);
    *     Logger.log(xml);
    */
  trait Cdata
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def append(text: String): Text
    
    def getText(): String
    
    def setText(text: String): Text
  }
  object Cdata {
    
    inline def apply(
      append: String => Text,
      asCdata: CallbackTo[Cdata],
      asComment: CallbackTo[Comment],
      asDocType: CallbackTo[DocType],
      asElement: CallbackTo[Element],
      asEntityRef: CallbackTo[EntityRef],
      asProcessingInstruction: CallbackTo[ProcessingInstruction],
      asText: CallbackTo[Text],
      detach: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content],
      getParentElement: CallbackTo[Element],
      getText: CallbackTo[String],
      getType: CallbackTo[ContentType],
      getValue: CallbackTo[String],
      setText: String => Text
    ): Cdata = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), asCdata = asCdata.toJsFn, asComment = asComment.toJsFn, asDocType = asDocType.toJsFn, asElement = asElement.toJsFn, asEntityRef = asEntityRef.toJsFn, asProcessingInstruction = asProcessingInstruction.toJsFn, asText = asText.toJsFn, detach = detach.toJsFn, getParentElement = getParentElement.toJsFn, getText = getText.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[Cdata]
    }
    
    extension [Self <: Cdata](x: Self) {
      
      inline def setAppend(value: String => Text): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setSetText(value: String => Text): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of an XML Comment node.
    */
  trait Comment
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getText(): String
    
    def setText(text: String): Comment
  }
  object Comment {
    
    inline def apply(
      asCdata: CallbackTo[Cdata],
      asComment: CallbackTo[Comment],
      asDocType: CallbackTo[DocType],
      asElement: CallbackTo[Element],
      asEntityRef: CallbackTo[EntityRef],
      asProcessingInstruction: CallbackTo[ProcessingInstruction],
      asText: CallbackTo[Text],
      detach: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content],
      getParentElement: CallbackTo[Element],
      getText: CallbackTo[String],
      getType: CallbackTo[ContentType],
      getValue: CallbackTo[String],
      setText: String => Comment
    ): Comment = {
      val __obj = js.Dynamic.literal(asCdata = asCdata.toJsFn, asComment = asComment.toJsFn, asDocType = asDocType.toJsFn, asElement = asElement.toJsFn, asEntityRef = asEntityRef.toJsFn, asProcessingInstruction = asProcessingInstruction.toJsFn, asText = asText.toJsFn, detach = detach.toJsFn, getParentElement = getParentElement.toJsFn, getText = getText.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setSetText(value: String => Comment): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of a generic XML node.
    * Implementing classes
    *
    * NameBrief description
    *
    * CdataA representation of an XML CDATASection node.
    *
    * CommentA representation of an XML Comment node.
    *
    * DocTypeA representation of an XML DocumentType node.
    *
    * ElementA representation of an XML Element node.
    *
    * EntityRefA representation of an XML EntityReference node.
    *
    * ProcessingInstructionA representation of an XML ProcessingInstruction node.
    *
    * TextA representation of an XML Text node.
    */
  trait Content extends StObject {
    
    def asCdata(): Cdata
    
    def asComment(): Comment
    
    def asDocType(): DocType
    
    def asElement(): Element
    
    def asEntityRef(): EntityRef
    
    def asProcessingInstruction(): ProcessingInstruction
    
    def asText(): Text
    
    def detach(): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content
    
    def getParentElement(): Element
    
    def getType(): ContentType
    
    def getValue(): String
  }
  object Content {
    
    inline def apply(
      asCdata: CallbackTo[Cdata],
      asComment: CallbackTo[Comment],
      asDocType: CallbackTo[DocType],
      asElement: CallbackTo[Element],
      asEntityRef: CallbackTo[EntityRef],
      asProcessingInstruction: CallbackTo[ProcessingInstruction],
      asText: CallbackTo[Text],
      detach: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content],
      getParentElement: CallbackTo[Element],
      getType: CallbackTo[ContentType],
      getValue: CallbackTo[String]
    ): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content = {
      val __obj = js.Dynamic.literal(asCdata = asCdata.toJsFn, asComment = asComment.toJsFn, asDocType = asDocType.toJsFn, asElement = asElement.toJsFn, asEntityRef = asEntityRef.toJsFn, asProcessingInstruction = asProcessingInstruction.toJsFn, asText = asText.toJsFn, detach = detach.toJsFn, getParentElement = getParentElement.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content]
    }
    
    extension [Self <: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content](x: Self) {
      
      inline def setAsCdata(value: CallbackTo[Cdata]): Self = StObject.set(x, "asCdata", value.toJsFn)
      
      inline def setAsComment(value: CallbackTo[Comment]): Self = StObject.set(x, "asComment", value.toJsFn)
      
      inline def setAsDocType(value: CallbackTo[DocType]): Self = StObject.set(x, "asDocType", value.toJsFn)
      
      inline def setAsElement(value: CallbackTo[Element]): Self = StObject.set(x, "asElement", value.toJsFn)
      
      inline def setAsEntityRef(value: CallbackTo[EntityRef]): Self = StObject.set(x, "asEntityRef", value.toJsFn)
      
      inline def setAsProcessingInstruction(value: CallbackTo[ProcessingInstruction]): Self = StObject.set(x, "asProcessingInstruction", value.toJsFn)
      
      inline def setAsText(value: CallbackTo[Text]): Self = StObject.set(x, "asText", value.toJsFn)
      
      inline def setDetach(value: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content]): Self = StObject.set(x, "detach", value.toJsFn)
      
      inline def setGetParentElement(value: CallbackTo[Element]): Self = StObject.set(x, "getParentElement", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[ContentType]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[String]): Self = StObject.set(x, "getValue", value.toJsFn)
    }
  }
  
  /**
    * A representation of an XML DocumentType node.
    */
  trait DocType
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getElementName(): String
    
    def getInternalSubset(): String
    
    def getPublicId(): String
    
    def getSystemId(): String
    
    def setElementName(name: String): DocType
    
    def setInternalSubset(data: String): DocType
    
    def setPublicId(id: String): DocType
    
    def setSystemId(id: String): DocType
  }
  object DocType {
    
    inline def apply(
      asCdata: CallbackTo[Cdata],
      asComment: CallbackTo[Comment],
      asDocType: CallbackTo[DocType],
      asElement: CallbackTo[Element],
      asEntityRef: CallbackTo[EntityRef],
      asProcessingInstruction: CallbackTo[ProcessingInstruction],
      asText: CallbackTo[Text],
      detach: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content],
      getElementName: CallbackTo[String],
      getInternalSubset: CallbackTo[String],
      getParentElement: CallbackTo[Element],
      getPublicId: CallbackTo[String],
      getSystemId: CallbackTo[String],
      getType: CallbackTo[ContentType],
      getValue: CallbackTo[String],
      setElementName: String => DocType,
      setInternalSubset: String => DocType,
      setPublicId: String => DocType,
      setSystemId: String => DocType
    ): DocType = {
      val __obj = js.Dynamic.literal(asCdata = asCdata.toJsFn, asComment = asComment.toJsFn, asDocType = asDocType.toJsFn, asElement = asElement.toJsFn, asEntityRef = asEntityRef.toJsFn, asProcessingInstruction = asProcessingInstruction.toJsFn, asText = asText.toJsFn, detach = detach.toJsFn, getElementName = getElementName.toJsFn, getInternalSubset = getInternalSubset.toJsFn, getParentElement = getParentElement.toJsFn, getPublicId = getPublicId.toJsFn, getSystemId = getSystemId.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, setElementName = js.Any.fromFunction1(setElementName), setInternalSubset = js.Any.fromFunction1(setInternalSubset), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
      __obj.asInstanceOf[DocType]
    }
    
    extension [Self <: DocType](x: Self) {
      
      inline def setGetElementName(value: CallbackTo[String]): Self = StObject.set(x, "getElementName", value.toJsFn)
      
      inline def setGetInternalSubset(value: CallbackTo[String]): Self = StObject.set(x, "getInternalSubset", value.toJsFn)
      
      inline def setGetPublicId(value: CallbackTo[String]): Self = StObject.set(x, "getPublicId", value.toJsFn)
      
      inline def setGetSystemId(value: CallbackTo[String]): Self = StObject.set(x, "getSystemId", value.toJsFn)
      
      inline def setSetElementName(value: String => DocType): Self = StObject.set(x, "setElementName", js.Any.fromFunction1(value))
      
      inline def setSetInternalSubset(value: String => DocType): Self = StObject.set(x, "setInternalSubset", js.Any.fromFunction1(value))
      
      inline def setSetPublicId(value: String => DocType): Self = StObject.set(x, "setPublicId", js.Any.fromFunction1(value))
      
      inline def setSetSystemId(value: String => DocType): Self = StObject.set(x, "setSystemId", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A representation of an XML document.
    */
  @js.native
  trait Document extends StObject {
    
    def addContent(content: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    def addContent(index: Integer, content: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def cloneContent(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def detachRootElement(): Element = js.native
    
    def getAllContent(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getContent(index: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def getContentSize(): Integer = js.native
    
    def getDescendants(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getDocType(): DocType = js.native
    
    def getRootElement(): Element = js.native
    
    def hasRootElement(): Boolean = js.native
    
    def removeContent(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    def removeContent(content: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content): Boolean = js.native
    def removeContent(index: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def setDocType(docType: DocType): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def setRootElement(element: Element): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
  }
  
  /**
    * A representation of an XML Element node.
    *
    *     // Adds up the values listed in a sample XML document and adds a new element with the total.
    *     var xml = '<things>'
    *         + '<plates>12</plates>'
    *         + '<bowls>18</bowls>'
    *         + '<cups>25</cups>'
    *         + '</things>';
    *     var document = XmlService.parse(xml);
    *     var root = document.getRootElement();
    *     var items = root.getChildren();
    *     var total = 0;
    *     for (var i = 0; i < items.length; i++) {
    *       total += Number(items[i].getText());
    *     }
    *     var totalElement = XmlService.createElement('total').setText(total);
    *     root.addContent(totalElement);
    *     xml = XmlService.getPrettyFormat().format(document);
    *     Logger.log(xml);
    */
  @js.native
  trait Element
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def addContent(content: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content): Element = js.native
    def addContent(index: Integer, content: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content): Element = js.native
    
    def cloneContent(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getAllContent(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getAttribute(name: String): Attribute = js.native
    def getAttribute(name: String, namespace: Namespace): Attribute = js.native
    
    def getAttributes(): js.Array[Attribute] = js.native
    
    def getChild(name: String): Element = js.native
    def getChild(name: String, namespace: Namespace): Element = js.native
    
    def getChildText(name: String): String = js.native
    def getChildText(name: String, namespace: Namespace): String = js.native
    
    def getChildren(): js.Array[Element] = js.native
    def getChildren(name: String): js.Array[Element] = js.native
    def getChildren(name: String, namespace: Namespace): js.Array[Element] = js.native
    
    def getContent(index: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def getContentSize(): Integer = js.native
    
    def getDescendants(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    
    def getDocument(): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def getName(): String = js.native
    
    def getNamespace(): Namespace = js.native
    def getNamespace(prefix: String): Namespace = js.native
    
    def getQualifiedName(): String = js.native
    
    def getText(): String = js.native
    
    def isAncestorOf(other: Element): Boolean = js.native
    
    def isRootElement(): Boolean = js.native
    
    def removeAttribute(attributeName: String): Boolean = js.native
    def removeAttribute(attributeName: String, namespace: Namespace): Boolean = js.native
    def removeAttribute(attribute: Attribute): Boolean = js.native
    
    def removeContent(): js.Array[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content] = js.native
    def removeContent(content: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content): Boolean = js.native
    def removeContent(index: Integer): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content = js.native
    
    def setAttribute(attribute: Attribute): Element = js.native
    def setAttribute(name: String, value: String): Element = js.native
    def setAttribute(name: String, value: String, namespace: Namespace): Element = js.native
    
    def setName(name: String): Element = js.native
    
    def setNamespace(namespace: Namespace): Element = js.native
    
    def setText(text: String): Element = js.native
  }
  
  /**
    * A representation of an XML EntityReference node.
    */
  trait EntityRef
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getName(): String
    
    def getPublicId(): String
    
    def getSystemId(): String
    
    def setName(name: String): EntityRef
    
    def setPublicId(id: String): EntityRef
    
    def setSystemId(id: String): EntityRef
  }
  object EntityRef {
    
    inline def apply(
      asCdata: CallbackTo[Cdata],
      asComment: CallbackTo[Comment],
      asDocType: CallbackTo[DocType],
      asElement: CallbackTo[Element],
      asEntityRef: CallbackTo[EntityRef],
      asProcessingInstruction: CallbackTo[ProcessingInstruction],
      asText: CallbackTo[Text],
      detach: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content],
      getName: CallbackTo[String],
      getParentElement: CallbackTo[Element],
      getPublicId: CallbackTo[String],
      getSystemId: CallbackTo[String],
      getType: CallbackTo[ContentType],
      getValue: CallbackTo[String],
      setName: String => EntityRef,
      setPublicId: String => EntityRef,
      setSystemId: String => EntityRef
    ): EntityRef = {
      val __obj = js.Dynamic.literal(asCdata = asCdata.toJsFn, asComment = asComment.toJsFn, asDocType = asDocType.toJsFn, asElement = asElement.toJsFn, asEntityRef = asEntityRef.toJsFn, asProcessingInstruction = asProcessingInstruction.toJsFn, asText = asText.toJsFn, detach = detach.toJsFn, getName = getName.toJsFn, getParentElement = getParentElement.toJsFn, getPublicId = getPublicId.toJsFn, getSystemId = getSystemId.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, setName = js.Any.fromFunction1(setName), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
      __obj.asInstanceOf[EntityRef]
    }
    
    extension [Self <: EntityRef](x: Self) {
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetPublicId(value: CallbackTo[String]): Self = StObject.set(x, "getPublicId", value.toJsFn)
      
      inline def setGetSystemId(value: CallbackTo[String]): Self = StObject.set(x, "getSystemId", value.toJsFn)
      
      inline def setSetName(value: String => EntityRef): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
      
      inline def setSetPublicId(value: String => EntityRef): Self = StObject.set(x, "setPublicId", js.Any.fromFunction1(value))
      
      inline def setSetSystemId(value: String => EntityRef): Self = StObject.set(x, "setSystemId", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A formatter for outputting an XML document, with three pre-defined formats that can be further
    * customized.
    *
    *     // Log an XML document with specified formatting options.
    *     var xml = '<root><a><b>Text!</b><b>More text!</b></a></root>';
    *     var document = XmlService.parse(xml);
    *     var output = XmlService.getCompactFormat()
    *         .setLineSeparator('\n')
    *         .setEncoding('UTF-8')
    *         .setIndent('   ')
    *         .format(document);
    *     Logger.log(output);
    */
  @js.native
  trait Format extends StObject {
    
    def format(document: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document): String = js.native
    def format(element: Element): String = js.native
    
    def setEncoding(encoding: String): Format = js.native
    
    def setIndent(indent: String): Format = js.native
    
    def setLineSeparator(separator: String): Format = js.native
    
    def setOmitDeclaration(omitDeclaration: Boolean): Format = js.native
    
    def setOmitEncoding(omitEncoding: Boolean): Format = js.native
  }
  
  /**
    * A representation of an XML namespace.
    */
  trait Namespace extends StObject {
    
    def getPrefix(): String
    
    def getURI(): String
  }
  object Namespace {
    
    inline def apply(getPrefix: CallbackTo[String], getURI: CallbackTo[String]): Namespace = {
      val __obj = js.Dynamic.literal(getPrefix = getPrefix.toJsFn, getURI = getURI.toJsFn)
      __obj.asInstanceOf[Namespace]
    }
    
    extension [Self <: Namespace](x: Self) {
      
      inline def setGetPrefix(value: CallbackTo[String]): Self = StObject.set(x, "getPrefix", value.toJsFn)
      
      inline def setGetURI(value: CallbackTo[String]): Self = StObject.set(x, "getURI", value.toJsFn)
    }
  }
  
  /**
    * A representation of an XML ProcessingInstruction node.
    */
  trait ProcessingInstruction
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def getData(): String
    
    def getTarget(): String
  }
  object ProcessingInstruction {
    
    inline def apply(
      asCdata: CallbackTo[Cdata],
      asComment: CallbackTo[Comment],
      asDocType: CallbackTo[DocType],
      asElement: CallbackTo[Element],
      asEntityRef: CallbackTo[EntityRef],
      asProcessingInstruction: CallbackTo[ProcessingInstruction],
      asText: CallbackTo[Text],
      detach: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content],
      getData: CallbackTo[String],
      getParentElement: CallbackTo[Element],
      getTarget: CallbackTo[String],
      getType: CallbackTo[ContentType],
      getValue: CallbackTo[String]
    ): ProcessingInstruction = {
      val __obj = js.Dynamic.literal(asCdata = asCdata.toJsFn, asComment = asComment.toJsFn, asDocType = asDocType.toJsFn, asElement = asElement.toJsFn, asEntityRef = asEntityRef.toJsFn, asProcessingInstruction = asProcessingInstruction.toJsFn, asText = asText.toJsFn, detach = detach.toJsFn, getData = getData.toJsFn, getParentElement = getParentElement.toJsFn, getTarget = getTarget.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn)
      __obj.asInstanceOf[ProcessingInstruction]
    }
    
    extension [Self <: ProcessingInstruction](x: Self) {
      
      inline def setGetData(value: CallbackTo[String]): Self = StObject.set(x, "getData", value.toJsFn)
      
      inline def setGetTarget(value: CallbackTo[String]): Self = StObject.set(x, "getTarget", value.toJsFn)
    }
  }
  
  /**
    * A representation of an XML Text node.
    */
  trait Text
    extends StObject
       with typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content {
    
    def append(text: String): Text
    
    def getText(): String
    
    def setText(text: String): Text
  }
  object Text {
    
    inline def apply(
      append: String => Text,
      asCdata: CallbackTo[Cdata],
      asComment: CallbackTo[Comment],
      asDocType: CallbackTo[DocType],
      asElement: CallbackTo[Element],
      asEntityRef: CallbackTo[EntityRef],
      asProcessingInstruction: CallbackTo[ProcessingInstruction],
      asText: CallbackTo[Text],
      detach: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Content],
      getParentElement: CallbackTo[Element],
      getText: CallbackTo[String],
      getType: CallbackTo[ContentType],
      getValue: CallbackTo[String],
      setText: String => Text
    ): Text = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), asCdata = asCdata.toJsFn, asComment = asComment.toJsFn, asDocType = asDocType.toJsFn, asElement = asElement.toJsFn, asEntityRef = asEntityRef.toJsFn, asProcessingInstruction = asProcessingInstruction.toJsFn, asText = asText.toJsFn, detach = detach.toJsFn, getParentElement = getParentElement.toJsFn, getText = getText.toJsFn, getType = getType.toJsFn, getValue = getValue.toJsFn, setText = js.Any.fromFunction1(setText))
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setAppend(value: String => Text): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setSetText(value: String => Text): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * This service allows scripts to parse, navigate, and programmatically create XML documents.
    *
    *     // Log the title and labels for the first page of blog posts on the G Suite Developer blog.
    *     function parseXml() {
    *       var url = 'https://gsuite-developers.googleblog.com/atom.xml';
    *       var xml = UrlFetchApp.fetch(url).getContentText();
    *       var document = XmlService.parse(xml);
    *       var root = document.getRootElement();
    *       var atom = XmlService.getNamespace('http://www.w3.org/2005/Atom');
    *
    *       var entries = root.getChildren('entry', atom);
    *       for (var i = 0; i < entries.length; i++) {
    *         var title = entries[i].getChild('title', atom).getText();
    *         var categoryElements = entries[i].getChildren('category', atom);
    *         var labels = [];
    *         for (var j = 0; j < categoryElements.length; j++) {
    *           labels.push(categoryElements[j].getAttribute('term').getValue());
    *         }
    *         Logger.log('%s (%s)', title, labels.join(', '));
    *       }
    *     }
    *
    *     // Create and log an XML representation of the threads in your Gmail inbox.
    *     function createXml() {
    *       var root = XmlService.createElement('threads');
    *       var threads = GmailApp.getInboxThreads();
    *       for (var i = 0; i < threads.length; i++) {
    *         var child = XmlService.createElement('thread')
    *             .setAttribute('messageCount', threads[i].getMessageCount())
    *             .setAttribute('isUnread', threads[i].isUnread())
    *             .setText(threads[i].getFirstMessageSubject());
    *         root.addContent(child);
    *       }
    *       var document = XmlService.createDocument(root);
    *       var xml = XmlService.getPrettyFormat().format(document);
    *       Logger.log(xml);
    *     }
    */
  @js.native
  trait XmlService extends StObject {
    
    var ContentTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ Any = js.native
    
    def createCdata(text: String): Cdata = js.native
    
    def createComment(text: String): Comment = js.native
    
    def createDocType(elementName: String): DocType = js.native
    def createDocType(elementName: String, publicId: String, systemId: String): DocType = js.native
    def createDocType(elementName: String, systemId: String): DocType = js.native
    
    def createDocument(): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    def createDocument(rootElement: Element): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
    
    def createElement(name: String): Element = js.native
    def createElement(name: String, namespace: Namespace): Element = js.native
    
    def createText(text: String): Text = js.native
    
    def getCompactFormat(): Format = js.native
    
    def getNamespace(prefix: String, uri: String): Namespace = js.native
    def getNamespace(uri: String): Namespace = js.native
    
    def getNoNamespace(): Namespace = js.native
    
    def getPrettyFormat(): Format = js.native
    
    def getRawFormat(): Format = js.native
    
    def getXmlNamespace(): Namespace = js.native
    
    def parse(xml: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Document = js.native
  }
}
