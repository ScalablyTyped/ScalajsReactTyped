package typingsJapgolly.restartHooks

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ResizeObserver interface is used to observe changes to Element's content
  * rect.
  *
  * It is modeled after MutationObserver and IntersectionObserver.
  */
@js.native
trait ResizeObserver
  extends StObject
     with Instantiable1[/* callback */ ResizeObserverCallback, Any] {
  
  /**
    * Clears both the observationTargets and activeTargets lists.
    */
  def disconnect(): Unit = js.native
  
  /**
    * Adds target to the list of observed elements.
    */
  def observe(target: Element): Unit = js.native
  
  /**
    * Removes target from the list of observed elements.
    */
  def unobserve(target: Element): Unit = js.native
}
