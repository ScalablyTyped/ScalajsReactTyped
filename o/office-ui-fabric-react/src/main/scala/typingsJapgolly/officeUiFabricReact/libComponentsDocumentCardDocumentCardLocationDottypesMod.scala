package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardLocationDotbaseMod.DocumentCardLocationBase
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardLocationDottypesMod {
  
  trait IDocumentCardLocation extends StObject
  
  trait IDocumentCardLocationProps
    extends StObject
       with ClassAttributes[DocumentCardLocationBase] {
    
    /**
      * Aria label for the link to the document location.
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardLocation]] = js.undefined
    
    /**
      * Text for the location of the document.
      */
    var location: String
    
    /**
      * URL to navigate to for this location.
      */
    var locationHref: js.UndefOr[String] = js.undefined
    
    /**
      * Function to call when the location is clicked.
      */
    var onClick: js.UndefOr[js.Function1[/* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], Unit]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]
      ] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDocumentCardLocationProps {
    
    inline def apply(location: String): IDocumentCardLocationProps = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardLocationProps]
    }
    
    extension [Self <: IDocumentCardLocationProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardLocation]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardLocation | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardLocation | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationHref(value: String): Self = StObject.set(x, "locationHref", value.asInstanceOf[js.Any])
      
      inline def setLocationHrefUndefined: Self = StObject.set(x, "locationHref", js.undefined)
      
      inline def setOnClick(value: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* ev */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardLocationStyleProps, IDocumentCardLocationStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardLocationStyleProps => DeepPartial[IDocumentCardLocationStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDocumentCardLocationStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardLocationStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardLocationStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardLocationStyleProps]
    }
    
    extension [Self <: IDocumentCardLocationStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardLocationStyles extends StObject {
    
    var root: IStyle
  }
  object IDocumentCardLocationStyles {
    
    inline def apply(): IDocumentCardLocationStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardLocationStyles]
    }
    
    extension [Self <: IDocumentCardLocationStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
