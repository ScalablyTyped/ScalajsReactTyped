package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.animate
import typingsJapgolly.plotlyJs.plotlyJsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderStep extends StObject {
  
  /**
    * Sets the arguments values to be passed to the Plotly
    * method set in `method` on slide.
    */
  var args: js.Array[Any]
  
  /**
    * When true, the API method is executed. When false, all other behaviors are the same
    * and command execution is skipped. This may be useful when hooking into, for example,
    * the `plotly_sliderchange` method and executing the API command manually without losing
    * the benefit of the slider automatically binding to the state of the plot through the
    * specification of `method` and `args`.
    */
  var execute: Boolean
  
  /**
    * Sets the text label to appear on the slider
    */
  var label: String
  
  /**
    * Sets the Plotly method to be called when the slider value is changed.
    * If the `skip` method is used, the API slider will function as normal
    * but will perform no API calls and will not bind automatically to state
    * updates. This may be used to create a component interface and attach to
    * slider events manually via JavaScript.
    */
  var method: animate | typingsJapgolly.plotlyJs.plotlyJsStrings.relayout | typingsJapgolly.plotlyJs.plotlyJsStrings.restyle | skip | typingsJapgolly.plotlyJs.plotlyJsStrings.update
  
  /**
    * Sets the value of the slider step, used to refer to the step programatically.
    * Defaults to the slider label if not provided.
    */
  var value: String
  
  /**
    * Determines whether or not this step is included in the slider.
    */
  var visible: Boolean
}
object SliderStep {
  
  inline def apply(
    args: js.Array[Any],
    execute: Boolean,
    label: String,
    method: animate | typingsJapgolly.plotlyJs.plotlyJsStrings.relayout | typingsJapgolly.plotlyJs.plotlyJsStrings.restyle | skip | typingsJapgolly.plotlyJs.plotlyJsStrings.update,
    value: String,
    visible: Boolean
  ): SliderStep = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], execute = execute.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderStep]
  }
  
  extension [Self <: SliderStep](x: Self) {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMethod(
      value: animate | typingsJapgolly.plotlyJs.plotlyJsStrings.relayout | typingsJapgolly.plotlyJs.plotlyJsStrings.restyle | skip | typingsJapgolly.plotlyJs.plotlyJsStrings.update
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
