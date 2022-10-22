package typingsJapgolly.reactIntl

import typingsJapgolly.reactIntl.anon.PartialPickResolvedIntlCo
import typingsJapgolly.reactIntl.reactIntlStrings.defaultFormats
import typingsJapgolly.reactIntl.reactIntlStrings.defaultLocale
import typingsJapgolly.reactIntl.reactIntlStrings.fallbackOnEmptyString
import typingsJapgolly.reactIntl.reactIntlStrings.formats
import typingsJapgolly.reactIntl.reactIntlStrings.messages
import typingsJapgolly.reactIntl.reactIntlStrings.onError
import typingsJapgolly.reactIntl.reactIntlStrings.textComponent
import typingsJapgolly.reactIntl.reactIntlStrings.timeZone
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  type IntlConfig = (Omit[
    ResolvedIntlConfig, 
    /* keyof react-intl.anon.PickResolvedIntlConfigfal */ timeZone | fallbackOnEmptyString | onError | defaultFormats | formats | textComponent | messages | defaultLocale
  ]) & PartialPickResolvedIntlCo
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntlFormatters<React.ReactNode> * / any */ trait IntlShape
    extends StObject
       with ResolvedIntlConfig {
    
    var formatters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Formatters */ Any
  }
  object IntlShape {
    
    inline def apply(
      formatters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Formatters */ Any
    ): IntlShape = {
      val __obj = js.Dynamic.literal(formatters = formatters.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntlShape]
    }
    
    extension [Self <: IntlShape](x: Self) {
      
      inline def setFormatters(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Formatters */ Any
      ): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreResolvedIntlConfig<React.ReactNode> * / any */ trait ResolvedIntlConfig extends StObject {
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactIntl.reactIntlStrings.a, typingsJapgolly.reactIntl.reactIntlStrings.abbr */ Any
      ] = js.undefined
    
    var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.undefined
  }
  object ResolvedIntlConfig {
    
    inline def apply(): ResolvedIntlConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolvedIntlConfig]
    }
    
    extension [Self <: ResolvedIntlConfig](x: Self) {
      
      inline def setTextComponent(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118, starting with typingsJapgolly.react.mod.ComponentType[js.Object], typingsJapgolly.reactIntl.reactIntlStrings.a, typingsJapgolly.reactIntl.reactIntlStrings.abbr */ Any
      ): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
      
      inline def setWrapRichTextChunksInFragment(value: Boolean): Self = StObject.set(x, "wrapRichTextChunksInFragment", value.asInstanceOf[js.Any])
      
      inline def setWrapRichTextChunksInFragmentUndefined: Self = StObject.set(x, "wrapRichTextChunksInFragment", js.undefined)
    }
  }
}
