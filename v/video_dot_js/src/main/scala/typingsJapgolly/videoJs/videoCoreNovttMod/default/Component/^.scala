package typingsJapgolly.videoJs.videoCoreNovttMod.default.Component

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.videoJs.AnonGetTagSettings
import typingsJapgolly.videoJs.AnonInstantiable
import typingsJapgolly.videoJs.AnonInstantiableClickableComponent
import typingsJapgolly.videoJs.AnonInstantiableMenu
import typingsJapgolly.videoJs.AnonInstantiableMenuButton
import typingsJapgolly.videoJs.AnonInstantiableMenuItem
import typingsJapgolly.videoJs.AnonInstantiableModalDialog
import typingsJapgolly.videoJs.AnonInstantiableMouseTimeDisplay
import typingsJapgolly.videoJs.AnonInstantiableSpacer
import typingsJapgolly.videoJs.AnonInstantiableTimeToolTip
import typingsJapgolly.videoJs.TypeofComponent
import typingsJapgolly.videoJs.mod.videojs.Component.ReadyCallback
import typingsJapgolly.videoJs.mod.videojs.ComponentOptions
import typingsJapgolly.videoJs.mod.videojs.Player
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core.novtt", "Component")
@js.native
class ^ protected ()
  extends typingsJapgolly.videoJs.mod.videojs.Component {
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
  def this(player: Player) = this()
  def this(player: Player, options: ComponentOptions) = this()
  def this(player: Player, options: ComponentOptions, ready: ReadyCallback) = this()
}

@JSImport("video.js/dist/alt/video.core.novtt", "Component")
@js.native
object ^
  extends TopLevel[
      (/**
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
Instantiable1[/* player */ Player, typingsJapgolly.videoJs.mod.videojs.Component]) with (Instantiable2[
        /* player */ Player, 
        /* options */ ComponentOptions, 
        typingsJapgolly.videoJs.mod.videojs.Component
      ]) with (Instantiable3[
        /* player */ Player, 
        /* options */ ComponentOptions, 
        /* ready */ ReadyCallback, 
        typingsJapgolly.videoJs.mod.videojs.Component
      ])
    ] {
  def getComponent(name: String): TypeofComponent = js.native
  /**
    * Get a `Component` based on the name it was registered with.
    *
    * @param name
    *        The Name of the component to get.
    *
    * @return The `Component` that got registered under the given name.
    *
    * @deprecated In `videojs` 6 this will not return `Component`s that were not
    *             registered using {@link Component.registerComponent}. Currently we
    *             check the global `videojs` object for a `Component` name and
    *             return that if it exists.
    */
  @JSName("getComponent")
  def getComponent_Button(name: Button): AnonInstantiable = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: ClickableComponent): AnonInstantiableClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_Component(name: typingsJapgolly.videoJs.videoJsStrings.Component): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: Menu): AnonInstantiableMenu = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: MenuButton): AnonInstantiableMenuButton = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: MenuItem): AnonInstantiableMenuItem = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: ModalDialog): AnonInstantiableModalDialog = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: MouseTimeDisplay): AnonInstantiableMouseTimeDisplay = js.native
  @JSName("getComponent")
  def getComponent_Player(name: typingsJapgolly.videoJs.videoJsStrings.Player): AnonGetTagSettings = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: Spacer): AnonInstantiableSpacer = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: TimeTooltip): AnonInstantiableTimeToolTip = js.native
  @JSName("getComponent")
  def getComponent_button(name: button_): AnonInstantiable = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: clickablecomponent_): AnonInstantiableClickableComponent = js.native
  @JSName("getComponent")
  def getComponent_component(name: component_): TypeofComponent = js.native
  @JSName("getComponent")
  def getComponent_menu(name: menu_): AnonInstantiableMenu = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: menubutton_): AnonInstantiableMenuButton = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: menuitem_): AnonInstantiableMenuItem = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: modaldialog_): AnonInstantiableModalDialog = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: mouseTimeDisplay_): AnonInstantiableMouseTimeDisplay = js.native
  @JSName("getComponent")
  def getComponent_player(name: player_): AnonGetTagSettings = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: spacer_): AnonInstantiableSpacer = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: timeTooltip_): AnonInstantiableTimeToolTip = js.native
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
  def registerComponent(name: String, ComponentToRegister: js.Any): js.Any = js.native
}

