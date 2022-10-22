package typingsJapgolly.xmlCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesXmlMod {
  
  @JSImport("xml-core/dist/types/xml", "APPLICATION_XML")
  @js.native
  val APPLICATION_XML: /* "application/xml" */ String = js.native
  
  @JSImport("xml-core/dist/types/xml", "DEFAULT_NAMESPACE_URI")
  @js.native
  val DEFAULT_NAMESPACE_URI: /* "" */ String = js.native
  
  @JSImport("xml-core/dist/types/xml", "DEFAULT_PREFIX")
  @js.native
  val DEFAULT_PREFIX: /* "" */ String = js.native
  
  @js.native
  sealed trait XmlNodeType extends StObject
  @JSImport("xml-core/dist/types/xml", "XmlNodeType")
  @js.native
  object XmlNodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XmlNodeType & Double] = js.native
    
    @js.native
    sealed trait Attribute
      extends StObject
         with XmlNodeType
    /* 2 */ val Attribute: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Attribute & Double = js.native
    
    @js.native
    sealed trait CDATA
      extends StObject
         with XmlNodeType
    /* 4 */ val CDATA: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.CDATA & Double = js.native
    
    @js.native
    sealed trait Comment
      extends StObject
         with XmlNodeType
    /* 8 */ val Comment: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Comment & Double = js.native
    
    @js.native
    sealed trait Document
      extends StObject
         with XmlNodeType
    /* 9 */ val Document: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Document & Double = js.native
    
    @js.native
    sealed trait DocumentFragment
      extends StObject
         with XmlNodeType
    /* 11 */ val DocumentFragment: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.DocumentFragment & Double = js.native
    
    @js.native
    sealed trait DocumentType
      extends StObject
         with XmlNodeType
    /* 10 */ val DocumentType: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.DocumentType & Double = js.native
    
    @js.native
    sealed trait Element
      extends StObject
         with XmlNodeType
    /* 1 */ val Element: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Element & Double = js.native
    
    @js.native
    sealed trait EndElement
      extends StObject
         with XmlNodeType
    /* 15 */ val EndElement: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.EndElement & Double = js.native
    
    @js.native
    sealed trait EndEntity
      extends StObject
         with XmlNodeType
    /* 16 */ val EndEntity: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.EndEntity & Double = js.native
    
    @js.native
    sealed trait Entity
      extends StObject
         with XmlNodeType
    /* 6 */ val Entity: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Entity & Double = js.native
    
    @js.native
    sealed trait EntityReference
      extends StObject
         with XmlNodeType
    /* 5 */ val EntityReference: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.EntityReference & Double = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with XmlNodeType
    /* 0 */ val None: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.None & Double = js.native
    
    @js.native
    sealed trait Notation
      extends StObject
         with XmlNodeType
    /* 12 */ val Notation: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Notation & Double = js.native
    
    @js.native
    sealed trait ProcessingInstruction
      extends StObject
         with XmlNodeType
    /* 7 */ val ProcessingInstruction: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.ProcessingInstruction & Double = js.native
    
    @js.native
    sealed trait SignificantWhitespace
      extends StObject
         with XmlNodeType
    /* 14 */ val SignificantWhitespace: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.SignificantWhitespace & Double = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with XmlNodeType
    /* 3 */ val Text: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Text & Double = js.native
    
    @js.native
    sealed trait Whitespace
      extends StObject
         with XmlNodeType
    /* 13 */ val Whitespace: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.Whitespace & Double = js.native
    
    @js.native
    sealed trait XmlDeclaration
      extends StObject
         with XmlNodeType
    /* 17 */ val XmlDeclaration: typingsJapgolly.xmlCore.distTypesXmlMod.XmlNodeType.XmlDeclaration & Double = js.native
  }
}
