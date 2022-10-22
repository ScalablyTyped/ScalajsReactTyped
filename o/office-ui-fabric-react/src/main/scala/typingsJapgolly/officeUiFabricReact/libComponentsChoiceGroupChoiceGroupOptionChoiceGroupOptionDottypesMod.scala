package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.anon.Width
import typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupDottypesMod.IChoiceGroupOption
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDottypesMod {
  
  trait IChoiceGroupOptionProps
    extends StObject
       with IChoiceGroupOption {
    
    /**
      * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IChoiceGroupOption]] = js.undefined
    
    /**
      * Indicates if the ChoiceGroupOption should appear focused, visually
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback for receiving a notification when the choice has lost focus.
      */
    @JSName("onBlur")
    var onBlur_IChoiceGroupOptionProps: js.UndefOr[
        js.Function2[
          /* ev */ ReactFocusEventFrom[HTMLElement], 
          /* props */ js.UndefOr[IChoiceGroupOption], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A callback for receiving a notification when the choice has been changed.
      */
    @JSName("onChange")
    var onChange_IChoiceGroupOptionProps: js.UndefOr[
        js.Function2[
          /* evt */ js.UndefOr[ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]], 
          /* props */ js.UndefOr[IChoiceGroupOption], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A callback for receiving a notification when the choice has received focus.
      */
    @JSName("onFocus")
    var onFocus_IChoiceGroupOptionProps: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[ReactFocusEventFrom[(HTMLElement | HTMLInputElement) & Element]], 
          /* props */ js.UndefOr[IChoiceGroupOption], 
          js.UndefOr[Unit]
        ]
      ] = js.undefined
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IChoiceGroupOptionProps {
    
    inline def apply(key: String, text: String): IChoiceGroupOptionProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChoiceGroupOptionProps]
    }
    
    extension [Self <: IChoiceGroupOptionProps](x: Self) {
      
      inline def setComponentRef(value: IRefObject[IChoiceGroupOption]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IChoiceGroupOption | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IChoiceGroupOption | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setOnBlur(
        value: (/* ev */ ReactFocusEventFrom[HTMLElement], /* props */ js.UndefOr[IChoiceGroupOption]) => Callback
      ): Self = StObject.set(x, "onBlur", js.Any.fromFunction2((t0: /* ev */ ReactFocusEventFrom[HTMLElement], t1: /* props */ js.UndefOr[IChoiceGroupOption]) => (value(t0, t1)).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(
        value: (/* evt */ js.UndefOr[ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]], /* props */ js.UndefOr[IChoiceGroupOption]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* evt */ js.UndefOr[ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]], t1: /* props */ js.UndefOr[IChoiceGroupOption]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(
        value: (/* ev */ js.UndefOr[ReactFocusEventFrom[(HTMLElement | HTMLInputElement) & Element]], /* props */ js.UndefOr[IChoiceGroupOption]) => js.UndefOr[Unit]
      ): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IChoiceGroupOptionStyleProps extends StObject {
    
    /** Whether the option is checked or not. */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option is disabled or not. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option is in focus or not. */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option has an icon. */
    var hasIcon: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the option icon is an image. */
    var hasImage: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the image width or height are higher than `71`. */
    var imageIsLarge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Image sizes used when `hasImage` or `hasIcon` style props are enabled.
      * @defaultvalue \{height: 32, width: 32\}
      */
    var imageSize: js.UndefOr[Width] = js.undefined
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme
  }
  object IChoiceGroupOptionStyleProps {
    
    inline def apply(theme: ITheme): IChoiceGroupOptionStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChoiceGroupOptionStyleProps]
    }
    
    extension [Self <: IChoiceGroupOptionStyleProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHasIcon(value: Boolean): Self = StObject.set(x, "hasIcon", value.asInstanceOf[js.Any])
      
      inline def setHasIconUndefined: Self = StObject.set(x, "hasIcon", js.undefined)
      
      inline def setHasImage(value: Boolean): Self = StObject.set(x, "hasImage", value.asInstanceOf[js.Any])
      
      inline def setHasImageUndefined: Self = StObject.set(x, "hasImage", js.undefined)
      
      inline def setImageIsLarge(value: Boolean): Self = StObject.set(x, "imageIsLarge", value.asInstanceOf[js.Any])
      
      inline def setImageIsLargeUndefined: Self = StObject.set(x, "imageIsLarge", js.undefined)
      
      inline def setImageSize(value: Width): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IChoiceGroupOptionStyles extends StObject {
    
    var choiceFieldWrapper: js.UndefOr[IStyle] = js.undefined
    
    var field: js.UndefOr[IStyle] = js.undefined
    
    var iconWrapper: js.UndefOr[IStyle] = js.undefined
    
    var imageWrapper: js.UndefOr[IStyle] = js.undefined
    
    var innerField: js.UndefOr[IStyle] = js.undefined
    
    var input: js.UndefOr[IStyle] = js.undefined
    
    var labelWrapper: js.UndefOr[IStyle] = js.undefined
    
    var root: js.UndefOr[IStyle] = js.undefined
    
    var selectedImageWrapper: js.UndefOr[IStyle] = js.undefined
  }
  object IChoiceGroupOptionStyles {
    
    inline def apply(): IChoiceGroupOptionStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChoiceGroupOptionStyles]
    }
    
    extension [Self <: IChoiceGroupOptionStyles](x: Self) {
      
      inline def setChoiceFieldWrapper(value: IStyle): Self = StObject.set(x, "choiceFieldWrapper", value.asInstanceOf[js.Any])
      
      inline def setChoiceFieldWrapperNull: Self = StObject.set(x, "choiceFieldWrapper", null)
      
      inline def setChoiceFieldWrapperUndefined: Self = StObject.set(x, "choiceFieldWrapper", js.undefined)
      
      inline def setField(value: IStyle): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldNull: Self = StObject.set(x, "field", null)
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setIconWrapper(value: IStyle): Self = StObject.set(x, "iconWrapper", value.asInstanceOf[js.Any])
      
      inline def setIconWrapperNull: Self = StObject.set(x, "iconWrapper", null)
      
      inline def setIconWrapperUndefined: Self = StObject.set(x, "iconWrapper", js.undefined)
      
      inline def setImageWrapper(value: IStyle): Self = StObject.set(x, "imageWrapper", value.asInstanceOf[js.Any])
      
      inline def setImageWrapperNull: Self = StObject.set(x, "imageWrapper", null)
      
      inline def setImageWrapperUndefined: Self = StObject.set(x, "imageWrapper", js.undefined)
      
      inline def setInnerField(value: IStyle): Self = StObject.set(x, "innerField", value.asInstanceOf[js.Any])
      
      inline def setInnerFieldNull: Self = StObject.set(x, "innerField", null)
      
      inline def setInnerFieldUndefined: Self = StObject.set(x, "innerField", js.undefined)
      
      inline def setInput(value: IStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputNull: Self = StObject.set(x, "input", null)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setLabelWrapper(value: IStyle): Self = StObject.set(x, "labelWrapper", value.asInstanceOf[js.Any])
      
      inline def setLabelWrapperNull: Self = StObject.set(x, "labelWrapper", null)
      
      inline def setLabelWrapperUndefined: Self = StObject.set(x, "labelWrapper", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSelectedImageWrapper(value: IStyle): Self = StObject.set(x, "selectedImageWrapper", value.asInstanceOf[js.Any])
      
      inline def setSelectedImageWrapperNull: Self = StObject.set(x, "selectedImageWrapper", null)
      
      inline def setSelectedImageWrapperUndefined: Self = StObject.set(x, "selectedImageWrapper", js.undefined)
    }
  }
  
  type OnChangeCallback = js.UndefOr[
    js.Function2[
      /* evt */ js.UndefOr[ReactEventFrom[(HTMLElement | HTMLInputElement) & Element]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      Unit
    ]
  ]
  
  type OnFocusCallback = js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[ReactFocusEventFrom[(HTMLElement | HTMLInputElement) & Element]], 
      /* props */ js.UndefOr[IChoiceGroupOption], 
      js.UndefOr[Unit]
    ]
  ]
}
