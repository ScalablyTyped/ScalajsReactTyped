package typingsJapgolly.semanticUiSite

import typingsJapgolly.semanticUiSite.SemanticUI.Site
import typingsJapgolly.semanticUiSite.SemanticUI.Site.NamespaceStubSettings
import typingsJapgolly.semanticUiSite.SemanticUI.SiteSettings
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.debug
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.destroy
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.modules
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.name
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.namespace
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.namespaceStub
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.performance
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.setting
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.silent
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.siteNamespace
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("site")
  var site_Original: Site = js.native
  def site(): JQuery = js.native
  def site(behavior: setting, name: debug): Boolean = js.native
  def site(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: modules): js.Array[String] = js.native
  def site(behavior: setting, name: modules, value: js.Array[String]): JQuery = js.native
  def site(behavior: setting, name: name): String = js.native
  def site(behavior: setting, name: namespace): String = js.native
  def site(behavior: setting, name: namespaceStub): NamespaceStubSettings = js.native
  def site(behavior: setting, name: namespaceStub, value: NamespaceStubSettings): JQuery = js.native
  def site(behavior: setting, name: namespace, value: String): JQuery = js.native
  def site(behavior: setting, name: name, value: String): JQuery = js.native
  def site(behavior: setting, name: performance): Boolean = js.native
  def site(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: silent): Boolean = js.native
  def site(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def site(behavior: setting, name: siteNamespace): String = js.native
  def site(behavior: setting, name: siteNamespace, value: String): JQuery = js.native
  def site(behavior: setting, name: verbose): Boolean = js.native
  def site(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def site(settings: SiteSettings): JQuery = js.native
  @JSName("site")
  def site_destroy(behavior: destroy): JQuery = js.native
  @JSName("site")
  def site_setting(behavior: setting, value: SiteSettings): JQuery = js.native
}

