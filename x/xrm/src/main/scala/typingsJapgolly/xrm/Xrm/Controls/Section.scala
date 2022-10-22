package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.Collection.ItemCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a form section.
  * @see {@link UiElement}
  */
trait Section
  extends StObject
     with UiStandardElement {
  
  /**
    * A reference to the collection of controls within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control]
  
  /**
    * Gets the name of the section.
    * @returns The name.
    */
  def getName(): String
  
  /**
    * Gets a reference to the parent {@link Tab}.
    * @returns The parent.
    */
  def getParent(): Tab
}
object Section {
  
  inline def apply(
    controls: ItemCollection[Control],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getParent: CallbackTo[Tab],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], getLabel = getLabel.toJsFn, getName = getName.toJsFn, getParent = getParent.toJsFn, getVisible = getVisible.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[Section]
  }
  
  extension [Self <: Section](x: Self) {
    
    inline def setControls(value: ItemCollection[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetParent(value: CallbackTo[Tab]): Self = StObject.set(x, "getParent", value.toJsFn)
  }
}
