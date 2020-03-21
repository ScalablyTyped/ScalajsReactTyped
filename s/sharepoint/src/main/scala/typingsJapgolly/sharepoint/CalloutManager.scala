package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutManager")
@js.native
class CalloutManager () extends js.Object

/* static members */
@JSGlobal("CalloutManager")
@js.native
object CalloutManager extends js.Object {
  /** Closes all callouts on the page */
  def closeAll(): Boolean = js.native
  /** Gets the first launch point within the specified ancestor element, and returns true if the associated with it callout is opened or opening.
    If the launch point is not found or the callout is hidden, returns false. */
  def containsOneCalloutOpen(ancestor: HTMLElement): Boolean = js.native
  /** Creates a new callout */
  def createNew(options: CalloutOptions): Callout = js.native
  /** Checks if callout with specified ID already exists. If it doesn't, creates it, otherwise returns the existing one. */
  def createNewIfNecessary(options: CalloutOptions): Callout = js.native
  /** Perform some action for each callout on the page. */
  def forEach(callback: js.Function1[/* callout */ Callout, Unit]): Unit = js.native
  /** Finds the closest launch point based on the specified descendant element, and returns callout associated with the launch point. */
  def getFromCalloutDescendant(descendant: HTMLElement): Callout = js.native
  /** Searches for a callout associated with the specified launch point. Throws error if not found. */
  def getFromLaunchPoint(launchPoint: HTMLElement): Callout = js.native
  /** Searches for a callout associated with the specified launch point. Returns null if not found. */
  def getFromLaunchPointIfExists(launchPoint: HTMLElement): Callout = js.native
  /** Returns true if at least one of the defined on page callouts is opened or opening. */
  def isAtLeastOneCalloutOn(): Boolean = js.native
  /** Returns true if at least one of the defined on page callouts is opened. */
  def isAtLeastOneCalloutOpen(): Boolean = js.native
  /** Detaches callout from the launch point and destroys it. */
  def remove(callout: Callout): Unit = js.native
}

