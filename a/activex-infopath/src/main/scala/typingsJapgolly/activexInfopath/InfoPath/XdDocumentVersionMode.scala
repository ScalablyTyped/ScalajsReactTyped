package typingsJapgolly.activexInfopath.InfoPath

import typingsJapgolly.activexInfopath.activexInfopathNumbers.`0`
import typingsJapgolly.activexInfopath.activexInfopathNumbers.`128`
import typingsJapgolly.activexInfopath.activexInfopathNumbers.`16`
import typingsJapgolly.activexInfopath.activexInfopathNumbers.`1`
import typingsJapgolly.activexInfopath.activexInfopathNumbers.`2`
import typingsJapgolly.activexInfopath.activexInfopathNumbers.`32`
import typingsJapgolly.activexInfopath.activexInfopathNumbers.`64`
import typingsJapgolly.activexInfopath.activexInfopathNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`8`
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`16`
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`128`
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`0`
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`1`
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`64`
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`32`
  - typingsJapgolly.activexInfopath.activexInfopathNumbers.`2`
*/
trait XdDocumentVersionMode extends js.Object

object XdDocumentVersionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xdCanOpenInReadOnlyMode: `8` = this.cast(8)
  @scala.inline
  def xdCanTransformSigned: `16` = this.cast(16)
  @scala.inline
  def xdDoNotInstallActiveXCabs: `128` = this.cast(128)
  @scala.inline
  def xdFailOnVersionMismatch: `0` = this.cast(0)
  @scala.inline
  def xdFailOnVersionOlder: `1` = this.cast(1)
  @scala.inline
  def xdIgnoreDataAdaptersQueryFailure: `64` = this.cast(64)
  @scala.inline
  def xdPromptTransformSigned: `32` = this.cast(32)
  @scala.inline
  def xdUseExistingVersion: `2` = this.cast(2)
}

