package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ButtonProps1977674036[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def btnContextual(value: String): this.type = set("btnContextual", value.asInstanceOf[js.Any])
  
  inline def btnGlyphicon(value: String): this.type = set("btnGlyphicon", value.asInstanceOf[js.Any])
  
  inline def btnText(value: String): this.type = set("btnText", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def onClick(value: /* e */ ReactMouseEventFrom[Any & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
}
