package typingsJapgolly.libphonenumberJs.typesMod

import typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.International_
import typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.National_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NATIONAL
  - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.National_
  - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL
  - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.International_
  - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EDot164
  - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RFC3966
  - typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IDD
*/
trait NumberFormat extends js.Object

object NumberFormat {
  @scala.inline
  def EDot164: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.EDot164 = this.cast("E.164")
  @scala.inline
  def IDD: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.IDD = this.cast("IDD")
  @scala.inline
  def INTERNATIONAL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL = this.cast("INTERNATIONAL")
  @scala.inline
  def International: International_ = this.cast("International")
  @scala.inline
  def NATIONAL: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.NATIONAL = this.cast("NATIONAL")
  @scala.inline
  def National: National_ = this.cast("National")
  @scala.inline
  def RFC3966: typingsJapgolly.libphonenumberJs.libphonenumberJsStrings.RFC3966 = this.cast("RFC3966")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

