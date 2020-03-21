package typingsJapgolly.winrt.Windows.Security.Cryptography.Certificates

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICertificateEnrollmentManagerStatics extends js.Object {
  def createRequestAsync(request: CertificateRequestProperties): IAsyncOperation[String]
  def importPfxDataAsync(
    pfxData: String,
    password: String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: String
  ): IAsyncAction
  def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction
}

object ICertificateEnrollmentManagerStatics {
  @scala.inline
  def apply(
    createRequestAsync: CertificateRequestProperties => CallbackTo[IAsyncOperation[String]],
    importPfxDataAsync: (String, String, ExportOption, KeyProtectionLevel, InstallOptions, String) => CallbackTo[IAsyncAction],
    installCertificateAsync: (String, InstallOptions) => CallbackTo[IAsyncAction]
  ): ICertificateEnrollmentManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createRequestAsync")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.Certificates.CertificateRequestProperties) => createRequestAsync(t0).runNow()))
    __obj.updateDynamic("importPfxDataAsync")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.winrt.Windows.Security.Cryptography.Certificates.ExportOption, t3: typingsJapgolly.winrt.Windows.Security.Cryptography.Certificates.KeyProtectionLevel, t4: typingsJapgolly.winrt.Windows.Security.Cryptography.Certificates.InstallOptions, t5: java.lang.String) => importPfxDataAsync(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("installCertificateAsync")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Security.Cryptography.Certificates.InstallOptions) => installCertificateAsync(t0, t1).runNow()))
    __obj.asInstanceOf[ICertificateEnrollmentManagerStatics]
  }
}

