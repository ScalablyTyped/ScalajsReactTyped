package typingsJapgolly.reactIntl

import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactIntl.anon.ChildrenValue
import typingsJapgolly.reactIntl.anon.`0`
import typingsJapgolly.reactIntl.anon.`10`
import typingsJapgolly.reactIntl.anon.`11`
import typingsJapgolly.reactIntl.anon.`12`
import typingsJapgolly.reactIntl.anon.`13`
import typingsJapgolly.reactIntl.anon.`14`
import typingsJapgolly.reactIntl.anon.`9`
import typingsJapgolly.reactIntl.reactIntlStrings.formatDate
import typingsJapgolly.reactIntl.reactIntlStrings.formatDisplayName
import typingsJapgolly.reactIntl.reactIntlStrings.formatList
import typingsJapgolly.reactIntl.reactIntlStrings.formatNumber
import typingsJapgolly.reactIntl.reactIntlStrings.formatTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsCreateFormattedComponentMod {
  
  @JSImport("react-intl/src/components/createFormattedComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-intl/src/components/createFormattedComponent", "FormattedListParts")
  @js.native
  val FormattedListParts: FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatList'] */ js.Any) & ChildrenValue
  ] = js.native
  
  @JSImport("react-intl/src/components/createFormattedComponent", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatNumber'] */ js.Any) & `0`
  ] = js.native
  
  inline def createFormattedComponent_formatDate(name: formatDate): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `9`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `9`
  ]]
  
  inline def createFormattedComponent_formatDisplayName(name: formatDisplayName): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ Any) & `13`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDisplayNameOptions */ Any) & `13`
  ]]
  
  inline def createFormattedComponent_formatList(name: formatList): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ Any) & `12`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatListOptions */ Any) & `12`
  ]]
  
  inline def createFormattedComponent_formatNumber(name: formatNumber): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ Any) & `11`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatNumberOptions */ Any) & `11`
  ]]
  
  inline def createFormattedComponent_formatTime(name: formatTime): FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `10`
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & `10`
  ]]
  
  inline def createFormattedDateTimePartsComponent[Name /* <: formatDate | formatTime */](name: Name): FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter[Name] */ js.Any) & `14`[Name]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormattedDateTimePartsComponent")(name.asInstanceOf[js.Any]).asInstanceOf[FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter[Name] */ js.Any) & `14`[Name]
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
