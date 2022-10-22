package typingsJapgolly.jspdf

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Blob
import typingsJapgolly.jspdf.jspdfBooleans.`true`
import typingsJapgolly.jspdf.jspdfStrings.arraybuffer
import typingsJapgolly.jspdf.jspdfStrings.blob
import typingsJapgolly.jspdf.jspdfStrings.datauristring
import typingsJapgolly.jspdf.jspdfStrings.dataurlstring
import typingsJapgolly.jspdf.jspdfStrings.truetype
import typingsJapgolly.jspdf.mod.AcroFormButton
import typingsJapgolly.jspdf.mod.AcroFormCheckBox
import typingsJapgolly.jspdf.mod.AcroFormChoiceField
import typingsJapgolly.jspdf.mod.AcroFormComboBox
import typingsJapgolly.jspdf.mod.AcroFormEditBox
import typingsJapgolly.jspdf.mod.AcroFormListBox
import typingsJapgolly.jspdf.mod.AcroFormPasswordField
import typingsJapgolly.jspdf.mod.AcroFormPushButton
import typingsJapgolly.jspdf.mod.AcroFormRadioButton
import typingsJapgolly.jspdf.mod.AcroFormTextField
import typingsJapgolly.jspdf.mod.Context2d
import typingsJapgolly.jspdf.mod.Matrix
import typingsJapgolly.jspdf.mod.PubSub
import typingsJapgolly.jspdf.mod.jsPDF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Appearance extends StObject {
    
    def Appearance(): Any
    
    def Button(): AcroFormButton
    
    def CheckBox(): AcroFormCheckBox
    
    def ChoiceField(): AcroFormChoiceField
    
    def ComboBox(): AcroFormComboBox
    
    def EditBox(): AcroFormEditBox
    
    def ListBox(): AcroFormListBox
    
    def PasswordField(): AcroFormPasswordField
    
    def PushButton(): AcroFormPushButton
    
    def RadioButton(): AcroFormRadioButton
    
    def TextField(): AcroFormTextField
  }
  object Appearance {
    
    inline def apply(
      Appearance: CallbackTo[Any],
      Button: CallbackTo[AcroFormButton],
      CheckBox: CallbackTo[AcroFormCheckBox],
      ChoiceField: CallbackTo[AcroFormChoiceField],
      ComboBox: CallbackTo[AcroFormComboBox],
      EditBox: CallbackTo[AcroFormEditBox],
      ListBox: CallbackTo[AcroFormListBox],
      PasswordField: CallbackTo[AcroFormPasswordField],
      PushButton: CallbackTo[AcroFormPushButton],
      RadioButton: CallbackTo[AcroFormRadioButton],
      TextField: CallbackTo[AcroFormTextField]
    ): Appearance = {
      val __obj = js.Dynamic.literal(Appearance = Appearance.toJsFn, Button = Button.toJsFn, CheckBox = CheckBox.toJsFn, ChoiceField = ChoiceField.toJsFn, ComboBox = ComboBox.toJsFn, EditBox = EditBox.toJsFn, ListBox = ListBox.toJsFn, PasswordField = PasswordField.toJsFn, PushButton = PushButton.toJsFn, RadioButton = RadioButton.toJsFn, TextField = TextField.toJsFn)
      __obj.asInstanceOf[Appearance]
    }
    
    extension [Self <: Appearance](x: Self) {
      
      inline def setAppearance(value: CallbackTo[Any]): Self = StObject.set(x, "Appearance", value.toJsFn)
      
      inline def setButton(value: CallbackTo[AcroFormButton]): Self = StObject.set(x, "Button", value.toJsFn)
      
      inline def setCheckBox(value: CallbackTo[AcroFormCheckBox]): Self = StObject.set(x, "CheckBox", value.toJsFn)
      
      inline def setChoiceField(value: CallbackTo[AcroFormChoiceField]): Self = StObject.set(x, "ChoiceField", value.toJsFn)
      
      inline def setComboBox(value: CallbackTo[AcroFormComboBox]): Self = StObject.set(x, "ComboBox", value.toJsFn)
      
      inline def setEditBox(value: CallbackTo[AcroFormEditBox]): Self = StObject.set(x, "EditBox", value.toJsFn)
      
      inline def setListBox(value: CallbackTo[AcroFormListBox]): Self = StObject.set(x, "ListBox", value.toJsFn)
      
      inline def setPasswordField(value: CallbackTo[AcroFormPasswordField]): Self = StObject.set(x, "PasswordField", value.toJsFn)
      
      inline def setPushButton(value: CallbackTo[AcroFormPushButton]): Self = StObject.set(x, "PushButton", value.toJsFn)
      
      inline def setRadioButton(value: CallbackTo[AcroFormRadioButton]): Self = StObject.set(x, "RadioButton", value.toJsFn)
      
      inline def setTextField(value: CallbackTo[AcroFormTextField]): Self = StObject.set(x, "TextField", value.toJsFn)
    }
  }
  
  trait Autoencode extends StObject {
    
    var autoencode: Boolean
    
    var noBOM: Boolean
  }
  object Autoencode {
    
    inline def apply(autoencode: Boolean, noBOM: Boolean): Autoencode = {
      val __obj = js.Dynamic.literal(autoencode = autoencode.asInstanceOf[js.Any], noBOM = noBOM.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autoencode]
    }
    
    extension [Self <: Autoencode](x: Self) {
      
      inline def setAutoencode(value: Boolean): Self = StObject.set(x, "autoencode", value.asInstanceOf[js.Any])
      
      inline def setNoBOM(value: Boolean): Self = StObject.set(x, "noBOM", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    var events: PubSub
    
    def getEncryptor(objectId: Double): js.Function1[/* data */ String, String]
    
    var pageSize: GetHeight
    
    var pages: js.Array[Double]
    
    var scaleFactor: Double
  }
  object Events {
    
    inline def apply(
      events: PubSub,
      getEncryptor: Double => js.Function1[/* data */ String, String],
      pageSize: GetHeight,
      pages: js.Array[Double],
      scaleFactor: Double
    ): Events = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getEncryptor = js.Any.fromFunction1(getEncryptor), pageSize = pageSize.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setEvents(value: PubSub): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setGetEncryptor(value: Double => js.Function1[/* data */ String, String]): Self = StObject.set(x, "getEncryptor", js.Any.fromFunction1(value))
      
      inline def setPageSize(value: GetHeight): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPages(value: js.Array[Double]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: Double*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filename extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Filename {
    
    inline def apply(): Filename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filename]
    }
    
    extension [Self <: Filename](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): String = js.native
    def apply(`type`: datauristring | dataurlstring): String = js.native
    def apply(`type`: datauristring | dataurlstring, options: Filename): String = js.native
    def apply(`type`: arraybuffer): js.typedarray.ArrayBuffer = js.native
    def apply(`type`: blob): Blob = js.native
  }
  
  trait Font extends StObject {
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var scaleFactor: js.UndefOr[Double] = js.undefined
  }
  object Font {
    
    inline def apply(): Font = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
      
      inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    }
  }
  
  trait Fontsize extends StObject {
    
    var `font-size`: Double
  }
  object Fontsize {
    
    inline def apply(`font-size`: Double): Fontsize = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fontsize]
    }
    
    extension [Self <: Fontsize](x: Self) {
      
      inline def `setFont-size`(value: Double): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: truetype
    
    var url: String
  }
  object Format {
    
    inline def apply(url: String): Format = {
      val __obj = js.Dynamic.literal(format = "truetype", url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: truetype): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetContext extends StObject {
    
    def getContext(): Context2d = js.native
    def getContext(`type`: String): Context2d = js.native
    
    var height: Double = js.native
    
    var pdf: jsPDF = js.native
    
    var style: Any = js.native
    
    var width: Double = js.native
  }
  
  trait GetHeight extends StObject {
    
    def getHeight(): Double
    
    def getWidth(): Double
    
    var height: Double
    
    var width: Double
  }
  object GetHeight {
    
    inline def apply(getHeight: CallbackTo[Double], getWidth: CallbackTo[Double], height: Double, width: Double): GetHeight = {
      val __obj = js.Dynamic.literal(getHeight = getHeight.toJsFn, getWidth = getWidth.toJsFn, height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetHeight]
    }
    
    extension [Self <: GetHeight](x: Self) {
      
      inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait H extends StObject {
    
    var h: Double
    
    var w: Double
    
    var x: Double
    
    var y: Double
  }
  object H {
    
    inline def apply(h: Double, w: Double, x: Double, y: Double): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    extension [Self <: H](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReturnPromise extends StObject {
    
    var returnPromise: `true`
  }
  object ReturnPromise {
    
    inline def apply(): ReturnPromise = {
      val __obj = js.Dynamic.literal(returnPromise = true)
      __obj.asInstanceOf[ReturnPromise]
    }
    
    extension [Self <: ReturnPromise](x: Self) {
      
      inline def setReturnPromise(value: `true`): Self = StObject.set(x, "returnPromise", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rotate extends StObject {
    
    var rotate: Matrix
    
    var scale: Matrix
    
    var skew: Matrix
    
    var translate: Matrix
  }
  object Rotate {
    
    inline def apply(rotate: Matrix, scale: Matrix, skew: Matrix, translate: Matrix): Rotate = {
      val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], skew = skew.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rotate]
    }
    
    extension [Self <: Rotate](x: Self) {
      
      inline def setRotate(value: Matrix): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Matrix): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSkew(value: Matrix): Self = StObject.set(x, "skew", value.asInstanceOf[js.Any])
      
      inline def setTranslate(value: Matrix): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    }
  }
  
  trait W extends StObject {
    
    var h: Double
    
    var w: Double
  }
  object W {
    
    inline def apply(h: Double, w: Double): W = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[W]
    }
    
    extension [Self <: W](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
}
