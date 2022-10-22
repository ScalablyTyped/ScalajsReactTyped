package typingsJapgolly.dwt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextAction
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRFindTextFlags
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProOutputFormat
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProPDFAVersion
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProPDFVersion
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTOCRProRecognitionModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonDotOCRProMod {
  
  trait Error extends StObject {
    
    /**
      * Return the index of the image or path of the file.
      */
    def GetInput(): Double | String
    
    /**
      * Return the error message.
      */
    def GetMessage(): String
    
    /**
      * Return the number of the page on which the error was thrown.
      * If the input is a file, this returns the index of the page in that file.
      * If the input is an image in the buffer, this always returns 0.
      */
    def GetPage(): Double
  }
  object Error {
    
    inline def apply(GetInput: CallbackTo[Double | String], GetMessage: CallbackTo[String], GetPage: CallbackTo[Double]): Error = {
      val __obj = js.Dynamic.literal(GetInput = GetInput.toJsFn, GetMessage = GetMessage.toJsFn, GetPage = GetPage.toJsFn)
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setGetInput(value: CallbackTo[Double | String]): Self = StObject.set(x, "GetInput", value.toJsFn)
      
      inline def setGetMessage(value: CallbackTo[String]): Self = StObject.set(x, "GetMessage", value.toJsFn)
      
      inline def setGetPage(value: CallbackTo[Double]): Self = StObject.set(x, "GetPage", value.toJsFn)
    }
  }
  
  trait Letter extends StObject {
    
    /**
      * Return the coordinates for the rectangle that contains the specified letter. The coordinates are in the sequence of "left,top,right,bottom" like "121,125,123,143".
      */
    def GetLetterRect(): String
    
    /**
      * Return the text of the letter.
      */
    def GetText(): Double
  }
  object Letter {
    
    inline def apply(GetLetterRect: CallbackTo[String], GetText: CallbackTo[Double]): Letter = {
      val __obj = js.Dynamic.literal(GetLetterRect = GetLetterRect.toJsFn, GetText = GetText.toJsFn)
      __obj.asInstanceOf[Letter]
    }
    
    extension [Self <: Letter](x: Self) {
      
      inline def setGetLetterRect(value: CallbackTo[String]): Self = StObject.set(x, "GetLetterRect", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[Double]): Self = StObject.set(x, "GetText", value.toJsFn)
    }
  }
  
  trait OCRPro extends StObject {
    
    /**
      * Download and install the OCR Professional add-on on the local system.
      * @param path The URL to download the add-on (typically a ZIP file).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Download(
      path: String,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit
    
    /**
      * Return whether the OCR Professional engine has been installed.
      */
    def IsModuleInstalled(): Boolean
    
    /**
      * Perform OCR on the specified image in the buffer.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument imageId The imageId of the image which can be used to find the index.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def Recognize(
      index: Double,
      successCallback: js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit
    
    /**
      * Perform OCR on the specified local file.
      * @param path Specify a local file.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument path The file path.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RecognizeFile(
      path: String,
      successCallback: js.Function2[/* path */ String, /* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit
    
    /**
      * Perform OCR on the specified rectangular area(s) on the image.
      * @param index Specify the image.
      * @param aryRects Specify the rectangle(s).
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument imageId The imageId of the image which can be used to find the index.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RecognizeRect(
      index: Double,
      aryRects: js.Array[Rect],
      successCallback: js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit
    
    /**
      * Perform OCR on the selected images in the buffer.
      * @param index Specify the image.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument result The OCR result.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def RecognizeSelectedImages(
      successCallback: js.Function1[/* result */ OCRProResult, Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit
    
    /**
      * Return or set the current settings of the OCR engine.
      */
    var Settings: typingsJapgolly.dwt.addonDotOCRProMod.Settings | Boolean | Null
  }
  object OCRPro {
    
    inline def apply(
      Download: (String, js.Function0[Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback,
      IsModuleInstalled: CallbackTo[Boolean],
      Recognize: (Double, js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback,
      RecognizeFile: (String, js.Function2[/* path */ String, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback,
      RecognizeRect: (Double, js.Array[Rect], js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback,
      RecognizeSelectedImages: (js.Function1[/* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
    ): OCRPro = {
      val __obj = js.Dynamic.literal(Download = js.Any.fromFunction3((t0: String, t1: js.Function0[Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (Download(t0, t1, t2)).runNow()), IsModuleInstalled = IsModuleInstalled.toJsFn, Recognize = js.Any.fromFunction3((t0: Double, t1: js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (Recognize(t0, t1, t2)).runNow()), RecognizeFile = js.Any.fromFunction3((t0: String, t1: js.Function2[/* path */ String, /* result */ OCRProResult, Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (RecognizeFile(t0, t1, t2)).runNow()), RecognizeRect = js.Any.fromFunction4((t0: Double, t1: js.Array[Rect], t2: js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], t3: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (RecognizeRect(t0, t1, t2, t3)).runNow()), RecognizeSelectedImages = js.Any.fromFunction2((t0: js.Function1[/* result */ OCRProResult, Unit], t1: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (RecognizeSelectedImages(t0, t1)).runNow()), Settings = null)
      __obj.asInstanceOf[OCRPro]
    }
    
    extension [Self <: OCRPro](x: Self) {
      
      inline def setDownload(
        value: (String, js.Function0[Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
      ): Self = StObject.set(x, "Download", js.Any.fromFunction3((t0: String, t1: js.Function0[Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setIsModuleInstalled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsModuleInstalled", value.toJsFn)
      
      inline def setRecognize(
        value: (Double, js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
      ): Self = StObject.set(x, "Recognize", js.Any.fromFunction3((t0: Double, t1: js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRecognizeFile(
        value: (String, js.Function2[/* path */ String, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
      ): Self = StObject.set(x, "RecognizeFile", js.Any.fromFunction3((t0: String, t1: js.Function2[/* path */ String, /* result */ OCRProResult, Unit], t2: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRecognizeRect(
        value: (Double, js.Array[Rect], js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
      ): Self = StObject.set(x, "RecognizeRect", js.Any.fromFunction4((t0: Double, t1: js.Array[Rect], t2: js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], t3: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRecognizeSelectedImages(
        value: (js.Function1[/* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Callback
      ): Self = StObject.set(x, "RecognizeSelectedImages", js.Any.fromFunction2((t0: js.Function1[/* result */ OCRProResult, Unit], t1: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSettings(value: Settings | Boolean): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsNull: Self = StObject.set(x, "Settings", null)
    }
  }
  
  trait OCRProResult extends StObject {
    
    /**
      * Return a base64 string that contains the result of the OCR.
      */
    def Get(): String
    
    /**
      * Return the number of pages already OCR'd on the machine.
      */
    def GetAlreadyOCRCount(): String
    
    /**
      * Return the error code.
      */
    def GetErrorCode(): Double
    
    /**
      * Return an array which contains detailed error information for each page that was OCR'd
      */
    def GetErrorDetailList(): js.Array[Error]
    
    /**
      * Return the error string.
      */
    def GetErrorString(): String
    
    /**
      * Return the source information. It could be the index of the OCR'd image or the path of the OCR'd file.
      */
    def GetInput(): Double | String
    
    /**
      * Return the number of pages allowed by the current license.
      */
    def GetOCRTotalCount(): String
    
    /**
      * Return the content of a page.
      * @param index Specify the page
      */
    def GetPageContent(index: Double): Page
    
    /**
      * Return the number of pages in the OCR result.
      */
    def GetPageCount(): String
    
    /**
      * Save the OCR result as a file.
      * @param path The path to save the file.
      */
    def Save(path: String): Boolean
  }
  object OCRProResult {
    
    inline def apply(
      Get: CallbackTo[String],
      GetAlreadyOCRCount: CallbackTo[String],
      GetErrorCode: CallbackTo[Double],
      GetErrorDetailList: CallbackTo[js.Array[Error]],
      GetErrorString: CallbackTo[String],
      GetInput: CallbackTo[Double | String],
      GetOCRTotalCount: CallbackTo[String],
      GetPageContent: Double => Page,
      GetPageCount: CallbackTo[String],
      Save: String => Boolean
    ): OCRProResult = {
      val __obj = js.Dynamic.literal(Get = Get.toJsFn, GetAlreadyOCRCount = GetAlreadyOCRCount.toJsFn, GetErrorCode = GetErrorCode.toJsFn, GetErrorDetailList = GetErrorDetailList.toJsFn, GetErrorString = GetErrorString.toJsFn, GetInput = GetInput.toJsFn, GetOCRTotalCount = GetOCRTotalCount.toJsFn, GetPageContent = js.Any.fromFunction1(GetPageContent), GetPageCount = GetPageCount.toJsFn, Save = js.Any.fromFunction1(Save))
      __obj.asInstanceOf[OCRProResult]
    }
    
    extension [Self <: OCRProResult](x: Self) {
      
      inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "Get", value.toJsFn)
      
      inline def setGetAlreadyOCRCount(value: CallbackTo[String]): Self = StObject.set(x, "GetAlreadyOCRCount", value.toJsFn)
      
      inline def setGetErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "GetErrorCode", value.toJsFn)
      
      inline def setGetErrorDetailList(value: CallbackTo[js.Array[Error]]): Self = StObject.set(x, "GetErrorDetailList", value.toJsFn)
      
      inline def setGetErrorString(value: CallbackTo[String]): Self = StObject.set(x, "GetErrorString", value.toJsFn)
      
      inline def setGetInput(value: CallbackTo[Double | String]): Self = StObject.set(x, "GetInput", value.toJsFn)
      
      inline def setGetOCRTotalCount(value: CallbackTo[String]): Self = StObject.set(x, "GetOCRTotalCount", value.toJsFn)
      
      inline def setGetPageContent(value: Double => Page): Self = StObject.set(x, "GetPageContent", js.Any.fromFunction1(value))
      
      inline def setGetPageCount(value: CallbackTo[String]): Self = StObject.set(x, "GetPageCount", value.toJsFn)
      
      inline def setSave(value: String => Boolean): Self = StObject.set(x, "Save", js.Any.fromFunction1(value))
    }
  }
  
  trait Page extends StObject {
    
    /**
      * Return the content of the specified letter.
      * @index Specify the letter.
      */
    def GetLetterContent(index: Double): Letter
    
    /**
      * Return the number of letters in the page.
      */
    def GetLetterCount(): Double
    
    /**
      * Return the base64-encoded content of the specified rectangle.
      * @index Specify the line.
      */
    def GetZoneContent(index: Double): String
    
    /**
      * Return the number of recognized rectangles in the page.
      */
    def GetZoneCount(): Double
  }
  object Page {
    
    inline def apply(
      GetLetterContent: Double => Letter,
      GetLetterCount: CallbackTo[Double],
      GetZoneContent: Double => String,
      GetZoneCount: CallbackTo[Double]
    ): Page = {
      val __obj = js.Dynamic.literal(GetLetterContent = js.Any.fromFunction1(GetLetterContent), GetLetterCount = GetLetterCount.toJsFn, GetZoneContent = js.Any.fromFunction1(GetZoneContent), GetZoneCount = GetZoneCount.toJsFn)
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setGetLetterContent(value: Double => Letter): Self = StObject.set(x, "GetLetterContent", js.Any.fromFunction1(value))
      
      inline def setGetLetterCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetLetterCount", value.toJsFn)
      
      inline def setGetZoneContent(value: Double => String): Self = StObject.set(x, "GetZoneContent", js.Any.fromFunction1(value))
      
      inline def setGetZoneCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetZoneCount", value.toJsFn)
    }
  }
  
  trait Rect extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Rect {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Redaction extends StObject {
    
    /**
      * Specify the text to redact.
      */
    var FindText: String
    
    /**
      * Specify how redaction is done.
      */
    var FindTextAction: EnumDWTOCRFindTextAction | Double
    
    /**
      * Specify how the text is found.
      */
    var FindTextFlags: EnumDWTOCRFindTextFlags | Double
  }
  object Redaction {
    
    inline def apply(
      FindText: String,
      FindTextAction: EnumDWTOCRFindTextAction | Double,
      FindTextFlags: EnumDWTOCRFindTextFlags | Double
    ): Redaction = {
      val __obj = js.Dynamic.literal(FindText = FindText.asInstanceOf[js.Any], FindTextAction = FindTextAction.asInstanceOf[js.Any], FindTextFlags = FindTextFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redaction]
    }
    
    extension [Self <: Redaction](x: Self) {
      
      inline def setFindText(value: String): Self = StObject.set(x, "FindText", value.asInstanceOf[js.Any])
      
      inline def setFindTextAction(value: EnumDWTOCRFindTextAction | Double): Self = StObject.set(x, "FindTextAction", value.asInstanceOf[js.Any])
      
      inline def setFindTextFlags(value: EnumDWTOCRFindTextFlags | Double): Self = StObject.set(x, "FindTextFlags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * Specify the target language.
      */
    var Languages: String
    
    /**
      * Specify the URL for the license checker.
      */
    var LicenseChecker: String
    
    /**
      * Specify the output format.
      */
    var OutputFormat: EnumDWTOCRProOutputFormat | String
    
    /**
      * Specify the PDF/A version.
      */
    var PDFAVersion: EnumDWTOCRProPDFAVersion | String
    
    /**
      * Specify the PDF version.
      */
    var PDFVersion: EnumDWTOCRProPDFVersion | String
    
    /**
      * Specify the recognition module.
      */
    var RecognitionModule: EnumDWTOCRProRecognitionModule | String
    
    /**
      * Configure the redaction.
      */
    var Redaction: typingsJapgolly.dwt.addonDotOCRProMod.Redaction
  }
  object Settings {
    
    inline def apply(
      Languages: String,
      LicenseChecker: String,
      OutputFormat: EnumDWTOCRProOutputFormat | String,
      PDFAVersion: EnumDWTOCRProPDFAVersion | String,
      PDFVersion: EnumDWTOCRProPDFVersion | String,
      RecognitionModule: EnumDWTOCRProRecognitionModule | String,
      Redaction: Redaction
    ): Settings = {
      val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], LicenseChecker = LicenseChecker.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], PDFAVersion = PDFAVersion.asInstanceOf[js.Any], PDFVersion = PDFVersion.asInstanceOf[js.Any], RecognitionModule = RecognitionModule.asInstanceOf[js.Any], Redaction = Redaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setLanguages(value: String): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
      
      inline def setLicenseChecker(value: String): Self = StObject.set(x, "LicenseChecker", value.asInstanceOf[js.Any])
      
      inline def setOutputFormat(value: EnumDWTOCRProOutputFormat | String): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
      
      inline def setPDFAVersion(value: EnumDWTOCRProPDFAVersion | String): Self = StObject.set(x, "PDFAVersion", value.asInstanceOf[js.Any])
      
      inline def setPDFVersion(value: EnumDWTOCRProPDFVersion | String): Self = StObject.set(x, "PDFVersion", value.asInstanceOf[js.Any])
      
      inline def setRecognitionModule(value: EnumDWTOCRProRecognitionModule | String): Self = StObject.set(x, "RecognitionModule", value.asInstanceOf[js.Any])
      
      inline def setRedaction(value: Redaction): Self = StObject.set(x, "Redaction", value.asInstanceOf[js.Any])
    }
  }
}
