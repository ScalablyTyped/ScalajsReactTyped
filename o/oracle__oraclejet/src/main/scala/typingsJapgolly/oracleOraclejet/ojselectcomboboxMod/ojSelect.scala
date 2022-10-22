package typingsJapgolly.oracleOraclejet.ojselectcomboboxMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import typingsJapgolly.oracleOraclejet.ojeditablevalueMod.editableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojSelect[V, SP /* <: ojSelectSettableProperties[V, SV] */, SV]
  extends StObject
     with editableValue[V, SP, SV, V] {
  
  def setProperties(properties: ojSelectSettablePropertiesLenient[V, SV]): Unit = js.native
  
  def validate(): js.Promise[Any] = js.native
}
object ojSelect {
  
  // tslint:disable-next-line interface-over-type-literal
  trait Optgroup extends StObject {
    
    var children: js.Array[
        typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
      ]
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: String
  }
  object Optgroup {
    
    inline def apply(
      children: js.Array[
          typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
        ],
      label: String
    ): typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup]
    }
    
    extension [Self <: typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option | typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Optgroup)*
      ): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait Option extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: Any
  }
  object Option {
    
    inline def apply(value: Any): typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option]
    }
    
    extension [Self <: typingsJapgolly.oracleOraclejet.ojselectcomboboxMod.ojSelect.Option](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait OptionContext extends StObject {
    
    var component: Element
    
    var data: js.Object
    
    var depth: Double
    
    var index: Double
    
    var leaf: Boolean
    
    var parent: Element
    
    var parentElement: Element
  }
  object OptionContext {
    
    inline def apply(
      component: Element,
      data: js.Object,
      depth: Double,
      index: Double,
      leaf: Boolean,
      parent: Element,
      parentElement: Element
    ): OptionContext = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionContext]
    }
    
    extension [Self <: OptionContext](x: Self) {
      
      inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLeaf(value: Boolean): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentElement(value: Element): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line interface-over-type-literal
  trait OptionsKeys extends StObject {
    
    var childKeys: js.UndefOr[OptionsKeys] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object OptionsKeys {
    
    inline def apply(): OptionsKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsKeys]
    }
    
    extension [Self <: OptionsKeys](x: Self) {
      
      inline def setChildKeys(value: OptionsKeys): Self = StObject.set(x, "childKeys", value.asInstanceOf[js.Any])
      
      inline def setChildKeysUndefined: Self = StObject.set(x, "childKeys", js.undefined)
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type ojAnimateEnd = CustomEvent
  
  type ojAnimateStart = CustomEvent
}
