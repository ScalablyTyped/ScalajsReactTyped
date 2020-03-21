package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.binary
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.dword
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.dwordLittleEndian
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.dwordBigEndian
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.expandSz
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.link
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.multiSz
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.qword
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.qwordlittleEndian
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.sz
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RegistryValueType extends js.Object

object RegistryValueType {
  @scala.inline
  def binary: typingsJapgolly.microsoftGraph.microsoftGraphStrings.binary = this.cast("binary")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dword: typingsJapgolly.microsoftGraph.microsoftGraphStrings.dword = this.cast("dword")
  @scala.inline
  def dwordBigEndian: typingsJapgolly.microsoftGraph.microsoftGraphStrings.dwordBigEndian = this.cast("dwordBigEndian")
  @scala.inline
  def dwordLittleEndian: typingsJapgolly.microsoftGraph.microsoftGraphStrings.dwordLittleEndian = this.cast("dwordLittleEndian")
  @scala.inline
  def expandSz: typingsJapgolly.microsoftGraph.microsoftGraphStrings.expandSz = this.cast("expandSz")
  @scala.inline
  def link: typingsJapgolly.microsoftGraph.microsoftGraphStrings.link = this.cast("link")
  @scala.inline
  def multiSz: typingsJapgolly.microsoftGraph.microsoftGraphStrings.multiSz = this.cast("multiSz")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def qword: typingsJapgolly.microsoftGraph.microsoftGraphStrings.qword = this.cast("qword")
  @scala.inline
  def qwordlittleEndian: typingsJapgolly.microsoftGraph.microsoftGraphStrings.qwordlittleEndian = this.cast("qwordlittleEndian")
  @scala.inline
  def sz: typingsJapgolly.microsoftGraph.microsoftGraphStrings.sz = this.cast("sz")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

