package typingsJapgolly.reactNativePaper.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_1242071912 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def expandedId(value: String | Double): this.type = set("expandedId", value.asInstanceOf[js.Any])
  
  inline def onAccordionPress(value: /* expandedId */ String | Double => Callback): this.type = set("onAccordionPress", js.Any.fromFunction1((t0: /* expandedId */ String | Double) => value(t0).runNow()))
}
