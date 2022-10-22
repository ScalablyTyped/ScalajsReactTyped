package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionNode
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.invalid
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabel extends StObject {
  
  var `aria-describedby`: String
  
  var `aria-label`: String
  
  var `aria-labelledby`: String
  
  var autoFocus: Boolean
  
  var defaultFocusTarget: String
  
  var fluid: Boolean
  
  var focusOnHover: Boolean
  
  var nodes: js.Array[CollectionNode]
  
  def onSelectionChange(event: ReactEventFrom[Element], newValue: js.Array[String]): Unit
  
  var selectedKeys: js.Array[String]
  
  var validationState: invalid | valid
}
object Arialabel {
  
  inline def apply(
    `aria-describedby`: String,
    `aria-label`: String,
    `aria-labelledby`: String,
    autoFocus: Boolean,
    defaultFocusTarget: String,
    fluid: Boolean,
    focusOnHover: Boolean,
    nodes: js.Array[CollectionNode],
    onSelectionChange: (ReactEventFrom[Element], js.Array[String]) => Callback,
    selectedKeys: js.Array[String],
    validationState: invalid | valid
  ): Arialabel = {
    val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any], defaultFocusTarget = defaultFocusTarget.asInstanceOf[js.Any], fluid = fluid.asInstanceOf[js.Any], focusOnHover = focusOnHover.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], onSelectionChange = js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: js.Array[String]) => (onSelectionChange(t0, t1)).runNow()), selectedKeys = selectedKeys.asInstanceOf[js.Any], validationState = validationState.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  
  extension [Self <: Arialabel](x: Self) {
    
    inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setDefaultFocusTarget(value: String): Self = StObject.set(x, "defaultFocusTarget", value.asInstanceOf[js.Any])
    
    inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    inline def setFocusOnHover(value: Boolean): Self = StObject.set(x, "focusOnHover", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[CollectionNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: CollectionNode*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setOnSelectionChange(value: (ReactEventFrom[Element], js.Array[String]) => Callback): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction2((t0: ReactEventFrom[Element], t1: js.Array[String]) => (value(t0, t1)).runNow()))
    
    inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    
    inline def setValidationState(value: invalid | valid): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
  }
}
