package typingsJapgolly.videoJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.videoJs.mod.videojs.Component
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

@js.native
trait AnonGetComponent
  extends /**
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
Instantiable1[/* player */ Player, Component]
     with Instantiable2[/* player */ Player, /* options */ ComponentOptions, Component]
     with Instantiable3[
      /* player */ Player, 
      /* options */ ComponentOptions, 
      /* ready */ ReadyCallback, 
      Component
    ] {
  def getComponent(name: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof Component */ js.Any = js.native
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
  def getComponent_Button(name: Button): /* import warning: importer.ImportType#apply Failed type conversion: typeof Button */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_ClickableComponent(name: ClickableComponent): /* import warning: importer.ImportType#apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Component(name: typingsJapgolly.videoJs.videoJsStrings.Component): /* import warning: importer.ImportType#apply Failed type conversion: typeof Component */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Menu(name: Menu): /* import warning: importer.ImportType#apply Failed type conversion: typeof Menu */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MenuButton(name: MenuButton): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuButton */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MenuItem(name: MenuItem): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuItem */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_ModalDialog(name: ModalDialog): /* import warning: importer.ImportType#apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_MouseTimeDisplay(name: MouseTimeDisplay): /* import warning: importer.ImportType#apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Player(name: typingsJapgolly.videoJs.videoJsStrings.Player): /* import warning: importer.ImportType#apply Failed type conversion: typeof Player */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_Spacer(name: Spacer): /* import warning: importer.ImportType#apply Failed type conversion: typeof Spacer */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_TimeTooltip(name: TimeTooltip): /* import warning: importer.ImportType#apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_button(name: button_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Button */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_clickablecomponent(name: clickablecomponent_): /* import warning: importer.ImportType#apply Failed type conversion: typeof ClickableComponent */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_component(name: component_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Component */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menu(name: menu_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Menu */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menubutton(name: menubutton_): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuButton */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_menuitem(name: menuitem_): /* import warning: importer.ImportType#apply Failed type conversion: typeof MenuItem */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_modaldialog(name: modaldialog_): /* import warning: importer.ImportType#apply Failed type conversion: typeof ModalDialog */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_mouseTimeDisplay(name: mouseTimeDisplay_): /* import warning: importer.ImportType#apply Failed type conversion: typeof MouseTimeDisplay */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_player(name: player_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Player */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_spacer(name: spacer_): /* import warning: importer.ImportType#apply Failed type conversion: typeof Spacer */ js.Any = js.native
  @JSName("getComponent")
  def getComponent_timeTooltip(name: timeTooltip_): /* import warning: importer.ImportType#apply Failed type conversion: typeof TimeToolTip */ js.Any = js.native
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

