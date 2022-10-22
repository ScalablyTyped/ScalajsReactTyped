package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Action
import typingsJapgolly.materialUiCore.anon.Href
import typingsJapgolly.materialUiCore.materialUiCoreStrings.a
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableTypeMap
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseButtonBaseMod extends Shortcut {
  
  /**
    * `ButtonBase` contains as few styles as possible.
    * It aims to be a simple building block for creating a button.
    * It contains a load of style reset and some focus/ripple logic.
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/ButtonBase/ButtonBase", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]] = js.native
  
  trait ButtonBaseActions extends StObject {
    
    def focusVisible(): Unit
  }
  object ButtonBaseActions {
    
    inline def apply(focusVisible: Callback): ButtonBaseActions = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.toJsFn)
      __obj.asInstanceOf[ButtonBaseActions]
    }
    
    extension [Self <: ButtonBaseActions](x: Self) {
      
      inline def setFocusVisible(value: Callback): Self = StObject.set(x, "focusVisible", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible
  */
  trait ButtonBaseClassKey extends StObject
  object ButtonBaseClassKey {
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def focusVisible: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type ButtonBaseProps[D /* <: ElementType */, P] = OverrideProps[ButtonBaseTypeMap[P, D], D]
  
  trait ButtonBaseTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ButtonBaseClassKey
    
    var defaultComponent: D
    
    var props: P & Action
  }
  object ButtonBaseTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ButtonBaseClassKey, defaultComponent: D, props: P & Action): ButtonBaseTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonBaseTypeMap[P, D]]
    }
    
    extension [Self <: ButtonBaseTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ButtonBaseTypeMap[P, D])) {
      
      inline def setClassKey(value: ButtonBaseClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Action): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtendButtonBase[M /* <: OverridableTypeMap */] = (js.Function1[/* props */ Href & (OverrideProps[ExtendButtonBaseTypeMap[M], a]), Element]) & OverridableComponent[ExtendButtonBaseTypeMap[M]]
  
  trait ExtendButtonBaseTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var classKey: /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & js.Object & Action
  }
  object ExtendButtonBaseTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      classKey: /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any,
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & js.Object & Action
    ): ExtendButtonBaseTypeMap[M] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendButtonBaseTypeMap[M]]
    }
    
    extension [Self <: ExtendButtonBaseTypeMap[?], M /* <: OverridableTypeMap */](x: Self & ExtendButtonBaseTypeMap[M]) {
      
      inline def setClassKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['classKey'] */ js.Any
      ): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & js.Object & Action
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `buttonBaseButtonBaseMod.foo` */
  override def _to: ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]] = default
}
