package typingsJapgolly.awsSdkXmlBuilder

import typingsJapgolly.awsSdkXmlBuilder.distTypesStringableMod.Stringable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/xml-builder", "XmlNode")
  @js.native
  open class XmlNode protected ()
    extends typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode {
    def this(name: String) = this()
    def this(name: String, children: js.Array[Stringable]) = this()
  }
  /* static members */
  object XmlNode {
    
    @JSImport("@aws-sdk/xml-builder", "XmlNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def of(name: String): typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
    inline def of(name: String, childText: String): typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
    inline def of(name: String, childText: String, withName: String): typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any], withName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
    inline def of(name: String, childText: Unit, withName: String): typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(name.asInstanceOf[js.Any], childText.asInstanceOf[js.Any], withName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.awsSdkXmlBuilder.distTypesXmlNodeMod.XmlNode]
  }
  
  @JSImport("@aws-sdk/xml-builder", "XmlText")
  @js.native
  open class XmlText protected ()
    extends typingsJapgolly.awsSdkXmlBuilder.distTypesXmlTextMod.XmlText {
    def this(value: String) = this()
  }
}
