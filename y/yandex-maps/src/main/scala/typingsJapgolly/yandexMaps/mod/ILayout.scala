package typingsJapgolly.yandexMaps.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayout
  extends StObject
     with IEventEmitter {
  
  // new (data: object);
  def destroy(): Unit = js.native
  
  def getData(): js.Object = js.native
  
  def getParentElement(): HTMLElement = js.native
  
  def getShape(): IShape | Null = js.native
  
  def isEmpty(): Boolean = js.native
  
  def setData(data: js.Object): Unit = js.native
  
  def setParentElement(): Unit = js.native
  def setParentElement(parent: HTMLElement): Unit = js.native
}
