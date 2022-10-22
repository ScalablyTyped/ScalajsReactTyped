package typingsJapgolly.xmlCore

import typingsJapgolly.xmlCore.distTypesCollectionMod.Collection
import typingsJapgolly.xmlCore.distTypesTypesMod.XmlNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNamespaceManagerMod {
  
  @JSImport("xml-core/dist/types/namespace_manager", "NamespaceManager")
  @js.native
  open class NamespaceManager () extends Collection[XmlNamespace] {
    def this(items: js.Array[XmlNamespace]) = this()
    
    def GetNamespace(namespaceUrl: String): XmlNamespace | Null = js.native
    def GetNamespace(namespaceUrl: String, start: Double): XmlNamespace | Null = js.native
    
    def GetPrefix(prefix: String): XmlNamespace | Null = js.native
    def GetPrefix(prefix: String, start: Double): XmlNamespace | Null = js.native
  }
}
