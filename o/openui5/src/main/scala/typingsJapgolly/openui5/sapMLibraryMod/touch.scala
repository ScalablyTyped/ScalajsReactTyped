package typingsJapgolly.openui5.sapMLibraryMod

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Touch
import org.scalajs.dom.TouchList
import typingsJapgolly.openui5.jQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touch {
  
  @JSImport("sap/m/library", "touch")
  @js.native
  val ^ : js.Any = js.native
  
  inline def countContained(
    /**
    * The list of touch objects to search.
    */
  oTouchList: TouchList,
    /**
    * A jQuery element or an element reference or an element id.
    */
  vElement: String
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def countContained(
    /**
    * The list of touch objects to search.
    */
  oTouchList: TouchList,
    /**
    * A jQuery element or an element reference or an element id.
    */
  vElement: Element
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  /**
    * Given a list of touches, count the number of touches related with the given element.
    *
    * @returns The number of touches related with the given element.
    */
  inline def countContained(
    /**
    * The list of touch objects to search.
    */
  oTouchList: TouchList,
    /**
    * A jQuery element or an element reference or an element id.
    */
  vElement: jQuery[HTMLElement]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countContained")(oTouchList.asInstanceOf[js.Any], vElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Given a list of touch objects, find the touch that matches the given one.
    *
    * @returns The touch matching if any.
    */
  inline def find(
    /**
    * The list of touch objects to search.
    */
  oTouchList: TouchList,
    /**
    * A touch object to find or a Touch.identifier that uniquely identifies the current finger in the touch
    * session.
    */
  oTouch: Touch
  ): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(oTouchList.asInstanceOf[js.Any], oTouch.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
  inline def find(
    /**
    * The list of touch objects to search.
    */
  oTouchList: TouchList,
    /**
    * A touch object to find or a Touch.identifier that uniquely identifies the current finger in the touch
    * session.
    */
  oTouch: Double
  ): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(oTouchList.asInstanceOf[js.Any], oTouch.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
}
