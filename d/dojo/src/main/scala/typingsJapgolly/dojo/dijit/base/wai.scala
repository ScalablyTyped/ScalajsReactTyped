package typingsJapgolly.dojo.dijit.base

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_base/wai.html
  *
  * Deprecated methods for setting/getting wai roles and states.
  * New code should call setAttribute()/getAttribute() directly.
  * 
  * Also loads hccss to apply dj_a11y class to root node if machine is in high-contrast mode.
  * 
  */
trait wai extends js.Object {
  /**
    * Gets the role for an element (which should be a wai role).
    * 
    * @param elem             
    */
  def getWaiRole(elem: HTMLElement): js.Any
  /**
    * Gets the value of a state on an element.
    * Checks for an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def getWaiState(elem: HTMLElement, state: String): js.Any
  /**
    * Determines if an element has a particular role.
    * 
    * @param elem             
    * @param role               Optional            
    */
  def hasWaiRole(elem: HTMLElement, role: String): js.Any
  /**
    * Determines if an element has a given state.
    * Checks for an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def hasWaiState(elem: HTMLElement, state: String): js.Any
  /**
    * Removes the specified role from an element.
    * Removes role attribute if no specific role provided (for backwards compat.)
    * 
    * @param elem             
    * @param role             
    */
  def removeWaiRole(elem: HTMLElement, role: String): Unit
  /**
    * Removes a state from an element.
    * Sets an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    */
  def removeWaiState(elem: HTMLElement, state: String): Unit
  /**
    * Sets the role on an element.
    * Replace existing role attribute with new role.
    * 
    * @param elem             
    * @param role             
    */
  def setWaiRole(elem: HTMLElement, role: String): Unit
  /**
    * Sets a state on an element.
    * Sets an attribute called "aria-"+state.
    * 
    * @param elem             
    * @param state             
    * @param value             
    */
  def setWaiState(elem: HTMLElement, state: String, value: String): Unit
}

object wai {
  @scala.inline
  def apply(
    getWaiRole: HTMLElement => CallbackTo[js.Any],
    getWaiState: (HTMLElement, String) => CallbackTo[js.Any],
    hasWaiRole: (HTMLElement, String) => CallbackTo[js.Any],
    hasWaiState: (HTMLElement, String) => CallbackTo[js.Any],
    removeWaiRole: (HTMLElement, String) => Callback,
    removeWaiState: (HTMLElement, String) => Callback,
    setWaiRole: (HTMLElement, String) => Callback,
    setWaiState: (HTMLElement, String, String) => Callback
  ): wai = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getWaiRole")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getWaiRole(t0).runNow()))
    __obj.updateDynamic("getWaiState")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => getWaiState(t0, t1).runNow()))
    __obj.updateDynamic("hasWaiRole")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => hasWaiRole(t0, t1).runNow()))
    __obj.updateDynamic("hasWaiState")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => hasWaiState(t0, t1).runNow()))
    __obj.updateDynamic("removeWaiRole")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => removeWaiRole(t0, t1).runNow()))
    __obj.updateDynamic("removeWaiState")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => removeWaiState(t0, t1).runNow()))
    __obj.updateDynamic("setWaiRole")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => setWaiRole(t0, t1).runNow()))
    __obj.updateDynamic("setWaiState")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String, t2: java.lang.String) => setWaiState(t0, t1, t2).runNow()))
    __obj.asInstanceOf[wai]
  }
}

