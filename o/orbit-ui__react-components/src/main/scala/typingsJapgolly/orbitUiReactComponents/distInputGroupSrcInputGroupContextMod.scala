package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.orbitUiReactComponents.distFieldSrcFieldContextMod.UseFieldInputPropsReturn
import typingsJapgolly.orbitUiReactComponents.distLayoutSrcAdaptersMod.Orientation
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputGroupSrcInputGroupContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/input-group/src/InputGroupContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ClearInputGroupContext(hasChildren: ClearInputGroupContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearInputGroupContext")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/input-group/src/InputGroupContext", "InputGroupContext")
  @js.native
  val InputGroupContext: Context[InputGroupContextType] = js.native
  
  inline def useInputGroupAddonProps(): js.Tuple2[UseInputGroupAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupAddonPropsReturn, Boolean]]
  
  inline def useInputGroupButtonAddonProps(): js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupButtonAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupButtonAddonPropsReturn, Boolean]]
  
  inline def useInputGroupContext(): js.Tuple2[InputGroupContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupContext")().asInstanceOf[js.Tuple2[InputGroupContextType, Boolean]]
  
  inline def useInputGroupMenuAddonProps(): js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupMenuAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupMenuAddonPropsReturn, Boolean]]
  
  inline def useInputGroupProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
  
  inline def useInputGroupSelectAddonProps(): js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupSelectAddonProps")().asInstanceOf[js.Tuple2[UseInputGroupSelectAddonPropsReturn, Boolean]]
  
  inline def useInputGroupTextInputProps(): js.Tuple2[UseInputGroupPropsReturn, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputGroupTextInputProps")().asInstanceOf[js.Tuple2[UseInputGroupPropsReturn, Boolean]]
  
  trait ClearInputGroupContextProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object ClearInputGroupContextProps {
    
    inline def apply(): ClearInputGroupContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearInputGroupContextProps]
    }
    
    extension [Self <: ClearInputGroupContextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ToolbarContextType because var conflicts: disabled. Inlined orientation */ trait InputGroupContextType
    extends StObject
       with UseFieldInputPropsReturn {
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object InputGroupContextType {
    
    inline def apply(): InputGroupContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupContextType]
    }
    
    extension [Self <: InputGroupContextType](x: Self) {
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  trait UseInputGroupAddonPropsReturn extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object UseInputGroupAddonPropsReturn {
    
    inline def apply(): UseInputGroupAddonPropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputGroupAddonPropsReturn]
    }
    
    extension [Self <: UseInputGroupAddonPropsReturn](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait UseInputGroupButtonAddonPropsReturn extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object UseInputGroupButtonAddonPropsReturn {
    
    inline def apply(): UseInputGroupButtonAddonPropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputGroupButtonAddonPropsReturn]
    }
    
    extension [Self <: UseInputGroupButtonAddonPropsReturn](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  trait UseInputGroupMenuAddonPropsReturn extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object UseInputGroupMenuAddonPropsReturn {
    
    inline def apply(): UseInputGroupMenuAddonPropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputGroupMenuAddonPropsReturn]
    }
    
    extension [Self <: UseInputGroupMenuAddonPropsReturn](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.orbitUiReactComponents.distToolbarSrcToolbarContextMod.ToolbarContextType because var conflicts: disabled. Inlined orientation */ trait UseInputGroupPropsReturn
    extends StObject
       with UseFieldInputPropsReturn {
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object UseInputGroupPropsReturn {
    
    inline def apply(): UseInputGroupPropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputGroupPropsReturn]
    }
    
    extension [Self <: UseInputGroupPropsReturn](x: Self) {
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  trait UseInputGroupSelectAddonPropsReturn extends StObject {
    
    var allowResponsiveMenuWidth: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object UseInputGroupSelectAddonPropsReturn {
    
    inline def apply(): UseInputGroupSelectAddonPropsReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputGroupSelectAddonPropsReturn]
    }
    
    extension [Self <: UseInputGroupSelectAddonPropsReturn](x: Self) {
      
      inline def setAllowResponsiveMenuWidth(value: Boolean): Self = StObject.set(x, "allowResponsiveMenuWidth", value.asInstanceOf[js.Any])
      
      inline def setAllowResponsiveMenuWidthUndefined: Self = StObject.set(x, "allowResponsiveMenuWidth", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
}
