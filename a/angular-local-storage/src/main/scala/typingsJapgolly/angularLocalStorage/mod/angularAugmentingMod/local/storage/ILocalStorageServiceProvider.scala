package typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage

import typingsJapgolly.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait ILocalStorageServiceProvider extends IServiceProvider {
  /**
    * If localStorage is not supported, the library will default to cookies instead. This behavior can be disabled
    * default: true
    */
  def setDefaultToCookie(shouldDefault: Boolean): ILocalStorageServiceProvider = js.native
  /**
    * Send signals for each of the following actions:
    * @param setItem default: true
    * @param removeItem default: false
    */
  def setNotify(setItem: Boolean, removeItem: Boolean): ILocalStorageServiceProvider = js.native
  /**
    * Setter for the prefix
    * You should set a prefix to avoid overwriting any local storage variables from the rest of your app
    * e.g. localStorageServiceProvider.setPrefix('youAppName');
    * With provider you can use config as this:
    * myApp.config(function (localStorageServiceProvider) {
    *  localStorageServiceProvider.prefix = 'yourAppName';
    * });
    * @param prefix default: ls.<your-key>
    */
  def setPrefix(prefix: String): ILocalStorageServiceProvider = js.native
  /**
    * Setter for cookie config
    * @param exp number of days before cookies expire (0 = does not expire). default: 30
    * @param path the web path the cookie represents. default: '/'
    * @param secure to store cookies as secure. default: false
    */
  def setStorageCookie(exp: Double, path: String, secure: Boolean): ILocalStorageServiceProvider = js.native
  /**
    * Set the cookie domain, since this runs inside a the config() block,
    * only providers and constants can be injected.
    * As a result, $location service can't be used here,
    * use a hardcoded string or window.location.
    * No default value
    */
  def setStorageCookieDomain(domain: String): ILocalStorageServiceProvider = js.native
  /**
    * Setter for the storageType
    * localstorage or sessionStorage. default: localStorage
    */
  def setStorageType(storageType: String): ILocalStorageServiceProvider = js.native
}

