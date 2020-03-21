package typingsJapgolly.awsSdkMd5Universal

import typingsJapgolly.awsSdkMd5Universal.awsSdkMd5UniversalStrings.ascii
import typingsJapgolly.awsSdkMd5Universal.awsSdkMd5UniversalStrings.latin1
import typingsJapgolly.awsSdkMd5Universal.awsSdkMd5UniversalStrings.utf8
import typingsJapgolly.awsSdkTypes.cryptoMod.Hash
import typingsJapgolly.awsSdkTypes.cryptoMod.SourceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/md5-universal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Md5 () extends Hash {
    val hash: js.Any = js.native
    @JSName("update")
    def update_ascii(data: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(data: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(data: SourceData, encoding: utf8): Unit = js.native
  }
  
}

