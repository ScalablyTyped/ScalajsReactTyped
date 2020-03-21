package typingsJapgolly.reactHotLoader.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactHotLoader.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Global error overlay
    */
  var ErrorOverlay: ComponentType[AnonErrors]
  /**
    * Allows SFC to be used, enables "intermediate" components used by Relay, should be disabled for Preact
    */
  var allowSFC: Boolean
  /**
    * Disable "hot-replacement-render"
    */
  var disableHotRenderer: Boolean
  /**
    * Disable "hot-replacement-render" when injection into react-dom are made
    */
  var disableHotRendererWhenInjected: Boolean
  /**
    * default value for AppContainer errorOverlay
    */
  var errorReporter: ComponentType[HotError]
  /**
    * flag to completely disable RHL for Components
    */
  var ignoreComponents: Boolean
  /**
    * flag to completely disable RHL for SFC
    */
  var ignoreSFC: Boolean
  /**
    * Specify loglLevel, default to 'error', set it to false to disable logs.
    * Available levels: ['debug', 'log', 'warn', 'error']
    */
  var logLevel: String
  /**
    * keep render method unpatched, moving sideEffect to componentDidUpdate
    */
  var pureRender: Boolean
  /**
    *  Allows using SFC without changes. leading to some components not updated
    */
  var pureSFC: Boolean
  /**
    * enables or disables hooks treatment
    */
  var reloadHooks: Boolean
  /**
    * Show "hot-loader/react-dom" warning
    */
  var showReactDomPatchNotification: Boolean
  /**
    * Controls tail(deferred) update checking
    */
  var trackTailUpdates: Boolean
  /**
    *
    * @param type {any} type being rendered. The first argument of React.createElement
    * @param displayName {string} type display name (if exists)
    */
  def onComponentCreate(`type`: js.Any, displayName: String): js.Any
  /**
    *
    * @param {any} type being registered. This could be ANY top level variable among project.
    * @param {string} uniqueLocalName - variable name
    * @param {string} fileName - origin file
    * @return {any}
    */
  def onComponentRegister(`type`: js.Any, uniqueLocalName: String, fileName: String): js.Any
}

object Config {
  @scala.inline
  def apply(
    ErrorOverlay: ComponentType[AnonErrors],
    allowSFC: Boolean,
    disableHotRenderer: Boolean,
    disableHotRendererWhenInjected: Boolean,
    errorReporter: ComponentType[HotError],
    ignoreComponents: Boolean,
    ignoreSFC: Boolean,
    logLevel: String,
    onComponentCreate: (js.Any, String) => CallbackTo[js.Any],
    onComponentRegister: (js.Any, String, String) => CallbackTo[js.Any],
    pureRender: Boolean,
    pureSFC: Boolean,
    reloadHooks: Boolean,
    showReactDomPatchNotification: Boolean,
    trackTailUpdates: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(ErrorOverlay = ErrorOverlay.asInstanceOf[js.Any], allowSFC = allowSFC.asInstanceOf[js.Any], disableHotRenderer = disableHotRenderer.asInstanceOf[js.Any], disableHotRendererWhenInjected = disableHotRendererWhenInjected.asInstanceOf[js.Any], errorReporter = errorReporter.asInstanceOf[js.Any], ignoreComponents = ignoreComponents.asInstanceOf[js.Any], ignoreSFC = ignoreSFC.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], pureRender = pureRender.asInstanceOf[js.Any], pureSFC = pureSFC.asInstanceOf[js.Any], reloadHooks = reloadHooks.asInstanceOf[js.Any], showReactDomPatchNotification = showReactDomPatchNotification.asInstanceOf[js.Any], trackTailUpdates = trackTailUpdates.asInstanceOf[js.Any])
    __obj.updateDynamic("onComponentCreate")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => onComponentCreate(t0, t1).runNow()))
    __obj.updateDynamic("onComponentRegister")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: java.lang.String) => onComponentRegister(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Config]
  }
}

