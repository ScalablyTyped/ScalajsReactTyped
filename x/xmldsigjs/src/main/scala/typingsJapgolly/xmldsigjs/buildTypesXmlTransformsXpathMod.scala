package typingsJapgolly.xmldsigjs

import org.scalajs.dom.Node
import typingsJapgolly.std.XPathEvaluator
import typingsJapgolly.xmldsigjs.buildTypesXmlTransformMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlTransformsXpathMod {
  
  @JSImport("xmldsigjs/build/types/xml/transforms/xpath", "XmlDsigXPathTransform")
  @js.native
  open class XmlDsigXPathTransform () extends Transform {
    def this(properties: js.Object) = this()
    
    /* protected */ def Evaluate(node: Node, xpath: String): Boolean = js.native
    
    /* protected */ def Filter(node: Node, xpath: String): Unit = js.native
    
    /* protected */ def GetEvaluator(node: Node): XPathEvaluator = js.native
  }
}
