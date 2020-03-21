package typingsJapgolly.antDesignProLayout.defaultSettingsMod

import typingsJapgolly.antDesignProLayout.AnonDefaultOpenAll
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.topmenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var colorWeak: js.UndefOr[Boolean] = js.undefined
  /**
    * layout of content: `Fluid` or `Fixed`, only works when layout is topmenu
    */
  var contentWidth: ContentWidth
  /**
    * sticky siderbar
    */
  var fixSiderbar: Boolean
  /**
    * sticky header
    */
  var fixedHeader: Boolean
  var iconfontUrl: String
  /**
    * nav menu position: `sidemenu` or `topmenu`
    */
  var layout: sidemenu | topmenu
  var menu: AnonDefaultOpenAll
  /**
    * theme for nav menu
    */
  var navTheme: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark
  ] = js.undefined
  var primaryColor: String
  var title: String
}

object Settings {
  @scala.inline
  def apply(
    contentWidth: ContentWidth,
    fixSiderbar: Boolean,
    fixedHeader: Boolean,
    iconfontUrl: String,
    layout: sidemenu | topmenu,
    menu: AnonDefaultOpenAll,
    primaryColor: String,
    title: String,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    navTheme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark = null
  ): Settings = {
    val __obj = js.Dynamic.literal(contentWidth = contentWidth.asInstanceOf[js.Any], fixSiderbar = fixSiderbar.asInstanceOf[js.Any], fixedHeader = fixedHeader.asInstanceOf[js.Any], iconfontUrl = iconfontUrl.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

