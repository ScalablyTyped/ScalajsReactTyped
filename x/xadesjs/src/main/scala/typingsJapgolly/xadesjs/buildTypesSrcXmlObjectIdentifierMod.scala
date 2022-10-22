package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesCollection
import typingsJapgolly.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlObjectIdentifierMod {
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "DocumentationReference")
  @js.native
  open class DocumentationReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Uri: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "DocumentationReferences")
  @js.native
  open class DocumentationReferences () extends XadesCollection[DocumentationReference] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "Identifier")
  @js.native
  open class Identifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Qualifier: IdentifierQualifier = js.native
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/src/xml/object_identifier", "ObjectIdentifier")
  @js.native
  open class ObjectIdentifier () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Description: String = js.native
    
    var DocumentationReferences: typingsJapgolly.xadesjs.buildTypesSrcXmlObjectIdentifierMod.DocumentationReferences = js.native
    
    var Identifier: typingsJapgolly.xadesjs.buildTypesSrcXmlObjectIdentifierMod.Identifier = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURI
    - typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURN
  */
  trait IdentifierQualifier extends StObject
  object IdentifierQualifier {
    
    inline def OIDAsURI: typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURI = "OIDAsURI".asInstanceOf[typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURI]
    
    inline def OIDAsURN: typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURN = "OIDAsURN".asInstanceOf[typingsJapgolly.xadesjs.xadesjsStrings.OIDAsURN]
  }
}
