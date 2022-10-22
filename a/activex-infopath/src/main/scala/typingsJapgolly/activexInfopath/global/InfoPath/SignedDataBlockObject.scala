package typingsJapgolly.activexInfopath.global.InfoPath

import typingsJapgolly.activexInfopath.InfoPath.XdSignatureRelation
import typingsJapgolly.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.SignedDataBlockObject")
@js.native
/* private */ open class SignedDataBlockObject ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath.SignedDataBlockObject {
  
  /* CompleteClass */
  override val Caption: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.SignedDataBlockObject_typekey")
  var InfoPathDotSignedDataBlockObject_typekey: typingsJapgolly.activexInfopath.InfoPath.SignedDataBlockObject = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override def Sign(): Unit = js.native
  
  /* CompleteClass */
  override val SignatureContainer: IXMLDOMNode = js.native
  
  /* CompleteClass */
  override val SignatureRelation: XdSignatureRelation = js.native
  
  /* CompleteClass */
  override val Signatures: typingsJapgolly.activexInfopath.InfoPath.SignaturesCollection = js.native
  
  /* CompleteClass */
  override val XPath: String = js.native
  
  /* CompleteClass */
  override val XPathNamespaceDeclarations: String = js.native
}
