package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.getServerCertificateMod.GetServerCertificateArgs
import typingsJapgolly.pulumiAws.getServerCertificateMod.GetServerCertificateResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getServerCertificate")
@js.native
object getServerCertificate extends js.Object {
  def apply(): js.Promise[GetServerCertificateResult] with GetServerCertificateResult = js.native
  def apply(args: GetServerCertificateArgs): js.Promise[GetServerCertificateResult] with GetServerCertificateResult = js.native
  def apply(args: GetServerCertificateArgs, opts: InvokeOptions): js.Promise[GetServerCertificateResult] with GetServerCertificateResult = js.native
}

