package typingsJapgolly.storybookAddonKnobs.anon

import typingsJapgolly.storybookAddonKnobs.distKnobStoreMod.KnobStoreKnob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFieldChange extends StObject {
  
  var knobs: js.Array[KnobStoreKnob]
  
  def onFieldChange(): Unit
  
  def onFieldClick(): Unit
}
object OnFieldChange {
  
  inline def apply(
    knobs: js.Array[KnobStoreKnob],
    onFieldChange: japgolly.scalajs.react.Callback,
    onFieldClick: japgolly.scalajs.react.Callback
  ): OnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = onFieldChange.toJsFn, onFieldClick = onFieldClick.toJsFn)
    __obj.asInstanceOf[OnFieldChange]
  }
  
  extension [Self <: OnFieldChange](x: Self) {
    
    inline def setKnobs(value: js.Array[KnobStoreKnob]): Self = StObject.set(x, "knobs", value.asInstanceOf[js.Any])
    
    inline def setKnobsVarargs(value: KnobStoreKnob*): Self = StObject.set(x, "knobs", js.Array(value*))
    
    inline def setOnFieldChange(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onFieldChange", value.toJsFn)
    
    inline def setOnFieldClick(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "onFieldClick", value.toJsFn)
  }
}
