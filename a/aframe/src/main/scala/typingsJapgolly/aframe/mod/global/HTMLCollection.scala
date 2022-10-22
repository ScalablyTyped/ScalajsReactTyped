package typingsJapgolly.aframe.mod.global

import org.scalajs.dom.Element
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.System
import typingsJapgolly.std.HTMLCollectionBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCollection
  extends StObject
     with HTMLCollectionBase {
  
  /**
    * Retrieves a select object or an object from an options collection.
    */
  def namedItem(name: String): Element | (Entity[ObjectMap[Component[Any, System[Any]]]]) | Null = js.native
}
