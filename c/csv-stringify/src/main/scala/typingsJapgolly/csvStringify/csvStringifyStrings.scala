package typingsJapgolly.csvStringify

import typingsJapgolly.csvStringify.es5Mod._RecordDelimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object csvStringifyStrings {
  @js.native
  sealed trait ascii
    extends _RecordDelimiter
       with typingsJapgolly.csvStringify.mod._RecordDelimiter
  
  @js.native
  sealed trait auto
    extends _RecordDelimiter
       with typingsJapgolly.csvStringify.mod._RecordDelimiter
  
  @js.native
  sealed trait mac
    extends _RecordDelimiter
       with typingsJapgolly.csvStringify.mod._RecordDelimiter
  
  @js.native
  sealed trait unicode
    extends _RecordDelimiter
       with typingsJapgolly.csvStringify.mod._RecordDelimiter
  
  @js.native
  sealed trait unix
    extends _RecordDelimiter
       with typingsJapgolly.csvStringify.mod._RecordDelimiter
  
  @js.native
  sealed trait windows
    extends _RecordDelimiter
       with typingsJapgolly.csvStringify.mod._RecordDelimiter
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def mac: mac = "mac".asInstanceOf[mac]
  @scala.inline
  def unicode: unicode = "unicode".asInstanceOf[unicode]
  @scala.inline
  def unix: unix = "unix".asInstanceOf[unix]
  @scala.inline
  def windows: windows = "windows".asInstanceOf[windows]
}

