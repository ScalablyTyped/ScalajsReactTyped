package typingsJapgolly.prettyFormat

import typingsJapgolly.prettyFormat.typesMod.Plugins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  def apply(`val`: js.Any): String = js.native
  def apply(`val`: js.Any, options: typingsJapgolly.prettyFormat.typesMod.OptionsReceived): String = js.native
  @js.native
  object plugins extends js.Object {
    var AsymmetricMatcher: typingsJapgolly.prettyFormat.typesMod.NewPlugin = js.native
    var ConvertAnsi: typingsJapgolly.prettyFormat.typesMod.NewPlugin = js.native
    var DOMCollection: typingsJapgolly.prettyFormat.typesMod.NewPlugin = js.native
    var DOMElement: typingsJapgolly.prettyFormat.typesMod.NewPlugin = js.native
    var Immutable: typingsJapgolly.prettyFormat.typesMod.NewPlugin = js.native
    var ReactElement: typingsJapgolly.prettyFormat.typesMod.NewPlugin = js.native
    var ReactTestComponent: typingsJapgolly.prettyFormat.typesMod.NewPlugin = js.native
  }
  
  type Colors = typingsJapgolly.prettyFormat.typesMod.Colors
  type Config = typingsJapgolly.prettyFormat.typesMod.Config
  type NewPlugin = typingsJapgolly.prettyFormat.typesMod.NewPlugin
  type Options = typingsJapgolly.prettyFormat.typesMod.Options
  type OptionsReceived = typingsJapgolly.prettyFormat.typesMod.OptionsReceived
  type Plugin = typingsJapgolly.prettyFormat.typesMod.Plugin
  type Plugins_ = Plugins
  type Refs = typingsJapgolly.prettyFormat.typesMod.Refs
  type Theme = typingsJapgolly.prettyFormat.typesMod.Theme
}

