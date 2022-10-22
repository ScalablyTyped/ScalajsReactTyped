package typingsJapgolly.sharepoint.global

import org.scalajs.dom.HTMLElement
import typingsJapgolly.sharepoint.SP.ClientContext
import typingsJapgolly.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import typingsJapgolly.sharepoint.SPClientTemplates.ChoiceFormatType
import typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode
import typingsJapgolly.sharepoint.SPClientTemplates.ClientLookupValue
import typingsJapgolly.sharepoint.SPClientTemplates.ClientUrlValue
import typingsJapgolly.sharepoint.SPClientTemplates.ClientUserValue
import typingsJapgolly.sharepoint.SPClientTemplates.FieldSchemaInForm
import typingsJapgolly.sharepoint.SPClientTemplates.FileSystemObjectType
import typingsJapgolly.sharepoint.SPClientTemplates.RenderContext
import typingsJapgolly.sharepoint.SPClientTemplates.RenderContextForm
import typingsJapgolly.sharepoint.SPClientTemplates.RichTextMode
import typingsJapgolly.sharepoint.SPClientTemplates.TemplateOverridesOptions
import typingsJapgolly.sharepoint.SPClientTemplates.Templates
import typingsJapgolly.sharepoint.anon.AllowScriptableWebParts
import typingsJapgolly.sharepoint.anon.BaseType
import typingsJapgolly.sharepoint.anon.ExternalListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SPClientTemplates {
  
  @JSGlobal("SPClientTemplates.ChoiceFormatType")
  @js.native
  object ChoiceFormatType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.ChoiceFormatType & Double] = js.native
    
    /* 0 */ val Dropdown: typingsJapgolly.sharepoint.SPClientTemplates.ChoiceFormatType.Dropdown & Double = js.native
    
    /* 1 */ val Radio: typingsJapgolly.sharepoint.SPClientTemplates.ChoiceFormatType.Radio & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.ClientControlMode")
  @js.native
  object ClientControlMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode & Double] = js.native
    
    /* 1 */ val DisplayForm: typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode.DisplayForm & Double = js.native
    
    /* 2 */ val EditForm: typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode.EditForm & Double = js.native
    
    /* 0 */ val Invalid: typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode.Invalid & Double = js.native
    
    /* 3 */ val NewForm: typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode.NewForm & Double = js.native
    
    /* 4 */ val View: typingsJapgolly.sharepoint.SPClientTemplates.ClientControlMode.View & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.ClientFormContext")
  @js.native
  open class ClientFormContext ()
    extends StObject
       with typingsJapgolly.sharepoint.SPClientTemplates.ClientFormContext {
    
    /* CompleteClass */
    var controlMode: Double = js.native
    
    /* CompleteClass */
    var fieldName: String = js.native
    
    /* CompleteClass */
    var fieldSchema: FieldSchemaInForm = js.native
    
    /* CompleteClass */
    var fieldValue: Any = js.native
    
    /* CompleteClass */
    var itemAttributes: ExternalListItem = js.native
    
    /* CompleteClass */
    var listAttributes: BaseType = js.native
    
    /* CompleteClass */
    override def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit = js.native
    
    /* CompleteClass */
    override def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def registerGetValueCallback(fieldname: String, callback: js.Function0[Any]): Unit = js.native
    
    /* CompleteClass */
    override def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[Any], Unit]): Unit = js.native
    
    /* CompleteClass */
    override def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def updateControlValue(fieldname: String, value: Any): Unit = js.native
    
    /* CompleteClass */
    var webAttributes: AllowScriptableWebParts = js.native
  }
  
  @JSGlobal("SPClientTemplates.DateTimeCalendarType")
  @js.native
  object DateTimeCalendarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType & Double] = js.native
    
    /* 13 */ val ChineseLunar: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.ChineseLunar & Double = js.native
    
    /* 1 */ val Gregorian: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.Gregorian & Double = js.native
    
    /* 9 */ val GregorianArabic: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianArabic & Double = js.native
    
    /* 8 */ val GregorianMEFrench: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianMEFrench & Double = js.native
    
    /* 10 */ val GregorianXLITEnglish: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianXLITEnglish & Double = js.native
    
    /* 11 */ val GregorianXLITFrench: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.GregorianXLITFrench & Double = js.native
    
    /* 7 */ val Hebrew: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.Hebrew & Double = js.native
    
    /* 5 */ val Hijri: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.Hijri & Double = js.native
    
    /* 2 */ val Japan: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.Japan & Double = js.native
    
    /* 4 */ val Korea: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.Korea & Double = js.native
    
    /* 12 */ val KoreaJapanLunar: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.KoreaJapanLunar & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.None & Double = js.native
    
    /* 14 */ val SakaEra: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.SakaEra & Double = js.native
    
    /* 3 */ val Taiwan: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.Taiwan & Double = js.native
    
    /* 6 */ val Thai: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.Thai & Double = js.native
    
    /* 15 */ val UmAlQura: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeCalendarType.UmAlQura & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.DateTimeDisplayFormat")
  @js.native
  object DateTimeDisplayFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.DateTimeDisplayFormat & Double] = js.native
    
    /* 0 */ val DateOnly: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateOnly & Double = js.native
    
    /* 1 */ val DateTime: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeDisplayFormat.DateTime & Double = js.native
    
    /* 2 */ val TimeOnly: typingsJapgolly.sharepoint.SPClientTemplates.DateTimeDisplayFormat.TimeOnly & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.FileSystemObjectType")
  @js.native
  object FileSystemObjectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.FileSystemObjectType & Double] = js.native
    
    /* 1 */ val File: typingsJapgolly.sharepoint.SPClientTemplates.FileSystemObjectType.File & Double = js.native
    
    /* 2 */ val Folder: typingsJapgolly.sharepoint.SPClientTemplates.FileSystemObjectType.Folder & Double = js.native
    
    /* 0 */ val Invalid: typingsJapgolly.sharepoint.SPClientTemplates.FileSystemObjectType.Invalid & Double = js.native
    
    /* 3 */ val Web: typingsJapgolly.sharepoint.SPClientTemplates.FileSystemObjectType.Web & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.RichTextMode")
  @js.native
  object RichTextMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.RichTextMode & Double] = js.native
    
    /* 0 */ val Compatible: typingsJapgolly.sharepoint.SPClientTemplates.RichTextMode.Compatible & Double = js.native
    
    /* 1 */ val FullHtml: typingsJapgolly.sharepoint.SPClientTemplates.RichTextMode.FullHtml & Double = js.native
    
    /* 2 */ val HtmlAsXml: typingsJapgolly.sharepoint.SPClientTemplates.RichTextMode.HtmlAsXml & Double = js.native
    
    /* 3 */ val ThemeHtml: typingsJapgolly.sharepoint.SPClientTemplates.RichTextMode.ThemeHtml & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.TemplateManager")
  @js.native
  open class TemplateManager ()
    extends StObject
       with typingsJapgolly.sharepoint.SPClientTemplates.TemplateManager
  object TemplateManager {
    
    @JSGlobal("SPClientTemplates.TemplateManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def GetTemplates(renderCtx: RenderContext): Templates = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTemplates")(renderCtx.asInstanceOf[js.Any]).asInstanceOf[Templates]
    
    /* static member */
    inline def RegisterTemplateOverrides(renderCtx: TemplateOverridesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterTemplateOverrides")(renderCtx.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("SPClientTemplates.UrlFormatType")
  @js.native
  object UrlFormatType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.UrlFormatType & Double] = js.native
    
    /* 0 */ val Hyperlink: typingsJapgolly.sharepoint.SPClientTemplates.UrlFormatType.Hyperlink & Double = js.native
    
    /* 1 */ val Image: typingsJapgolly.sharepoint.SPClientTemplates.UrlFormatType.Image & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.UserSelectionMode")
  @js.native
  object UserSelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SPClientTemplates.UserSelectionMode & Double] = js.native
    
    /* 1 */ val PeopleAndGroups: typingsJapgolly.sharepoint.SPClientTemplates.UserSelectionMode.PeopleAndGroups & Double = js.native
    
    /* 0 */ val PeopleOnly: typingsJapgolly.sharepoint.SPClientTemplates.UserSelectionMode.PeopleOnly & Double = js.native
  }
  
  @JSGlobal("SPClientTemplates.Utility")
  @js.native
  open class Utility ()
    extends StObject
       with typingsJapgolly.sharepoint.SPClientTemplates.Utility
  object Utility {
    
    @JSGlobal("SPClientTemplates.Utility")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents lookup values array in some strange format */
    /* static member */
    inline def BuildLookupValuesAsString(choiceArray: js.Array[ClientLookupValue], isMultiLookup: Boolean, setGroupDesc: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildLookupValuesAsString")(choiceArray.asInstanceOf[js.Any], isMultiLookup.asInstanceOf[js.Any], setGroupDesc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def ChoiceFormatTypeToString(fileSystemObjectType: ChoiceFormatType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ChoiceFormatTypeToString")(fileSystemObjectType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def ComputeRegisterTypeInfo(renderCtx: TemplateOverridesOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ComputeRegisterTypeInfo")(renderCtx.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* static member */
    inline def ControlModeToString(mode: ClientControlMode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ControlModeToString")(mode.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def FileSystemObjectTypeToString(fileSystemObjectType: FileSystemObjectType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FileSystemObjectTypeToString")(fileSystemObjectType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def GetControlOptions(control: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetControlOptions")(control.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /* static member */
    inline def GetFormContextForCurrentField(context: RenderContextForm): typingsJapgolly.sharepoint.SPClientTemplates.ClientFormContext = ^.asInstanceOf[js.Dynamic].applyDynamic("GetFormContextForCurrentField")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SPClientTemplates.ClientFormContext]
    
    /* static member */
    inline def GetPropertiesFromPageContextInfo(context: RenderContext): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPropertiesFromPageContextInfo")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Creates SP.ClientContext based on the specified Web URL. If the SP.Runtime.js script is not loaded, returns null */
    /* static member */
    inline def InitContext(webUrl: String): ClientContext = ^.asInstanceOf[js.Dynamic].applyDynamic("InitContext")(webUrl.asInstanceOf[js.Any]).asInstanceOf[ClientContext]
    
    /* static member */
    inline def IsValidControlMode(mode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsValidControlMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def ParseLookupValue(valueStr: String): ClientLookupValue = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseLookupValue")(valueStr.asInstanceOf[js.Any]).asInstanceOf[ClientLookupValue]
    
    /* static member */
    inline def ParseMultiLookupValues(valueStr: String): js.Array[ClientLookupValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseMultiLookupValues")(valueStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ClientLookupValue]]
    
    /* static member */
    inline def ParseURLValue(value: String): ClientUrlValue = ^.asInstanceOf[js.Dynamic].applyDynamic("ParseURLValue")(value.asInstanceOf[js.Any]).asInstanceOf[ClientUrlValue]
    
    /** Replaces tokens "~site/", "~sitecollection/", "~sitecollectionmasterpagegallery", "{lcid}", "{locale}" and "{siteclienttag}" with appropriate context values */
    /* static member */
    inline def ReplaceUrlTokens(tokenUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ReplaceUrlTokens")(tokenUrl.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def RichTextModeToString(fileSystemObjectType: RichTextMode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RichTextModeToString")(fileSystemObjectType.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /** Removes leading and trailing spaces */
    /* static member */
    inline def Trim(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Trim")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def TryParseInitialUserValue(userStr: String): js.Array[ClientUserValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("TryParseInitialUserValue")(userStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ClientUserValue]]
    
    /** Tries to resolve user names from string. Pushes either ClientUserValue (if resolved successfully) or original string (if not) to the resulting array. */
    /* static member */
    inline def TryParseUserControlValue(userStr: String, separator: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("TryParseUserControlValue")(userStr.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /** Returns ";#" */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.UserLookupDelimitString")
    @js.native
    def UserLookupDelimitString: String = js.native
    inline def UserLookupDelimitString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserLookupDelimitString")(x.asInstanceOf[js.Any])
    
    /** Returns ";#" */
    /* static member */
    @JSGlobal("SPClientTemplates.Utility.UserMultiValueDelimitString")
    @js.native
    def UserMultiValueDelimitString: String = js.native
    inline def UserMultiValueDelimitString_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserMultiValueDelimitString")(x.asInstanceOf[js.Any])
  }
}
