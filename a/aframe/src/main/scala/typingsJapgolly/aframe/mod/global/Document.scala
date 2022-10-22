package typingsJapgolly.aframe.mod.global

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.aframe.aframeStrings.`a-scene`
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.Scene
import typingsJapgolly.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom elements augment document methods to return custom HTML
  */
@js.native
trait Document extends StObject {
  
  def createElement(tagName: String): Entity[ObjectMap[Component[Any, System[Any]]]] = js.native
  
  def querySelector(selectors: String): Entity[Any] = js.native
  
  def querySelectorAll(selectors: String): NodeList[(Entity[Any] | Element) & Node] = js.native
  
  @JSName("querySelector")
  def querySelector_ascene(selectors: `a-scene`): Scene = js.native
}
