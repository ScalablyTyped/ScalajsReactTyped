package typingsJapgolly.sharepoint.global

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CalloutOptions")
@js.native
open class CalloutOptions ()
  extends StObject
     with typingsJapgolly.sharepoint.CalloutOptions {
  
  /** Some unique id for the callout. */
  /* CompleteClass */
  var ID: String = js.native
  
  /** One of the following: "topBottom" (default) or "leftRight". */
  /* CompleteClass */
  var beakOrientation: String = js.native
  
  /** If defined, callout will be inscribed into the bounding element. */
  /* CompleteClass */
  var boundingBox: HTMLElement = js.native
  
  /** String (HTML allowed) that represents contents of the callout window. */
  /* CompleteClass */
  var content: String = js.native
  
  /** HTML element that represents contents of the callout window. */
  /* CompleteClass */
  var contentElement: HTMLElement = js.native
  
  /** Content element's width in pixels. By default = 350. */
  /* CompleteClass */
  var contentWidth: Double = js.native
  
  /** Element on that the callout is shown. */
  /* CompleteClass */
  var launchPoint: HTMLElement = js.native
  
  /** Fires right after the callout is closed */
  /* CompleteClass */
  override def onClosedCallback(callout: typingsJapgolly.sharepoint.Callout): Unit = js.native
  
  /** Fires right before the callout is closed */
  /* CompleteClass */
  override def onClosingCallback(callout: typingsJapgolly.sharepoint.Callout): Unit = js.native
  
  /** Fires right after the callout is shown */
  /* CompleteClass */
  override def onOpenedCallback(callout: typingsJapgolly.sharepoint.Callout): Unit = js.native
  
  /** Fires after the callout is rendered but before it is positioned and shown */
  /* CompleteClass */
  override def onOpeningCallback(callout: typingsJapgolly.sharepoint.Callout): Unit = js.native
  
  /** Defines opening behavior */
  /* CompleteClass */
  var openOptions: typingsJapgolly.sharepoint.CalloutOpenOptions = js.native
  
  /** Sets the position of the callout during its opening phase. For an example of a position algorithm function, please explore defaultPositionAlgorithm function from the callout.debug.js file */
  /* CompleteClass */
  override def positionAlgorithm(callout: typingsJapgolly.sharepoint.Callout): Unit = js.native
  
  /** Title for the callout */
  /* CompleteClass */
  var title: String = js.native
}
