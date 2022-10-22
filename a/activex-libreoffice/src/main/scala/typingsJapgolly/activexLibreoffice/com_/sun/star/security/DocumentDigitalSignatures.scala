package typingsJapgolly.activexLibreoffice.com_.sun.star.security

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link DocumentDigitalSignatures} */
trait DocumentDigitalSignatures
  extends StObject
     with XDocumentDigitalSignatures {
  
  def createDefault(): Unit
  
  /** @param ODFVersion the version of the signature */
  def createWithVersion(ODFVersion: String): Unit
  
  /**
    * @param ODFVersion the version of the signature
    * @param HasValidDocumentSignature indicates if the document already contains a document signature.
    */
  def createWithVersionAndValidSignature(ODFVersion: String, HasValidDocumentSignature: Boolean): Unit
}
object DocumentDigitalSignatures {
  
  inline def apply(
    DocumentContentSignatureDefaultStreamName: String,
    PackageSignatureDefaultStreamName: String,
    ScriptingContentSignatureDefaultStreamName: String,
    acquire: Callback,
    addAuthorToTrustedSources: XCertificate => Callback,
    addLocationToTrustedSources: String => Callback,
    chooseCertificate: js.Array[String] => XCertificate,
    createDefault: Callback,
    createWithVersion: String => Callback,
    createWithVersionAndValidSignature: (String, Boolean) => Callback,
    getDocumentContentSignatureDefaultStreamName: CallbackTo[String],
    getPackageSignatureDefaultStreamName: CallbackTo[String],
    getScriptingContentSignatureDefaultStreamName: CallbackTo[String],
    isAuthorTrusted: XCertificate => Boolean,
    isLocationTrusted: String => Boolean,
    manageTrustedSources: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    showCertificate: XCertificate => Callback,
    showDocumentContentSignatures: (XStorage, XInputStream) => Callback,
    showPackageSignatures: (XStorage, XInputStream) => Callback,
    showScriptingContentSignatures: (XStorage, XInputStream) => Callback,
    signDocumentContent: (XStorage, XStream) => Boolean,
    signPackage: (XStorage, XStream) => Boolean,
    signScriptingContent: (XStorage, XStream) => Boolean,
    verifyDocumentContentSignatures: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation],
    verifyPackageSignatures: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation],
    verifyScriptingContentSignatures: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]
  ): DocumentDigitalSignatures = {
    val __obj = js.Dynamic.literal(DocumentContentSignatureDefaultStreamName = DocumentContentSignatureDefaultStreamName.asInstanceOf[js.Any], PackageSignatureDefaultStreamName = PackageSignatureDefaultStreamName.asInstanceOf[js.Any], ScriptingContentSignatureDefaultStreamName = ScriptingContentSignatureDefaultStreamName.asInstanceOf[js.Any], acquire = acquire.toJsFn, addAuthorToTrustedSources = js.Any.fromFunction1((t0: XCertificate) => addAuthorToTrustedSources(t0).runNow()), addLocationToTrustedSources = js.Any.fromFunction1((t0: String) => addLocationToTrustedSources(t0).runNow()), chooseCertificate = js.Any.fromFunction1(chooseCertificate), createDefault = createDefault.toJsFn, createWithVersion = js.Any.fromFunction1((t0: String) => createWithVersion(t0).runNow()), createWithVersionAndValidSignature = js.Any.fromFunction2((t0: String, t1: Boolean) => (createWithVersionAndValidSignature(t0, t1)).runNow()), getDocumentContentSignatureDefaultStreamName = getDocumentContentSignatureDefaultStreamName.toJsFn, getPackageSignatureDefaultStreamName = getPackageSignatureDefaultStreamName.toJsFn, getScriptingContentSignatureDefaultStreamName = getScriptingContentSignatureDefaultStreamName.toJsFn, isAuthorTrusted = js.Any.fromFunction1(isAuthorTrusted), isLocationTrusted = js.Any.fromFunction1(isLocationTrusted), manageTrustedSources = manageTrustedSources.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, showCertificate = js.Any.fromFunction1((t0: XCertificate) => showCertificate(t0).runNow()), showDocumentContentSignatures = js.Any.fromFunction2((t0: XStorage, t1: XInputStream) => (showDocumentContentSignatures(t0, t1)).runNow()), showPackageSignatures = js.Any.fromFunction2((t0: XStorage, t1: XInputStream) => (showPackageSignatures(t0, t1)).runNow()), showScriptingContentSignatures = js.Any.fromFunction2((t0: XStorage, t1: XInputStream) => (showScriptingContentSignatures(t0, t1)).runNow()), signDocumentContent = js.Any.fromFunction2(signDocumentContent), signPackage = js.Any.fromFunction2(signPackage), signScriptingContent = js.Any.fromFunction2(signScriptingContent), verifyDocumentContentSignatures = js.Any.fromFunction2(verifyDocumentContentSignatures), verifyPackageSignatures = js.Any.fromFunction2(verifyPackageSignatures), verifyScriptingContentSignatures = js.Any.fromFunction2(verifyScriptingContentSignatures))
    __obj.asInstanceOf[DocumentDigitalSignatures]
  }
  
  extension [Self <: DocumentDigitalSignatures](x: Self) {
    
    inline def setCreateDefault(value: Callback): Self = StObject.set(x, "createDefault", value.toJsFn)
    
    inline def setCreateWithVersion(value: String => Callback): Self = StObject.set(x, "createWithVersion", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCreateWithVersionAndValidSignature(value: (String, Boolean) => Callback): Self = StObject.set(x, "createWithVersionAndValidSignature", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
