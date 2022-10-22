package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsKycDocumentMod.kycDocument.CreateKycPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.KycPage")
@js.native
open class KycPage protected ()
  extends StObject
     with CreateKycPage {
  def this(data: CreateKycPage) = this()
  
  /**
    * The base64 encoded file which needs to be uploaded
    *
    * You need to fill in only the binary code. Do not send the first part that some converters add into the binary code which is
    * `<img src=" data:image/png;base64..." />`
    *
    * e.g.
    * ```json
    * {
    *   "File": "/9j/4AAQSkZJRgABAQEBLAEsAAD/.../wgARCAAyADIDAREAAhEBAxEB/8QAGwAAAgMBAQEA"
    * }
    * ```
    */
  /* CompleteClass */
  var File: String = js.native
}
