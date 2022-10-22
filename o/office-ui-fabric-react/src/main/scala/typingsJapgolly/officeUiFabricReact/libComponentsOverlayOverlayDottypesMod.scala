package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsOverlayOverlayDottypesMod {
  
  trait IOverlay extends StObject
  
  trait IOverlayProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Allow body scroll on touch devices. Changing after mounting has no effect.
      * @defaultvalue false
      */
    var allowTouchBodyScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IOverlay]] = js.undefined
    
    /**
      * Whether to use the dark-themed overlay.
      * @defaultvalue false
      */
    var isDarkThemed: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onClick")
    var onClick_IOverlayProps: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IOverlayProps {
    
    inline def apply(): IOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayProps]
    }
    
    extension [Self <: IOverlayProps](x: Self) {
      
      inline def setAllowTouchBodyScroll(value: Boolean): Self = StObject.set(x, "allowTouchBodyScroll", value.asInstanceOf[js.Any])
      
      inline def setAllowTouchBodyScrollUndefined: Self = StObject.set(x, "allowTouchBodyScroll", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IOverlay]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IOverlay | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IOverlay | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setIsDarkThemed(value: Boolean): Self = StObject.set(x, "isDarkThemed", value.asInstanceOf[js.Any])
      
      inline def setIsDarkThemedUndefined: Self = StObject.set(x, "isDarkThemed", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IOverlayStyleProps => DeepPartial[IOverlayStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IOverlayStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Is overlay dark themed
      */
    var isDark: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is overlay visible
      */
    var isNone: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IOverlayStyleProps {
    
    inline def apply(theme: ITheme): IOverlayStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayStyleProps]
    }
    
    extension [Self <: IOverlayStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsDark(value: Boolean): Self = StObject.set(x, "isDark", value.asInstanceOf[js.Any])
      
      inline def setIsDarkUndefined: Self = StObject.set(x, "isDark", js.undefined)
      
      inline def setIsNone(value: Boolean): Self = StObject.set(x, "isNone", value.asInstanceOf[js.Any])
      
      inline def setIsNoneUndefined: Self = StObject.set(x, "isNone", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOverlayStyles extends StObject {
    
    /**
      * Style for the root element.
      */
    var root: IStyle
  }
  object IOverlayStyles {
    
    inline def apply(): IOverlayStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayStyles]
    }
    
    extension [Self <: IOverlayStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
