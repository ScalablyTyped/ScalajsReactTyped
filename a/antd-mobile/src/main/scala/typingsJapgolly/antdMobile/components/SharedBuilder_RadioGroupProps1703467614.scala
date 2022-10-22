package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esComponentsRadioRadioMod.RadioValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RadioGroupProps1703467614 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def defaultValue(value: RadioValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def defaultValueNull: this.type = set("defaultValue", null)
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* val */ RadioValue => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* val */ RadioValue) => value(t0).runNow()))
  
  inline def value(value: RadioValue): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueNull: this.type = set("value", null)
}
