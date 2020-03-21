package typingsJapgolly.xmlcreate

import typingsJapgolly.xmlcreate.optionsMod.IDeclarationOptions
import typingsJapgolly.xmlcreate.xmlAttributeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class XmlAttribute protected () extends default {
    def this(name: String, value: js.Array[typingsJapgolly.xmlcreate.xmlNodeMod.default]) = this()
    /**
      * Initializes a new instance of the {@link XmlAttribute} class.
      *
      * @param name The name of the XML attribute.
      * @param value The initial value of the XML attribute. Additional children
      *              can be added later. Only {@link XmlAttributeText},
      *              {@link XmlCharRef}, and {@link XmlEntityRef} nodes are
      *              permitted.
      */
    def this(name: String, value: typingsJapgolly.xmlcreate.xmlNodeMod.default) = this()
  }
  
  @js.native
  class XmlAttributeText protected ()
    extends typingsJapgolly.xmlcreate.xmlAttributeTextMod.default {
    /**
      * Initializes a new instance of the {@link XmlAttributeText} class.
      *
      * @param text Text.
      */
    def this(text: String) = this()
  }
  
  @js.native
  class XmlCdata protected ()
    extends typingsJapgolly.xmlcreate.xmlCdataMod.default {
    /**
      * Initializes a new instance of the {@link XmlCdata} class.
      *
      * @param data The character data of the CDATA section.
      */
    def this(data: String) = this()
  }
  
  @js.native
  class XmlCharData protected ()
    extends typingsJapgolly.xmlcreate.xmlCharDataMod.default {
    /**
      * Initializes a new instance of the {@link XmlCharData} class.
      *
      * @param charData Character data.
      */
    def this(charData: String) = this()
  }
  
  @js.native
  class XmlCharRef protected ()
    extends typingsJapgolly.xmlcreate.xmlCharRefMod.default {
    /**
      * Initializes a new instance of the {@link XmlCharRef} class.
      *
      * @param char The character to represent using the reference.
      * @param hex Whether to use the hexadecimal or decimal representation for
      *            the reference. If left undefined, decimal is the default.
      */
    def this(char: String) = this()
    def this(char: String, hex: Boolean) = this()
  }
  
  @js.native
  class XmlComment protected ()
    extends typingsJapgolly.xmlcreate.xmlCommentMod.default {
    /**
      * Initializes a new instance of the {@link XmlComment} class.
      *
      * @param content The content of the comment.
      */
    def this(content: String) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the {@link XmlDecl} class.
    *
    * @param options The options associated with the XML declaration.
    */
  class XmlDecl ()
    extends typingsJapgolly.xmlcreate.xmlDeclMod.default {
    def this(options: IDeclarationOptions) = this()
  }
  
  @js.native
  class XmlDocument protected ()
    extends typingsJapgolly.xmlcreate.xmlDocumentMod.default {
    /**
      * Initializes a new instance of the {@link XmlDocument} class.
      *
      * @param root The name of the root element.
      */
    def this(root: String) = this()
  }
  
  @js.native
  class XmlDtd protected ()
    extends typingsJapgolly.xmlcreate.xmlDtdMod.default {
    /**
      * Initializes a new instance of the {@link XmlDtd} class.
      *
      * @param name The name of the DTD.
      * @param sysId The system identifier of the DTD, excluding quotation marks.
      * @param pubId The public identifier of the DTD, excluding quotation marks.
      *              If a public identifier is provided, a system identifier
      *              must be provided as well.
      */
    def this(name: String) = this()
    def this(name: String, sysId: String) = this()
    def this(name: String, sysId: String, pubId: String) = this()
  }
  
  @js.native
  class XmlDtdAttlist protected ()
    extends typingsJapgolly.xmlcreate.xmlDtdAttlistMod.default {
    /**
      * Initializes a new instance of the {@link XmlDtdAttlist} class.
      *
      * @param text The text associated with the XML attribute-list declaration.
      */
    def this(text: String) = this()
  }
  
  @js.native
  class XmlDtdElement protected ()
    extends typingsJapgolly.xmlcreate.xmlDtdElementMod.default {
    /**
      * Initializes a new instance of the {@link XmlDtdElement} class.
      *
      * @param text The text associated with the XML element declaration.
      */
    def this(text: String) = this()
  }
  
  @js.native
  class XmlDtdEntity protected ()
    extends typingsJapgolly.xmlcreate.xmlDtdEntityMod.default {
    /**
      * Initializes a new instance of the {@link XmlDtdEntity} class.
      *
      * @param text The text associated with the XML entity declaration.
      */
    def this(text: String) = this()
  }
  
  @js.native
  class XmlDtdNotation protected ()
    extends typingsJapgolly.xmlcreate.xmlDtdNotationMod.default {
    /**
      * Initializes a new instance of the {@link XmlDtdNotation} class.
      *
      * @param text The text associated with the XML notation declaration.
      */
    def this(text: String) = this()
  }
  
  @js.native
  class XmlDtdParamEntityRef protected ()
    extends typingsJapgolly.xmlcreate.xmlDtdParamEntityRefMod.default {
    /**
      * Initializes a new instance of the {@link XmlDtdParamEntityRef} class.
      *
      * @param entity The entity to be referenced.
      */
    def this(entity: String) = this()
  }
  
  @js.native
  class XmlElement protected ()
    extends typingsJapgolly.xmlcreate.xmlElementMod.default {
    /**
      * Initializes a new instance of the {@link XmlElement} class.
      *
      * @param name The name of the element.
      */
    def this(name: String) = this()
  }
  
  @js.native
  class XmlEntityRef protected ()
    extends typingsJapgolly.xmlcreate.xmlEntityRefMod.default {
    /**
      * Initializes a new instance of the {@link XmlEntityRef} class.
      *
      * @param entity The entity to be referenced.
      */
    def this(entity: String) = this()
  }
  
  @js.native
  /**
    * Initializes a new instance of the {@link XmlNode} class.
    */
  class XmlNode ()
    extends typingsJapgolly.xmlcreate.xmlNodeMod.default
  
  @js.native
  class XmlProcInst protected ()
    extends typingsJapgolly.xmlcreate.xmlProcInstMod.default {
    /**
      * Initializes a new instance of the {@link XmlProcInst} class.
      *
      * @param target The target of the processing instruction.
      * @param content The data of the processing instruction, or undefined if
      *                there is no target.
      */
    def this(target: String) = this()
    def this(target: String, content: String) = this()
  }
  
  def document(root: String): typingsJapgolly.xmlcreate.xmlDocumentMod.default = js.native
}

