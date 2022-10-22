package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesXmlAnyMod.Any
import typingsJapgolly.xadesjs.buildTypesXmlObjectIdentifierMod.ObjectIdentifier
import typingsJapgolly.xadesjs.buildTypesXmlXmlBaseMod.XadesCollection
import typingsJapgolly.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlCommitmentTypeIndicationMod {
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "CommitmentTypeIndication")
  @js.native
  open class CommitmentTypeIndication () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var AllSignedDataObjects: Boolean = js.native
    
    var CommitmentTypeId: ObjectIdentifier = js.native
    
    var CommitmentTypeQualifiers: typingsJapgolly.xadesjs.buildTypesXmlCommitmentTypeIndicationMod.CommitmentTypeQualifiers = js.native
    
    var ObjectReference: ObjectReferenceCollection = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "CommitmentTypeQualifier")
  @js.native
  open class CommitmentTypeQualifier () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "CommitmentTypeQualifiers")
  @js.native
  open class CommitmentTypeQualifiers () extends XadesCollection[CommitmentTypeQualifier] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "ObjectReference")
  @js.native
  open class ObjectReference () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Value: String = js.native
  }
  
  @JSImport("xadesjs/build/types/xml/commitment_type_indication", "ObjectReferenceCollection")
  @js.native
  open class ObjectReferenceCollection () extends XadesCollection[ObjectReference] {
    def this(properties: js.Object) = this()
  }
}
