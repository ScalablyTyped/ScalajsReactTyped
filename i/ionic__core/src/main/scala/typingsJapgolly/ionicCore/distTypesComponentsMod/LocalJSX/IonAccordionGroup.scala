package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsAccordionGroupAccordionGroupInterfaceMod.AccordionGroupChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonAccordionGroupCustomEvent
import typingsJapgolly.ionicCore.ionicCoreStrings.compact
import typingsJapgolly.ionicCore.ionicCoreStrings.inset
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonAccordionGroup extends StObject {
  
  /**
    * If `true`, all accordions inside of the accordion group will animate when expanding or collapsing.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the accordion group cannot be interacted with.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes the expansion behavior for each accordion. Possible values are `"compact"` and `"inset"`. Defaults to `"compact"`.
    */
  var expand: js.UndefOr[compact | inset] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * If `true`, the accordion group can have multiple accordion components expanded at the same time.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[
    js.Function1[
      /* event */ IonAccordionGroupCustomEvent[AccordionGroupChangeEventDetail[Any]], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * If `true`, the accordion group cannot be interacted with, but does not alter the opacity.
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the accordion group.
    */
  var value: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}
object IonAccordionGroup {
  
  inline def apply(): IonAccordionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonAccordionGroup]
  }
  
  extension [Self <: IonAccordionGroup](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpand(value: compact | inset): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOnIonChange(value: /* event */ IonAccordionGroupCustomEvent[AccordionGroupChangeEventDetail[Any]] => Callback): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1((t0: /* event */ IonAccordionGroupCustomEvent[AccordionGroupChangeEventDetail[Any]]) => value(t0).runNow()))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
