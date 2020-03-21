package typingsJapgolly.activexShdocvw.SHDocVw

import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`1024`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`128`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`16384`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`16`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`1`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`2048`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`256`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`2`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`32768`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`32`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`4096`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`512`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`64`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`65536`
import typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`8192`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`1`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`2`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`16`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`32`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`64`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`128`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`256`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`512`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`1024`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`2048`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`4096`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`8192`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`16384`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`32768`
  - typingsJapgolly.activexShdocvw.activexShdocvwNumbers.`65536`
*/
trait BrowserNavConstants extends js.Object

object BrowserNavConstants {
  /** If the navigation fails, the autosearch functionality attempts to navigate common root domains (.com, .edu, and so on). If this also fails, the URL is passed to a search engine. */
  @scala.inline
  def AllowAutosearch: `16` = this.cast(16)
  /**
    * Internet Explorer 8. Block cross-domain redirect requests. The navigation triggers the
    * [**DWebBrowserEvents2::RedirectXDomainBlocked**](https://msdn.microsoft.com/en-us/library/dd565686(v=vs.85).aspx) event if blocked.
    */
  @scala.inline
  def BlockRedirectsXDomain: `32768` = this.cast(32768)
  /** Causes the current Explorer Bar to navigate to the given item, if possible.  */
  @scala.inline
  def BrowserBar: `32` = this.cast(32)
  /** Internet Explorer 6 for Windows XP SP2 and later. Force the URL into the restricted zone. */
  @scala.inline
  def EnforceRestricted: `128` = this.cast(128)
  /**
    * Internet Explorer 6 for Windows XP SP2 and later. If the navigation fails when a hyperlink is being followed, this constant specifies that the resource should then be bound to the
    * moniker using the [**BINDF_HYPERLINK**](https://msdn.microsoft.com/en-us/library/ms775130(v=vs.85).aspx) flag.
    */
  @scala.inline
  def Hyperlink: `64` = this.cast(64)
  /**
    * Internet Explorer 7. Maintain state for dynamic navigation based on the filter string entered in the search band text box (wordwheel). Restore the wordwheel text when the navigation
    * completes.
    */
  @scala.inline
  def KeepWordWheelText: `8192` = this.cast(8192)
  /** Internet Explorer 6 for Windows XP SP2 and later. Use the default Popup Manager to block pop-up windows.  */
  @scala.inline
  def NewWindowsManaged: `256` = this.cast(256)
  /** Do not add the resource or file to the history list. The new page replaces the current page in the list. */
  @scala.inline
  def NoHistory: `2` = this.cast(2)
  /** Internet Explorer 7. Open the resource or file in a new background tab; the currently active window and/or tab remains open on top.  */
  @scala.inline
  def OpenInBackgroundTab: `4096` = this.cast(4096)
  /** Internet Explorer 7. Open the resource or file in a new tab. Allow the destination window to come to the foreground, if necessary.  */
  @scala.inline
  def OpenInNewTab: `2048` = this.cast(2048)
  /** Open the resource or file in a new window. */
  @scala.inline
  def OpenInNewWindow: `1` = this.cast(1)
  /** Internet Explorer 8 and later. Open the resource in a new tab that becomes the foreground tab. */
  @scala.inline
  def OpenNewForegroundTab: `65536` = this.cast(65536)
  /** Internet Explorer 6 for Windows XP SP2 and later. Prompt for the installation of ActiveX controls.   */
  @scala.inline
  def TrustedForActiveX: `1024` = this.cast(1024)
  /** Internet Explorer 6 for Windows XP SP2 and later. Block files that normally trigger a file download dialog box.  */
  @scala.inline
  def UntrustedForDownload: `512` = this.cast(512)
  /**
    * Internet Explorer 8. Open the resource as a replacement for the current or target tab. The existing tab is closed while the new tab takes its place in the tab bar and replaces it in the
    * tab group, if any. Browser history is copied forward to the new tab. On Windows Vista, this flag is implied if the navigation would cross integrity levels and **navOpenInNewTab**,
    * **navOpenInBackgroundTab**, or **navOpenInNewWindow**> is not specified.
    */
  @scala.inline
  def VirtualTab: `16384` = this.cast(16384)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

