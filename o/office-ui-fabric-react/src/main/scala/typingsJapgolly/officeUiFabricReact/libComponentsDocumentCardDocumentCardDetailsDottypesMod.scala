package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstyleMod.IStyle
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDocumentCardDocumentCardDetailsDottypesMod {
  
  trait IDocumentCardDetails extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.Props<DocumentCardDetailsBase> * / any */ trait IDocumentCardDetailsProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IDocumentCardDetails]] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[
        IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles]
      ] = js.undefined
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDocumentCardDetailsProps {
    
    inline def apply(): IDocumentCardDetailsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardDetailsProps]
    }
    
    extension [Self <: IDocumentCardDetailsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IDocumentCardDetails]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IDocumentCardDetails | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardDetails | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDocumentCardDetailsStyleProps, IDocumentCardDetailsStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDocumentCardDetailsStyleProps => DeepPartial[IDocumentCardDetailsStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDocumentCardDetailsStyleProps extends StObject {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme
  }
  object IDocumentCardDetailsStyleProps {
    
    inline def apply(theme: ITheme): IDocumentCardDetailsStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardDetailsStyleProps]
    }
    
    extension [Self <: IDocumentCardDetailsStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDocumentCardDetailsStyles extends StObject {
    
    var root: IStyle
  }
  object IDocumentCardDetailsStyles {
    
    inline def apply(): IDocumentCardDetailsStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentCardDetailsStyles]
    }
    
    extension [Self <: IDocumentCardDetailsStyles](x: Self) {
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
