package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLLabelElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.LabelHTMLAttributes
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libIcomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsLabelLabelDottypesMod {
  
  trait ILabel extends StObject
  
  trait ILabelProps
    extends StObject
       with LabelHTMLAttributes[HTMLLabelElement] {
    
    /**
      * Render the root element as another type.
      */
    var as: js.UndefOr[IComponentAs[AllHTMLAttributes[HTMLElement]]] = js.undefined
    
    /**
      * Optional callback to access the ILabel interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ILabel]] = js.undefined
    
    /**
      * Renders the label as disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the associated form field is required or not
      * @defaultvalue false
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Styles for the label.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object ILabelProps {
    
    inline def apply(): ILabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabelProps]
    }
    
    extension [Self <: ILabelProps](x: Self) {
      
      inline def setAs(value: IComponentAs[AllHTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ILabel]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ILabel | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ ILabel | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ILabelStyleProps => DeepPartial[ILabelStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait ILabelStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      *
      */
    var theme: ITheme
  }
  object ILabelStyleProps {
    
    inline def apply(theme: ITheme): ILabelStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILabelStyleProps]
    }
    
    extension [Self <: ILabelStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILabelStyles extends StObject {
    
    /**
      * Styles for the root element.
      */
    var root: IStyle
  }
  object ILabelStyles {
    
    inline def apply(): ILabelStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabelStyles]
    }
    
    extension [Self <: ILabelStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
