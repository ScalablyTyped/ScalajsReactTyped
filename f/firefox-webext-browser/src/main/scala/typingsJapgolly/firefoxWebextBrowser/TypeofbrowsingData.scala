package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.browsingData.DataTypeSet
import typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofbrowsingData extends js.Object {
  /**
    * Clears various types of browsing data stored in a user's profile.
    * @param dataToRemove The set of data types to remove.
    */
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit]
  /**
    * Clears websites' appcache data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeAppcache(options: RemovalOptions): js.Promise[Unit]
  /** Clears the browser's cache. */
  def removeCache(options: RemovalOptions): js.Promise[Unit]
  /** Clears the browser's cookies and server-bound certificates modified within a particular timeframe. */
  def removeCookies(options: RemovalOptions): js.Promise[Unit]
  /** Clears the browser's list of downloaded files (_not_ the downloaded files themselves). */
  def removeDownloads(options: RemovalOptions): js.Promise[Unit]
  /**
    * Clears websites' file system data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeFileSystems(options: RemovalOptions): js.Promise[Unit]
  /** Clears the browser's stored form data (autofill). */
  def removeFormData(options: RemovalOptions): js.Promise[Unit]
  /** Clears the browser's history. */
  def removeHistory(options: RemovalOptions): js.Promise[Unit]
  /**
    * Clears websites' IndexedDB data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeIndexedDB(options: RemovalOptions): js.Promise[Unit]
  /** Clears websites' local storage data. */
  def removeLocalStorage(options: RemovalOptions): js.Promise[Unit]
  /** Clears the browser's stored passwords. */
  def removePasswords(options: RemovalOptions): js.Promise[Unit]
  /** Clears plugins' data. */
  def removePluginData(options: RemovalOptions): js.Promise[Unit]
  /**
    * Clears websites' WebSQL data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeWebSQL(options: RemovalOptions): js.Promise[Unit]
  /* browsingData functions */
  /**
    * Reports which types of data are currently selected in the 'Clear browsing data' settings UI. Note: some of the
    * data types included in this API are not available in the settings UI, and some UI settings control more than one
    * data type listed here.
    */
  def settings(): js.Promise[AnonDataRemovalPermitted]
}

object TypeofbrowsingData {
  @scala.inline
  def apply(
    remove: (RemovalOptions, DataTypeSet) => CallbackTo[js.Promise[Unit]],
    removeAppcache: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeCache: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeCookies: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeDownloads: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeFileSystems: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeFormData: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeHistory: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeIndexedDB: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeLocalStorage: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removePasswords: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removePluginData: RemovalOptions => CallbackTo[js.Promise[Unit]],
    removeWebSQL: RemovalOptions => CallbackTo[js.Promise[Unit]],
    settings: CallbackTo[js.Promise[AnonDataRemovalPermitted]]
  ): TypeofbrowsingData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions, t1: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.DataTypeSet) => remove(t0, t1).runNow()))
    __obj.updateDynamic("removeAppcache")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeAppcache(t0).runNow()))
    __obj.updateDynamic("removeCache")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeCache(t0).runNow()))
    __obj.updateDynamic("removeCookies")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeCookies(t0).runNow()))
    __obj.updateDynamic("removeDownloads")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeDownloads(t0).runNow()))
    __obj.updateDynamic("removeFileSystems")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeFileSystems(t0).runNow()))
    __obj.updateDynamic("removeFormData")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeFormData(t0).runNow()))
    __obj.updateDynamic("removeHistory")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeHistory(t0).runNow()))
    __obj.updateDynamic("removeIndexedDB")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeIndexedDB(t0).runNow()))
    __obj.updateDynamic("removeLocalStorage")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeLocalStorage(t0).runNow()))
    __obj.updateDynamic("removePasswords")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removePasswords(t0).runNow()))
    __obj.updateDynamic("removePluginData")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removePluginData(t0).runNow()))
    __obj.updateDynamic("removeWebSQL")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.browsingData.RemovalOptions) => removeWebSQL(t0).runNow()))
    __obj.updateDynamic("settings")(settings.toJsFn)
    __obj.asInstanceOf[TypeofbrowsingData]
  }
}

