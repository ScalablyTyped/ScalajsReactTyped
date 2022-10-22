package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterSection extends StObject {
  
  /**
    * Returns the footer section visibility.
    * @remarks Available only for Unified Interface.  Footers aren't supported after 2021 wave 2 release.
    * @see {@link https://docs.microsoft.com/en-us/power-platform/important-changes-coming#form-footers-in-model-driven-apps-wont-be-supported-with-the-2021-release-wave-2 External Link: Important notices}
    */
  def getVisible(): Boolean
  
  /**
    * Sets the visibility of the footer section.
    * @arg bool Specify true to show the footer section; false to hide the footer section.
    * @remarks Available only for Unified Interface.  Footers aren't supported after 2021 wave 2 release.
    * @see {@link https://docs.microsoft.com/en-us/power-platform/important-changes-coming#form-footers-in-model-driven-apps-wont-be-supported-with-the-2021-release-wave-2 External Link: Important notices}
    */
  def setVisible(bool: Boolean): Unit
}
object FooterSection {
  
  inline def apply(getVisible: CallbackTo[Boolean], setVisible: Boolean => Callback): FooterSection = {
    val __obj = js.Dynamic.literal(getVisible = getVisible.toJsFn, setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[FooterSection]
  }
  
  extension [Self <: FooterSection](x: Self) {
    
    inline def setGetVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisible", value.toJsFn)
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
