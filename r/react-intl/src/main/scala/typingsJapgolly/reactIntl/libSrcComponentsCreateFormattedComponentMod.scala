package typingsJapgolly.reactIntl

import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactIntl.anon.`1`
import typingsJapgolly.reactIntl.anon.`2`
import typingsJapgolly.reactIntl.anon.`3`
import typingsJapgolly.reactIntl.anon.`4`
import typingsJapgolly.reactIntl.anon.`5`
import typingsJapgolly.reactIntl.anon.`6`
import typingsJapgolly.reactIntl.anon.`7`
import typingsJapgolly.reactIntl.anon.`8`
import typingsJapgolly.reactIntl.reactIntlStrings.formatDate
import typingsJapgolly.reactIntl.reactIntlStrings.formatDisplayName
import typingsJapgolly.reactIntl.reactIntlStrings.formatList
import typingsJapgolly.reactIntl.reactIntlStrings.formatNumber
import typingsJapgolly.reactIntl.reactIntlStrings.formatTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcComponentsCreateFormattedComponentMod {
  
  @JSImport("react-intl/lib/src/components/createFormattedComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-intl/lib/src/components/createFormattedComponent", "FormattedListParts")
  @js.native
  val FormattedListParts: FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/lib/src/components/createFormattedComponent.Formatter['formatList'] */ js.Any) & `1`
  ] = js.native
  
  @JSImport("react-intl/lib/src/components/createFormattedComponent", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/lib/src/components/createFormattedComponent.Formatter['formatNumber'] */ js.Any) & `2`
  ] = js.native
  
  inline def createFormattedComponent_formatDate(name: formatDate): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `3`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `3`
  ]]
  
  inline def createFormattedComponent_formatDisplayName(name: formatDisplayName): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ Any) & `7`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ Any) & `7`
  ]]
  
  inline def createFormattedComponent_formatList(name: formatList): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ Any) & `6`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ Any) & `6`
  ]]
  
  inline def createFormattedComponent_formatNumber(name: formatNumber): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ Any) & `5`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ Any) & `5`
  ]]
  
  inline def createFormattedComponent_formatTime(name: formatTime): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `4`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `4`
  ]]
  
  inline def createFormattedDateTimePartsComponent[Name /* <: formatDate | formatTime */](name: Name): FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/lib/src/components/createFormattedComponent.Formatter[Name] */ js.Any) & `8`[Name]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedDateTimePartsComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/lib/src/components/createFormattedComponent.Formatter[Name] */ js.Any) & `8`[Name]
  ]]
  
  trait Formatter extends StObject {
    
    var formatDate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any
    
    var formatDisplayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ Any
    
    var formatList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ Any
    
    var formatNumber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ Any
    
    var formatTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any
  }
  object Formatter {
    
    inline def apply(
      formatDate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any,
      formatDisplayName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ Any,
      formatList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ Any,
      formatNumber: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ Any,
      formatTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any
    ): Formatter = {
      val __obj = js.Dynamic.literal(formatDate = formatDate.asInstanceOf[js.Any], formatDisplayName = formatDisplayName.asInstanceOf[js.Any], formatList = formatList.asInstanceOf[js.Any], formatNumber = formatNumber.asInstanceOf[js.Any], formatTime = formatTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formatter]
    }
    
    extension [Self <: Formatter](x: Self) {
      
      inline def setFormatDate(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any
      ): Self = StObject.set(x, "formatDate", value.asInstanceOf[js.Any])
      
      inline def setFormatDisplayName(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ Any
      ): Self = StObject.set(x, "formatDisplayName", value.asInstanceOf[js.Any])
      
      inline def setFormatList(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ Any
      ): Self = StObject.set(x, "formatList", value.asInstanceOf[js.Any])
      
      inline def setFormatNumber(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ Any
      ): Self = StObject.set(x, "formatNumber", value.asInstanceOf[js.Any])
      
      inline def setFormatTime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any
      ): Self = StObject.set(x, "formatTime", value.asInstanceOf[js.Any])
    }
  }
}
