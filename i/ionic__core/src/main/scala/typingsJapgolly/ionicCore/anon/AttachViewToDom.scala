package typingsJapgolly.ionicCore.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachViewToDom extends StObject {
  
  def attachViewToDom(parentElement: HTMLElement, userComponent: Any): js.Promise[Any] = js.native
  def attachViewToDom(parentElement: HTMLElement, userComponent: Any, userComponentProps: Any): js.Promise[Any] = js.native
  def attachViewToDom(
    parentElement: HTMLElement,
    userComponent: Any,
    userComponentProps: Any,
    cssClasses: js.Array[String]
  ): js.Promise[Any] = js.native
  def attachViewToDom(
    parentElement: HTMLElement,
    userComponent: Any,
    userComponentProps: Unit,
    cssClasses: js.Array[String]
  ): js.Promise[Any] = js.native
  
  def removeViewFromDom(): js.Promise[Unit] = js.native
}
