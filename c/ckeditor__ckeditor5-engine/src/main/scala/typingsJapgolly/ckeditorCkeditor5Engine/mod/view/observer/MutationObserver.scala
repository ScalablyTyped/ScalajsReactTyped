package typingsJapgolly.ckeditorCkeditor5Engine.mod.view.observer

import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.DomConverter
import typingsJapgolly.ckeditorCkeditor5Engine.mod.view.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/observer/mutationobserver
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.MutationObserver")
@js.native
class MutationObserver () extends Observer {
  var domConverter: DomConverter = js.native
  var renderer: Renderer = js.native
}

