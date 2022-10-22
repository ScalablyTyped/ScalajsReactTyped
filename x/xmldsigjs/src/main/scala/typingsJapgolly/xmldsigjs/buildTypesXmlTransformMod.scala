package typingsJapgolly.xmldsigjs

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Node
import typingsJapgolly.xmlCore.distTypesTypesMod.IXmlSerializable
import typingsJapgolly.xmldsigjs.buildTypesXmlXmlObjectMod.XmlSignatureObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlTransformMod {
  
  @JSImport("xmldsigjs/build/types/xml/transform", "Transform")
  @js.native
  open class Transform ()
    extends XmlSignatureObject
       with ITransform {
    def this(properties: js.Object) = this()
    
    /**
      * XPath of the transformation
      */
    var XPath: String = js.native
    
    /* protected */ var innerXml: Node | Null = js.native
  }
  
  @js.native
  trait ITransform
    extends StObject
       with IXmlSerializable {
    
    var Algorithm: String = js.native
    
    def GetInnerXml(): Node | Null = js.native
    
    def GetOutput(): Any = js.native
    
    def LoadInnerXml(node: Node): Unit = js.native
  }
  
  type ITransformConstructable = Instantiable0[Transform]
}
