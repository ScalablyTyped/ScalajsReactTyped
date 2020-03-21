package typingsJapgolly.chromeApps.chrome.contextMenus

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.AnonALL
import typingsJapgolly.chromeApps.AnonCHECKBOX
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chromeAppsStrings.all_
import typingsJapgolly.chromeApps.chromeAppsStrings.audio
import typingsJapgolly.chromeApps.chromeAppsStrings.browser_action
import typingsJapgolly.chromeApps.chromeAppsStrings.checkbox
import typingsJapgolly.chromeApps.chromeAppsStrings.editable
import typingsJapgolly.chromeApps.chromeAppsStrings.frame
import typingsJapgolly.chromeApps.chromeAppsStrings.image
import typingsJapgolly.chromeApps.chromeAppsStrings.launcher
import typingsJapgolly.chromeApps.chromeAppsStrings.link
import typingsJapgolly.chromeApps.chromeAppsStrings.normal
import typingsJapgolly.chromeApps.chromeAppsStrings.page
import typingsJapgolly.chromeApps.chromeAppsStrings.page_action
import typingsJapgolly.chromeApps.chromeAppsStrings.radio
import typingsJapgolly.chromeApps.chromeAppsStrings.selection
import typingsJapgolly.chromeApps.chromeAppsStrings.separator
import typingsJapgolly.chromeApps.chromeAppsStrings.video
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProperties extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  /** @see ContextType */
  var contexts: js.UndefOr[
    js.Array[
      ToStringLiteral[
        AnonALL, 
        String, 
        Exclude[
          String, 
          browser_action | selection | video | launcher | image | editable | page_action | page | audio | frame | all_ | link
        ]
      ]
    ]
  ] = js.undefined
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Information sent when a context menu item is clicked.
    * @since Chrome 44
    */
  var onclick: js.UndefOr[js.Function1[/* info */ OnClickData, Unit]] = js.undefined
  /** Note: You cannot change an item to be a child of one of its own descendants.  */
  var parentId: js.UndefOr[integer | String] = js.undefined
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  /** @see ItemType */
  var `type`: js.UndefOr[
    ToStringLiteral[AnonCHECKBOX, String, Exclude[String, normal | checkbox | radio | separator]]
  ] = js.undefined
  /**
    * Whether the item is visible in the menu.
    * @since Chrome 62.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object UpdateProperties {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    contexts: js.Array[
      ToStringLiteral[
        AnonALL, 
        String, 
        Exclude[
          String, 
          browser_action | selection | video | launcher | image | editable | page_action | page | audio | frame | all_ | link
        ]
      ]
    ] = null,
    documentUrlPatterns: js.Array[String] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    onclick: /* info */ OnClickData => Callback = null,
    parentId: integer | String = null,
    targetUrlPatterns: js.Array[String] = null,
    title: String = null,
    `type`: ToStringLiteral[AnonCHECKBOX, String, Exclude[String, normal | checkbox | radio | separator]] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): UpdateProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (documentUrlPatterns != null) __obj.updateDynamic("documentUrlPatterns")(documentUrlPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.chromeApps.chrome.contextMenus.OnClickData) => onclick(t0).runNow()))
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (targetUrlPatterns != null) __obj.updateDynamic("targetUrlPatterns")(targetUrlPatterns.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProperties]
  }
}

