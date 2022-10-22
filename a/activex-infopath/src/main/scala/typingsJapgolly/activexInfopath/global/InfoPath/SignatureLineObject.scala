package typingsJapgolly.activexInfopath.global.InfoPath

import typingsJapgolly.activexInfopath.InfoPath.XdSignatureAppearanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.SignatureLineObject")
@js.native
/* private */ open class SignatureLineObject ()
  extends StObject
     with typingsJapgolly.activexInfopath.InfoPath.SignatureLineObject {
  
  /* CompleteClass */
  override val Id: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.SignatureLineObject_typekey")
  var InfoPathDotSignatureLineObject_typekey: typingsJapgolly.activexInfopath.InfoPath.SignatureLineObject = js.native
  
  /* CompleteClass */
  override def Sign(
    bstrImageURL: String,
    bstrSuggestedSigner: String,
    bstrSuggestedSignerTitle: String,
    bstrSuggestedSignerEmailAddress: String
  ): Boolean = js.native
  
  /* CompleteClass */
  override val Signature: typingsJapgolly.activexInfopath.InfoPath.SignatureObject = js.native
  
  /* CompleteClass */
  override val SignatureAppearanceType: XdSignatureAppearanceType = js.native
  
  /* CompleteClass */
  var SuggestedSigner: String = js.native
  
  /* CompleteClass */
  var SuggestedSignerEmailAddress: String = js.native
  
  /* CompleteClass */
  var SuggestedSignerTitle: String = js.native
}
