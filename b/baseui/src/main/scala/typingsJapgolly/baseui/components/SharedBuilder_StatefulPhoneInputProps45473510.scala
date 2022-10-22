package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.PartialState
import typingsJapgolly.baseui.phoneInputTypesMod.State
import typingsJapgolly.baseui.phoneInputTypesMod.StateChange
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_StatefulPhoneInputProps45473510 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
  
  inline def `aria-describedbyNull`: this.type = set("aria-describedby", null)
  
  inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
  
  inline def `aria-labelNull`: this.type = set("aria-label", null)
  
  inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
  
  inline def `aria-labelledbyNull`: this.type = set("aria-labelledby", null)
  
  inline def clearable(value: Boolean): this.type = set("clearable", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def idNull: this.type = set("id", null)
  
  inline def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
  
  inline def mapIsoToLabel(value: /* iso */ String => String): this.type = set("mapIsoToLabel", js.Any.fromFunction1(value))
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def nameNull: this.type = set("name", null)
  
  inline def onCountryChange(value: /* event */ OnChangeParams => Any): this.type = set("onCountryChange", js.Any.fromFunction1(value))
  
  inline def onTextChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onTextChange", js.Any.fromFunction1(value))
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def stateReducer(value: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
}
