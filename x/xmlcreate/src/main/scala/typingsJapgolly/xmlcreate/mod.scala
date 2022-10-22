package typingsJapgolly.xmlcreate

import typingsJapgolly.xmlcreate.libNodesXmlAttributeMod.IXmlAttributeOptions
import typingsJapgolly.xmlcreate.libNodesXmlAttributeMod.default
import typingsJapgolly.xmlcreate.libNodesXmlAttributeTextMod.IXmlAttributeTextOptions
import typingsJapgolly.xmlcreate.libNodesXmlCdataMod.IXmlCdataOptions
import typingsJapgolly.xmlcreate.libNodesXmlCharDataMod.IXmlCharDataOptions
import typingsJapgolly.xmlcreate.libNodesXmlCharRefMod.IXmlCharRefOptions
import typingsJapgolly.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typingsJapgolly.xmlcreate.libNodesXmlDeclMod.IXmlDeclOptions
import typingsJapgolly.xmlcreate.libNodesXmlDocumentMod.IXmlDocumentOptions
import typingsJapgolly.xmlcreate.libNodesXmlDtdAttlistMod.IXmlDtdAttlistOptions
import typingsJapgolly.xmlcreate.libNodesXmlDtdElementMod.IXmlDtdElementOptions
import typingsJapgolly.xmlcreate.libNodesXmlDtdEntityMod.IXmlDtdEntityOptions
import typingsJapgolly.xmlcreate.libNodesXmlDtdMod.IXmlDtdOptions
import typingsJapgolly.xmlcreate.libNodesXmlDtdNotationMod.IXmlDtdNotationOptions
import typingsJapgolly.xmlcreate.libNodesXmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typingsJapgolly.xmlcreate.libNodesXmlElementMod.IXmlElementOptions
import typingsJapgolly.xmlcreate.libNodesXmlEntityRefMod.IXmlEntityRefOptions
import typingsJapgolly.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xmlcreate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xmlcreate", "XmlAttribute")
  @js.native
  open class XmlAttribute[Parent] protected () extends default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlAttributeText")
  @js.native
  open class XmlAttributeText[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlAttributeTextMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeTextOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCdata")
  @js.native
  open class XmlCdata[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlCdataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCdataOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCharData")
  @js.native
  open class XmlCharData[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlCharDataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlCharRef")
  @js.native
  open class XmlCharRef[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlCharRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlComment")
  @js.native
  open class XmlComment[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlCommentMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDecl")
  @js.native
  open class XmlDecl[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDeclMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDeclOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDocument")
  @js.native
  open class XmlDocument protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDocumentMod.default {
    def this(options: IXmlDocumentOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtd")
  @js.native
  open class XmlDtd[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDtdMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdAttlist")
  @js.native
  open class XmlDtdAttlist[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDtdAttlistMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdAttlistOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdElement")
  @js.native
  open class XmlDtdElement[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDtdElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdElementOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdEntity")
  @js.native
  open class XmlDtdEntity[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDtdEntityMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdNotation")
  @js.native
  open class XmlDtdNotation[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDtdNotationMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdNotationOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlDtdParamEntityRef")
  @js.native
  open class XmlDtdParamEntityRef[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlDtdParamEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdParamEntityRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlElement")
  @js.native
  open class XmlElement[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlElementOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlEntityRef")
  @js.native
  open class XmlEntityRef[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlEntityRefOptions) = this()
  }
  
  @JSImport("xmlcreate", "XmlProcInst")
  @js.native
  open class XmlProcInst[Parent] protected ()
    extends typingsJapgolly.xmlcreate.libNodesXmlProcInstMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlProcInstOptions) = this()
  }
  
  inline def document(): typingsJapgolly.xmlcreate.libNodesXmlDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")().asInstanceOf[typingsJapgolly.xmlcreate.libNodesXmlDocumentMod.default]
  inline def document(options: IXmlDocumentOptions): typingsJapgolly.xmlcreate.libNodesXmlDocumentMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("document")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.xmlcreate.libNodesXmlDocumentMod.default]
}
