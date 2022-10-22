package typingsJapgolly.activexLibreoffice.com_.sun.star.rdf

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.StringPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * marks an object representing an ODF element that may have RDF meta data attached.
  *
  * To make using ODF elements as part of RDF statements more convenient, this interface inherits from {@link XURI} . The {@link URI} is constructed by
  * concatenating the {@link URI} of the document, the stream name, a fragment separator, and the XML ID.
  *
  * Note that using the {@link XURI} interface on an instance of {@link XMetadatable} may have the side effect of creating a metadata reference for the
  * instance.
  * @see XRepository
  * @see XDocumentMetadataAccess
  * @since OOo 3.2
  */
trait XMetadatable
  extends StObject
     with XURI {
  
  /**
    * a metadata reference, comprising the stream name and the XML ID.
    *
    * Note that this metadata reference must be unique for the ODF document. This implies that the XML ID part must be unique for every stream. A pair of
    * two empty strings signifies "no metadata reference". For example: Pair("content.xml", "foo-element-1")
    * @throws com::sun::star::lang::IllegalArgumentException if the given metadata reference is invalid, or not unique
    */
  var MetadataReference: StringPair
  
  /**
    * creates a metadata reference for this object, if necessary.
    *
    * If this object already has a metadata reference, do nothing; otherwise, create metadata reference with a fresh, unique XML ID and assign it to the
    * MetadataReference attribute.
    */
  def ensureMetadataReference(): Unit
}
object XMetadatable {
  
  inline def apply(
    LocalName: String,
    MetadataReference: StringPair,
    Namespace: String,
    StringValue: String,
    ensureMetadataReference: Callback
  ): XMetadatable = {
    val __obj = js.Dynamic.literal(LocalName = LocalName.asInstanceOf[js.Any], MetadataReference = MetadataReference.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], ensureMetadataReference = ensureMetadataReference.toJsFn)
    __obj.asInstanceOf[XMetadatable]
  }
  
  extension [Self <: XMetadatable](x: Self) {
    
    inline def setEnsureMetadataReference(value: Callback): Self = StObject.set(x, "ensureMetadataReference", value.toJsFn)
    
    inline def setMetadataReference(value: StringPair): Self = StObject.set(x, "MetadataReference", value.asInstanceOf[js.Any])
  }
}
