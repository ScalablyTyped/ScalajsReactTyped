package typingsJapgolly.videoJs.mod.default

import typingsJapgolly.videoJs.anon.GetComponent
import typingsJapgolly.videoJs.anon.GetTagSettings
import typingsJapgolly.videoJs.anon.Instantiable
import typingsJapgolly.videoJs.anon.InstantiableClickableComponent
import typingsJapgolly.videoJs.anon.InstantiableMenu
import typingsJapgolly.videoJs.anon.InstantiableMenuButton
import typingsJapgolly.videoJs.anon.InstantiableMenuItem
import typingsJapgolly.videoJs.anon.InstantiableModalDialog
import typingsJapgolly.videoJs.anon.InstantiableMouseTimeDisplay
import typingsJapgolly.videoJs.anon.InstantiableSpacer
import typingsJapgolly.videoJs.anon.InstantiableTimeToolTip
import typingsJapgolly.videoJs.mod.videojs.Component.ReadyCallback
import typingsJapgolly.videoJs.mod.videojs.ComponentOptions
import typingsJapgolly.videoJs.videoJsStrings.Button
import typingsJapgolly.videoJs.videoJsStrings.ClickableComponent
import typingsJapgolly.videoJs.videoJsStrings.Menu
import typingsJapgolly.videoJs.videoJsStrings.MenuButton
import typingsJapgolly.videoJs.videoJsStrings.MenuItem
import typingsJapgolly.videoJs.videoJsStrings.ModalDialog
import typingsJapgolly.videoJs.videoJsStrings.MouseTimeDisplay
import typingsJapgolly.videoJs.videoJsStrings.Spacer
import typingsJapgolly.videoJs.videoJsStrings.TimeTooltip
import typingsJapgolly.videoJs.videoJsStrings.button_
import typingsJapgolly.videoJs.videoJsStrings.clickablecomponent_
import typingsJapgolly.videoJs.videoJsStrings.component_
import typingsJapgolly.videoJs.videoJsStrings.menu_
import typingsJapgolly.videoJs.videoJsStrings.menubutton_
import typingsJapgolly.videoJs.videoJsStrings.menuitem_
import typingsJapgolly.videoJs.videoJsStrings.modaldialog_
import typingsJapgolly.videoJs.videoJsStrings.mouseTimeDisplay_
import typingsJapgolly.videoJs.videoJsStrings.player_
import typingsJapgolly.videoJs.videoJsStrings.spacer_
import typingsJapgolly.videoJs.videoJsStrings.timeTooltip_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js", "default.Component")
  @js.native
  open class ^ protected ()
    extends StObject
       with typingsJapgolly.videoJs.mod.videojs.Component {
    /**
      * Creates an instance of this class.
      *
      * @param player
      *        The `Player` that this class should be attached to.
      *
      * @param [options]
      *        The key/value store of player options.
      *
      * @param [options.children]
      *        An array of children objects to intialize this component with. Children objects have
      *        a name property that will be used if more than one component of the same type needs to be
      *        added.
      *
      * @param [ready]
      *        Function that gets called when the `Component` is ready.
      */
    def this(player: typingsJapgolly.videoJs.mod.videojs.Player) = this()
    def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: ComponentOptions) = this()
    def this(player: typingsJapgolly.videoJs.mod.videojs.Player, options: Unit, ready: ReadyCallback) = this()
    def this(
      player: typingsJapgolly.videoJs.mod.videojs.Player,
      options: ComponentOptions,
      ready: ReadyCallback
    ) = this()
  }
  
  @JSImport("video.js", "default.Component")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get a `Component` based on the name it was registered with.
    *
    * @param name
    *        The Name of the component to get.
    *
    * @return The `Component` that got registered under the given name.
    */
  inline def getComponent(name: Button | button_): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  inline def getComponent(name: String): GetComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[GetComponent]
  
  inline def getComponent_GetComponent(name: typingsJapgolly.videoJs.videoJsStrings.Component | component_): GetComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[GetComponent]
  
  inline def getComponent_GetTagSettings(name: typingsJapgolly.videoJs.videoJsStrings.Player | player_): GetTagSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[GetTagSettings]
  
  inline def getComponent_InstantiableClickableComponent(name: ClickableComponent | clickablecomponent_): InstantiableClickableComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableClickableComponent]
  
  inline def getComponent_InstantiableMenu(name: Menu | menu_): InstantiableMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMenu]
  
  inline def getComponent_InstantiableMenuButton(name: MenuButton | menubutton_): InstantiableMenuButton = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMenuButton]
  
  inline def getComponent_InstantiableMenuItem(name: MenuItem | menuitem_): InstantiableMenuItem = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMenuItem]
  
  inline def getComponent_InstantiableModalDialog(name: ModalDialog | modaldialog_): InstantiableModalDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableModalDialog]
  
  inline def getComponent_InstantiableMouseTimeDisplay(name: MouseTimeDisplay | mouseTimeDisplay_): InstantiableMouseTimeDisplay = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableMouseTimeDisplay]
  
  inline def getComponent_InstantiableSpacer(name: Spacer | spacer_): InstantiableSpacer = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableSpacer]
  
  inline def getComponent_InstantiableTimeToolTip(name: timeTooltip_ | TimeTooltip): InstantiableTimeToolTip = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponent")(name.asInstanceOf[js.Any]).asInstanceOf[InstantiableTimeToolTip]
  
  /**
    * Register a `Component` with `videojs` given the name and the component.
    *
    * > NOTE: {@link Tech}s should not be registered as a `Component`. {@link Tech}s
    *         should be registered using {@link Tech.registerTech} or
    *         {@link videojs:videojs.registerTech}.
    *
    * > NOTE: This function can also be seen on videojs as
    *         {@link videojs:videojs.registerComponent}.
    *
    * @param name
    *        The name of the `Component` to register.
    *
    * @param ComponentToRegister
    *        The `Component` class to register.
    *
    * @return The `Component` that was registered.
    */
  inline def registerComponent(name: String, ComponentToRegister: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], ComponentToRegister.asInstanceOf[js.Any])).asInstanceOf[Any]
}
