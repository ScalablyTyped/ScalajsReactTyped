package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antd.libLocaleProviderMod.Locale
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocaleProviderLocaleReceiverMod {
  
  @JSImport("antd/lib/locale-provider/LocaleReceiver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: LocaleComponentName */](props: LocaleReceiverProps[C]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useLocaleReceiver[C /* <: LocaleComponentName */](componentName: C): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ]]
  inline def useLocaleReceiver[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ]]
  inline def useLocaleReceiver[C /* <: LocaleComponentName */](
    componentName: C,
    defaultLocale: js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
    ]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocaleReceiver")(componentName.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
  ]]
  
  /* Inlined std.Exclude<keyof antd.antd/lib/locale-provider.Locale, 'locale'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.PageHeader
    - typingsJapgolly.antd.antdStrings.Empty
    - typingsJapgolly.antd.antdStrings.Text
    - typingsJapgolly.antd.antdStrings.Pagination
    - typingsJapgolly.antd.antdStrings.global
    - typingsJapgolly.antd.antdStrings.Form
    - typingsJapgolly.antd.antdStrings.Select
    - typingsJapgolly.antd.antdStrings.Modal
    - typingsJapgolly.antd.antdStrings.Icon
    - typingsJapgolly.antd.antdStrings.TimePicker
    - typingsJapgolly.antd.antdStrings.Image
    - typingsJapgolly.antd.antdStrings.Transfer
    - typingsJapgolly.antd.antdStrings.Table
    - typingsJapgolly.antd.antdStrings.DatePicker
    - typingsJapgolly.antd.antdStrings.Calendar
    - typingsJapgolly.antd.antdStrings.Upload
    - typingsJapgolly.antd.antdStrings.Popconfirm
  */
  trait LocaleComponentName extends StObject
  object LocaleComponentName {
    
    inline def Calendar: typingsJapgolly.antd.antdStrings.Calendar = "Calendar".asInstanceOf[typingsJapgolly.antd.antdStrings.Calendar]
    
    inline def DatePicker: typingsJapgolly.antd.antdStrings.DatePicker = "DatePicker".asInstanceOf[typingsJapgolly.antd.antdStrings.DatePicker]
    
    inline def Empty: typingsJapgolly.antd.antdStrings.Empty = "Empty".asInstanceOf[typingsJapgolly.antd.antdStrings.Empty]
    
    inline def Form: typingsJapgolly.antd.antdStrings.Form = "Form".asInstanceOf[typingsJapgolly.antd.antdStrings.Form]
    
    inline def Icon: typingsJapgolly.antd.antdStrings.Icon = "Icon".asInstanceOf[typingsJapgolly.antd.antdStrings.Icon]
    
    inline def Image: typingsJapgolly.antd.antdStrings.Image = "Image".asInstanceOf[typingsJapgolly.antd.antdStrings.Image]
    
    inline def Modal: typingsJapgolly.antd.antdStrings.Modal = "Modal".asInstanceOf[typingsJapgolly.antd.antdStrings.Modal]
    
    inline def PageHeader: typingsJapgolly.antd.antdStrings.PageHeader = "PageHeader".asInstanceOf[typingsJapgolly.antd.antdStrings.PageHeader]
    
    inline def Pagination: typingsJapgolly.antd.antdStrings.Pagination = "Pagination".asInstanceOf[typingsJapgolly.antd.antdStrings.Pagination]
    
    inline def Popconfirm: typingsJapgolly.antd.antdStrings.Popconfirm = "Popconfirm".asInstanceOf[typingsJapgolly.antd.antdStrings.Popconfirm]
    
    inline def Select: typingsJapgolly.antd.antdStrings.Select = "Select".asInstanceOf[typingsJapgolly.antd.antdStrings.Select]
    
    inline def Table: typingsJapgolly.antd.antdStrings.Table = "Table".asInstanceOf[typingsJapgolly.antd.antdStrings.Table]
    
    inline def Text: typingsJapgolly.antd.antdStrings.Text = "Text".asInstanceOf[typingsJapgolly.antd.antdStrings.Text]
    
    inline def TimePicker: typingsJapgolly.antd.antdStrings.TimePicker = "TimePicker".asInstanceOf[typingsJapgolly.antd.antdStrings.TimePicker]
    
    inline def Transfer: typingsJapgolly.antd.antdStrings.Transfer = "Transfer".asInstanceOf[typingsJapgolly.antd.antdStrings.Transfer]
    
    inline def Upload: typingsJapgolly.antd.antdStrings.Upload = "Upload".asInstanceOf[typingsJapgolly.antd.antdStrings.Upload]
    
    inline def global: typingsJapgolly.antd.antdStrings.global = "global".asInstanceOf[typingsJapgolly.antd.antdStrings.global]
  }
  
  trait LocaleReceiverProps[C /* <: LocaleComponentName */] extends StObject {
    
    def children(
      locale: NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
        ],
      localeCode: String,
      fullLocale: Locale
    ): Element
    
    var componentName: js.UndefOr[C] = js.undefined
    
    var defaultLocale: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any) | (js.Function0[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
        ])
      ] = js.undefined
  }
  object LocaleReceiverProps {
    
    inline def apply[C /* <: LocaleComponentName */](
      children: (NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
        ], String, Locale) => Element
    ): LocaleReceiverProps[C] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
      __obj.asInstanceOf[LocaleReceiverProps[C]]
    }
    
    extension [Self <: LocaleReceiverProps[?], C /* <: LocaleComponentName */](x: Self & LocaleReceiverProps[C]) {
      
      inline def setChildren(
        value: (NonNullable[
              /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
            ], String, Locale) => Element
      ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setComponentName(value: C): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      inline def setDefaultLocale(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any) | (js.Function0[
              /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
            ])
      ): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleCallbackTo(
        value: CallbackTo[
              /* import warning: importer.ImportType#apply Failed type conversion: antd.antd/lib/locale-provider.Locale[C] */ js.Any
            ]
      ): Self = StObject.set(x, "defaultLocale", value.toJsFn)
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    }
  }
}
