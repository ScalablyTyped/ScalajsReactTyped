package typingsJapgolly.devextreme.mod.default

import org.scalajs.dom.Element
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponent.Properties
import typingsJapgolly.devextreme.mod.DevExpress.core.DefaultOptionsRule
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.DOMComponent")
@js.native
open class DOMComponent[TProperties] protected ()
  extends StObject
     with typingsJapgolly.devextreme.mod.DevExpress.DOMComponent[TProperties] {
  def this(element: UserDefinedElement[Element]) = this()
  def this(element: UserDefinedElement[Element], options: TProperties) = this()
}
/* static members */
object DOMComponent {
  
  @JSImport("devextreme", "default.DOMComponent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Specifies the device-dependent default configuration properties for this component.
    */
  inline def defaultOptions[TProperties](rule: DefaultOptionsRule[TProperties]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOptions")(rule.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Gets the instance of a UI component found using its DOM node.
    */
  inline def getInstance(element: UserDefinedElement[Element]): typingsJapgolly.devextreme.mod.DevExpress.DOMComponent[Properties] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.devextreme.mod.DevExpress.DOMComponent[Properties]]
}
