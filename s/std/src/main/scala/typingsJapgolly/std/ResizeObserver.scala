package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserver extends StObject {
  
  /* standard dom */
  def disconnect(): Unit = js.native
  
  /* standard dom */
  def observe(target: org.scalajs.dom.Element): Unit = js.native
  def observe(target: org.scalajs.dom.Element, options: ResizeObserverOptions): Unit = js.native
  
  /* standard dom */
  def unobserve(target: org.scalajs.dom.Element): Unit = js.native
}
