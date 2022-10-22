package typingsJapgolly.nodeRedEditorClient.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.nodeRedEditorClient.anon.AutoClose
import typingsJapgolly.nodeRedEditorClient.anon.ContainerHide
import typingsJapgolly.nodeRedEditorClient.anon.DisposeOnClose
import typingsJapgolly.nodeRedEditorClient.anon.Show
import typingsJapgolly.nodeRedEditorClient.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popover extends StObject {
  
  def create(options: AutoClose): PopoverInstance = js.native
  
  def menu(options: DisposeOnClose): Show = js.native
  
  def panel(content: JQuery[HTMLElement]): ContainerHide = js.native
  
  def tooltip(target: JQuery[HTMLElement], content: String): PopoverInstance = js.native
  def tooltip(target: JQuery[HTMLElement], content: String, action: String): PopoverInstance = js.native
}
